package com.afzaal.FlightReservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afzaal.FlightReservation.DTO.ReservationRequest;
import com.afzaal.FlightReservation.Dao.FlightRepo;
import com.afzaal.FlightReservation.Dao.PassengerRepo;
import com.afzaal.FlightReservation.Dao.ReservationRepo;
import com.afzaal.FlightReservation.Entities.Flight;
import com.afzaal.FlightReservation.Entities.Passenger;
import com.afzaal.FlightReservation.Entities.Reservation;
import com.afzaal.FlightReservation.util.EmailUtil;
import com.afzaal.FlightReservation.util.PDFgenerator;
@Service
public class ReservationserviceImpl implements ReservationService {

	@Autowired
	private FlightRepo flightRepo;
	@Autowired
	private PassengerRepo passengerRepo;
	@Autowired
	private ReservationRepo reservationRepo; 
	@Autowired
	PDFgenerator pdFgenerator;
	@Autowired
	EmailUtil emailUtil;
	@Override
	public Reservation Bookflight(ReservationRequest request) {
		
		Long flightId=request.getId();//abstract entity wala id
		Flight flight = flightRepo.findById(flightId).get();//if value is present other wise nosuchelementpresentexception
		
		Passenger passenger=new Passenger();
		passenger.setFirstname(request.getPassengerFirstName());
		passenger.setMiddlename(request.getPassengerMiddleName());
		passenger.setLastname(request.getPassengerLastName());
		passenger.setPhone(request.getPassengerPhone());
		passenger.setEmail(request.getPassengerEmail());
		
		Passenger save = passengerRepo.save(passenger);
		
		Reservation reservation=new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(save);
		reservation.setCheckIn(false);
		
		Reservation reservationsave = reservationRepo.save(reservation);
		//String filepath="‪C:\\Users\\Techskilkl\\Downloads\\Java"+reservationsave.getId()+".pdf";
		String filepath="C:\\Users\\Techskilkl\\Desktop\\afzaalpdf\\"+"Invoice"+reservationsave.getId()+".pdf";
		System.out.println(filepath);
		pdFgenerator.generatepdf(reservationsave, filepath);
		emailUtil.sendEmail(passenger.getEmail(), filepath);
		
		
		
		return reservationsave;
	}
	

	
}
