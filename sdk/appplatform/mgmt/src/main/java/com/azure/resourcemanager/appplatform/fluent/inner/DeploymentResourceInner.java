// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appplatform.models.DeploymentResourceProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DeploymentResource model. */
@Fluent
public final class DeploymentResourceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeploymentResourceInner.class);

    /*
     * Properties of the Deployment resource
     */
    @JsonProperty(value = "properties")
    private DeploymentResourceProperties properties;

    /**
     * Get the properties property: Properties of the Deployment resource.
     *
     * @return the properties value.
     */
    public DeploymentResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the Deployment resource.
     *
     * @param properties the properties value to set.
     * @return the DeploymentResourceInner object itself.
     */
    public DeploymentResourceInner withProperties(DeploymentResourceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
