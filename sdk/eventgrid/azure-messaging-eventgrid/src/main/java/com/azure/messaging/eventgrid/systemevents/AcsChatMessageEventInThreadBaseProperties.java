// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Schema of common properties of all thread-level chat message events. */
@Fluent
public class AcsChatMessageEventInThreadBaseProperties extends AcsChatEventInThreadBaseProperties {
    /*
     * The chat message id
     */
    @JsonProperty(value = "messageId")
    private String messageId;

    /*
     * The communication identifier of the sender
     */
    @JsonProperty(value = "senderCommunicationIdentifier")
    private CommunicationIdentifierModel senderCommunicationIdentifier;

    /*
     * The display name of the sender
     */
    @JsonProperty(value = "senderDisplayName")
    private String senderDisplayName;

    /*
     * The original compose time of the message
     */
    @JsonProperty(value = "composeTime")
    private OffsetDateTime composeTime;

    /*
     * The type of the message
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The version of the message
     */
    @JsonProperty(value = "version")
    private Long version;

    /**
     * Get the messageId property: The chat message id.
     *
     * @return the messageId value.
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * Set the messageId property: The chat message id.
     *
     * @param messageId the messageId value to set.
     * @return the AcsChatMessageEventInThreadBaseProperties object itself.
     */
    public AcsChatMessageEventInThreadBaseProperties setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the senderCommunicationIdentifier property: The communication identifier of the sender.
     *
     * @return the senderCommunicationIdentifier value.
     */
    public CommunicationIdentifierModel getSenderCommunicationIdentifier() {
        return this.senderCommunicationIdentifier;
    }

    /**
     * Set the senderCommunicationIdentifier property: The communication identifier of the sender.
     *
     * @param senderCommunicationIdentifier the senderCommunicationIdentifier value to set.
     * @return the AcsChatMessageEventInThreadBaseProperties object itself.
     */
    public AcsChatMessageEventInThreadBaseProperties setSenderCommunicationIdentifier(
            CommunicationIdentifierModel senderCommunicationIdentifier) {
        this.senderCommunicationIdentifier = senderCommunicationIdentifier;
        return this;
    }

    /**
     * Get the senderDisplayName property: The display name of the sender.
     *
     * @return the senderDisplayName value.
     */
    public String getSenderDisplayName() {
        return this.senderDisplayName;
    }

    /**
     * Set the senderDisplayName property: The display name of the sender.
     *
     * @param senderDisplayName the senderDisplayName value to set.
     * @return the AcsChatMessageEventInThreadBaseProperties object itself.
     */
    public AcsChatMessageEventInThreadBaseProperties setSenderDisplayName(String senderDisplayName) {
        this.senderDisplayName = senderDisplayName;
        return this;
    }

    /**
     * Get the composeTime property: The original compose time of the message.
     *
     * @return the composeTime value.
     */
    public OffsetDateTime getComposeTime() {
        return this.composeTime;
    }

    /**
     * Set the composeTime property: The original compose time of the message.
     *
     * @param composeTime the composeTime value to set.
     * @return the AcsChatMessageEventInThreadBaseProperties object itself.
     */
    public AcsChatMessageEventInThreadBaseProperties setComposeTime(OffsetDateTime composeTime) {
        this.composeTime = composeTime;
        return this;
    }

    /**
     * Get the type property: The type of the message.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The type of the message.
     *
     * @param type the type value to set.
     * @return the AcsChatMessageEventInThreadBaseProperties object itself.
     */
    public AcsChatMessageEventInThreadBaseProperties setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the version property: The version of the message.
     *
     * @return the version value.
     */
    public Long getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the message.
     *
     * @param version the version value to set.
     * @return the AcsChatMessageEventInThreadBaseProperties object itself.
     */
    public AcsChatMessageEventInThreadBaseProperties setVersion(Long version) {
        this.version = version;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatMessageEventInThreadBaseProperties setTransactionId(String transactionId) {
        super.setTransactionId(transactionId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatMessageEventInThreadBaseProperties setThreadId(String threadId) {
        super.setThreadId(threadId);
        return this;
    }
}
