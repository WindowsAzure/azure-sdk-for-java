// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver.models.events;

import com.azure.communication.callingserver.models.OperationStatus;
import com.azure.communication.callingserver.models.ResultInfo;
import com.azure.core.annotation.Fluent;
import com.azure.core.util.BinaryData;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The InviteParticipantsResultEvent model. */
@Fluent
public final class InviteParticipantsResultEvent extends CallingServerEventBase {
    /**
     * The event type.
     */
    public static final String EVENT_TYPE = "Microsoft.Communication.InviteParticipantResult";
    /*
     * The result details.
     */
    @JsonProperty(value = "resultInfo")
    private ResultInfo resultInfo;

    /*
     * The operation context.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /*
     * Gets or sets the status of the operation
     */
    @JsonProperty(value = "status")
    private OperationStatus status;

    /**
     * Get the resultInfo property: The result details.
     *
     * @return the resultInfo value.
     */
    public ResultInfo getResultInfo() {
        return this.resultInfo;
    }

    /**
     * Set the resultInfo property: The result details.
     *
     * @param resultInfo the resultInfo value to set.
     * @return the InviteParticipantsResultEvent object itself.
     */
    public InviteParticipantsResultEvent setResultInfo(ResultInfo resultInfo) {
        this.resultInfo = resultInfo;
        return this;
    }

    /**
     * Get the operationContext property: The operation context.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The operation context.
     *
     * @param operationContext the operationContext value to set.
     * @return the InviteParticipantsResultEvent object itself.
     */
    public InviteParticipantsResultEvent setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }

    /**
     * Get the status property: Gets or sets the status of the operation.
     *
     * @return the status value.
     */
    public OperationStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Gets or sets the status of the operation.
     *
     * @param status the status value to set.
     * @return the InviteParticipantsResultEvent object itself.
     */
    public InviteParticipantsResultEvent setStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Deserialize {@link InviteParticipantsResultEvent} event.
     *
     * @param eventData binary data for event
     * @return {@link InviteParticipantsResultEvent} event.
     */
    public static InviteParticipantsResultEvent deserialize(BinaryData eventData) {
        return eventData == null ? null : eventData.toObject(InviteParticipantsResultEvent.class);
    }
}
