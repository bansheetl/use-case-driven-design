package com.devonfw.ddd.loanapp.scoring.service.impl;


import com.devonfw.ddd.loanapp.scoring.common.api.to.ApplicantDto;
import com.devonfw.ddd.loanapp.scoring.common.api.to.CreditApplicationDto;
import com.devonfw.ddd.loanapp.scoring.common.api.to.FinancialSituationDto;
import com.devonfw.ddd.loanapp.scoring.common.api.to.MoneyDto;
import com.devonfw.ddd.loanapp.scoring.logic.api.UcReceiveApplication;
import com.devonfw.ddd.loanapp.scoring.service.api.Applicant;
import com.devonfw.ddd.loanapp.scoring.service.api.ApplicationSubmittedEvent;
import com.devonfw.ddd.loanapp.scoring.service.api.EarningCapacity;
import com.devonfw.ddd.loanapp.scoring.service.api.MonthlyExpenses;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CreditApplicationMessageListener {

	@Inject
	private UcReceiveApplication ucReceiveApplication;

	@Incoming("applicationSubmittedIn")
	public void receiveApplicationSubmission(ApplicationSubmittedEvent applicationSubmittedEvent) {
		Applicant firstApplicant = applicationSubmittedEvent.getFirstApplicant();
		MonthlyExpenses monthlyExpenses = applicationSubmittedEvent.getHousehold().getMonthlyExpenses();
		EarningCapacity earningCapacity = applicationSubmittedEvent.getHousehold().getEarningCapacity();
		CreditApplicationDto creditApplication = CreditApplicationDto.builder().withApplicationNumber(applicationSubmittedEvent.getApplicationNumber())
				.withApplicant(ApplicantDto.builder().firstName(firstApplicant.getFirstName())
								.lastName(firstApplicant.getLastName())
								.street(firstApplicant.getAddress().getStreet())
								.postCode(firstApplicant.getAddress().getPostCode())
								.city(firstApplicant.getAddress().getCity())
								.balance(applicationSubmittedEvent.getHousehold().getEarningCapacity().getAssetsOnBankAccounts())
						.build())
				.withFinancialSituation(
						new FinancialSituationDto(new MoneyDto(monthlyExpenses.getCostOfLiving()),
										new MoneyDto(earningCapacity.getFurtherIncome()),
										new MoneyDto(monthlyExpenses.getRent()),
										new MoneyDto(earningCapacity.getSalaryFirstApplicant())))
				.build();
		this.ucReceiveApplication.receive(creditApplication);


	}


}
