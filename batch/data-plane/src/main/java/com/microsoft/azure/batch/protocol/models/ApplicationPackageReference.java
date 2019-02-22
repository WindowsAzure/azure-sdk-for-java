// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A reference to an application package to be deployed to compute nodes.
 */
public class ApplicationPackageReference {
    /**
     * The ID of the application to deploy.
     */
    @JsonProperty(value = "applicationId", required = true)
    private String applicationId;

    /**
     * The version of the application to deploy. If omitted, the default
     * version is deployed.
     * If this is omitted on a pool, and no default version is specified for
     * this application, the request fails with the error code
     * InvalidApplicationPackageReferences and HTTP status code 409. If this is
     * omitted on a task, and no default version is specified for this
     * application, the task fails with a pre-processing error.
     */
    @JsonProperty(value = "version")
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
     * Get if this is omitted on a pool, and no default version is specified for this application, the request fails with the error code InvalidApplicationPackageReferences and HTTP status code 409. If this is omitted on a task, and no default version is specified for this application, the task fails with a pre-processing error.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set if this is omitted on a pool, and no default version is specified for this application, the request fails with the error code InvalidApplicationPackageReferences and HTTP status code 409. If this is omitted on a task, and no default version is specified for this application, the task fails with a pre-processing error.
     *
     * @param version the version value to set
     * @return the ApplicationPackageReference object itself.
     */
    public ApplicationPackageReference withVersion(String version) {
        this.version = version;
        return this;
    }

}
