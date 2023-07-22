package Shitta.data.repositories;

import Shitta.data.models.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {
//	Event save(Event event);
//	void delete(Event event);
//	void delete(int id);
//	List<Event> findAll();
//	Event findById(int id);
//
//	int count();
}
