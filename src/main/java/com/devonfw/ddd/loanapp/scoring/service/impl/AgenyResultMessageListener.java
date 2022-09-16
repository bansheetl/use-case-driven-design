package com.devonfw.ddd.loanapp.scoring.service.impl;

import com.devonfw.ddd.loanapp.scoring.common.api.to.AgencyResultDto;
import com.devonfw.ddd.loanapp.scoring.logic.api.UcReceiveAgencyResult;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class AgenyResultMessageListener {

    @Inject
    private UcReceiveAgencyResult ucReceiveAgencyResult;

    @Incoming("applicationSubmittedIn")
    public void receiveAgencyResultMessage(AgencyResultDto event) {

        ucReceiveAgencyResult.receiveAgencyResult(event);
    }
}
