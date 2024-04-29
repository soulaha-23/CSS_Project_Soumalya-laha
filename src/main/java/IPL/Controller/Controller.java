package IPL.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import IPL.Dto.Management;
import IPL.Dto.Player;
import IPL.Dto.Team;

@org.springframework.stereotype.Controller
@Component
public class Controller {
	
	@Autowired
	Management management; // it is refersh the object
	
	@Autowired
	Team team;
	
	@Autowired
	Player player;
	
	@RequestMapping("homePage")
	@ResponseBody
	public ModelAndView homeSignUp(@RequestParam String role) { //@RequestParams it will same as req.getparam but it take at one shot
		ModelAndView modelAndView=new ModelAndView(); // it is object that help to send data form backend to frontend
		if(role.equals("managment")) {
			
			modelAndView.addObject("management",management); // value store in key and value pair
			modelAndView.setViewName("managementSigupPage.jsp");
			
//			modelAndView.addObject("msg","managment done completely");
//			modelAndView.setViewName("LoginArea.jsp");
		}else if(role.equals("team")) {
			modelAndView.addObject("team",team);
			modelAndView.setViewName("teamSigupPage.jsp");
		}else {
			modelAndView.addObject("player",player);
			modelAndView.setViewName("player/playerSignupPage.jsp");
		}
		return modelAndView;
	}
}
