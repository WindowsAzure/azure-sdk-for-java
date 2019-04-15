/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_11_01.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.storage.v2018_11_01.ManagementPolicySchema;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The Get Storage Account ManagementPolicies operation response.
 */
@JsonFlatten
public class ManagementPolicyInner extends ProxyResource {
    /**
     * Returns the date and time the ManagementPolicies was last modified.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedTime;

    /**
     * The Storage Account ManagementPolicy, in JSON format. See more details
     * in:
     * https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     */
    @JsonProperty(value = "properties.policy", required = true)
    private ManagementPolicySchema policy;

    /**
     * Get returns the date and time the ManagementPolicies was last modified.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the Storage Account ManagementPolicy, in JSON format. See more details in: https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     *
     * @return the policy value
     */
    public ManagementPolicySchema policy() {
        return this.policy;
    }

    /**
     * Set the Storage Account ManagementPolicy, in JSON format. See more details in: https://docs.microsoft.com/en-us/azure/storage/common/storage-lifecycle-managment-concepts.
     *
     * @param policy the policy value to set
     * @return the ManagementPolicyInner object itself.
     */
    public ManagementPolicyInner withPolicy(ManagementPolicySchema policy) {
        this.policy = policy;
        return this;
    }

}
