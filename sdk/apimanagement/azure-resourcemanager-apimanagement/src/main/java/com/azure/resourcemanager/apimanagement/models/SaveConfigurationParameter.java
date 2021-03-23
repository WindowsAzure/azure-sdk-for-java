// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Save Tenant Configuration Contract details. */
@JsonFlatten
@Fluent
public class SaveConfigurationParameter {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SaveConfigurationParameter.class);

    /*
     * The name of the Git branch in which to commit the current configuration
     * snapshot.
     */
    @JsonProperty(value = "properties.branch")
    private String branch;

    /*
     * The value if true, the current configuration database is committed to
     * the Git repository, even if the Git repository has newer changes that
     * would be overwritten.
     */
    @JsonProperty(value = "properties.force")
    private Boolean force;

    /**
     * Get the branch property: The name of the Git branch in which to commit the current configuration snapshot.
     *
     * @return the branch value.
     */
    public String branch() {
        return this.branch;
    }

    /**
     * Set the branch property: The name of the Git branch in which to commit the current configuration snapshot.
     *
     * @param branch the branch value to set.
     * @return the SaveConfigurationParameter object itself.
     */
    public SaveConfigurationParameter withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the force property: The value if true, the current configuration database is committed to the Git repository,
     * even if the Git repository has newer changes that would be overwritten.
     *
     * @return the force value.
     */
    public Boolean force() {
        return this.force;
    }

    /**
     * Set the force property: The value if true, the current configuration database is committed to the Git repository,
     * even if the Git repository has newer changes that would be overwritten.
     *
     * @param force the force value to set.
     * @return the SaveConfigurationParameter object itself.
     */
    public SaveConfigurationParameter withForce(Boolean force) {
        this.force = force;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
