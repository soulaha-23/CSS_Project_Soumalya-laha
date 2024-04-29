package IPL.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import IPL.Dao.ManagementDao;
import IPL.Dto.Management;

@org.springframework.stereotype.Controller
@Component
public class ManagementController {
	
	@Autowired
	ManagementDao managementDao;

	@RequestMapping("managementSingup")
//	@GetMapping
//	@PostMapping
	@ResponseBody
	public ModelAndView management_signup(@ModelAttribute Management management) {
		ModelAndView modelAndView=new ModelAndView();

		managementDao.Management_save(management);
		modelAndView.addObject("msg", "mangement account got created");
		modelAndView.setViewName("LoginArea.jsp");
		
		return modelAndView;
	}
	
	@RequestMapping("managementLogin")
	@ResponseBody
	public ModelAndView managementLoginLogic(@RequestParam String name,@RequestParam String password) {
		
		Management management = managementDao.Mangement_login(name, password);
		ModelAndView modelAndView =new ModelAndView();
		
		if(management==null) {
			modelAndView.addObject("msg", "invalid creditental");
			modelAndView.setViewName("LoginArea.jsp");
		}else {
			modelAndView.addObject("msg", "Login is succcessfully");
			modelAndView.setViewName("managementHomePage.jsp");
		}
		
		return modelAndView;
	}
}
