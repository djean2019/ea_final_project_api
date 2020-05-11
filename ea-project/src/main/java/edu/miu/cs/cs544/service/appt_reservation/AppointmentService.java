package edu.miu.cs.cs544.service.appt_reservation;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.miu.cs.cs544.domain.appt_reservation.Appointment;

@Service
public interface AppointmentService {
	public void createAppointment(Appointment appointment);
	public List<Appointment> getAllAppointments();
	public Appointment getAppointmentById(int id);
}
