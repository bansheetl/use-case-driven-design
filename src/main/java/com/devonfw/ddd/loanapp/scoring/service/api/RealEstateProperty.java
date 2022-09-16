package com.devonfw.ddd.loanapp.scoring.service.api;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
public class RealEstateProperty implements Serializable {
	private Long databaseId;
	private String applicationNumber;

	private String street;

	private String houseNumber;

	private String postCode;

	private String city;
	private String yearOfConstruction;

	private int livingSpaceSqm;
	private int landAreaSqm;

	private TypeOfUse typeOfUse;

	private ObjectType objectType;

	private UsageOfLoan usageOfLoan;

	private Construction construction;

	private Interior interior;

	private Attic attic;

	private Basement basement;

	private Set<Feature> features;

	private int numberOfFloors;

	private Date lastModernization;

	private ApartmentInformation apartmentInformation;
}
