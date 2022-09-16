package com.devonfw.ddd.loanapp.scoring.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Embeddable
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FinancialSituation {

	private BigDecimal incomingOther;
	private BigDecimal incomingSalary;
	private BigDecimal outgoingRent;
	private BigDecimal outgoingCostOfLiving;
}
