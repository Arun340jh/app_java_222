package Flightreservatinonapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
