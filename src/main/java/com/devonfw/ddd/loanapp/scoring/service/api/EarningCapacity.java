package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class EarningCapacity implements Serializable {
	private int salaryFirstApplicant;
	private int salarySecondApplicant;
	private int rentalIncomeFinancedProperty;
	private int rentalIncomeOtherProperties;
	private int furtherIncome;
	private int childBenefit;
	private int assetsOnBankAccounts;
	private int assetsOther;

}
