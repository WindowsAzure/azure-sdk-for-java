/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about an issue encountered in the process of checking for
 * connectivity.
 */
public class ConnectivityIssue {
    /**
     * The origin of the issue. Possible values include: 'Local', 'Inbound',
     * 'Outbound'.
     */
    @JsonProperty(value = "origin", access = JsonProperty.Access.WRITE_ONLY)
    private Origin origin;

    /**
     * The severity of the issue. Possible values include: 'Error', 'Warning'.
     */
    @JsonProperty(value = "severity", access = JsonProperty.Access.WRITE_ONLY)
    private Severity severity;

    /**
     * The type of issue. Possible values include: 'Unknown', 'AgentStopped',
     * 'GuestFirewall', 'DnsResolution', 'SocketBind', 'NetworkSecurityRule',
     * 'UserDefinedRoute', 'PortThrottled', 'Platform'.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private IssueType type;

    /**
     * Provides additional context on the issue.
     */
    @JsonProperty(value = "context", access = JsonProperty.Access.WRITE_ONLY)
    private List<Map<String, String>> context;

    /**
     * Get the origin of the issue. Possible values include: 'Local', 'Inbound', 'Outbound'.
     *
     * @return the origin value
     */
    public Origin origin() {
        return this.origin;
    }

    /**
     * Get the severity of the issue. Possible values include: 'Error', 'Warning'.
     *
     * @return the severity value
     */
    public Severity severity() {
        return this.severity;
    }

    /**
     * Get the type of issue. Possible values include: 'Unknown', 'AgentStopped', 'GuestFirewall', 'DnsResolution', 'SocketBind', 'NetworkSecurityRule', 'UserDefinedRoute', 'PortThrottled', 'Platform'.
     *
     * @return the type value
     */
    public IssueType type() {
        return this.type;
    }

    /**
     * Get provides additional context on the issue.
     *
     * @return the context value
     */
    public List<Map<String, String>> context() {
        return this.context;
    }

}
