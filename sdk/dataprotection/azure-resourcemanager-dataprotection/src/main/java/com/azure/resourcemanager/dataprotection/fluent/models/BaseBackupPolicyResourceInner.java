// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dataprotection.models.BaseBackupPolicy;
import com.azure.resourcemanager.dataprotection.models.DppResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** BaseBackupPolicy resource. */
@Fluent
public final class BaseBackupPolicyResourceInner extends DppResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BaseBackupPolicyResourceInner.class);

    /*
     * BaseBackupPolicyResource properties
     */
    @JsonProperty(value = "properties")
    private BaseBackupPolicy properties;

    /**
     * Get the properties property: BaseBackupPolicyResource properties.
     *
     * @return the properties value.
     */
    public BaseBackupPolicy properties() {
        return this.properties;
    }

    /**
     * Set the properties property: BaseBackupPolicyResource properties.
     *
     * @param properties the properties value to set.
     * @return the BaseBackupPolicyResourceInner object itself.
     */
    public BaseBackupPolicyResourceInner withProperties(BaseBackupPolicy properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (properties() != null) {
            properties().validate();
        }
    }
}
