package Shitta.utils;

import Shitta.data.models.User;
import Shitta.dto.Request.RegisteredUserRequest;
import Shitta.dto.Response.RegisteredUserResponse;

public class ResponseMapper {
	
	public static User map(RegisteredUserRequest userRequest){
		User newUser = new User();
		newUser.setFirstName(userRequest.getFirstName());
		newUser.setLastName(userRequest.getLastName());
		newUser.setEmail(userRequest.getEmail());
		newUser.setUserAddress(userRequest.getAddress());
		newUser.setPhoneNumber(userRequest.getPhoneNumber());
		return newUser;
	}
	
	public static RegisteredUserResponse map(User newUser){
		RegisteredUserResponse userResponse = new RegisteredUserResponse();
		userResponse.setFirstName(newUser.getFirstName());
		userResponse.setLastName(newUser.getLastName());
		userResponse.setUserId(newUser.getUserId());
		userResponse.setEmail(newUser.getEmail());
		userResponse.setAddress(newUser.getUserAddress());
		userResponse.setPhoneNumber(newUser.getPhoneNumber());
		return userResponse;
	}
}
