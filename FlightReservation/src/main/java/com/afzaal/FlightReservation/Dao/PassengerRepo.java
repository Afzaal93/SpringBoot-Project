package com.afzaal.FlightReservation.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afzaal.FlightReservation.Entities.Passenger;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Long> {

}
