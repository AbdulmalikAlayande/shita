package tdd;

import Shitta.Service.IUserService;
import Shitta.Service.UserServiceImpl;
import Shitta.dto.Request.RegisteredUserRequest;
import Shitta.dto.Response.RegisteredUserResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserServiceImplTest {
	IUserService userService;
	RegisteredUserRequest userRequest;
	@BeforeEach
	void setUP(){
		userRequest = new RegisteredUserRequest();
		userRequest.setFirstName("Baker");
		userRequest.setLastName("Sophia");
		userRequest.setFullName();
		userRequest.setEmail("bakersophie@gmail.com");
		userRequest.setPhoneNumber("09091658960");
		userRequest.setAddress("flat 56B 4kt road U.S.A");
		userService = new UserServiceImpl();
	}
	
	@Test
	@DisplayName("Register Test: test that a user can register")
	public void registerUserTest(){
		assertEquals(1, userService.getCountOfUsers());
	}
	
	@Test
	public void findByIdTest(){
		RegisteredUserResponse savedUser = userService.registerNewUser(userRequest);
//		RegisteredUserResponse foundUser = userService.findUserById(savedUser.getUserId());
//		assertEquals(savedUser.getUserId(), foundUser.getUserId());
//		assertEquals(1, foundUser.getUserId());
	}
	
	@Test
	public void deleteUserByUserObjectTest(){
		RegisteredUserResponse savedUser = userService.registerNewUser(userRequest);
//		String deletedUser = userService.deleteUserById(savedUser);
//		assertEquals("User Successfully Deleted", deletedUser);
		assertEquals(0, userService.getCountOfUsers());
	}
}