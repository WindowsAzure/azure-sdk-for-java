/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies Azure Application Insights information for performance counters
 * reporting.
 */
public class AppInsightsReference {
    /**
     * Specifies the Azure Application Insights component resource id.
     */
    @JsonProperty(value = "component", required = true)
    private ResourceId component;

    /**
     * Value of the Azure Application Insights instrumentation key.
     */
    @JsonProperty(value = "instrumentationKey")
    private String instrumentationKey;

    /**
     * Specifies a KeyVault Secret containing Azure Application Insights
     * instrumentation key.
     * Specifies KeyVault Store and Secret which contains Azure Application
     * Insights instrumentation key. One of instumentationKey or
     * instrumentationKeySecretReference must be specified.
     */
    @JsonProperty(value = "instrumentationKeySecretReference")
    private KeyVaultSecretReference instrumentationKeySecretReference;

    /**
     * Get the component value.
     *
     * @return the component value
     */
    public ResourceId component() {
        return this.component;
    }

    /**
     * Set the component value.
     *
     * @param component the component value to set
     * @return the AppInsightsReference object itself.
     */
    public AppInsightsReference withComponent(ResourceId component) {
        this.component = component;
        return this;
    }

    /**
     * Get the instrumentationKey value.
     *
     * @return the instrumentationKey value
     */
    public String instrumentationKey() {
        return this.instrumentationKey;
    }

    /**
     * Set the instrumentationKey value.
     *
     * @param instrumentationKey the instrumentationKey value to set
     * @return the AppInsightsReference object itself.
     */
    public AppInsightsReference withInstrumentationKey(String instrumentationKey) {
        this.instrumentationKey = instrumentationKey;
        return this;
    }

    /**
     * Get the instrumentationKeySecretReference value.
     *
     * @return the instrumentationKeySecretReference value
     */
    public KeyVaultSecretReference instrumentationKeySecretReference() {
        return this.instrumentationKeySecretReference;
    }

    /**
     * Set the instrumentationKeySecretReference value.
     *
     * @param instrumentationKeySecretReference the instrumentationKeySecretReference value to set
     * @return the AppInsightsReference object itself.
     */
    public AppInsightsReference withInstrumentationKeySecretReference(KeyVaultSecretReference instrumentationKeySecretReference) {
        this.instrumentationKeySecretReference = instrumentationKeySecretReference;
        return this;
    }

}
