package com.devonfw.ddd.loanapp.scoring.service.api;


import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class Financing implements Serializable {
	private Long databaseId;

	private String applicationNumber;

	private int financingNeeds;

	private OwnResources ownResources;

	private PurchaseCosts purchaseCosts;

	private List<Loan> loans;
}
