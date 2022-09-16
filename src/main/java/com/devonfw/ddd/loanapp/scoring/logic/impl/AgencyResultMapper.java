package com.devonfw.ddd.loanapp.scoring.logic.impl;

import com.devonfw.ddd.loanapp.scoring.common.api.to.AgencyResultDto;
import com.devonfw.ddd.loanapp.scoring.domain.model.AgencyResult;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface AgencyResultMapper {

    @Mapping(target = "warnings", source = "warningMessages")
    AgencyResult fromDto(AgencyResultDto dto);
}
