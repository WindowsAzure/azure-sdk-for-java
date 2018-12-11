/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The global configuration settings.
 */
public class GlobalConfigurationInner {
    /**
     * The version for the global configuration.
     */
    @JsonProperty(value = "version")
    private Integer version;

    /**
     * The schema for the configuration.
     */
    @JsonProperty(value = "schemaXml")
    private String schemaXml;

    /**
     * Indicates if password sync is enabled or not.
     */
    @JsonProperty(value = "passwordSyncEnabled")
    private Boolean passwordSyncEnabled;

    /**
     * The number of saved password events.
     */
    @JsonProperty(value = "numSavedPwdEvent")
    private Integer numSavedPwdEvent;

    /**
     * The list of additional feature sets.
     */
    @JsonProperty(value = "featureSet")
    private List<ItemInner> featureSet;

    /**
     * Get the version for the global configuration.
     *
     * @return the version value
     */
    public Integer version() {
        return this.version;
    }

    /**
     * Set the version for the global configuration.
     *
     * @param version the version value to set
     * @return the GlobalConfigurationInner object itself.
     */
    public GlobalConfigurationInner withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * Get the schema for the configuration.
     *
     * @return the schemaXml value
     */
    public String schemaXml() {
        return this.schemaXml;
    }

    /**
     * Set the schema for the configuration.
     *
     * @param schemaXml the schemaXml value to set
     * @return the GlobalConfigurationInner object itself.
     */
    public GlobalConfigurationInner withSchemaXml(String schemaXml) {
        this.schemaXml = schemaXml;
        return this;
    }

    /**
     * Get indicates if password sync is enabled or not.
     *
     * @return the passwordSyncEnabled value
     */
    public Boolean passwordSyncEnabled() {
        return this.passwordSyncEnabled;
    }

    /**
     * Set indicates if password sync is enabled or not.
     *
     * @param passwordSyncEnabled the passwordSyncEnabled value to set
     * @return the GlobalConfigurationInner object itself.
     */
    public GlobalConfigurationInner withPasswordSyncEnabled(Boolean passwordSyncEnabled) {
        this.passwordSyncEnabled = passwordSyncEnabled;
        return this;
    }

    /**
     * Get the number of saved password events.
     *
     * @return the numSavedPwdEvent value
     */
    public Integer numSavedPwdEvent() {
        return this.numSavedPwdEvent;
    }

    /**
     * Set the number of saved password events.
     *
     * @param numSavedPwdEvent the numSavedPwdEvent value to set
     * @return the GlobalConfigurationInner object itself.
     */
    public GlobalConfigurationInner withNumSavedPwdEvent(Integer numSavedPwdEvent) {
        this.numSavedPwdEvent = numSavedPwdEvent;
        return this;
    }

    /**
     * Get the list of additional feature sets.
     *
     * @return the featureSet value
     */
    public List<ItemInner> featureSet() {
        return this.featureSet;
    }

    /**
     * Set the list of additional feature sets.
     *
     * @param featureSet the featureSet value to set
     * @return the GlobalConfigurationInner object itself.
     */
    public GlobalConfigurationInner withFeatureSet(List<ItemInner> featureSet) {
        this.featureSet = featureSet;
        return this;
    }

}
