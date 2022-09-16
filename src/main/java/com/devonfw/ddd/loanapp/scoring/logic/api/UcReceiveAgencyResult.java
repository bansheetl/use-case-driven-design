package com.devonfw.ddd.loanapp.scoring.logic.api;

import com.devonfw.ddd.loanapp.scoring.common.api.to.AgencyResultDto;

public interface UcReceiveAgencyResult {

    void receiveAgencyResult(AgencyResultDto result);

}
