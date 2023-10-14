package com.afzaal.FlightReservation.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afzaal.FlightReservation.Entities.Reservation;
@Repository
public interface ReservationRepo extends JpaRepository<Reservation , Long> {

}
