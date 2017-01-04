package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(value="/getUserById" , method = RequestMethod.GET)
	public ModelAndView getUserById(@RequestParam("id") String id) {
		
		ModelAndView model = new ModelAndView("userList");
		List<UserDTO> userList = userService.getUserById(id);
		model.addObject("userList", userList);
		
		return model;
	}
	@RequestMapping(value="/deleteUser" , method = RequestMethod.GET)
	public ModelAndView deleteUser(@RequestParam("id") String id) {
		
		ModelAndView model = new ModelAndView("userList");
		int deleteUser = userService.deleteUser(id);
		
		List<UserDTO> userList = userService.getAllUsers();
		model.addObject("userList", userList);
		
		return model;
	}
	
	@RequestMapping(value="/editUser" , method = RequestMethod.GET)
	public ModelAndView editUser(@RequestParam("id") String id) {
		
		ModelAndView model = new ModelAndView("userList");
		List<UserDTO> userList = userService.getUserById(id);
		model.addObject("userList", userList);
		
		return model;
	}
}
