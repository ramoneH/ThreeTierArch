package frontendui;

import java.util.Scanner;

import businessObjects.User;
import service.UserService;

public class DummyUserApp {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("Please Enter UserName:");
		String username = new Scanner(System.in).nextLine();
		
		System.out.println("Please Enter Password");
		String password = new Scanner(System.in).nextLine();
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		UserService userService = new UserService();
		System.out.println(userService.saveUser(user));
	}

}
