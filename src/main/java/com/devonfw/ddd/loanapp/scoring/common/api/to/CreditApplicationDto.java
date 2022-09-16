package com.devonfw.ddd.loanapp.scoring.common.api.to;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "with")
public class CreditApplicationDto {
	private String applicationNumber;
	private ApplicantDto applicant;
	private FinancialSituationDto financialSituation;
}
