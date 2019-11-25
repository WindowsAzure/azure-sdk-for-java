/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This class is used to send blob details after exporting jobs.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("ExportJobsOperationResultInfo")
public class ExportJobsOperationResultInfo extends OperationResultInfoBase {
    /**
     * The URL of the blob. The serialized string, which is the list of jobs,
     * is exported to this URL.
     */
    @JsonProperty(value = "blobUrl")
    private String blobUrl;

    /**
     * The Shared Access Signatures (SAS) key used to access the blob. The key
     * expires after 15 minutes.
     */
    @JsonProperty(value = "blobSasKey")
    private String blobSasKey;

    /**
     * Get the URL of the blob. The serialized string, which is the list of jobs, is exported to this URL.
     *
     * @return the blobUrl value
     */
    public String blobUrl() {
        return this.blobUrl;
    }

    /**
     * Set the URL of the blob. The serialized string, which is the list of jobs, is exported to this URL.
     *
     * @param blobUrl the blobUrl value to set
     * @return the ExportJobsOperationResultInfo object itself.
     */
    public ExportJobsOperationResultInfo withBlobUrl(String blobUrl) {
        this.blobUrl = blobUrl;
        return this;
    }

    /**
     * Get the Shared Access Signatures (SAS) key used to access the blob. The key expires after 15 minutes.
     *
     * @return the blobSasKey value
     */
    public String blobSasKey() {
        return this.blobSasKey;
    }

    /**
     * Set the Shared Access Signatures (SAS) key used to access the blob. The key expires after 15 minutes.
     *
     * @param blobSasKey the blobSasKey value to set
     * @return the ExportJobsOperationResultInfo object itself.
     */
    public ExportJobsOperationResultInfo withBlobSasKey(String blobSasKey) {
        this.blobSasKey = blobSasKey;
        return this;
    }

}
