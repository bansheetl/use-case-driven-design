package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MaritalStatus {
	SINGLE("Single"),
	MARRIED("Married"),
	DIVORCED("Divorced"),
	WIDOWED("Widowed");

	private final String displayName;
}
