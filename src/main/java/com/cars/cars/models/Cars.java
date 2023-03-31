package com.cars.cars.models;

import com.cars.cars.dto.CarDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Cars {

  public Cars(CarDTO data) {
    this.modelo = data.modelo();
    this.fabricante = data.fabricante();
    this.dataFabricacao = data.dataFabricacao();
    this.valor = data.valor();
    this.anoModelo = data.anoModelo();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 50, nullable = false, unique = true)
  private String modelo;

  @Column(length = 50, nullable = false)
  private String fabricante;

  @Column(length = 20, nullable = false)
  private String dataFabricacao;

  @Column(nullable = false)
  private double valor;

  @Column(length = 20, nullable = false)
  private int anoModelo;

}
