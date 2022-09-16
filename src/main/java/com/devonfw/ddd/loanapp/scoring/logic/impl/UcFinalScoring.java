package com.devonfw.ddd.loanapp.scoring.logic.impl;

import com.devonfw.ddd.loanapp.scoring.domain.model.Application;
import com.devonfw.ddd.loanapp.scoring.domain.model.DetailedScoringResults;
import com.devonfw.ddd.loanapp.scoring.domain.model.ScoringColor;
import com.devonfw.ddd.loanapp.scoring.domain.model.ScoringResult;
import com.devonfw.ddd.loanapp.scoring.domain.repo.ApplicationRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
class UcFinalScoring {

    @Inject
    private ApplicationRepository repository;
    
    void performFinalScoring(Application application) {
        final ScoringResult scoringResult = application.getScoringResult();
        DetailedScoringResults details = scoringResult.getDetailedScoringResults();

        // TODO check invariant!
        int overallPoints = details.getApplicantScoringResult() + details.getFinancialSituationScoringResult() + details.getAgencyScoringResult();
        ScoringColor color;
        if(details.isNoGoCriteriaPresent()) {
            color = ScoringColor.RED;
        } else {
            if (overallPoints > 40) {
                color = ScoringColor.GREEN;
            } else {
                color = ScoringColor.RED;
            }
        }
        scoringResult.setScorePoints(overallPoints);
        scoringResult.setScoreColor(color);

        repository.save(application);
    }
}
