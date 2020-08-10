/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameter required for creating a linked server to redis cache.
 */
@JsonFlatten
public class RedisLinkedServerCreateParameters {
    /**
     * Fully qualified resourceId of the linked redis cache.
     */
    @JsonProperty(value = "properties.linkedRedisCacheId", required = true)
    private String linkedRedisCacheId;

    /**
     * Location of the linked redis cache.
     */
    @JsonProperty(value = "properties.linkedRedisCacheLocation", required = true)
    private String linkedRedisCacheLocation;

    /**
     * Role of the linked server. Possible values include: 'Primary',
     * 'Secondary'.
     */
    @JsonProperty(value = "properties.serverRole", required = true)
    private ReplicationRole serverRole;

    /**
     * Get the linkedRedisCacheId value.
     *
     * @return the linkedRedisCacheId value
     */
    public String linkedRedisCacheId() {
        return this.linkedRedisCacheId;
    }

    /**
     * Set the linkedRedisCacheId value.
     *
     * @param linkedRedisCacheId the linkedRedisCacheId value to set
     * @return the RedisLinkedServerCreateParameters object itself.
     */
    public RedisLinkedServerCreateParameters withLinkedRedisCacheId(String linkedRedisCacheId) {
        this.linkedRedisCacheId = linkedRedisCacheId;
        return this;
    }

    /**
     * Get the linkedRedisCacheLocation value.
     *
     * @return the linkedRedisCacheLocation value
     */
    public String linkedRedisCacheLocation() {
        return this.linkedRedisCacheLocation;
    }

    /**
     * Set the linkedRedisCacheLocation value.
     *
     * @param linkedRedisCacheLocation the linkedRedisCacheLocation value to set
     * @return the RedisLinkedServerCreateParameters object itself.
     */
    public RedisLinkedServerCreateParameters withLinkedRedisCacheLocation(String linkedRedisCacheLocation) {
        this.linkedRedisCacheLocation = linkedRedisCacheLocation;
        return this;
    }

    /**
     * Get the serverRole value.
     *
     * @return the serverRole value
     */
    public ReplicationRole serverRole() {
        return this.serverRole;
    }

    /**
     * Set the serverRole value.
     *
     * @param serverRole the serverRole value to set
     * @return the RedisLinkedServerCreateParameters object itself.
     */
    public RedisLinkedServerCreateParameters withServerRole(ReplicationRole serverRole) {
        this.serverRole = serverRole;
        return this;
    }

}
