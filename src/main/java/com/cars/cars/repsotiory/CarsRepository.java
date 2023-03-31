package com.cars.cars.repsotiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cars.cars.models.Cars;

public interface CarsRepository extends JpaRepository<Cars, Long> {

}
