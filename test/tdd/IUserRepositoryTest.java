package tdd;

import Shitta.data.models.User;
import Shitta.data.repositories.IUserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IUserRepositoryTest {
	
	User user;
	IUserRepository userRepository;
	@BeforeEach
	void setUp() {
		user = new User();
		userRepository = new UserRepositoryImpl();
	}
	
	@AfterEach
	void tearDown() {
	}
	
	@Test
	@DisplayName("Test that count of users increments if i save one user")
	public void saveOneUser_countIsIncrementingTest(){
		assertEquals(0, userRepository.count());
		User user1 = new User();
		userRepository.save(user1);
		userRepository.save(user);
		assertEquals(2, userRepository.count());
	}
	
	@Test
	@DisplayName("Saved by id: test that if i save a user the user " +
			             "is saved with their id")
	public void testSaveOneUser_IdIsSetTest(){
//		I have a user
		User user1 = new User();
		User user2 = new User();
		assertEquals(0, user1.getUserId());
//		When I save the user id saves with it
		assertEquals(1, userRepository.save(user1).getUserId());
		assertEquals(2, userRepository.save(user2).getUserId());
		assertEquals(3, userRepository.save(user).getUserId());
		System.out.println(user1);
	}
	
	@Test
	@DisplayName("Find by id test: if a user is saved, " +
			             "i can find the user by their id")
	public void saveUser_FindUserById_returnSavedUserTest(){
//		Given that i have a user
		User user = new User();
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		assertEquals(0, user.getUserId());
//		When I save the user
		User savedUser1 = userRepository.save(user1);
		User savedUser2 = userRepository.save(user2);
		User savedUser3 = userRepository.save(user3);
//		I can find the saved users by their user id
		User foundUser1 = userRepository.findById(1);
		User foundUser2 = userRepository.findById(2);
		User foundUser3 = userRepository.findById(3);
		
		assertEquals(1, foundUser1.getUserId());
		assertEquals(2, foundUser2.getUserId());
		assertEquals(3, foundUser3.getUserId());
		
		assertEquals(savedUser1, foundUser1);
		assertEquals(savedUser2, foundUser2);
		assertEquals(savedUser3, foundUser3);
	}
	
	@Test
	@DisplayName("Update Test: If i save the same users with the same id, " +
			             "the former is removed, the latter is saved")
	public void saveTwoUsersWithSameId_CountIsSameTest(){
		User user = new User();
		userRepository.save(user);
		
		User user1 = new User();
		user1.setUserId(1);
		userRepository.save(user1);
		
		User foundUser = userRepository.findById(1);
		assertEquals(foundUser, user1);
		assertNotEquals(foundUser, user);
		
	}
	@Test
	@DisplayName("Delete by user: If i want to delete a user," +
			             "i can delete with user with their id")
	void deleteOneUser_CountIsZero(){
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		User savedUser = userRepository.save(user1);
		User savedUser1 = userRepository.save(user2);
		User savedUser2 = userRepository.save(user3);
		assertEquals(1, savedUser.getUserId());
		assertEquals(2, savedUser1.getUserId());
		assertEquals(3, savedUser2.getUserId());
		assertEquals(3, userRepository.count());
		
		userRepository.delete(savedUser1);
		userRepository.delete(savedUser);
		assertEquals(1, userRepository.count());
		
		User foundUser = userRepository.findById(3);
		System.out.println(userRepository.findById(2));
		System.out.println(userRepository.findById(1));
		assertSame(foundUser, savedUser2);
		
	}
	
	@Test
	@DisplayName("Delete by id: i can delete a user by id")
	public void deleteUser_IdIsDeleted(){
//		Given that i have a user
		User user1 = new User();
		User user2 = new User();
//		If I saved the user, whether by id or by user itself
		userRepository.save(user1);
		userRepository.save(user2);
//		I can delete the users by their id
		userRepository.delete(1);
		userRepository.delete(2);
		
		assertEquals(1, user1.getUserId());
		assertEquals(0, user2.getUserId());
		System.out.println(userRepository.count());
		System.out.println(user1);
		System.out.println(user2);
	}
	
	
}