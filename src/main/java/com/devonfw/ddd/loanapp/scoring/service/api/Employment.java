package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Employment {
	EMPLOYEE("Employee"), OFFICIAL("Official"),
	PENSIONER("Pensioner"),
	STUDENT("Student"),
	TRAINEE("Trainee"),
	FREELANCER("Freelancer"),
	UNEMPLOYED("Unemployed"),
	OTHER("Other");

	private final String displayName;
}
