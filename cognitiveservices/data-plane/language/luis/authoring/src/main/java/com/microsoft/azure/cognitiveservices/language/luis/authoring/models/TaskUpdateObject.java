/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object model for cloning an application's version.
 */
public class TaskUpdateObject {
    /**
     * The new version for the cloned model.
     */
    @JsonProperty(value = "version")
    private String version;

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
     * @return the TaskUpdateObject object itself.
     */
    public TaskUpdateObject withVersion(String version) {
        this.version = version;
        return this;
    }

}
