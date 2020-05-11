package edu.miu.cs.cs544.domain.appt_reservation;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Value;

import edu.miu.cs.cs544.domain.user.User;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Status status;
	private LocalDate dateAndTime;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private User consumer;
	
	@ManyToOne
	private Appointment appointment;
	
	public Reservation() {
		super();
	}
	
	public Reservation(Status status, LocalDate dateAndTime, User consumer) {
		super();
		this.status = status;
		this.dateAndTime = dateAndTime;
		this.consumer = consumer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDate getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(LocalDate dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public User getConsumer() {
		return consumer;
	}

	public void setConsumer(User consumer) {
		this.consumer = consumer;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	
}
