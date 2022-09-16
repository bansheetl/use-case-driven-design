package com.devonfw.ddd.loanapp.scoring.logic.impl;

import com.devonfw.ddd.loanapp.scoring.common.api.to.CreditApplicationDto;
import com.devonfw.ddd.loanapp.scoring.domain.model.Applicant;
import com.devonfw.ddd.loanapp.scoring.domain.model.Application;
import com.devonfw.ddd.loanapp.scoring.domain.model.DetailedScoringResults;
import com.devonfw.ddd.loanapp.scoring.domain.model.FinancialSituation;
import com.devonfw.ddd.loanapp.scoring.logic.api.UcReceiveApplication;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class UcReceiveApplicationImpl implements UcReceiveApplication {

    @Inject
    private ApplicationMapper mapper;

    @Inject
    private UcScoreFinancialSituation scoreFinancialSituation;
    @Inject
    private UcScoreApplicant scoreApplicant;


    @Override
    public void receive(CreditApplicationDto creditApplication) {
        Application application = mapper.fromDto(creditApplication);
        final DetailedScoringResults detailedScoringResults = application.getScoringResult().getDetailedScoringResults();
        detailedScoringResults.setFinancialSituationScoringResult(scoreFinancialSituation.scoreFinancialSituation(application.getApplicant().getFinancialSituation()));
        detailedScoringResults.setApplicantScoringResult(scoreApplicant.scoreApplicant(application.getApplicant()));
        // TODO call final scoring!
        // TODO persist
    }
}
