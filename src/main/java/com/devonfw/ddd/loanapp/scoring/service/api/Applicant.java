package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Data
public class Applicant implements Serializable {
	private Long databaseId;

	private String applicationNumber;

	private String applicantNumber;

	private String customerNumber;

	private String firstName;

	private String lastName;

	private Address address;

	private MaritalStatus maritalStatus;

	private Business business;

	private Employment employment;

	private String employer;

	private Date employedSince;

	private Date birthday;

}
