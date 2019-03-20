/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.management.billing.v2018_11_01_preview.Address;
import java.util.List;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Enrollment;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A billing account resource.
 */
@JsonFlatten
public class BillingAccountInner extends ProxyResource {
    /**
     * The billing account name.
     */
    @JsonProperty(value = "properties.displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * The Company this billing account belongs to.
     */
    @JsonProperty(value = "properties.company", access = JsonProperty.Access.WRITE_ONLY)
    private String company;

    /**
     * The billing account Type. Possible values include: 'Organization',
     * 'Enrollment'.
     */
    @JsonProperty(value = "properties.accountType", access = JsonProperty.Access.WRITE_ONLY)
    private String accountType;

    /**
     * The address associated with billing account.
     */
    @JsonProperty(value = "properties.address")
    private Address address;

    /**
     * The country associated with billing account..
     */
    @JsonProperty(value = "properties.country", access = JsonProperty.Access.WRITE_ONLY)
    private String country;

    /**
     * The invoice sections associated to the billing account.
     */
    @JsonProperty(value = "properties.invoiceSections")
    private List<InvoiceSectionInner> invoiceSections;

    /**
     * The billing profiles associated to the billing account.
     */
    @JsonProperty(value = "properties.billingProfiles")
    private List<BillingProfileInner> billingProfiles;

    /**
     * The details about the associated legacy enrollment. By default this is
     * not populated, unless it's specified in $expand.
     */
    @JsonProperty(value = "properties.enrollmentDetails", access = JsonProperty.Access.WRITE_ONLY)
    private Enrollment enrollmentDetails;

    /**
     * The departments associated to the enrollment.
     */
    @JsonProperty(value = "properties.departments")
    private List<DepartmentInner> departments;

    /**
     * The accounts associated to the enrollment.
     */
    @JsonProperty(value = "properties.enrollmentAccounts")
    private List<EnrollmentAccountInner> enrollmentAccounts;

    /**
     * Get the billing account name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the Company this billing account belongs to.
     *
     * @return the company value
     */
    public String company() {
        return this.company;
    }

    /**
     * Get the billing account Type. Possible values include: 'Organization', 'Enrollment'.
     *
     * @return the accountType value
     */
    public String accountType() {
        return this.accountType;
    }

    /**
     * Get the address associated with billing account.
     *
     * @return the address value
     */
    public Address address() {
        return this.address;
    }

    /**
     * Set the address associated with billing account.
     *
     * @param address the address value to set
     * @return the BillingAccountInner object itself.
     */
    public BillingAccountInner withAddress(Address address) {
        this.address = address;
        return this;
    }

    /**
     * Get the country associated with billing account..
     *
     * @return the country value
     */
    public String country() {
        return this.country;
    }

    /**
     * Get the invoice sections associated to the billing account.
     *
     * @return the invoiceSections value
     */
    public List<InvoiceSectionInner> invoiceSections() {
        return this.invoiceSections;
    }

    /**
     * Set the invoice sections associated to the billing account.
     *
     * @param invoiceSections the invoiceSections value to set
     * @return the BillingAccountInner object itself.
     */
    public BillingAccountInner withInvoiceSections(List<InvoiceSectionInner> invoiceSections) {
        this.invoiceSections = invoiceSections;
        return this;
    }

    /**
     * Get the billing profiles associated to the billing account.
     *
     * @return the billingProfiles value
     */
    public List<BillingProfileInner> billingProfiles() {
        return this.billingProfiles;
    }

    /**
     * Set the billing profiles associated to the billing account.
     *
     * @param billingProfiles the billingProfiles value to set
     * @return the BillingAccountInner object itself.
     */
    public BillingAccountInner withBillingProfiles(List<BillingProfileInner> billingProfiles) {
        this.billingProfiles = billingProfiles;
        return this;
    }

    /**
     * Get the details about the associated legacy enrollment. By default this is not populated, unless it's specified in $expand.
     *
     * @return the enrollmentDetails value
     */
    public Enrollment enrollmentDetails() {
        return this.enrollmentDetails;
    }

    /**
     * Get the departments associated to the enrollment.
     *
     * @return the departments value
     */
    public List<DepartmentInner> departments() {
        return this.departments;
    }

    /**
     * Set the departments associated to the enrollment.
     *
     * @param departments the departments value to set
     * @return the BillingAccountInner object itself.
     */
    public BillingAccountInner withDepartments(List<DepartmentInner> departments) {
        this.departments = departments;
        return this;
    }

    /**
     * Get the accounts associated to the enrollment.
     *
     * @return the enrollmentAccounts value
     */
    public List<EnrollmentAccountInner> enrollmentAccounts() {
        return this.enrollmentAccounts;
    }

    /**
     * Set the accounts associated to the enrollment.
     *
     * @param enrollmentAccounts the enrollmentAccounts value to set
     * @return the BillingAccountInner object itself.
     */
    public BillingAccountInner withEnrollmentAccounts(List<EnrollmentAccountInner> enrollmentAccounts) {
        this.enrollmentAccounts = enrollmentAccounts;
        return this;
    }

}
