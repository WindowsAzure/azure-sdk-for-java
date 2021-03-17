// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.chat.models;

import com.azure.communication.common.CommunicationIdentifier;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The ChatMessageReadReceipt model. */
@Fluent
public final class ChatMessageReadReceipt {
    /*
     * Identifies a participant in Azure Communication services. A participant
     * is, for example, a phone number or an Azure communication user. This
     * model must be interpreted as a union: Apart from rawId, at most one
     * further property may be set.
     */
    @JsonProperty(value = "senderCommunicationIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private CommunicationIdentifier sender;

    /*
     * Id for the chat message that has been read. This id is generated by the
     * server.
     */
    @JsonProperty(value = "chatMessageId", access = JsonProperty.Access.WRITE_ONLY)
    private String chatMessageId;

    /*
     * Read receipt timestamp. The timestamp is in RFC3339 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "readOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime readOn;

    /**
     * Get the sender property: Identifies a participant in Azure Communication services. A
     * participant is, for example, a phone number or an Azure communication user. This model must be interpreted as a
     * union: Apart from rawId, at most one further property may be set.
     *
     * @return the sender value.
     */
    public CommunicationIdentifier getSender() {
        return this.sender;
    }

    /**
     * Set the sender property: Identifies a participant in Azure Communication services. A
     * participant is, for example, a phone number or an Azure communication user. This model must be interpreted as a
     * union: Apart from rawId, at most one further property may be set.
     *
     * @param sender the sender value to set.
     * @return the ChatMessageReadReceipt object itself.
     */
    public ChatMessageReadReceipt setSender(CommunicationIdentifier sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Get the chatMessageId property: Id for the chat message that has been read. This id is generated by the server.
     *
     * @return the chatMessageId value.
     */
    public String getChatMessageId() {
        return this.chatMessageId;
    }

    /**
     * Set the chatMessageId property: Id for the chat message that has been read. This id is generated by the server.
     *
     * @param chatMessageId the chatMessageId value to set.
     * @return the ChatMessageReadReceipt object itself.
     */
    public ChatMessageReadReceipt setChatMessageId(String chatMessageId) {
        this.chatMessageId = chatMessageId;
        return this;
    }

    /**
     * Get the readOn property: Read receipt timestamp. The timestamp is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the readOn value.
     */
    public OffsetDateTime getReadOn() {
        return this.readOn;
    }

    /**
     * Set the readOn property: Read receipt timestamp. The timestamp is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param readOn the readOn value to set.
     * @return the ChatMessageReadReceipt object itself.
     */
    public ChatMessageReadReceipt setReadOn(OffsetDateTime readOn) {
        this.readOn = readOn;
        return this;
    }
}
