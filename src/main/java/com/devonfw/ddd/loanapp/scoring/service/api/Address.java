package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Address implements Serializable {
	private String street;

	private String postCode;

	private String city;
}
