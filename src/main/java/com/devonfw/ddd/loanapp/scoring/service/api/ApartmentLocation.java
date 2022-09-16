package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApartmentLocation {
	BASEMENT_FLOOR("Basement floor"),
	GROUND_FLOOR("Ground floor"),
	UPPER_FLOOR("Upper floor"),
	PENTHOUSE("Penthouse");

	private final String displayName;
}
