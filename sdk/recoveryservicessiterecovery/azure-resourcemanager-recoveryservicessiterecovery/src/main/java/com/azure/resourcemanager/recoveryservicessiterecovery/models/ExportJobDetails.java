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
import java.util.Map;

/** This class represents details for export jobs workflow. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("ExportJobDetails")
@Fluent
public final class ExportJobDetails extends JobDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExportJobDetails.class);

    /*
     * BlobUri of the exported jobs.
     */
    @JsonProperty(value = "blobUri")
    private String blobUri;

    /*
     * The sas token to access blob.
     */
    @JsonProperty(value = "sasToken")
    private String sasToken;

    /**
     * Get the blobUri property: BlobUri of the exported jobs.
     *
     * @return the blobUri value.
     */
    public String blobUri() {
        return this.blobUri;
    }

    /**
     * Set the blobUri property: BlobUri of the exported jobs.
     *
     * @param blobUri the blobUri value to set.
     * @return the ExportJobDetails object itself.
     */
    public ExportJobDetails withBlobUri(String blobUri) {
        this.blobUri = blobUri;
        return this;
    }

    /**
     * Get the sasToken property: The sas token to access blob.
     *
     * @return the sasToken value.
     */
    public String sasToken() {
        return this.sasToken;
    }

    /**
     * Set the sasToken property: The sas token to access blob.
     *
     * @param sasToken the sasToken value to set.
     * @return the ExportJobDetails object itself.
     */
    public ExportJobDetails withSasToken(String sasToken) {
        this.sasToken = sasToken;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExportJobDetails withAffectedObjectDetails(Map<String, String> affectedObjectDetails) {
        super.withAffectedObjectDetails(affectedObjectDetails);
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
