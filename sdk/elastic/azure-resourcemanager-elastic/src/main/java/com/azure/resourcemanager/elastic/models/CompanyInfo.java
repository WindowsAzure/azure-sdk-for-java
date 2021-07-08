// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Company information of the user to be passed to partners. */
@Fluent
public final class CompanyInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CompanyInfo.class);

    /*
     * Domain of the company
     */
    @JsonProperty(value = "domain")
    private String domain;

    /*
     * Business of the company
     */
    @JsonProperty(value = "business")
    private String business;

    /*
     * Number of employees in the company
     */
    @JsonProperty(value = "employeesNumber")
    private String employeesNumber;

    /*
     * State of the company location.
     */
    @JsonProperty(value = "state")
    private String state;

    /*
     * Country of the company location.
     */
    @JsonProperty(value = "country")
    private String country;

    /**
     * Get the domain property: Domain of the company.
     *
     * @return the domain value.
     */
    public String domain() {
        return this.domain;
    }

    /**
     * Set the domain property: Domain of the company.
     *
     * @param domain the domain value to set.
     * @return the CompanyInfo object itself.
     */
    public CompanyInfo withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get the business property: Business of the company.
     *
     * @return the business value.
     */
    public String business() {
        return this.business;
    }

    /**
     * Set the business property: Business of the company.
     *
     * @param business the business value to set.
     * @return the CompanyInfo object itself.
     */
    public CompanyInfo withBusiness(String business) {
        this.business = business;
        return this;
    }

    /**
     * Get the employeesNumber property: Number of employees in the company.
     *
     * @return the employeesNumber value.
     */
    public String employeesNumber() {
        return this.employeesNumber;
    }

    /**
     * Set the employeesNumber property: Number of employees in the company.
     *
     * @param employeesNumber the employeesNumber value to set.
     * @return the CompanyInfo object itself.
     */
    public CompanyInfo withEmployeesNumber(String employeesNumber) {
        this.employeesNumber = employeesNumber;
        return this;
    }

    /**
     * Get the state property: State of the company location.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: State of the company location.
     *
     * @param state the state value to set.
     * @return the CompanyInfo object itself.
     */
    public CompanyInfo withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the country property: Country of the company location.
     *
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country property: Country of the company location.
     *
     * @param country the country value to set.
     * @return the CompanyInfo object itself.
     */
    public CompanyInfo withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
