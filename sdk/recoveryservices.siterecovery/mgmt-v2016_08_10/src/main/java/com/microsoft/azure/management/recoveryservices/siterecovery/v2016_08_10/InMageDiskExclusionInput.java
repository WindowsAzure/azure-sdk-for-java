/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DiskExclusionInput when doing enable protection of virtual machine in InMage
 * provider.
 */
public class InMageDiskExclusionInput {
    /**
     * The volume label based option for disk exclusion.
     */
    @JsonProperty(value = "volumeOptions")
    private List<InMageVolumeExclusionOptions> volumeOptions;

    /**
     * The guest disk signature based option for disk exclusion.
     */
    @JsonProperty(value = "diskSignatureOptions")
    private List<InMageDiskSignatureExclusionOptions> diskSignatureOptions;

    /**
     * Get the volume label based option for disk exclusion.
     *
     * @return the volumeOptions value
     */
    public List<InMageVolumeExclusionOptions> volumeOptions() {
        return this.volumeOptions;
    }

    /**
     * Set the volume label based option for disk exclusion.
     *
     * @param volumeOptions the volumeOptions value to set
     * @return the InMageDiskExclusionInput object itself.
     */
    public InMageDiskExclusionInput withVolumeOptions(List<InMageVolumeExclusionOptions> volumeOptions) {
        this.volumeOptions = volumeOptions;
        return this;
    }

    /**
     * Get the guest disk signature based option for disk exclusion.
     *
     * @return the diskSignatureOptions value
     */
    public List<InMageDiskSignatureExclusionOptions> diskSignatureOptions() {
        return this.diskSignatureOptions;
    }

    /**
     * Set the guest disk signature based option for disk exclusion.
     *
     * @param diskSignatureOptions the diskSignatureOptions value to set
     * @return the InMageDiskExclusionInput object itself.
     */
    public InMageDiskExclusionInput withDiskSignatureOptions(List<InMageDiskSignatureExclusionOptions> diskSignatureOptions) {
        this.diskSignatureOptions = diskSignatureOptions;
        return this;
    }

}
