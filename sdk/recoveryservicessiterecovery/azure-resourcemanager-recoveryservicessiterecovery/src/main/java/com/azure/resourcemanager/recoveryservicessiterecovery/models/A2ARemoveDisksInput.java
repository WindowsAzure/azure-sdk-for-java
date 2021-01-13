// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** A2A remove disk(s) input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("A2A")
@Fluent
public final class A2ARemoveDisksInput extends RemoveDisksProviderSpecificInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(A2ARemoveDisksInput.class);

    /*
     * The list of vm disk vhd URIs.
     */
    @JsonProperty(value = "vmDisksUris")
    private List<String> vmDisksUris;

    /*
     * The list of vm managed disk Ids.
     */
    @JsonProperty(value = "vmManagedDisksIds")
    private List<String> vmManagedDisksIds;

    /**
     * Get the vmDisksUris property: The list of vm disk vhd URIs.
     *
     * @return the vmDisksUris value.
     */
    public List<String> vmDisksUris() {
        return this.vmDisksUris;
    }

    /**
     * Set the vmDisksUris property: The list of vm disk vhd URIs.
     *
     * @param vmDisksUris the vmDisksUris value to set.
     * @return the A2ARemoveDisksInput object itself.
     */
    public A2ARemoveDisksInput withVmDisksUris(List<String> vmDisksUris) {
        this.vmDisksUris = vmDisksUris;
        return this;
    }

    /**
     * Get the vmManagedDisksIds property: The list of vm managed disk Ids.
     *
     * @return the vmManagedDisksIds value.
     */
    public List<String> vmManagedDisksIds() {
        return this.vmManagedDisksIds;
    }

    /**
     * Set the vmManagedDisksIds property: The list of vm managed disk Ids.
     *
     * @param vmManagedDisksIds the vmManagedDisksIds value to set.
     * @return the A2ARemoveDisksInput object itself.
     */
    public A2ARemoveDisksInput withVmManagedDisksIds(List<String> vmManagedDisksIds) {
        this.vmManagedDisksIds = vmManagedDisksIds;
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
