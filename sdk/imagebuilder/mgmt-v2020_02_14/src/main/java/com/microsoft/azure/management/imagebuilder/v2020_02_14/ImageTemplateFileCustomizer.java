/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.imagebuilder.v2020_02_14;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Uploads files to VMs (Linux, Windows). Corresponds to Packer file
 * provisioner.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = ImageTemplateFileCustomizer.class)
@JsonTypeName("File")
public class ImageTemplateFileCustomizer extends ImageTemplateCustomizer {
    /**
     * The URI of the file to be uploaded for customizing the VM. It can be a
     * github link, SAS URI for Azure Storage, etc.
     */
    @JsonProperty(value = "sourceUri")
    private String sourceUri;

    /**
     * SHA256 checksum of the file provided in the sourceUri field above.
     */
    @JsonProperty(value = "sha256Checksum")
    private String sha256Checksum;

    /**
     * The absolute path to a file (with nested directory structures already
     * created) where the file (from sourceUri) will be uploaded to in the VM.
     */
    @JsonProperty(value = "destination")
    private String destination;

    /**
     * Get the URI of the file to be uploaded for customizing the VM. It can be a github link, SAS URI for Azure Storage, etc.
     *
     * @return the sourceUri value
     */
    public String sourceUri() {
        return this.sourceUri;
    }

    /**
     * Set the URI of the file to be uploaded for customizing the VM. It can be a github link, SAS URI for Azure Storage, etc.
     *
     * @param sourceUri the sourceUri value to set
     * @return the ImageTemplateFileCustomizer object itself.
     */
    public ImageTemplateFileCustomizer withSourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
        return this;
    }

    /**
     * Get sHA256 checksum of the file provided in the sourceUri field above.
     *
     * @return the sha256Checksum value
     */
    public String sha256Checksum() {
        return this.sha256Checksum;
    }

    /**
     * Set sHA256 checksum of the file provided in the sourceUri field above.
     *
     * @param sha256Checksum the sha256Checksum value to set
     * @return the ImageTemplateFileCustomizer object itself.
     */
    public ImageTemplateFileCustomizer withSha256Checksum(String sha256Checksum) {
        this.sha256Checksum = sha256Checksum;
        return this;
    }

    /**
     * Get the absolute path to a file (with nested directory structures already created) where the file (from sourceUri) will be uploaded to in the VM.
     *
     * @return the destination value
     */
    public String destination() {
        return this.destination;
    }

    /**
     * Set the absolute path to a file (with nested directory structures already created) where the file (from sourceUri) will be uploaded to in the VM.
     *
     * @param destination the destination value to set
     * @return the ImageTemplateFileCustomizer object itself.
     */
    public ImageTemplateFileCustomizer withDestination(String destination) {
        this.destination = destination;
        return this;
    }

}
