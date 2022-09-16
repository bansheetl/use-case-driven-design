package com.devonfw.ddd.loanapp.scoring.common.api.to;

import lombok.Data;

import java.math.BigDecimal;

@Data
public final class MoneyDto {
	private final static int DEFAULT_SCALE = 2;
	private BigDecimal amount;
	private int scale;

	public MoneyDto() {
		this(BigDecimal.ZERO);
	}

	public MoneyDto(BigDecimal amount) {
		this.amount = amount;
		this.scale = DEFAULT_SCALE;
	}
	public MoneyDto(int amount) {
		this(new BigDecimal(amount));
	}
}
