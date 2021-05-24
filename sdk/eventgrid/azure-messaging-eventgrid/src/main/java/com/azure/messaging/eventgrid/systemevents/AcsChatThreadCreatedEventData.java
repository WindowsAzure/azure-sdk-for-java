// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Schema of the Data property of an EventGridEvent for a Microsoft.Communication.ChatThreadCreated event. */
@Fluent
public final class AcsChatThreadCreatedEventData extends AcsChatThreadEventInThreadBaseProperties {
    /*
     * The communication identifier of the user who created the thread
     */
    @JsonProperty(value = "createdByCommunicationIdentifier")
    private CommunicationIdentifierModel createdByCommunicationIdentifier;

    /*
     * The thread properties
     */
    @JsonProperty(value = "properties")
    private Map<String, Object> properties;

    /*
     * The list of properties of participants who are part of the thread
     */
    @JsonProperty(value = "participants")
    private List<AcsChatThreadParticipantProperties> participants;

    /**
     * Get the createdByCommunicationIdentifier property: The communication identifier of the user who created the
     * thread.
     *
     * @return the createdByCommunicationIdentifier value.
     */
    public CommunicationIdentifierModel getCreatedByCommunicationIdentifier() {
        return this.createdByCommunicationIdentifier;
    }

    /**
     * Set the createdByCommunicationIdentifier property: The communication identifier of the user who created the
     * thread.
     *
     * @param createdByCommunicationIdentifier the createdByCommunicationIdentifier value to set.
     * @return the AcsChatThreadCreatedEventData object itself.
     */
    public AcsChatThreadCreatedEventData setCreatedByCommunicationIdentifier(
            CommunicationIdentifierModel createdByCommunicationIdentifier) {
        this.createdByCommunicationIdentifier = createdByCommunicationIdentifier;
        return this;
    }

    /**
     * Get the properties property: The thread properties.
     *
     * @return the properties value.
     */
    public Map<String, Object> getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: The thread properties.
     *
     * @param properties the properties value to set.
     * @return the AcsChatThreadCreatedEventData object itself.
     */
    public AcsChatThreadCreatedEventData setProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the participants property: The list of properties of participants who are part of the thread.
     *
     * @return the participants value.
     */
    public List<AcsChatThreadParticipantProperties> getParticipants() {
        return this.participants;
    }

    /**
     * Set the participants property: The list of properties of participants who are part of the thread.
     *
     * @param participants the participants value to set.
     * @return the AcsChatThreadCreatedEventData object itself.
     */
    public AcsChatThreadCreatedEventData setParticipants(List<AcsChatThreadParticipantProperties> participants) {
        this.participants = participants;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatThreadCreatedEventData setCreateTime(OffsetDateTime createTime) {
        super.setCreateTime(createTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatThreadCreatedEventData setVersion(Long version) {
        super.setVersion(version);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatThreadCreatedEventData setTransactionId(String transactionId) {
        super.setTransactionId(transactionId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatThreadCreatedEventData setThreadId(String threadId) {
        super.setThreadId(threadId);
        return this;
    }
}
