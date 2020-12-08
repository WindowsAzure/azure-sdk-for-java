// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.ServerInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A server trust group. */
@JsonFlatten
@Fluent
public class ServerTrustGroupInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerTrustGroupInner.class);

    /*
     * Group members information for the server trust group.
     */
    @JsonProperty(value = "properties.groupMembers")
    private List<ServerInfo> groupMembers;

    /*
     * Trust scope of the server trust group.
     */
    @JsonProperty(value = "properties.trustScopes")
    private List<String> trustScopes;

    /**
     * Get the groupMembers property: Group members information for the server trust group.
     *
     * @return the groupMembers value.
     */
    public List<ServerInfo> groupMembers() {
        return this.groupMembers;
    }

    /**
     * Set the groupMembers property: Group members information for the server trust group.
     *
     * @param groupMembers the groupMembers value to set.
     * @return the ServerTrustGroupInner object itself.
     */
    public ServerTrustGroupInner withGroupMembers(List<ServerInfo> groupMembers) {
        this.groupMembers = groupMembers;
        return this;
    }

    /**
     * Get the trustScopes property: Trust scope of the server trust group.
     *
     * @return the trustScopes value.
     */
    public List<String> trustScopes() {
        return this.trustScopes;
    }

    /**
     * Set the trustScopes property: Trust scope of the server trust group.
     *
     * @param trustScopes the trustScopes value to set.
     * @return the ServerTrustGroupInner object itself.
     */
    public ServerTrustGroupInner withTrustScopes(List<String> trustScopes) {
        this.trustScopes = trustScopes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (groupMembers() != null) {
            groupMembers().forEach(e -> e.validate());
        }
    }
}
