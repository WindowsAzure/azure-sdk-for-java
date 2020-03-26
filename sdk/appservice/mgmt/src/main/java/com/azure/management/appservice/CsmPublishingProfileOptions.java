// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CsmPublishingProfileOptions model.
 */
@Fluent
public final class CsmPublishingProfileOptions {
    /*
     * Name of the format. Valid values are:
     * FileZilla3
     * WebDeploy -- default
     * Ftp
     */
    @JsonProperty(value = "format")
    private PublishingProfileFormat format;

    /*
     * Include the DisasterRecover endpoint if true
     */
    @JsonProperty(value = "includeDisasterRecoveryEndpoints")
    private Boolean includeDisasterRecoveryEndpoints;

    /**
     * Get the format property: Name of the format. Valid values are:
     * FileZilla3
     * WebDeploy -- default
     * Ftp.
     * 
     * @return the format value.
     */
    public PublishingProfileFormat format() {
        return this.format;
    }

    /**
     * Set the format property: Name of the format. Valid values are:
     * FileZilla3
     * WebDeploy -- default
     * Ftp.
     * 
     * @param format the format value to set.
     * @return the CsmPublishingProfileOptions object itself.
     */
    public CsmPublishingProfileOptions withFormat(PublishingProfileFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the includeDisasterRecoveryEndpoints property: Include the
     * DisasterRecover endpoint if true.
     * 
     * @return the includeDisasterRecoveryEndpoints value.
     */
    public Boolean includeDisasterRecoveryEndpoints() {
        return this.includeDisasterRecoveryEndpoints;
    }

    /**
     * Set the includeDisasterRecoveryEndpoints property: Include the
     * DisasterRecover endpoint if true.
     * 
     * @param includeDisasterRecoveryEndpoints the
     * includeDisasterRecoveryEndpoints value to set.
     * @return the CsmPublishingProfileOptions object itself.
     */
    public CsmPublishingProfileOptions withIncludeDisasterRecoveryEndpoints(Boolean includeDisasterRecoveryEndpoints) {
        this.includeDisasterRecoveryEndpoints = includeDisasterRecoveryEndpoints;
        return this;
    }
}
