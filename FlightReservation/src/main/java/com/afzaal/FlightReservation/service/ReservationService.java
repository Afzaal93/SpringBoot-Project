package com.afzaal.FlightReservation.service;


import com.afzaal.FlightReservation.DTO.ReservationRequest;
import com.afzaal.FlightReservation.Entities.Reservation;

public interface ReservationService {
	Reservation Bookflight(ReservationRequest request);
}
