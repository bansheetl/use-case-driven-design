package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Construction {
	PREFABRICATED_HOUSE("Prefabricated house"),
	WOOD("Wood"),
	STONE("Stone");

	private final String displayName;

}
