// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.keyvault.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the organization administrator of the certificate issuer.
 */
public class AdministratorDetails {
    /**
     * First name.
     */
    @JsonProperty(value = "first_name")
    private String firstName;

    /**
     * Last name.
     */
    @JsonProperty(value = "last_name")
    private String lastName;

    /**
     * Email addresss.
     */
    @JsonProperty(value = "email")
    private String emailAddress;

    /**
     * Phone number.
     */
    @JsonProperty(value = "phone")
    private String phone;

    /**
     * Get the firstName value.
     *
     * @return the firstName value
     */
    public String firstName() {
        return this.firstName;
    }

    /**
     * Set the firstName value.
     *
     * @param firstName the firstName value to set
     * @return the AdministratorDetails object itself.
     */
    public AdministratorDetails withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get the lastName value.
     *
     * @return the lastName value
     */
    public String lastName() {
        return this.lastName;
    }

    /**
     * Set the lastName value.
     *
     * @param lastName the lastName value to set
     * @return the AdministratorDetails object itself.
     */
    public AdministratorDetails withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get the emailAddress value.
     *
     * @return the emailAddress value
     */
    public String emailAddress() {
        return this.emailAddress;
    }

    /**
     * Set the emailAddress value.
     *
     * @param emailAddress the emailAddress value to set
     * @return the AdministratorDetails object itself.
     */
    public AdministratorDetails withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Get the phone value.
     *
     * @return the phone value
     */
    public String phone() {
        return this.phone;
    }

    /**
     * Set the phone value.
     *
     * @param phone the phone value to set
     * @return the AdministratorDetails object itself.
     */
    public AdministratorDetails withPhone(String phone) {
        this.phone = phone;
        return this;
    }

}
