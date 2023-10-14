package com.afzaal.FlightReservation.Entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.afzaal.FlightReservation.AbstractEntities.AbstractEntities;
@Entity
public class Reservation extends AbstractEntities {
	private Boolean checkedIn;
	private int numberofbags;
	@OneToOne
	private Passenger passenger;
	@OneToOne
	private Flight flight;
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(Boolean checkedIn, int numberofbags, Passenger passenger, Flight flight) {
		super();
		this.checkedIn = checkedIn;
		this.numberofbags = numberofbags;
		this.passenger = passenger;
		this.flight = flight;
	}
	public Boolean getCheckIn() {
		return checkedIn;
	}
	public void setCheckIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumberofbags() {
		return numberofbags;
	}
	public void setNumberofbags(int numberofbags) {
		this.numberofbags = numberofbags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	@Override
	public String toString() {
		return "Reservation [checkIn=" + checkedIn + ", numberofbags=" + numberofbags + ", passenger=" + passenger
				+ ", flight=" + flight + "]";
	}
	
}
