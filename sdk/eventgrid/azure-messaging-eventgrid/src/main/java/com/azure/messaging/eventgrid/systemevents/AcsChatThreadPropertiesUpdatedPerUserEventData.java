// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.Communication.ChatThreadPropertiesUpdatedPerUser
 * event.
 */
@Fluent
public final class AcsChatThreadPropertiesUpdatedPerUserEventData extends AcsChatThreadEventBaseProperties {
    /*
     * The communication identifier of the user who updated the thread
     * properties
     */
    @JsonProperty(value = "editedByCommunicationIdentifier")
    private CommunicationIdentifierModel editedByCommunicationIdentifier;

    /*
     * The time at which the properties of the thread were updated
     */
    @JsonProperty(value = "editTime")
    private OffsetDateTime editTime;

    /*
     * The updated thread properties
     */
    @JsonProperty(value = "properties")
    private Map<String, Object> properties;

    /**
     * Get the editedByCommunicationIdentifier property: The communication identifier of the user who updated the thread
     * properties.
     *
     * @return the editedByCommunicationIdentifier value.
     */
    public CommunicationIdentifierModel getEditedByCommunicationIdentifier() {
        return this.editedByCommunicationIdentifier;
    }

    /**
     * Set the editedByCommunicationIdentifier property: The communication identifier of the user who updated the thread
     * properties.
     *
     * @param editedByCommunicationIdentifier the editedByCommunicationIdentifier value to set.
     * @return the AcsChatThreadPropertiesUpdatedPerUserEventData object itself.
     */
    public AcsChatThreadPropertiesUpdatedPerUserEventData setEditedByCommunicationIdentifier(
            CommunicationIdentifierModel editedByCommunicationIdentifier) {
        this.editedByCommunicationIdentifier = editedByCommunicationIdentifier;
        return this;
    }

    /**
     * Get the editTime property: The time at which the properties of the thread were updated.
     *
     * @return the editTime value.
     */
    public OffsetDateTime getEditTime() {
        return this.editTime;
    }

    /**
     * Set the editTime property: The time at which the properties of the thread were updated.
     *
     * @param editTime the editTime value to set.
     * @return the AcsChatThreadPropertiesUpdatedPerUserEventData object itself.
     */
    public AcsChatThreadPropertiesUpdatedPerUserEventData setEditTime(OffsetDateTime editTime) {
        this.editTime = editTime;
        return this;
    }

    /**
     * Get the properties property: The updated thread properties.
     *
     * @return the properties value.
     */
    public Map<String, Object> getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: The updated thread properties.
     *
     * @param properties the properties value to set.
     * @return the AcsChatThreadPropertiesUpdatedPerUserEventData object itself.
     */
    public AcsChatThreadPropertiesUpdatedPerUserEventData setProperties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatThreadPropertiesUpdatedPerUserEventData setCreateTime(OffsetDateTime createTime) {
        super.setCreateTime(createTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatThreadPropertiesUpdatedPerUserEventData setVersion(Long version) {
        super.setVersion(version);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatThreadPropertiesUpdatedPerUserEventData setRecipientCommunicationIdentifier(
            CommunicationIdentifierModel recipientCommunicationIdentifier) {
        super.setRecipientCommunicationIdentifier(recipientCommunicationIdentifier);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatThreadPropertiesUpdatedPerUserEventData setTransactionId(String transactionId) {
        super.setTransactionId(transactionId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatThreadPropertiesUpdatedPerUserEventData setThreadId(String threadId) {
        super.setThreadId(threadId);
        return this;
    }
}
