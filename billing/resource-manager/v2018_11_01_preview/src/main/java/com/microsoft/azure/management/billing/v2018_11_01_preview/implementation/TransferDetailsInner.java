/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.billing.v2018_11_01_preview.TransferStatus;
import java.util.List;
import com.microsoft.azure.management.billing.v2018_11_01_preview.DetailedTransferStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Details of the transfer.
 */
@JsonFlatten
public class TransferDetailsInner {
    /**
     * Transfer creation time.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * Transfer expiration time.
     */
    @JsonProperty(value = "properties.expirationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime expirationTime;

    /**
     * Target invoice setion Id.
     */
    @JsonProperty(value = "properties.invoiceSectionId", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionId;

    /**
     * Target billing account Id.
     */
    @JsonProperty(value = "properties.billingAccountId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingAccountId;

    /**
     * Overall transfer status. Possible values include: 'Pending',
     * 'InProgress', 'Completed', 'CompletedWithErrors', 'Failed', 'Canceled',
     * 'Declined'.
     */
    @JsonProperty(value = "properties.transferStatus", access = JsonProperty.Access.WRITE_ONLY)
    private TransferStatus transferStatus;

    /**
     * Email Id of recipient of transfer.
     */
    @JsonProperty(value = "properties.recipientEmailId", access = JsonProperty.Access.WRITE_ONLY)
    private String recipientEmailId;

    /**
     * Email Id of initiator of transfer.
     */
    @JsonProperty(value = "properties.initiatorEmailId", access = JsonProperty.Access.WRITE_ONLY)
    private String initiatorEmailId;

    /**
     * Email Id who user canceled the transfer.
     */
    @JsonProperty(value = "properties.canceledBy", access = JsonProperty.Access.WRITE_ONLY)
    private String canceledBy;

    /**
     * Transfer last modification time.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedTime;

    /**
     * Detailed transfer status.
     */
    @JsonProperty(value = "properties.detailedTransferStatus", access = JsonProperty.Access.WRITE_ONLY)
    private List<DetailedTransferStatus> detailedTransferStatus;

    /**
     * Get transfer creation time.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get transfer expiration time.
     *
     * @return the expirationTime value
     */
    public DateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Get target invoice setion Id.
     *
     * @return the invoiceSectionId value
     */
    public String invoiceSectionId() {
        return this.invoiceSectionId;
    }

    /**
     * Get target billing account Id.
     *
     * @return the billingAccountId value
     */
    public String billingAccountId() {
        return this.billingAccountId;
    }

    /**
     * Get overall transfer status. Possible values include: 'Pending', 'InProgress', 'Completed', 'CompletedWithErrors', 'Failed', 'Canceled', 'Declined'.
     *
     * @return the transferStatus value
     */
    public TransferStatus transferStatus() {
        return this.transferStatus;
    }

    /**
     * Get email Id of recipient of transfer.
     *
     * @return the recipientEmailId value
     */
    public String recipientEmailId() {
        return this.recipientEmailId;
    }

    /**
     * Get email Id of initiator of transfer.
     *
     * @return the initiatorEmailId value
     */
    public String initiatorEmailId() {
        return this.initiatorEmailId;
    }

    /**
     * Get email Id who user canceled the transfer.
     *
     * @return the canceledBy value
     */
    public String canceledBy() {
        return this.canceledBy;
    }

    /**
     * Get transfer last modification time.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get detailed transfer status.
     *
     * @return the detailedTransferStatus value
     */
    public List<DetailedTransferStatus> detailedTransferStatus() {
        return this.detailedTransferStatus;
    }

}
