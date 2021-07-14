// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents a size category supported by this Lab Account (small, medium or large). */
@Fluent
public final class EnvironmentSizeFragment {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EnvironmentSizeFragment.class);

    /*
     * The size category
     */
    @JsonProperty(value = "name")
    private ManagedLabVmSize name;

    /*
     * Represents a set of compute sizes that can serve this given size type
     */
    @JsonProperty(value = "vmSizes")
    private List<SizeInfoFragment> vmSizes;

    /**
     * Get the name property: The size category.
     *
     * @return the name value.
     */
    public ManagedLabVmSize name() {
        return this.name;
    }

    /**
     * Set the name property: The size category.
     *
     * @param name the name value to set.
     * @return the EnvironmentSizeFragment object itself.
     */
    public EnvironmentSizeFragment withName(ManagedLabVmSize name) {
        this.name = name;
        return this;
    }

    /**
     * Get the vmSizes property: Represents a set of compute sizes that can serve this given size type.
     *
     * @return the vmSizes value.
     */
    public List<SizeInfoFragment> vmSizes() {
        return this.vmSizes;
    }

    /**
     * Set the vmSizes property: Represents a set of compute sizes that can serve this given size type.
     *
     * @param vmSizes the vmSizes value to set.
     * @return the EnvironmentSizeFragment object itself.
     */
    public EnvironmentSizeFragment withVmSizes(List<SizeInfoFragment> vmSizes) {
        this.vmSizes = vmSizes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vmSizes() != null) {
            vmSizes().forEach(e -> e.validate());
        }
    }
}
