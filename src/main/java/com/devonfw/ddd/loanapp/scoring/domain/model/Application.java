package com.devonfw.ddd.loanapp.scoring.domain.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Builder
public class Application {

    @Id
    @NotNull
    private String applicationNumber;

    @Embedded
    @NotNull
    private Applicant applicant;

    @Embedded
    private ScoringResult scoringResult;

    public ScoringResult getScoringResult() {
        if(scoringResult == null)
            scoringResult = new ScoringResult();
        return scoringResult;
    }
}
