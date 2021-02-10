// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JwtClaimChecks model. */
@JsonFlatten
@Fluent
public class JwtClaimChecks extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JwtClaimChecks.class);

    /*
     * The allowedGroups property.
     */
    @JsonProperty(value = "properties.allowedGroups")
    private List<String> allowedGroups;

    /*
     * The allowedClientApplications property.
     */
    @JsonProperty(value = "properties.allowedClientApplications")
    private List<String> allowedClientApplications;

    /**
     * Get the allowedGroups property: The allowedGroups property.
     *
     * @return the allowedGroups value.
     */
    public List<String> allowedGroups() {
        return this.allowedGroups;
    }

    /**
     * Set the allowedGroups property: The allowedGroups property.
     *
     * @param allowedGroups the allowedGroups value to set.
     * @return the JwtClaimChecks object itself.
     */
    public JwtClaimChecks withAllowedGroups(List<String> allowedGroups) {
        this.allowedGroups = allowedGroups;
        return this;
    }

    /**
     * Get the allowedClientApplications property: The allowedClientApplications property.
     *
     * @return the allowedClientApplications value.
     */
    public List<String> allowedClientApplications() {
        return this.allowedClientApplications;
    }

    /**
     * Set the allowedClientApplications property: The allowedClientApplications property.
     *
     * @param allowedClientApplications the allowedClientApplications value to set.
     * @return the JwtClaimChecks object itself.
     */
    public JwtClaimChecks withAllowedClientApplications(List<String> allowedClientApplications) {
        this.allowedClientApplications = allowedClientApplications;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public JwtClaimChecks withKind(String kind) {
        super.withKind(kind);
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
    }
}
