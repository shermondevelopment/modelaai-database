package com.cars.cars.dto;

public record CarDTO(
        String modelo,
        String fabricante,
        String dataFabricacao,
        double valor,
        int anoModelo) {

}
