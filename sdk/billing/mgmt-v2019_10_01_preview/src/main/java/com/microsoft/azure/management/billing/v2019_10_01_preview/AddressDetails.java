/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Address details.
 */
public class AddressDetails {
    /**
     * First Name.
     */
    @JsonProperty(value = "firstName")
    private String firstName;

    /**
     * Last Name.
     */
    @JsonProperty(value = "lastName")
    private String lastName;

    /**
     * Company Name.
     */
    @JsonProperty(value = "companyName")
    private String companyName;

    /**
     * Address Line1.
     */
    @JsonProperty(value = "addressLine1")
    private String addressLine1;

    /**
     * Address Line2.
     */
    @JsonProperty(value = "addressLine2")
    private String addressLine2;

    /**
     * Address Line3.
     */
    @JsonProperty(value = "addressLine3")
    private String addressLine3;

    /**
     * Address City.
     */
    @JsonProperty(value = "city")
    private String city;

    /**
     * Address Region.
     */
    @JsonProperty(value = "region")
    private String region;

    /**
     * Country code uses ISO2, 2-digit format.
     */
    @JsonProperty(value = "country")
    private String country;

    /**
     * Address Postal Code.
     */
    @JsonProperty(value = "postalCode")
    private String postalCode;

    /**
     * Get first Name.
     *
     * @return the firstName value
     */
    public String firstName() {
        return this.firstName;
    }

    /**
     * Set first Name.
     *
     * @param firstName the firstName value to set
     * @return the AddressDetails object itself.
     */
    public AddressDetails withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get last Name.
     *
     * @return the lastName value
     */
    public String lastName() {
        return this.lastName;
    }

    /**
     * Set last Name.
     *
     * @param lastName the lastName value to set
     * @return the AddressDetails object itself.
     */
    public AddressDetails withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get company Name.
     *
     * @return the companyName value
     */
    public String companyName() {
        return this.companyName;
    }

    /**
     * Set company Name.
     *
     * @param companyName the companyName value to set
     * @return the AddressDetails object itself.
     */
    public AddressDetails withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * Get address Line1.
     *
     * @return the addressLine1 value
     */
    public String addressLine1() {
        return this.addressLine1;
    }

    /**
     * Set address Line1.
     *
     * @param addressLine1 the addressLine1 value to set
     * @return the AddressDetails object itself.
     */
    public AddressDetails withAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * Get address Line2.
     *
     * @return the addressLine2 value
     */
    public String addressLine2() {
        return this.addressLine2;
    }

    /**
     * Set address Line2.
     *
     * @param addressLine2 the addressLine2 value to set
     * @return the AddressDetails object itself.
     */
    public AddressDetails withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * Get address Line3.
     *
     * @return the addressLine3 value
     */
    public String addressLine3() {
        return this.addressLine3;
    }

    /**
     * Set address Line3.
     *
     * @param addressLine3 the addressLine3 value to set
     * @return the AddressDetails object itself.
     */
    public AddressDetails withAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
        return this;
    }

    /**
     * Get address City.
     *
     * @return the city value
     */
    public String city() {
        return this.city;
    }

    /**
     * Set address City.
     *
     * @param city the city value to set
     * @return the AddressDetails object itself.
     */
    public AddressDetails withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get address Region.
     *
     * @return the region value
     */
    public String region() {
        return this.region;
    }

    /**
     * Set address Region.
     *
     * @param region the region value to set
     * @return the AddressDetails object itself.
     */
    public AddressDetails withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get country code uses ISO2, 2-digit format.
     *
     * @return the country value
     */
    public String country() {
        return this.country;
    }

    /**
     * Set country code uses ISO2, 2-digit format.
     *
     * @param country the country value to set
     * @return the AddressDetails object itself.
     */
    public AddressDetails withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get address Postal Code.
     *
     * @return the postalCode value
     */
    public String postalCode() {
        return this.postalCode;
    }

    /**
     * Set address Postal Code.
     *
     * @param postalCode the postalCode value to set
     * @return the AddressDetails object itself.
     */
    public AddressDetails withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

}
