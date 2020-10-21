/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_30;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An access policy entry.
 */
public class ServiceAccessPolicyEntry {
    /**
     * An Azure AD object ID (User or Apps) that is allowed access to the FHIR
     * service.
     */
    @JsonProperty(value = "objectId", required = true)
    private String objectId;

    /**
     * Get an Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     *
     * @return the objectId value
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set an Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     *
     * @param objectId the objectId value to set
     * @return the ServiceAccessPolicyEntry object itself.
     */
    public ServiceAccessPolicyEntry withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

}
