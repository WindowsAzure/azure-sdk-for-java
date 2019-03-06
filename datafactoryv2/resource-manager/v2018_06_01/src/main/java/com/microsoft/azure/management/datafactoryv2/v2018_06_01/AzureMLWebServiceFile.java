/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure ML WebService Input/Output file.
 */
public class AzureMLWebServiceFile {
    /**
     * The relative file path, including container name, in the Azure Blob
     * Storage specified by the LinkedService. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "filePath", required = true)
    private Object filePath;

    /**
     * Reference to an Azure Storage LinkedService, where Azure ML WebService
     * Input/Output file located.
     */
    @JsonProperty(value = "linkedServiceName", required = true)
    private LinkedServiceReference linkedServiceName;

    /**
     * Get the relative file path, including container name, in the Azure Blob Storage specified by the LinkedService. Type: string (or Expression with resultType string).
     *
     * @return the filePath value
     */
    public Object filePath() {
        return this.filePath;
    }

    /**
     * Set the relative file path, including container name, in the Azure Blob Storage specified by the LinkedService. Type: string (or Expression with resultType string).
     *
     * @param filePath the filePath value to set
     * @return the AzureMLWebServiceFile object itself.
     */
    public AzureMLWebServiceFile withFilePath(Object filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * Get reference to an Azure Storage LinkedService, where Azure ML WebService Input/Output file located.
     *
     * @return the linkedServiceName value
     */
    public LinkedServiceReference linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Set reference to an Azure Storage LinkedService, where Azure ML WebService Input/Output file located.
     *
     * @param linkedServiceName the linkedServiceName value to set
     * @return the AzureMLWebServiceFile object itself.
     */
    public AzureMLWebServiceFile withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        this.linkedServiceName = linkedServiceName;
        return this;
    }

}
