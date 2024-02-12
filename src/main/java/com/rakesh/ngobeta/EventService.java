package com.rakesh.ngobeta;


public interface EventService {

	   Event createEvent(String username, String email, String password);
	   Event getEventById(int eventId);
	    void updateEvent(Event event);
	    void deleteEvent(int eventId);


}


