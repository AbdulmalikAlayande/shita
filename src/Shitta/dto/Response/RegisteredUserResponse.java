package Shitta.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class RegisteredUserResponse {
	private String userId;
	private String firstName;
	private String lastName;
	private String fullName;
	private String email;
	private String phoneNumber;
	private String address;
	
	
}
