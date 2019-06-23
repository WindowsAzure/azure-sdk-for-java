/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The destination to which a file should be uploaded.
 */
public class OutputFileDestination {
    /**
     * A location in Azure blob storage to which files are uploaded.
     */
    @JsonProperty(value = "container")
    private OutputFileBlobContainerDestination container;

    /**
     * Get the container value.
     *
     * @return the container value
     */
    public OutputFileBlobContainerDestination container() {
        return this.container;
    }

    /**
     * Set the container value.
     *
     * @param container the container value to set
     * @return the OutputFileDestination object itself.
     */
    public OutputFileDestination withContainer(OutputFileBlobContainerDestination container) {
        this.container = container;
        return this;
    }

}
