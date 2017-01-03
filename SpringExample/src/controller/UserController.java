package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dto.UserDTO;
import service.IUserService;

@Controller
public class UserController {

	@Autowired
	IUserService userService;
	
	@RequestMapping(value="/getUsers" , method = RequestMethod.GET)
	public ModelAndView getUsers() {
		
		ModelAndView model = new ModelAndView("userList");
		List<UserDTO> userList = userService.getAllUsers();
		model.addObject("userList", userList);
		
		return model;
	}
}
