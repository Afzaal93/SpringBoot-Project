package com.afzaal.FlightReservation.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afzaal.FlightReservation.Entities.Flight;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Long>{

}
