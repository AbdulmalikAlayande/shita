package Shitta;

import Shitta.Controllers.UserController;
import Shitta.dto.Request.RegisteredUserRequest;
import Shitta.dto.Response.RegisteredUserResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;

import javax.swing.*;

@SpringBootApplication
public class Main {
	
	public static void main(String... args) {
		SpringApplication.run(Main.class, args);
//		String mainMenu = """
//				What do you want to do
//				1.) Register new User
//				2.) Find Registered User by Id
//				3.) Exit
//				""";
//		int userInput = collectUserInput(mainMenu);
//		switch (userInput){
//			case 1 -> registerNewUser();
//			case 2 -> findRegisteredUser();
//			case 3 -> System.exit(0);
//		}
	}
	
	private static final UserController userController = new UserController();
	private static void registerNewUser() {
		String firstName = collectStringInput("Enter Your First name");
		String lastName = collectStringInput("Enter Your Last name");
		String address = collectStringInput("Enter Your address");
		String email = collectStringInput("Enter Your email");
		String phoneNumber = collectStringInput("Enter Your phone number");
		
		RegisteredUserRequest userRequest = new RegisteredUserRequest();
		userRequest.setFirstName(firstName);
		userRequest.setLastName(lastName);
		userRequest.setAddress(address);
		userRequest.setEmail(email);
		userRequest.setPhoneNumber(phoneNumber);
		ResponseEntity<?> registeredUser = userController.registerNewUser(userRequest);
		display(String.valueOf(registeredUser));
		main();
	}
	
	private static void findRegisteredUser() {
		String userId = collectUserInput("Enter your Id");
		ResponseEntity<?> foundUser = userController.findUserByUserId(userId);
		display(String.valueOf(foundUser));
		main();
	}
	
	private static void display(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	
	private static String collectStringInput(String prompt) {
		return JOptionPane.showInputDialog(prompt);
	}
	
	private static String collectUserInput(String mainMenu) {
		return JOptionPane.showInputDialog(mainMenu);
	}
}
