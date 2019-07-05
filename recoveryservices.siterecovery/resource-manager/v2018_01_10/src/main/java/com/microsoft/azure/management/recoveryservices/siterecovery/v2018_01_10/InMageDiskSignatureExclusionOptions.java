/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Guest disk signature based disk exclusion option when doing enable
 * protection of virtual machine in InMage provider.
 */
public class InMageDiskSignatureExclusionOptions {
    /**
     * The guest signature of disk to be excluded from replication.
     */
    @JsonProperty(value = "diskSignature")
    private String diskSignature;

    /**
     * Get the guest signature of disk to be excluded from replication.
     *
     * @return the diskSignature value
     */
    public String diskSignature() {
        return this.diskSignature;
    }

    /**
     * Set the guest signature of disk to be excluded from replication.
     *
     * @param diskSignature the diskSignature value to set
     * @return the InMageDiskSignatureExclusionOptions object itself.
     */
    public InMageDiskSignatureExclusionOptions withDiskSignature(String diskSignature) {
        this.diskSignature = diskSignature;
        return this;
    }

}
