package Flightreservatinonapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
