/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The trigger based on base image dependency.
 */
public class BaseImageTrigger {
    /**
     * The type of the auto trigger for base image dependency updates. Possible
     * values include: 'All', 'Runtime'.
     */
    @JsonProperty(value = "baseImageTriggerType", required = true)
    private BaseImageTriggerType baseImageTriggerType;

    /**
     * The current status of build trigger. Possible values include:
     * 'Disabled', 'Enabled'.
     */
    @JsonProperty(value = "status")
    private TriggerStatus status;

    /**
     * The name of the trigger.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the type of the auto trigger for base image dependency updates. Possible values include: 'All', 'Runtime'.
     *
     * @return the baseImageTriggerType value
     */
    public BaseImageTriggerType baseImageTriggerType() {
        return this.baseImageTriggerType;
    }

    /**
     * Set the type of the auto trigger for base image dependency updates. Possible values include: 'All', 'Runtime'.
     *
     * @param baseImageTriggerType the baseImageTriggerType value to set
     * @return the BaseImageTrigger object itself.
     */
    public BaseImageTrigger withBaseImageTriggerType(BaseImageTriggerType baseImageTriggerType) {
        this.baseImageTriggerType = baseImageTriggerType;
        return this;
    }

    /**
     * Get the current status of build trigger. Possible values include: 'Disabled', 'Enabled'.
     *
     * @return the status value
     */
    public TriggerStatus status() {
        return this.status;
    }

    /**
     * Set the current status of build trigger. Possible values include: 'Disabled', 'Enabled'.
     *
     * @param status the status value to set
     * @return the BaseImageTrigger object itself.
     */
    public BaseImageTrigger withStatus(TriggerStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the name of the trigger.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the trigger.
     *
     * @param name the name value to set
     * @return the BaseImageTrigger object itself.
     */
    public BaseImageTrigger withName(String name) {
        this.name = name;
        return this;
    }

}
