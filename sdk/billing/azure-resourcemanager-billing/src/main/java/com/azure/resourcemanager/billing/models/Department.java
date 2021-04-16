// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A department. */
@JsonFlatten
@Fluent
public class Department extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Department.class);

    /*
     * The name of the department.
     */
    @JsonProperty(value = "properties.departmentName")
    private String departmentName;

    /*
     * The cost center associated with the department.
     */
    @JsonProperty(value = "properties.costCenter")
    private String costCenter;

    /*
     * The status of the department.
     */
    @JsonProperty(value = "properties.status")
    private String status;

    /*
     * Associated enrollment accounts. By default this is not populated, unless
     * it's specified in $expand.
     */
    @JsonProperty(value = "properties.enrollmentAccounts")
    private List<EnrollmentAccount> enrollmentAccounts;

    /**
     * Get the departmentName property: The name of the department.
     *
     * @return the departmentName value.
     */
    public String departmentName() {
        return this.departmentName;
    }

    /**
     * Set the departmentName property: The name of the department.
     *
     * @param departmentName the departmentName value to set.
     * @return the Department object itself.
     */
    public Department withDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }

    /**
     * Get the costCenter property: The cost center associated with the department.
     *
     * @return the costCenter value.
     */
    public String costCenter() {
        return this.costCenter;
    }

    /**
     * Set the costCenter property: The cost center associated with the department.
     *
     * @param costCenter the costCenter value to set.
     * @return the Department object itself.
     */
    public Department withCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * Get the status property: The status of the department.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the department.
     *
     * @param status the status value to set.
     * @return the Department object itself.
     */
    public Department withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the enrollmentAccounts property: Associated enrollment accounts. By default this is not populated, unless
     * it's specified in $expand.
     *
     * @return the enrollmentAccounts value.
     */
    public List<EnrollmentAccount> enrollmentAccounts() {
        return this.enrollmentAccounts;
    }

    /**
     * Set the enrollmentAccounts property: Associated enrollment accounts. By default this is not populated, unless
     * it's specified in $expand.
     *
     * @param enrollmentAccounts the enrollmentAccounts value to set.
     * @return the Department object itself.
     */
    public Department withEnrollmentAccounts(List<EnrollmentAccount> enrollmentAccounts) {
        this.enrollmentAccounts = enrollmentAccounts;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (enrollmentAccounts() != null) {
            enrollmentAccounts().forEach(e -> e.validate());
        }
    }
}
