package com.ch.multitenancy.repositories;

import com.ch.multitenancy.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
