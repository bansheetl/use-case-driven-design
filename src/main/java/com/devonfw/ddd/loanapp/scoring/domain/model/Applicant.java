package com.devonfw.ddd.loanapp.scoring.domain.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Embeddable
@Data
@Builder
public class Applicant {
	private String personId;
	private String name;
	private String lastName;
	private String city;
	private String postCode;
	private String street;
	private int balance;
	@Embedded
	private FinancialSituation financialSituation;
	@Embedded
	private AgencyResult agencyResult;

	public FinancialSituation getFinancialSituation() {
		if (financialSituation == null)
			financialSituation = new FinancialSituation();
		return financialSituation;
	}

	public AgencyResult getAgencyResult() {
		if(agencyResult == null)
			agencyResult = new AgencyResult();
		return agencyResult;
	}
}
