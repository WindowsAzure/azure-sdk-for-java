// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.mixedreality.remoterendering.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The result of a list sessions request. */
@Fluent
public final class SessionsList {
    /*
     * The list of rendering sessions. Does not include sessions in 'Stopped'
     * state.
     */
    @JsonProperty(value = "sessions", required = true)
    private List<SessionProperties> sessions;

    /*
     * If more rendering sessions are available this link with the same
     * authentication header can be used to retrieve further values
     */
    @JsonProperty(value = "@nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of SessionsList class.
     *
     * @param sessions the sessions value to set.
     */
    @JsonCreator
    public SessionsList(@JsonProperty(value = "sessions", required = true) List<SessionProperties> sessions) {
        this.sessions = sessions;
    }

    /**
     * Get the sessions property: The list of rendering sessions. Does not include sessions in 'Stopped' state.
     *
     * @return the sessions value.
     */
    public List<SessionProperties> getSessions() {
        return this.sessions;
    }

    /**
     * Get the nextLink property: If more rendering sessions are available this link with the same authentication header
     * can be used to retrieve further values.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }
}
