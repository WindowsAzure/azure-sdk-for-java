/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.imagebuilder.v2020_02_14;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Runs a shell script during the customization phase (Linux). Corresponds to
 * Packer shell provisioner. Exactly one of 'scriptUri' or 'inline' can be
 * specified.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = ImageTemplateShellCustomizer.class)
@JsonTypeName("Shell")
public class ImageTemplateShellCustomizer extends ImageTemplateCustomizer {
    /**
     * URI of the shell script to be run for customizing. It can be a github
     * link, SAS URI for Azure Storage, etc.
     */
    @JsonProperty(value = "scriptUri")
    private String scriptUri;

    /**
     * SHA256 checksum of the shell script provided in the scriptUri field.
     */
    @JsonProperty(value = "sha256Checksum")
    private String sha256Checksum;

    /**
     * Array of shell commands to execute.
     */
    @JsonProperty(value = "inline")
    private List<String> inline;

    /**
     * Get uRI of the shell script to be run for customizing. It can be a github link, SAS URI for Azure Storage, etc.
     *
     * @return the scriptUri value
     */
    public String scriptUri() {
        return this.scriptUri;
    }

    /**
     * Set uRI of the shell script to be run for customizing. It can be a github link, SAS URI for Azure Storage, etc.
     *
     * @param scriptUri the scriptUri value to set
     * @return the ImageTemplateShellCustomizer object itself.
     */
    public ImageTemplateShellCustomizer withScriptUri(String scriptUri) {
        this.scriptUri = scriptUri;
        return this;
    }

    /**
     * Get sHA256 checksum of the shell script provided in the scriptUri field.
     *
     * @return the sha256Checksum value
     */
    public String sha256Checksum() {
        return this.sha256Checksum;
    }

    /**
     * Set sHA256 checksum of the shell script provided in the scriptUri field.
     *
     * @param sha256Checksum the sha256Checksum value to set
     * @return the ImageTemplateShellCustomizer object itself.
     */
    public ImageTemplateShellCustomizer withSha256Checksum(String sha256Checksum) {
        this.sha256Checksum = sha256Checksum;
        return this;
    }

    /**
     * Get array of shell commands to execute.
     *
     * @return the inline value
     */
    public List<String> inline() {
        return this.inline;
    }

    /**
     * Set array of shell commands to execute.
     *
     * @param inline the inline value to set
     * @return the ImageTemplateShellCustomizer object itself.
     */
    public ImageTemplateShellCustomizer withInline(List<String> inline) {
        this.inline = inline;
        return this;
    }

}
