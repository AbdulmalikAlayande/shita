package Shitta.dto.Request;

import lombok.Data;

@Data
public class RegisteredUserRequest {
	private String firstName;
	private String lastName;
	private String fullName;
	private String email;
	private String phoneNumber;
	private String address;
	
}
