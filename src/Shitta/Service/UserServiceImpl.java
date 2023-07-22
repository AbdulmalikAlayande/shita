package Shitta.Service;


import Shitta.data.models.User;
import Shitta.data.repositories.IUserRepository;
import Shitta.dto.Request.RegisteredUserRequest;
import Shitta.dto.Response.RegisteredUserResponse;
import Shitta.utils.ResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private IUserRepository userRepository;
	
	@Override
	public RegisteredUserResponse registerNewUser(RegisteredUserRequest userRequest) {
		User savedUser = ResponseMapper.map(userRequest);
		User savedUserResponse = userRepository.save(savedUser);
		return ResponseMapper.map(savedUserResponse);
	}
	
	@Override
	public RegisteredUserResponse findUserById(String id) {
		Optional<User> foundUser = userRepository.findById(id);
		if (foundUser.isEmpty())
			throw new IllegalArgumentException("User does not exist");
		return ResponseMapper.map(foundUser.get());
	}
	
	
	
	@Override
	public int getCountOfUsers() {
		return (int) userRepository.count();
	}
	
	@Override
	public String deleteUserById(RegisteredUserRequest savedUser) {
		User mappedUser = ResponseMapper.map(savedUser);
//		userRepository.delete(user);
		return null;
	}
}
