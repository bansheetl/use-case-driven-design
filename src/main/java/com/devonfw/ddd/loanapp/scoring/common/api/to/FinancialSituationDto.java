package com.devonfw.ddd.loanapp.scoring.common.api.to;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class FinancialSituationDto {
	private MoneyDto costOfLiving;
	private MoneyDto furtherIncome;
	private MoneyDto rent;
	private MoneyDto salary;
}
