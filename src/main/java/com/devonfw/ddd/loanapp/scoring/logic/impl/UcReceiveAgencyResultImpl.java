package com.devonfw.ddd.loanapp.scoring.logic.impl;

import com.devonfw.ddd.loanapp.scoring.common.api.to.AgencyResultDto;
import com.devonfw.ddd.loanapp.scoring.domain.model.AgencyResult;
import com.devonfw.ddd.loanapp.scoring.domain.model.Application;
import com.devonfw.ddd.loanapp.scoring.domain.model.DetailedScoringResults;
import com.devonfw.ddd.loanapp.scoring.domain.repo.ApplicationRepository;
import com.devonfw.ddd.loanapp.scoring.logic.api.UcReceiveAgencyResult;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class UcReceiveAgencyResultImpl implements UcReceiveAgencyResult {

    @Inject
    private AgencyResultMapper mapper;

    @Inject UcFinalScoring ucFinalScoring;

    @Inject
    private ApplicationRepository repository;

    @Override
    public void receiveAgencyResult(AgencyResultDto resultDto) {
        AgencyResult result = mapper.fromDto(resultDto);
        Application application = repository.findByPerson(
                resultDto.getFirstName(),
                resultDto.getLastName(),
                resultDto.getPostCode(),
                resultDto.getStreet());
        application.getApplicant().setAgencyResult(result);
        final DetailedScoringResults detailedScoringResults = application.getScoringResult().getDetailedScoringResults();
        detailedScoringResults.setAgencyScoringResult(scoreAgencyResult(result));
        detailedScoringResults.setNoGoCriteriaPresent(result.getKoCriteria().size() > 0);
        ucFinalScoring.performFinalScoring(application);
        repository.save(application);
    }

    private int scoreAgencyResult(AgencyResult entity) {

        int result = 0;
        if (entity.getKoCriteria().size() > 0) {
            return result;
        }
        if (entity.getWarnings().size() == 0) {
            result += 5;
        }
        if (entity.getPoints() > 90) {
            result += 15;
        } else if (entity.getPoints() > 85) {
            result += 10;
        } else if (entity.getPoints() > 80) {
            result += 5;
        }
        return result;
    }
}
