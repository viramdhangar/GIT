package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dto.UserDTO;
import service.IUserService;

@Controller
public class WelcomeController {

	@Autowired
	IUserService userService;
	
	@RequestMapping(value="/logout" , method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return new ModelAndView("login", "message", "Succesfully logged out");
	}
	
	@RequestMapping(value="/login" , method = RequestMethod.GET)
	public ModelAndView login(HttpServletRequest request,@RequestParam("emailId") String emailId,@RequestParam("password") String password) {

		HttpSession session = request.getSession();
		
		
		
		// String password
		 UserDTO user = new UserDTO();
		if(password.equalsIgnoreCase("userPassFromDB")){
			
			session.setAttribute("user", user);
			session.invalidate();
			return new ModelAndView("home", "message", "Succesfully logged in");
		}else{
			return new ModelAndView("login", "message", "email/password invalid");
		}
		
		
	}
	@RequestMapping(value="/" , method = RequestMethod.GET)
	public ModelAndView welcome() {

		return new ModelAndView("welcome", "message", "welcome message called");
	}
	
	@RequestMapping(value="/saveUser", method = RequestMethod.POST)
	public ModelAndView saveUser(@RequestParam("id") String id,@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName){
		
		UserDTO userDTO = new UserDTO();
		userDTO.setId(Integer.parseInt(id));
		userDTO.setFirstName(firstName);
		userDTO.setLastName(lastName);
		
		userService.addUser(userDTO);
		return new ModelAndView("welcome");
	}
}
