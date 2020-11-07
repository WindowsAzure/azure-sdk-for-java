/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview.implementation;

import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.ContainerStatus;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.AzureContainerDataFormat;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.RefreshDetails;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.ARMBaseModel;

/**
 * Represents a container on the  Data Box Edge/Gateway device.
 */
@JsonFlatten
public class ContainerInner extends ARMBaseModel {
    /**
     * Current status of the container. Possible values include: 'OK',
     * 'Offline', 'Unknown', 'Updating', 'NeedsAttention'.
     */
    @JsonProperty(value = "properties.containerStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ContainerStatus containerStatus;

    /**
     * DataFormat for Container. Possible values include: 'BlockBlob',
     * 'PageBlob', 'AzureFile'.
     */
    @JsonProperty(value = "properties.dataFormat", required = true)
    private AzureContainerDataFormat dataFormat;

    /**
     * Details of the refresh job on this container.
     */
    @JsonProperty(value = "properties.refreshDetails", access = JsonProperty.Access.WRITE_ONLY)
    private RefreshDetails refreshDetails;

    /**
     * The UTC time when container got created.
     */
    @JsonProperty(value = "properties.createdDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdDateTime;

    /**
     * Get current status of the container. Possible values include: 'OK', 'Offline', 'Unknown', 'Updating', 'NeedsAttention'.
     *
     * @return the containerStatus value
     */
    public ContainerStatus containerStatus() {
        return this.containerStatus;
    }

    /**
     * Get dataFormat for Container. Possible values include: 'BlockBlob', 'PageBlob', 'AzureFile'.
     *
     * @return the dataFormat value
     */
    public AzureContainerDataFormat dataFormat() {
        return this.dataFormat;
    }

    /**
     * Set dataFormat for Container. Possible values include: 'BlockBlob', 'PageBlob', 'AzureFile'.
     *
     * @param dataFormat the dataFormat value to set
     * @return the ContainerInner object itself.
     */
    public ContainerInner withDataFormat(AzureContainerDataFormat dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

    /**
     * Get details of the refresh job on this container.
     *
     * @return the refreshDetails value
     */
    public RefreshDetails refreshDetails() {
        return this.refreshDetails;
    }

    /**
     * Get the UTC time when container got created.
     *
     * @return the createdDateTime value
     */
    public DateTime createdDateTime() {
        return this.createdDateTime;
    }

}
