package com.devonfw.ddd.loanapp.scoring.logic.impl;

import com.devonfw.ddd.loanapp.scoring.domain.model.Applicant;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
class UcScoreApplicant {

    int scoreApplicant(Applicant applicant) {

        int balancePoints = scoreBalance(applicant.getBalance());
        int addressPoints = scoreAddress(applicant);
        return balancePoints + addressPoints;
    }

    private int scoreBalance(int balance) {
        return balance > 3000 ? 10 : 0;
    }

    private int scoreAddress(Applicant applicant) {
        String city = applicant.getCity();
        if("Munich".equals(city)) {
            return 5;
        } else if ("Dortmund".equals(city)) {
            return -2;
        } else if ("Nürnberg".equals(city)) {
            return 8;
        }else {
            return 0;
        }
    }

}
