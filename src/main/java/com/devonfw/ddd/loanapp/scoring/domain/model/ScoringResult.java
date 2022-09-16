package com.devonfw.ddd.loanapp.scoring.domain.model;

import lombok.*;

import javax.persistence.*;

@Embeddable
@Builder()
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ScoringResult {

	private Integer scorePoints;

	private ScoringColor scoreColor;

	@Embedded()
	private DetailedScoringResults detailedScoringResults;

	public DetailedScoringResults getDetailedScoringResults() {
		if (detailedScoringResults == null)
			detailedScoringResults = new DetailedScoringResults();
		return detailedScoringResults;
	}
}
