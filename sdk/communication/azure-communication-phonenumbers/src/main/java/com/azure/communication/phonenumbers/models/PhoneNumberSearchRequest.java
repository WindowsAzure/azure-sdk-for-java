// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PhoneNumberSearchRequest model. */
@Fluent
public final class PhoneNumberSearchRequest {
    /*
     * The type of phone numbers to search for, e.g. geographic, or tollFree.
     */
    @JsonProperty(value = "phoneNumberType", required = true)
    private PhoneNumberType phoneNumberType;

    /*
     * The assignment type of the phone numbers to search for. A phone number
     * can be assigned to a person, or to an application.
     */
    @JsonProperty(value = "assignmentType", required = true)
    private PhoneNumberAssignmentType assignmentType;

    /*
     * Capabilities of a phone number.
     */
    @JsonProperty(value = "capabilities", required = true)
    private PhoneNumberCapabilities capabilities;

    /*
     * The area code of the desired phone number, e.g. 425.
     */
    @JsonProperty(value = "areaCode")
    private String areaCode;

    /*
     * The quantity of desired phone numbers. The default value is 1.
     */
    @JsonProperty(value = "quantity")
    private Integer quantity;

    /**
     * Get the phoneNumberType property: The type of phone numbers to search for, e.g. geographic, or tollFree.
     *
     * @return the phoneNumberType value.
     */
    public PhoneNumberType getPhoneNumberType() {
        return this.phoneNumberType;
    }

    /**
     * Set the phoneNumberType property: The type of phone numbers to search for, e.g. geographic, or tollFree.
     *
     * @param phoneNumberType the phoneNumberType value to set.
     * @return the PhoneNumberSearchRequest object itself.
     */
    public PhoneNumberSearchRequest setPhoneNumberType(PhoneNumberType phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
        return this;
    }

    /**
     * Get the assignmentType property: The assignment type of the phone numbers to search for. A phone number can be
     * assigned to a person, or to an application.
     *
     * @return the assignmentType value.
     */
    public PhoneNumberAssignmentType getAssignmentType() {
        return this.assignmentType;
    }

    /**
     * Set the assignmentType property: The assignment type of the phone numbers to search for. A phone number can be
     * assigned to a person, or to an application.
     *
     * @param assignmentType the assignmentType value to set.
     * @return the PhoneNumberSearchRequest object itself.
     */
    public PhoneNumberSearchRequest setAssignmentType(PhoneNumberAssignmentType assignmentType) {
        this.assignmentType = assignmentType;
        return this;
    }

    /**
     * Get the capabilities property: Capabilities of a phone number.
     *
     * @return the capabilities value.
     */
    public PhoneNumberCapabilities getCapabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: Capabilities of a phone number.
     *
     * @param capabilities the capabilities value to set.
     * @return the PhoneNumberSearchRequest object itself.
     */
    public PhoneNumberSearchRequest setCapabilities(PhoneNumberCapabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the areaCode property: The area code of the desired phone number, e.g. 425.
     *
     * @return the areaCode value.
     */
    public String getAreaCode() {
        return this.areaCode;
    }

    /**
     * Set the areaCode property: The area code of the desired phone number, e.g. 425.
     *
     * @param areaCode the areaCode value to set.
     * @return the PhoneNumberSearchRequest object itself.
     */
    public PhoneNumberSearchRequest setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * Get the quantity property: The quantity of desired phone numbers. The default value is 1.
     *
     * @return the quantity value.
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * Set the quantity property: The quantity of desired phone numbers. The default value is 1.
     *
     * @param quantity the quantity value to set.
     * @return the PhoneNumberSearchRequest object itself.
     */
    public PhoneNumberSearchRequest setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
}
