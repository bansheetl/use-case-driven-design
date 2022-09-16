package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Business {
	BANKING("Banking"),
	ENERGY("Energy"),
	INSURANCE("Insurance"),
	CONSTRUCTION("Construction"),
	AGRICULTURE("Agriculture"),
	INDUSTRY("Industry"),
	PUBLIC_SERVICE("Public service"),
	OTHER("Other");

	private final String displayName;

}
