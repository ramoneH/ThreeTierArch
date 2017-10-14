package service;

import businessObjects.User;
import dao.MockUserDao;
import util.PasswordUtilities;

public class UserService {
	
	public String saveUser(User user) {
		MockUserDao userdao = new MockUserDao();
		// If Password matches return A successful Attempt
		//If Fails Return Error
		boolean ispassvalid = PasswordUtilities.verifyPassword(user.getPassword());
			if(ispassvalid) {
			
			userdao.save(user);
			return "You have successfully registered";
		}
		
		else {
			return "Password entered is invalid";
	}
		}
}

