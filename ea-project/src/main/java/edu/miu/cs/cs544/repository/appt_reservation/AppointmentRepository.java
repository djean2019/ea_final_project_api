package edu.miu.cs.cs544.repository.appt_reservation;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs.cs544.domain.appt_reservation.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}
