package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Loan implements Serializable {
	private Long databaseId;
	private int loanAmount;
	private int interestRate;
	private int repaymentInPercent;
	private int fixedInterestRateInYears;

	public Loan() {
		this.interestRate = 2;
	}
}
