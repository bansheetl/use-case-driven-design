package com.devonfw.ddd.loanapp.scoring.domain.model;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class AgencyMessage {
	private String key;
	private String message;

	public AgencyMessage() {
	}

	AgencyMessage(String key, String message) {
		this.key = key;
		this.message = message;
	}
}
