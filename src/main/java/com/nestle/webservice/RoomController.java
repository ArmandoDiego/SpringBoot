package com.nestle.webservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.nestle.landon.data.repository.RoomRepository;
import com.nestle.landon.data.entity.Room;
@RestController
public class RoomController {

	@Autowired
	private RoomRepository repositoy;
	
	@RequestMapping(value="/rooms", method= RequestMethod.GET)
	List<Room> findAll(@RequestParam(required=false) String roomNumber){
		List<Room> rooms =new ArrayList<>();
		if(null==roomNumber){
			Iterable<Room> results=this.repositoy.findAll();
			results.forEach(room->{
				rooms.add(room);
			});
		}else{
			Room room=this.repositoy.findByNumber(roomNumber);
			if(null!=room){
				rooms.add(room);
			}
		}
		return rooms;
	}
	
}
