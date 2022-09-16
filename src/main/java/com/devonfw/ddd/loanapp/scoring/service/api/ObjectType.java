package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ObjectType {
	SEMI_DETACHED_HOUSE("Semi detached house"),
	ROW_HOUSE("Row house"),
	DETACHED_HOUSE("Detached house"),
	APARTMENT("Apartment");

	private final String displayName;

}
