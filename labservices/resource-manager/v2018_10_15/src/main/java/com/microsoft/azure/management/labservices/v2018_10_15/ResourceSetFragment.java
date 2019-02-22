/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a VM and the setting Id it was created for.
 */
public class ResourceSetFragment {
    /**
     * VM resource Id for the environment.
     */
    @JsonProperty(value = "vmResourceId")
    private String vmResourceId;

    /**
     * resourceSettingId for the environment.
     */
    @JsonProperty(value = "resourceSettingId")
    private String resourceSettingId;

    /**
     * Get vM resource Id for the environment.
     *
     * @return the vmResourceId value
     */
    public String vmResourceId() {
        return this.vmResourceId;
    }

    /**
     * Set vM resource Id for the environment.
     *
     * @param vmResourceId the vmResourceId value to set
     * @return the ResourceSetFragment object itself.
     */
    public ResourceSetFragment withVmResourceId(String vmResourceId) {
        this.vmResourceId = vmResourceId;
        return this;
    }

    /**
     * Get resourceSettingId for the environment.
     *
     * @return the resourceSettingId value
     */
    public String resourceSettingId() {
        return this.resourceSettingId;
    }

    /**
     * Set resourceSettingId for the environment.
     *
     * @param resourceSettingId the resourceSettingId value to set
     * @return the ResourceSetFragment object itself.
     */
    public ResourceSetFragment withResourceSettingId(String resourceSettingId) {
        this.resourceSettingId = resourceSettingId;
        return this;
    }

}
