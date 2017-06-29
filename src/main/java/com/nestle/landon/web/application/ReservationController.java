package com.nestle.landon.web.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nestle.landon.bussines.domain.RoomReservation;
import com.nestle.landon.bussiness.service.ReservationService;

import java.util.List;

@Controller
public class ReservationController {
	
    @Autowired
    private ReservationService reservationService;

    @RequestMapping(value = "/reservations", method = RequestMethod.POST)
    public String getReservations(@RequestParam(value="date", required=false)String dateString, Model model){
        List<RoomReservation> roomReservationList = this.reservationService.getRoomReservationsForDate(dateString);
        model.addAttribute("roomReservations", roomReservationList);
        return "reservations";
    }
}
