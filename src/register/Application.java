package register;

import register.controller.UserController;
import register.dto.User;

public class Application {

	public static void main(String[] args) {
		
		// application starts here
		
		User user = new User("John Smith");
		UserController controller = new UserController();
		controller.registerUser(user);
	}
	
}
