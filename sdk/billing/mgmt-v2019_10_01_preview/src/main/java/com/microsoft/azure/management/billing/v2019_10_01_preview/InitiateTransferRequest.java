/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Request parameters to initiate transfer.
 */
@JsonFlatten
public class InitiateTransferRequest {
    /**
     * Email Id of recipient for transfer.
     */
    @JsonProperty(value = "properties.recipientEmailId")
    private String recipientEmailId;

    /**
     * Optional reseller Id for transfer.
     */
    @JsonProperty(value = "properties.resellerId")
    private String resellerId;

    /**
     * Get email Id of recipient for transfer.
     *
     * @return the recipientEmailId value
     */
    public String recipientEmailId() {
        return this.recipientEmailId;
    }

    /**
     * Set email Id of recipient for transfer.
     *
     * @param recipientEmailId the recipientEmailId value to set
     * @return the InitiateTransferRequest object itself.
     */
    public InitiateTransferRequest withRecipientEmailId(String recipientEmailId) {
        this.recipientEmailId = recipientEmailId;
        return this;
    }

    /**
     * Get optional reseller Id for transfer.
     *
     * @return the resellerId value
     */
    public String resellerId() {
        return this.resellerId;
    }

    /**
     * Set optional reseller Id for transfer.
     *
     * @param resellerId the resellerId value to set
     * @return the InitiateTransferRequest object itself.
     */
    public InitiateTransferRequest withResellerId(String resellerId) {
        this.resellerId = resellerId;
        return this;
    }

}
