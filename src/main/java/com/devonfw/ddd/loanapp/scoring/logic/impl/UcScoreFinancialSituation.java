package com.devonfw.ddd.loanapp.scoring.logic.impl;

import com.devonfw.ddd.loanapp.scoring.common.api.to.CreditApplicationDto;
import com.devonfw.ddd.loanapp.scoring.common.api.to.FinancialSituationDto;
import com.devonfw.ddd.loanapp.scoring.domain.model.Applicant;
import com.devonfw.ddd.loanapp.scoring.domain.model.Application;
import com.devonfw.ddd.loanapp.scoring.domain.model.FinancialSituation;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;

@ApplicationScoped
class UcScoreFinancialSituation {

    int scoreFinancialSituation(FinancialSituation financialSituation) {
        BigDecimal incomings = financialSituation.getIncomingOther().add(financialSituation.getIncomingSalary());
        BigDecimal outgoings = financialSituation.getOutgoingRent().add(financialSituation.getOutgoingRent());
        BigDecimal monthlyBalance = incomings.subtract(outgoings);
        if(monthlyBalance.compareTo(BigDecimal.valueOf(2000d)) > 0) {
            return 35;
        } else if(monthlyBalance.compareTo(BigDecimal.valueOf(1000d)) > 0) {
            return 20;
        } else if(monthlyBalance.compareTo(BigDecimal.valueOf(750d)) > 0) {
            return 15;
        } else if(monthlyBalance.compareTo(BigDecimal.valueOf(500d)) > 0) {
            return 10;
        } else if (monthlyBalance.compareTo(BigDecimal.valueOf(250d)) > 0) {
            return 5;
        } else if(monthlyBalance. compareTo(BigDecimal.valueOf(0)) > 0) {
            return 0;
        } else {
            return -10;
        }
    }
}
