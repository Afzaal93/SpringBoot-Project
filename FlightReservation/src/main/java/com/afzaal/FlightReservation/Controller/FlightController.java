package com.afzaal.FlightReservation.Controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.afzaal.FlightReservation.Dao.FlightDao;
import com.afzaal.FlightReservation.Entities.Flight;

@Controller
public class FlightController {
	@Autowired
	private FlightDao dao;

	@RequestMapping("/SaveFlight")
	public String saveFlightForm() {
		return "Flight/SaveFlight";
	}

	@PostMapping("/SaveFlight")
	public String saveFlight(@ModelAttribute("flight") Flight flight,
			@DateTimeFormat(pattern = "yyyy-MM-dd") String dateofdeparture,
			@DateTimeFormat(pattern = "HH:mm:ss") String estimatedDepartureTime, Model model) {
		flight.setDateofdeparture(dateofdeparture);
		flight.setEstimatedDepartureTime(estimatedDepartureTime);

		Flight save = dao.save(flight);
		System.out.println(flight);
		model.addAttribute("flight", save);
		return "Flight/Flight"; // Assuming you want to redirect to the index page after saving.
	}

	@PostMapping("/find")
	public String findflight(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("dateOfDeparture") String date, Model model) {

		List<Flight> findFlights = dao.findFlights(from, to, date);
		System.out.println("flight" + findFlights);
		model.addAttribute("flights", findFlights);
		return "Flight/displayflight";
	}
}
