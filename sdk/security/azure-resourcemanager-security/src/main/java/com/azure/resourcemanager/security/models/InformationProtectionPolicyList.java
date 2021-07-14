// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.models.InformationProtectionPolicyInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information protection policies response. */
@Fluent
public final class InformationProtectionPolicyList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InformationProtectionPolicyList.class);

    /*
     * List of information protection policies.
     */
    @JsonProperty(value = "value")
    private List<InformationProtectionPolicyInner> value;

    /*
     * The URI to fetch the next page.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of information protection policies.
     *
     * @return the value value.
     */
    public List<InformationProtectionPolicyInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of information protection policies.
     *
     * @param value the value value to set.
     * @return the InformationProtectionPolicyList object itself.
     */
    public InformationProtectionPolicyList withValue(List<InformationProtectionPolicyInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
