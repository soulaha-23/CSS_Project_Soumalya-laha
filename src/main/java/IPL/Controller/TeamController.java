package IPL.Controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import IPL.Dao.TeamDao;
import IPL.Dto.Team;

//@org.springframework.stereotype.Controller

@RestController // i wil do the work of @controller and @ResponseBody also 
public class TeamController {

	@Autowired
	TeamDao teamDao;

	@Autowired
	Team team;

	@RequestMapping("teamSingup")
//	@ResponseBody
	public ModelAndView teamSignupLogic(@ModelAttribute Team team) {
		teamDao.save(team);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", "Team Account is created successfully");
		modelAndView.setViewName("LoginArea.jsp");
		return modelAndView;
	}

	@PostMapping("teamLogin")
//	@ResponseBody
	public ModelAndView teamLoginLogic(@RequestParam String username, @RequestParam String password, HttpSession httpSession) {
		Team team = teamDao.login(username, password);
		ModelAndView modelAndView = new ModelAndView();
		
		System.out.println("the status is "+ team.isStatus());
		if (team == null) {
			modelAndView.addObject("msg", "invalidate creditenal");
			modelAndView.setViewName("LoginArea.jsp");
		} else {
			if (team.isStatus() == true) {
				httpSession.setAttribute("team", team);// if i want information of the team in future then i will use
														// the httpSession
				modelAndView.addObject("msg", "login Successfully");
				modelAndView.addObject("img", team.getImagelink());
				modelAndView.setViewName("teamHomePage.jsp");
			} else {
				System.out.println("wait for management approval");
				modelAndView.addObject("msg", "wait for management Approval");
				modelAndView.setViewName("LoginArea.jsp");
			}
		}
		return modelAndView;
	}

	// get all team detail
	@RequestMapping("viewAllTeams")
//	@ResponseBody
	public ModelAndView teamAllLogic() {
		ModelAndView modelAndView = new ModelAndView();
		
		List<Team> teams = teamDao.getAllTeam();
		
		if(teams.isEmpty()) {
			modelAndView.addObject("msg", "There is no team data present");
			modelAndView.setViewName("managementHomePage.jsp");
		}else {
			modelAndView.addObject("teams", teams);
			modelAndView.setViewName("viewAllTeam.jsp");
		}
		
		return modelAndView;
	}
	
	// change the status 
	@RequestMapping("changeStatus")
	public ModelAndView changeStatausLogic(@RequestParam int id) {
		Team team = teamDao.getTeamById(id);
		ModelAndView modelAndView=new ModelAndView();
		if(team.isStatus()) {
			team.setStatus(false);
		}else {
			team.setStatus(true);
		}
		
		teamDao.update(team);
		
		List<Team> teams = teamDao.getAllTeam();
		modelAndView.addObject("teams", teams);

		modelAndView.addObject("msg", "team status got change");
		modelAndView.setViewName("viewAllTeam.jsp");
		return modelAndView;
	}
	
	@RequestMapping("addAmountForTeams")
	// to skip parsing -> requestParam internally do parsing
	// @ModelAttribe 
	public ModelAndView addAmount(@RequestParam double wallet, @RequestParam int tid) {
		System.out.println("the tid is "+tid);
		Team team = teamDao.addAmount(tid);
		team.setWallet(team.getWallet()+wallet);
		teamDao.update(team);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", "amount has been added for "+team.getName()+" successfuly");
		modelAndView.setViewName("teamHomePage.jsp");
		return modelAndView;
	}
	
}
