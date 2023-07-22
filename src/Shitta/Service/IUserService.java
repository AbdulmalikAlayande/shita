package Shitta.Service;

import Shitta.dto.Request.RegisteredUserRequest;
import Shitta.dto.Response.RegisteredUserResponse;

public interface IUserService {
	RegisteredUserResponse registerNewUser(RegisteredUserRequest userRequested);
	RegisteredUserResponse findUserById(String id);
	
	int getCountOfUsers();
	
	String deleteUserById(RegisteredUserRequest savedUser);
}
