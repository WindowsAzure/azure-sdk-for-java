/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Edifact one way agreement.
 */
public class EdifactOneWayAgreement {
    /**
     * The sender business identity.
     */
    @JsonProperty(value = "senderBusinessIdentity", required = true)
    private BusinessIdentity senderBusinessIdentity;

    /**
     * The receiver business identity.
     */
    @JsonProperty(value = "receiverBusinessIdentity", required = true)
    private BusinessIdentity receiverBusinessIdentity;

    /**
     * The EDIFACT protocol settings.
     */
    @JsonProperty(value = "protocolSettings", required = true)
    private EdifactProtocolSettings protocolSettings;

    /**
     * Get the sender business identity.
     *
     * @return the senderBusinessIdentity value
     */
    public BusinessIdentity senderBusinessIdentity() {
        return this.senderBusinessIdentity;
    }

    /**
     * Set the sender business identity.
     *
     * @param senderBusinessIdentity the senderBusinessIdentity value to set
     * @return the EdifactOneWayAgreement object itself.
     */
    public EdifactOneWayAgreement withSenderBusinessIdentity(BusinessIdentity senderBusinessIdentity) {
        this.senderBusinessIdentity = senderBusinessIdentity;
        return this;
    }

    /**
     * Get the receiver business identity.
     *
     * @return the receiverBusinessIdentity value
     */
    public BusinessIdentity receiverBusinessIdentity() {
        return this.receiverBusinessIdentity;
    }

    /**
     * Set the receiver business identity.
     *
     * @param receiverBusinessIdentity the receiverBusinessIdentity value to set
     * @return the EdifactOneWayAgreement object itself.
     */
    public EdifactOneWayAgreement withReceiverBusinessIdentity(BusinessIdentity receiverBusinessIdentity) {
        this.receiverBusinessIdentity = receiverBusinessIdentity;
        return this;
    }

    /**
     * Get the EDIFACT protocol settings.
     *
     * @return the protocolSettings value
     */
    public EdifactProtocolSettings protocolSettings() {
        return this.protocolSettings;
    }

    /**
     * Set the EDIFACT protocol settings.
     *
     * @param protocolSettings the protocolSettings value to set
     * @return the EdifactOneWayAgreement object itself.
     */
    public EdifactOneWayAgreement withProtocolSettings(EdifactProtocolSettings protocolSettings) {
        this.protocolSettings = protocolSettings;
        return this;
    }

}
