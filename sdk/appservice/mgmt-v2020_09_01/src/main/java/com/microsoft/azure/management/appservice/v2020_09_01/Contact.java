/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contact information for domain registration. If 'Domain Privacy' option is
 * not selected then the contact information is made publicly available through
 * the Whois
 * directories as per ICANN requirements.
 */
public class Contact {
    /**
     * Mailing address.
     */
    @JsonProperty(value = "addressMailing")
    private Address addressMailing;

    /**
     * Email address.
     */
    @JsonProperty(value = "email", required = true)
    private String email;

    /**
     * Fax number.
     */
    @JsonProperty(value = "fax")
    private String fax;

    /**
     * Job title.
     */
    @JsonProperty(value = "jobTitle")
    private String jobTitle;

    /**
     * First name.
     */
    @JsonProperty(value = "nameFirst", required = true)
    private String nameFirst;

    /**
     * Last name.
     */
    @JsonProperty(value = "nameLast", required = true)
    private String nameLast;

    /**
     * Middle name.
     */
    @JsonProperty(value = "nameMiddle")
    private String nameMiddle;

    /**
     * Organization contact belongs to.
     */
    @JsonProperty(value = "organization")
    private String organization;

    /**
     * Phone number.
     */
    @JsonProperty(value = "phone", required = true)
    private String phone;

    /**
     * Get mailing address.
     *
     * @return the addressMailing value
     */
    public Address addressMailing() {
        return this.addressMailing;
    }

    /**
     * Set mailing address.
     *
     * @param addressMailing the addressMailing value to set
     * @return the Contact object itself.
     */
    public Contact withAddressMailing(Address addressMailing) {
        this.addressMailing = addressMailing;
        return this;
    }

    /**
     * Get email address.
     *
     * @return the email value
     */
    public String email() {
        return this.email;
    }

    /**
     * Set email address.
     *
     * @param email the email value to set
     * @return the Contact object itself.
     */
    public Contact withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get fax number.
     *
     * @return the fax value
     */
    public String fax() {
        return this.fax;
    }

    /**
     * Set fax number.
     *
     * @param fax the fax value to set
     * @return the Contact object itself.
     */
    public Contact withFax(String fax) {
        this.fax = fax;
        return this;
    }

    /**
     * Get job title.
     *
     * @return the jobTitle value
     */
    public String jobTitle() {
        return this.jobTitle;
    }

    /**
     * Set job title.
     *
     * @param jobTitle the jobTitle value to set
     * @return the Contact object itself.
     */
    public Contact withJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Get first name.
     *
     * @return the nameFirst value
     */
    public String nameFirst() {
        return this.nameFirst;
    }

    /**
     * Set first name.
     *
     * @param nameFirst the nameFirst value to set
     * @return the Contact object itself.
     */
    public Contact withNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
        return this;
    }

    /**
     * Get last name.
     *
     * @return the nameLast value
     */
    public String nameLast() {
        return this.nameLast;
    }

    /**
     * Set last name.
     *
     * @param nameLast the nameLast value to set
     * @return the Contact object itself.
     */
    public Contact withNameLast(String nameLast) {
        this.nameLast = nameLast;
        return this;
    }

    /**
     * Get middle name.
     *
     * @return the nameMiddle value
     */
    public String nameMiddle() {
        return this.nameMiddle;
    }

    /**
     * Set middle name.
     *
     * @param nameMiddle the nameMiddle value to set
     * @return the Contact object itself.
     */
    public Contact withNameMiddle(String nameMiddle) {
        this.nameMiddle = nameMiddle;
        return this;
    }

    /**
     * Get organization contact belongs to.
     *
     * @return the organization value
     */
    public String organization() {
        return this.organization;
    }

    /**
     * Set organization contact belongs to.
     *
     * @param organization the organization value to set
     * @return the Contact object itself.
     */
    public Contact withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get phone number.
     *
     * @return the phone value
     */
    public String phone() {
        return this.phone;
    }

    /**
     * Set phone number.
     *
     * @param phone the phone value to set
     * @return the Contact object itself.
     */
    public Contact withPhone(String phone) {
        this.phone = phone;
        return this;
    }

}
