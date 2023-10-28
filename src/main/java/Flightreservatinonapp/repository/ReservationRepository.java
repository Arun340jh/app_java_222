package Flightreservatinonapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
