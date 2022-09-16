package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class MonthlyExpenses implements Serializable {
	private int healthInsuranceFirstApplicant;
	private int healthInsuranceSecondApplicant;
	private int otherLoansRemainderOfDebt;
	private int otherLoansMonthlyRepayments;
	private int costOfLiving;
	private int rent;
	private boolean rentNotApplicableInFuture;
}
