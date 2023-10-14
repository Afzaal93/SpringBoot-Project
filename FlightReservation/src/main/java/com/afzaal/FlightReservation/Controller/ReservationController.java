package com.afzaal.FlightReservation.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.afzaal.FlightReservation.DTO.ReservationRequest;
import com.afzaal.FlightReservation.Dao.FlightRepo;
import com.afzaal.FlightReservation.Dao.ReservationRepo;
import com.afzaal.FlightReservation.Entities.Flight;
import com.afzaal.FlightReservation.Entities.Reservation;
import com.afzaal.FlightReservation.service.ReservationService;

@Controller
public class ReservationController {
@Autowired
	private FlightRepo flightRepo;
@Autowired
private ReservationRepo  reservationRepo;
@Autowired
private ReservationService service;

@RequestMapping("/showCompleteReservation")
public String showCompleteResservation(@RequestParam("flightId") Long flightid,ModelMap map) {
	Flight findById = flightRepo.findById(flightid).get();
	map.addAttribute("flight", findById);
	return "reservation/completeResrvation";
}

@RequestMapping("/completeReservation")
public String CompleteReservation(ReservationRequest request,ModelMap map) {
	Reservation bookflight = service.Bookflight(request);
	map.addAttribute("msg","Reservation Created successfully and id is"+bookflight.getId());
	
	map.addAttribute("flight", bookflight.getId());
	return "reservation/reservationConfirm";
}

@RequestMapping("/completeCheckedIn")
public String getcheckedInpage(@RequestParam("reservationId")Long id,ModelMap map) {
	Reservation reservation = reservationRepo.findById(id).get();
	map.addAttribute("resdetail",reservation);
	return "reservation/sucess";
}
	

}
