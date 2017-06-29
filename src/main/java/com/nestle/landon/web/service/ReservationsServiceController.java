package com.nestle.landon.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nestle.landon.bussines.domain.RoomReservation;
import com.nestle.landon.bussiness.service.ReservationService;

@RestController
@RequestMapping(value="/api")
public class ReservationsServiceController {

	
	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping(method= RequestMethod.GET, value="/reservations/{date}")
	public List<RoomReservation> getAllReservationsForDate(@PathVariable(value="date")
									String dateString){
		return this.reservationService.getRoomReservationsForDate(dateString);
		
	}
	
}
