// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CRM connector entities. */
@Fluent
public final class CrmConnectorEntities {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CrmConnectorEntities.class);

    /*
     * The logical name.
     */
    @JsonProperty(value = "logicalName", required = true)
    private String logicalName;

    /*
     * The display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Indicating whether this is profile.
     */
    @JsonProperty(value = "isProfile")
    private Boolean isProfile;

    /**
     * Get the logicalName property: The logical name.
     *
     * @return the logicalName value.
     */
    public String logicalName() {
        return this.logicalName;
    }

    /**
     * Set the logicalName property: The logical name.
     *
     * @param logicalName the logicalName value to set.
     * @return the CrmConnectorEntities object itself.
     */
    public CrmConnectorEntities withLogicalName(String logicalName) {
        this.logicalName = logicalName;
        return this;
    }

    /**
     * Get the displayName property: The display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name.
     *
     * @param displayName the displayName value to set.
     * @return the CrmConnectorEntities object itself.
     */
    public CrmConnectorEntities withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the isProfile property: Indicating whether this is profile.
     *
     * @return the isProfile value.
     */
    public Boolean isProfile() {
        return this.isProfile;
    }

    /**
     * Set the isProfile property: Indicating whether this is profile.
     *
     * @param isProfile the isProfile value to set.
     * @return the CrmConnectorEntities object itself.
     */
    public CrmConnectorEntities withIsProfile(Boolean isProfile) {
        this.isProfile = isProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logicalName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property logicalName in model CrmConnectorEntities"));
        }
    }
}
