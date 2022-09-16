package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ParkingSpace {
	NOT_PRESENT("Not present"),
	CARPORT("Carport"),
	GARAGE("Garage");

	private final String displayName;

}
