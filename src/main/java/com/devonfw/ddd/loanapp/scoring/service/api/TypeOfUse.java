package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum TypeOfUse {
	FOR_LEASE("For lease"),
	SELF_OCCUPIED("Self occupied"),
	COMMERCIAL("Commercial");

	private final String displayName;

}
