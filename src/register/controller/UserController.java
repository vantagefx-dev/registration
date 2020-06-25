package register.controller;

import register.dto.User;
import register.service.UserService;

public class UserController {

	private UserService userService = new UserService();
	
	//this is an endpoint
	public void registerUser(User user) {
		//validation
		
		//save
		userService.saveUser(user);
		//send email
		
		//send sms
		
		//others
		
		//
	}
}
