package Shitta.Controllers;


import Shitta.Service.IUserService;
import Shitta.dto.Request.RegisteredUserRequest;
import Shitta.dto.Response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@PostMapping ("/user")
	public ResponseEntity<?> registerNewUser(@RequestBody RegisteredUserRequest userRequest){
//		var response = userService.registerNewUser(userRequest);
//		return new ResponseEntity<>(response, HttpStatus.CREATED);
		var response = userService.registerNewUser(userRequest);
		ApiResponse apiResponse = new ApiResponse(true, response);
		return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<?> findUserByUserId(@PathVariable String id){
//		try {
//			return new ResponseEntity<>(userService.findUserById(id), HttpStatus.FOUND);
//		}   catch (IllegalArgumentException exception){
//			return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
//		}
		try {
			return new ResponseEntity<>(new ApiResponse(true, userService.findUserById(id)), HttpStatus.FOUND);
		}   catch (IllegalArgumentException exception){
			return new ResponseEntity<>(new ApiResponse(false, exception.getMessage()), HttpStatus.NOT_FOUND);
		}
	}
}
