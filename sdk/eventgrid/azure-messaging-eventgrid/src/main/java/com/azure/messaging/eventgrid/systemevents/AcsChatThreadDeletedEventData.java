// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Schema of the Data property of an EventGridEvent for an Microsoft.Communication.ChatThreadDeleted event. */
@Fluent
public final class AcsChatThreadDeletedEventData extends AcsChatThreadEventInThreadBaseProperties {
    /*
     * The communication identifier of the user who deleted the thread
     */
    @JsonProperty(value = "deletedByCommunicationIdentifier")
    private CommunicationIdentifierModel deletedByCommunicationIdentifier;

    /*
     * The deletion time of the thread
     */
    @JsonProperty(value = "deleteTime")
    private OffsetDateTime deleteTime;

    /**
     * Get the deletedByCommunicationIdentifier property: The communication identifier of the user who deleted the
     * thread.
     *
     * @return the deletedByCommunicationIdentifier value.
     */
    public CommunicationIdentifierModel getDeletedByCommunicationIdentifier() {
        return this.deletedByCommunicationIdentifier;
    }

    /**
     * Set the deletedByCommunicationIdentifier property: The communication identifier of the user who deleted the
     * thread.
     *
     * @param deletedByCommunicationIdentifier the deletedByCommunicationIdentifier value to set.
     * @return the AcsChatThreadDeletedEventData object itself.
     */
    public AcsChatThreadDeletedEventData setDeletedByCommunicationIdentifier(
            CommunicationIdentifierModel deletedByCommunicationIdentifier) {
        this.deletedByCommunicationIdentifier = deletedByCommunicationIdentifier;
        return this;
    }

    /**
     * Get the deleteTime property: The deletion time of the thread.
     *
     * @return the deleteTime value.
     */
    public OffsetDateTime getDeleteTime() {
        return this.deleteTime;
    }

    /**
     * Set the deleteTime property: The deletion time of the thread.
     *
     * @param deleteTime the deleteTime value to set.
     * @return the AcsChatThreadDeletedEventData object itself.
     */
    public AcsChatThreadDeletedEventData setDeleteTime(OffsetDateTime deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatThreadDeletedEventData setCreateTime(OffsetDateTime createTime) {
        super.setCreateTime(createTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatThreadDeletedEventData setVersion(Long version) {
        super.setVersion(version);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatThreadDeletedEventData setTransactionId(String transactionId) {
        super.setTransactionId(transactionId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatThreadDeletedEventData setThreadId(String threadId) {
        super.setThreadId(threadId);
        return this;
    }
}
