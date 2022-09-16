package com.devonfw.ddd.loanapp.scoring.common.api.to;

import lombok.Data;

import java.util.Set;

@Data
public class AgencyResultDto {

    private String firstName;
    private String lastName;
    private String street;
    private String postCode;
    private String city;

    private  int points;
    private Set<AgencyMessageDto> koCriteria;
    private  Set<AgencyMessageDto> warningMessages;

}
