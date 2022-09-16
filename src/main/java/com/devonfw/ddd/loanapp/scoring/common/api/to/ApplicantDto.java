package com.devonfw.ddd.loanapp.scoring.common.api.to;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ApplicantDto {
	private String firstName;
	private String lastName;
	private String street;
	private String postCode;
	private String city;
	private int balance;

}
