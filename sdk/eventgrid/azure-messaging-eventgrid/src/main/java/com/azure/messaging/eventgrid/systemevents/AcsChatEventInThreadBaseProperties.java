// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Schema of common properties of all thread-level chat events. */
@Fluent
public class AcsChatEventInThreadBaseProperties {
    /*
     * The chat thread id
     */
    @JsonProperty(value = "threadId")
    private String threadId;

    /**
     * Get the threadId property: The chat thread id.
     *
     * @return the threadId value.
     */
    public String getThreadId() {
        return this.threadId;
    }

    /**
     * Set the threadId property: The chat thread id.
     *
     * @param threadId the threadId value to set.
     * @return the AcsChatEventInThreadBaseProperties object itself.
     */
    public AcsChatEventInThreadBaseProperties setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
}
