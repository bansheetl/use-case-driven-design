package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class OwnResources implements Serializable {
	private int liquidAssets;
	private int balanceFromBuildingSociety;
	private int ownManpower;
}
