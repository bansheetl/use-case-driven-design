package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class PurchaseCosts implements Serializable {
	private int priceOfLand;
	private int purchasePrice;
	private int reconstructionCosts;
	private int additionalPurchaseCharges;
}
