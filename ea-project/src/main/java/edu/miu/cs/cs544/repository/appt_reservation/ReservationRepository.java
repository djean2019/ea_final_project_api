package edu.miu.cs.cs544.repository.appt_reservation;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs.cs544.domain.appt_reservation.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
