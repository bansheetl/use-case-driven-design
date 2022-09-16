package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Basement {
	NOT_PRESENT("Not present"),
	PARTLY_DEVELOPED("Partly developed"),
	FULLY_DEVELOPED("Fully developed");

	private final String displayName;
}
