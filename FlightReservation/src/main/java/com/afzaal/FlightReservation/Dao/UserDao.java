package com.afzaal.FlightReservation.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afzaal.FlightReservation.Entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{

	public List<User> findByEmail(String email);

}
