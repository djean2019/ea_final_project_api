package edu.miu.cs.cs544.service.response;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;


import edu.miu.cs.cs544.domain.appt_reservation.Appointment;
import edu.miu.cs.cs544.domain.appt_reservation.Reservation;
import edu.miu.cs.cs544.domain.user.UserRole;

public class UserResponse {
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String gender;
	private String username;
	private String password;
	
	private UserRole role;
	
	private List<Appointment> appointments;
	
	private List<Reservation> reservations;
	
	public UserResponse() {
		super();
	}

	public UserResponse(String firstname, String lastname, @Email String email, String gender, String username, String password,
			UserRole role) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.gender = gender;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public UserResponse(String firstname, String lastname, @Email String email, String gender, String username,
			String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.gender = gender;
		this.username = username;
		this.password = password;
	}
	
	public void addAppointment(Appointment appointment) {
		appointments.add(appointment);
	}
	
	public void addReservation(Reservation reservation) {
		reservations.add(reservation);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	
}
