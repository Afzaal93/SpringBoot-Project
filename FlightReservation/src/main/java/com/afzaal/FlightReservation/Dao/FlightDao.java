package com.afzaal.FlightReservation.Dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.afzaal.FlightReservation.Entities.Flight;

public interface FlightDao extends JpaRepository<Flight, Long> {
	@Query(value = "from Flight where departurecity=:from and arrivalcity=:to and dateofdeparture=:dateOfDeparture")
	List<Flight> findFlights(@Param("from")String from, @Param("to") String to, @Param("dateOfDeparture") String format); 
}
