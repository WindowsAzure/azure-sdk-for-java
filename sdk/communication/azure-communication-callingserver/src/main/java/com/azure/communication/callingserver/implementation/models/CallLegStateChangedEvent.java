// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The call state change event. */
@Fluent
public final class CallLegStateChangedEvent {
    /*
     * The conversation.id.
     */
    @JsonProperty(value = "conversationId")
    private String conversationId;

    /*
     * The call leg.id.
     */
    @JsonProperty(value = "callLegId")
    private String callLegId;

    /*
     * The call state.
     */
    @JsonProperty(value = "callState")
    private CallState callState;

    /**
     * Get the conversationId property: The conversation.id.
     *
     * @return the conversationId value.
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * Set the conversationId property: The conversation.id.
     *
     * @param conversationId the conversationId value to set.
     * @return the CallLegStateChangedEvent object itself.
     */
    public CallLegStateChangedEvent setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    /**
     * Get the callLegId property: The call leg.id.
     *
     * @return the callLegId value.
     */
    public String getCallLegId() {
        return this.callLegId;
    }

    /**
     * Set the callLegId property: The call leg.id.
     *
     * @param callLegId the callLegId value to set.
     * @return the CallLegStateChangedEvent object itself.
     */
    public CallLegStateChangedEvent setCallLegId(String callLegId) {
        this.callLegId = callLegId;
        return this;
    }

    /**
     * Get the callState property: The call state.
     *
     * @return the callState value.
     */
    public CallState getCallState() {
        return this.callState;
    }

    /**
     * Set the callState property: The call state.
     *
     * @param callState the callState value to set.
     * @return the CallLegStateChangedEvent object itself.
     */
    public CallLegStateChangedEvent setCallState(CallState callState) {
        this.callState = callState;
        return this;
    }
}
