package Flightreservatinonapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
