// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.implementation.models;

import com.azure.communication.chat.models.CreateChatThreadErrors;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Result of the create chat thread operation. */
@Fluent
public final class CreateChatThreadResult {
    /*
     * Chat thread.
     */
    @JsonProperty(value = "chatThread")
    private ChatThread chatThread;

    /*
     * Errors encountered during the creation of the chat thread.
     */
    @JsonProperty(value = "errors")
    private CreateChatThreadErrors errors;

    /**
     * Get the chatThread property: Chat thread.
     *
     * @return the chatThread value.
     */
    public ChatThread getChatThread() {
        return this.chatThread;
    }

    /**
     * Set the chatThread property: Chat thread.
     *
     * @param chatThread the chatThread value to set.
     * @return the CreateChatThreadResult object itself.
     */
    public CreateChatThreadResult setChatThread(ChatThread chatThread) {
        this.chatThread = chatThread;
        return this;
    }

    /**
     * Get the errors property: Errors encountered during the creation of the chat thread.
     *
     * @return the errors value.
     */
    public CreateChatThreadErrors getErrors() {
        return this.errors;
    }

    /**
     * Set the errors property: Errors encountered during the creation of the chat thread.
     *
     * @param errors the errors value to set.
     * @return the CreateChatThreadResult object itself.
     */
    public CreateChatThreadResult setErrors(CreateChatThreadErrors errors) {
        this.errors = errors;
        return this;
    }
}
