package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class ApartmentInformation implements Serializable {
	private int numberOfApartmentsInHouse;

	private String nameOfApartment;

	private ApartmentLocation apartmentLocation;
}
