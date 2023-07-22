package Shitta.Service;

import Shitta.data.repositories.EventRepository;
import Shitta.dto.Request.RegisteredUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements IEventService{
	
	@Autowired
	private EventRepository eventRepository;
	
	public void registerNewUser(RegisteredUserRequest userRequest){
	
	}
}
