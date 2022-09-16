package com.devonfw.ddd.loanapp.scoring.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AgencyResult {

	private int points;

	@ElementCollection
	private Set<AgencyMessage> koCriteria = new HashSet<>();

	@ElementCollection
	private Set<AgencyMessage> warnings = new HashSet<>();
}
