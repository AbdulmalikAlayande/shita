package tdd;

import Shitta.data.models.Event;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventRepositoryImplTest {
	EventRepositoryImpl eventRepository;
	@BeforeEach
	void setUp() {
		eventRepository = new EventRepositoryImpl();
	}
	
	@AfterEach
	void tearDown() {
	}
	
	@Test
	@DisplayName("Test that count of events increments if i save one event")
	public void saveOneEvent_countIsIncrementingTest(){
		assertEquals(0, eventRepository.count());
		Event event = new Event();
		eventRepository.save(event);
		assertEquals(1, eventRepository.count());
	}
}