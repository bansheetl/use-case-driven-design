package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Interior {
	STANDARD("Standard"),
	LUXURY("Luxury"),
	SIMPLE("Simple");

	private final String displayName;

}
