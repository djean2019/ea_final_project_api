package edu.miu.cs.cs544.service.appt_reservation;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.miu.cs.cs544.domain.appt_reservation.Reservation;


@Service
public interface ReservationService {
	public void createReservation(Reservation reservation);
	public List<Reservation> getAllReservations();
	public Reservation getReservationById(int id);
}
