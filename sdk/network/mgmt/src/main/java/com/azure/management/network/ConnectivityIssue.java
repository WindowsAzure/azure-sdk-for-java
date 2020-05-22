// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The ConnectivityIssue model. */
@Immutable
public final class ConnectivityIssue {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectivityIssue.class);

    /*
     * The origin of the issue.
     */
    @JsonProperty(value = "origin", access = JsonProperty.Access.WRITE_ONLY)
    private Origin origin;

    /*
     * The severity of the issue.
     */
    @JsonProperty(value = "severity", access = JsonProperty.Access.WRITE_ONLY)
    private Severity severity;

    /*
     * The type of issue.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private IssueType type;

    /*
     * Provides additional context on the issue.
     */
    @JsonProperty(value = "context", access = JsonProperty.Access.WRITE_ONLY)
    private List<Map<String, String>> context;

    /**
     * Get the origin property: The origin of the issue.
     *
     * @return the origin value.
     */
    public Origin origin() {
        return this.origin;
    }

    /**
     * Get the severity property: The severity of the issue.
     *
     * @return the severity value.
     */
    public Severity severity() {
        return this.severity;
    }

    /**
     * Get the type property: The type of issue.
     *
     * @return the type value.
     */
    public IssueType type() {
        return this.type;
    }

    /**
     * Get the context property: Provides additional context on the issue.
     *
     * @return the context value.
     */
    public List<Map<String, String>> context() {
        return this.context;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
