package IPL.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import IPL.Dao.PlayerDao;
import IPL.Dto.Player;

@RestController
public class PlayerContoroller {

	@Autowired
	PlayerDao playerDao;
	
	// player singup 
	@PostMapping("playerSignup")
	public ModelAndView playerSignupLogic(@ModelAttribute Player player) {
		ModelAndView modelAndView = new ModelAndView();
		playerDao.save(player);
		modelAndView.addObject("msg", "account is created successfully");
		modelAndView.setViewName("LoginArea.jsp");
		return modelAndView;
	}
	
	// player login
	@PostMapping("playerLogin")
	public void playerLoginLogic(@RequestParam String username, @RequestParam String password) {
		ModelAndView modelAndView = new ModelAndView();
		playerDao.login(username, password);
		
	}
}
