/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The shipping address of the customer.
 */
public class Address {
    /**
     * The address line1.
     */
    @JsonProperty(value = "addressLine1", required = true)
    private String addressLine1;

    /**
     * The address line2.
     */
    @JsonProperty(value = "addressLine2")
    private String addressLine2;

    /**
     * The address line3.
     */
    @JsonProperty(value = "addressLine3")
    private String addressLine3;

    /**
     * The postal code.
     */
    @JsonProperty(value = "postalCode", required = true)
    private String postalCode;

    /**
     * The city name.
     */
    @JsonProperty(value = "city", required = true)
    private String city;

    /**
     * The state name.
     */
    @JsonProperty(value = "state", required = true)
    private String state;

    /**
     * The country name.
     */
    @JsonProperty(value = "country", required = true)
    private String country;

    /**
     * Get the address line1.
     *
     * @return the addressLine1 value
     */
    public String addressLine1() {
        return this.addressLine1;
    }

    /**
     * Set the address line1.
     *
     * @param addressLine1 the addressLine1 value to set
     * @return the Address object itself.
     */
    public Address withAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * Get the address line2.
     *
     * @return the addressLine2 value
     */
    public String addressLine2() {
        return this.addressLine2;
    }

    /**
     * Set the address line2.
     *
     * @param addressLine2 the addressLine2 value to set
     * @return the Address object itself.
     */
    public Address withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * Get the address line3.
     *
     * @return the addressLine3 value
     */
    public String addressLine3() {
        return this.addressLine3;
    }

    /**
     * Set the address line3.
     *
     * @param addressLine3 the addressLine3 value to set
     * @return the Address object itself.
     */
    public Address withAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
        return this;
    }

    /**
     * Get the postal code.
     *
     * @return the postalCode value
     */
    public String postalCode() {
        return this.postalCode;
    }

    /**
     * Set the postal code.
     *
     * @param postalCode the postalCode value to set
     * @return the Address object itself.
     */
    public Address withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get the city name.
     *
     * @return the city value
     */
    public String city() {
        return this.city;
    }

    /**
     * Set the city name.
     *
     * @param city the city value to set
     * @return the Address object itself.
     */
    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get the state name.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state name.
     *
     * @param state the state value to set
     * @return the Address object itself.
     */
    public Address withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the country name.
     *
     * @return the country value
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country name.
     *
     * @param country the country value to set
     * @return the Address object itself.
     */
    public Address withCountry(String country) {
        this.country = country;
        return this;
    }

}
