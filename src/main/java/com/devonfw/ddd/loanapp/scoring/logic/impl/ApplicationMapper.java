package com.devonfw.ddd.loanapp.scoring.logic.impl;

import com.devonfw.ddd.loanapp.scoring.common.api.to.CreditApplicationDto;
import com.devonfw.ddd.loanapp.scoring.common.api.to.FinancialSituationDto;
import com.devonfw.ddd.loanapp.scoring.domain.model.Application;
import com.devonfw.ddd.loanapp.scoring.domain.model.FinancialSituation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ApplicationMapper {

    @Mapping(target = "scoringResult", ignore = true)
    @Mapping(target = "applicant.financialSituation", source = "financialSituation")
    Application fromDto(CreditApplicationDto dto);

    @Mapping(target = "incomingOther", source = "furtherIncome.amount")
    @Mapping(target = "incomingSalary", source = "salary.amount")
    @Mapping(target = "outgoingCostOfLiving", source = "costOfLiving.amount")
    @Mapping(target = "outgoingRent", source = "rent.amount")
    FinancialSituation fromDto(FinancialSituationDto dto);
}
