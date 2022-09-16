package com.devonfw.ddd.loanapp.scoring.domain.model;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class DetailedScoringResults {
	private int applicantScoringResult;
	private int financialSituationScoringResult;
	private int agencyScoringResult;
	private boolean noGoCriteriaPresent;
}
