package com.cars.cars.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.cars.dto.CarDTO;
import com.cars.cars.models.Cars;
import com.cars.cars.repsotiory.CarsRepository;

@RestController
@RequestMapping("/api/v1/cars")
public class CarsController {

  @Autowired
  private CarsRepository repository;

  @PostMapping
  public void create(@RequestBody CarDTO req) {
    System.out.println(req.fabricante());
    repository.save(new Cars(req));
  }

}
