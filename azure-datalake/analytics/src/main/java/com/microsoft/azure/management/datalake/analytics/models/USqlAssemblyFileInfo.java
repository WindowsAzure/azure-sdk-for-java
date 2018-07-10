/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog U-SQL assembly file information item.
 */
public class USqlAssemblyFileInfo {
    /**
     * the assembly file type. Possible values include: 'Assembly', 'Resource',
     * 'Nodeploy'.
     */
    @JsonProperty(value = "type")
    private FileType type;

    /**
     * the the original path to the assembly file.
     */
    @JsonProperty(value = "originalPath")
    private String originalPath;

    /**
     * the the content path to the assembly file.
     */
    @JsonProperty(value = "contentPath")
    private String contentPath;

    /**
     * Get the assembly file type. Possible values include: 'Assembly', 'Resource', 'Nodeploy'.
     *
     * @return the type value
     */
    public FileType type() {
        return this.type;
    }

    /**
     * Set the assembly file type. Possible values include: 'Assembly', 'Resource', 'Nodeploy'.
     *
     * @param type the type value to set
     * @return the USqlAssemblyFileInfo object itself.
     */
    public USqlAssemblyFileInfo withType(FileType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the the original path to the assembly file.
     *
     * @return the originalPath value
     */
    public String originalPath() {
        return this.originalPath;
    }

    /**
     * Set the the original path to the assembly file.
     *
     * @param originalPath the originalPath value to set
     * @return the USqlAssemblyFileInfo object itself.
     */
    public USqlAssemblyFileInfo withOriginalPath(String originalPath) {
        this.originalPath = originalPath;
        return this;
    }

    /**
     * Get the the content path to the assembly file.
     *
     * @return the contentPath value
     */
    public String contentPath() {
        return this.contentPath;
    }

    /**
     * Set the the content path to the assembly file.
     *
     * @param contentPath the contentPath value to set
     * @return the USqlAssemblyFileInfo object itself.
     */
    public USqlAssemblyFileInfo withContentPath(String contentPath) {
        this.contentPath = contentPath;
        return this;
    }

}
