/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.billing.v2019_10_01_preview.AzurePlan;
import com.microsoft.azure.management.billing.v2019_10_01_preview.Reseller;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A partner's customer.
 */
@JsonFlatten
public class CustomerInner extends ProxyResource {
    /**
     * The name of the customer.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Azure plans enabled for the customer.
     */
    @JsonProperty(value = "properties.enabledAzurePlans")
    private List<AzurePlan> enabledAzurePlans;

    /**
     * The list of resellers for which an Azure plan is enabled for the
     * customer.
     */
    @JsonProperty(value = "properties.resellers")
    private List<Reseller> resellers;

    /**
     * Get the name of the customer.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the name of the customer.
     *
     * @param displayName the displayName value to set
     * @return the CustomerInner object itself.
     */
    public CustomerInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get azure plans enabled for the customer.
     *
     * @return the enabledAzurePlans value
     */
    public List<AzurePlan> enabledAzurePlans() {
        return this.enabledAzurePlans;
    }

    /**
     * Set azure plans enabled for the customer.
     *
     * @param enabledAzurePlans the enabledAzurePlans value to set
     * @return the CustomerInner object itself.
     */
    public CustomerInner withEnabledAzurePlans(List<AzurePlan> enabledAzurePlans) {
        this.enabledAzurePlans = enabledAzurePlans;
        return this;
    }

    /**
     * Get the list of resellers for which an Azure plan is enabled for the customer.
     *
     * @return the resellers value
     */
    public List<Reseller> resellers() {
        return this.resellers;
    }

    /**
     * Set the list of resellers for which an Azure plan is enabled for the customer.
     *
     * @param resellers the resellers value to set
     * @return the CustomerInner object itself.
     */
    public CustomerInner withResellers(List<Reseller> resellers) {
        this.resellers = resellers;
        return this;
    }

}
