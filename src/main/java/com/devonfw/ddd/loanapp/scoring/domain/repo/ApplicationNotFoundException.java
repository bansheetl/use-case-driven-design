package com.devonfw.ddd.loanapp.scoring.domain.repo;

import lombok.Getter;

@Getter
public class ApplicationNotFoundException extends RuntimeException {
    private final String firstName;
    private final String lastName;
    private final String postCode;
    private final String street;

    public ApplicationNotFoundException(String firstName, String lastName, String postCode, String street) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postCode = postCode;
        this.street = street;
    }
}
