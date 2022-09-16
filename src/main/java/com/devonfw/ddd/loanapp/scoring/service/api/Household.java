package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class Household implements Serializable {
	private Long databaseId;

	private String applicationNumber;

	private int adultsInHousehold;
	private int childrenInHousehold;

	private String iban;

	private String bic;

	private EarningCapacity earningCapacity;

	private MonthlyExpenses monthlyExpenses;

}
