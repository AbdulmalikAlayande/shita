package Shitta.data.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class User {
	@Id
	private String userId;
	private String firstName;
	private String lastName;
	private String fullName;
	private String userAddress;
	private String phoneNumber;
	private String email;
	private List<Event> status;
	
}
