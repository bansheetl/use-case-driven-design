package com.devonfw.ddd.loanapp.scoring.logic.api;

import com.devonfw.ddd.loanapp.scoring.common.api.to.CreditApplicationDto;

public interface UcReceiveApplication {
    void receive(CreditApplicationDto creditApplication);
}
