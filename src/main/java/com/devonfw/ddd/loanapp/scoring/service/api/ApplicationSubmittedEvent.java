package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.Data;

import java.util.Date;

@Data
public class ApplicationSubmittedEvent {
	private String applicationNumber;
	private Date timestamp;
	private Applicant firstApplicant;
	private Applicant secondApplicant;
	private Household household;
	private RealEstateProperty realEstateProperty;
	private Financing financing;

}
