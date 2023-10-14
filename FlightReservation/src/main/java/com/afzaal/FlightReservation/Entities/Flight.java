package com.afzaal.FlightReservation.Entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.afzaal.FlightReservation.AbstractEntities.AbstractEntities;

@Entity
public class Flight extends AbstractEntities {
	private String flightnumber;
	private String operatingairline;
	private String departurecity;
	private String arrivalcity;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private String dateofdeparture;
	@DateTimeFormat(pattern = "HH:mm:ss")
	private String estimatedDepartureTime;

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flight(String flightnumber, String operatingairline, String departurecity, String arrivalcity,
			String dateofdeparture, String estimatedDepartureTime) {
		super();
		this.flightnumber = flightnumber;
		this.operatingairline = operatingairline;
		this.departurecity = departurecity;
		this.arrivalcity = arrivalcity;
		this.dateofdeparture = dateofdeparture;
		this.estimatedDepartureTime = estimatedDepartureTime;
	}

	@Override
	public String toString() {
		return "Flight [flightnumber=" + flightnumber + ", operatingairline=" + operatingairline + ", departurecity="
				+ departurecity + ", arrivalcity=" + arrivalcity + ", dateofdeparture=" + dateofdeparture
				+ ", estimatedDepartureTime=" + estimatedDepartureTime + "]";
	}

	public String getFlightnumber() {
		return flightnumber;
	}

	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}

	public String getOperatingairline() {
		return operatingairline;
	}

	public void setOperatingairline(String operatingairline) {
		this.operatingairline = operatingairline;
	}

	public String getDeparturecity() {
		return departurecity;
	}

	public void setDeparturecity(String departurecity) {
		this.departurecity = departurecity;
	}

	public String getArrivalcity() {
		return arrivalcity;
	}

	public void setArrivalcity(String arrivalcity) {
		this.arrivalcity = arrivalcity;
	}

	public String getDateofdeparture() {
		return dateofdeparture;
	}

	public void setDateofdeparture(String dateofdeparture) {
		this.dateofdeparture = dateofdeparture;
	}

	public String getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(String estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}

}
