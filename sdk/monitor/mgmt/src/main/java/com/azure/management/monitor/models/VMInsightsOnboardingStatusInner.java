// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.management.monitor.DataContainer;
import com.azure.management.monitor.DataStatus;
import com.azure.management.monitor.OnboardingStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VMInsightsOnboardingStatus model. */
@JsonFlatten
@Fluent
public class VMInsightsOnboardingStatusInner extends ProxyResource {
    /*
     * Azure Resource Manager identifier of the resource whose onboarding
     * status is being represented.
     */
    @JsonProperty(value = "properties.resourceId")
    private String resourceId;

    /*
     * The onboarding status for the resource. Note that, a higher level scope,
     * e.g., resource group or subscription, is considered onboarded if at
     * least one resource under it is onboarded.
     */
    @JsonProperty(value = "properties.onboardingStatus")
    private OnboardingStatus onboardingStatus;

    /*
     * The status of VM Insights data from the resource. When reported as
     * `present` the data array will contain information about the data
     * containers to which data for the specified resource is being routed.
     */
    @JsonProperty(value = "properties.dataStatus")
    private DataStatus dataStatus;

    /*
     * Containers that currently store VM Insights data for the specified
     * resource.
     */
    @JsonProperty(value = "properties.data")
    private List<DataContainer> data;

    /**
     * Get the resourceId property: Azure Resource Manager identifier of the resource whose onboarding status is being
     * represented.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Azure Resource Manager identifier of the resource whose onboarding status is being
     * represented.
     *
     * @param resourceId the resourceId value to set.
     * @return the VMInsightsOnboardingStatusInner object itself.
     */
    public VMInsightsOnboardingStatusInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the onboardingStatus property: The onboarding status for the resource. Note that, a higher level scope, e.g.,
     * resource group or subscription, is considered onboarded if at least one resource under it is onboarded.
     *
     * @return the onboardingStatus value.
     */
    public OnboardingStatus onboardingStatus() {
        return this.onboardingStatus;
    }

    /**
     * Set the onboardingStatus property: The onboarding status for the resource. Note that, a higher level scope, e.g.,
     * resource group or subscription, is considered onboarded if at least one resource under it is onboarded.
     *
     * @param onboardingStatus the onboardingStatus value to set.
     * @return the VMInsightsOnboardingStatusInner object itself.
     */
    public VMInsightsOnboardingStatusInner withOnboardingStatus(OnboardingStatus onboardingStatus) {
        this.onboardingStatus = onboardingStatus;
        return this;
    }

    /**
     * Get the dataStatus property: The status of VM Insights data from the resource. When reported as `present` the
     * data array will contain information about the data containers to which data for the specified resource is being
     * routed.
     *
     * @return the dataStatus value.
     */
    public DataStatus dataStatus() {
        return this.dataStatus;
    }

    /**
     * Set the dataStatus property: The status of VM Insights data from the resource. When reported as `present` the
     * data array will contain information about the data containers to which data for the specified resource is being
     * routed.
     *
     * @param dataStatus the dataStatus value to set.
     * @return the VMInsightsOnboardingStatusInner object itself.
     */
    public VMInsightsOnboardingStatusInner withDataStatus(DataStatus dataStatus) {
        this.dataStatus = dataStatus;
        return this;
    }

    /**
     * Get the data property: Containers that currently store VM Insights data for the specified resource.
     *
     * @return the data value.
     */
    public List<DataContainer> data() {
        return this.data;
    }

    /**
     * Set the data property: Containers that currently store VM Insights data for the specified resource.
     *
     * @param data the data value to set.
     * @return the VMInsightsOnboardingStatusInner object itself.
     */
    public VMInsightsOnboardingStatusInner withData(List<DataContainer> data) {
        this.data = data;
        return this;
    }
}
