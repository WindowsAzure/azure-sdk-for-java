// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Guest disk signature based disk exclusion option when doing enable protection of virtual machine in InMage provider.
 */
@Fluent
public final class InMageDiskSignatureExclusionOptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InMageDiskSignatureExclusionOptions.class);

    /*
     * The guest signature of disk to be excluded from replication.
     */
    @JsonProperty(value = "diskSignature")
    private String diskSignature;

    /**
     * Get the diskSignature property: The guest signature of disk to be excluded from replication.
     *
     * @return the diskSignature value.
     */
    public String diskSignature() {
        return this.diskSignature;
    }

    /**
     * Set the diskSignature property: The guest signature of disk to be excluded from replication.
     *
     * @param diskSignature the diskSignature value to set.
     * @return the InMageDiskSignatureExclusionOptions object itself.
     */
    public InMageDiskSignatureExclusionOptions withDiskSignature(String diskSignature) {
        this.diskSignature = diskSignature;
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
