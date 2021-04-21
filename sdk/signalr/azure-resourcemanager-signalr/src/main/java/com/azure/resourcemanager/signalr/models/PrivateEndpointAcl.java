// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ACL for a private endpoint. */
@Fluent
public final class PrivateEndpointAcl extends NetworkAcl {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpointAcl.class);

    /*
     * Name of the private endpoint connection
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the name property: Name of the private endpoint connection.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the private endpoint connection.
     *
     * @param name the name value to set.
     * @return the PrivateEndpointAcl object itself.
     */
    public PrivateEndpointAcl withName(String name) {
        this.name = name;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PrivateEndpointAcl withAllow(List<SignalRRequestType> allow) {
        super.withAllow(allow);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PrivateEndpointAcl withDeny(List<SignalRRequestType> deny) {
        super.withDeny(deny);
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
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model PrivateEndpointAcl"));
        }
    }
}
