/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A reference to an application package to be deployed to compute nodes.
 */
public class ApplicationPackageReference {
    /**
     * The id of the application to deploy.
     */
    @JsonProperty(required = true)
    private String applicationId;

    /**
     * The version of the application to deploy. If omitted, the default
     * version is deployed.
     */
    private String version;

    /**
     * Get the applicationId value.
     *
     * @return the applicationId value
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId value.
     *
     * @param applicationId the applicationId value to set
     * @return the ApplicationPackageReference object itself.
     */
    public ApplicationPackageReference withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the ApplicationPackageReference object itself.
     */
    public ApplicationPackageReference withVersion(String version) {
        this.version = version;
        return this;
    }

}
