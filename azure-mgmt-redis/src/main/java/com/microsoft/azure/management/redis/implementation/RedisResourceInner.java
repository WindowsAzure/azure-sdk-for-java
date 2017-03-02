/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.implementation;

import java.util.Map;
import com.microsoft.azure.management.redis.Sku;
import com.microsoft.azure.management.redis.RedisAccessKeys;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A single Redis item in List or Get Operation.
 */
@JsonFlatten
public class RedisResourceInner extends Resource {
    /**
     * All Redis Settings. Few possible keys:
     * rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value
     * etc.
     */
    @JsonProperty(value = "properties.redisConfiguration")
    private Map<String, String> redisConfiguration;

    /**
     * Specifies whether the non-ssl Redis server port (6379) is enabled.
     */
    @JsonProperty(value = "properties.enableNonSslPort")
    private Boolean enableNonSslPort;

    /**
     * tenantSettings.
     */
    @JsonProperty(value = "properties.tenantSettings")
    private Map<String, String> tenantSettings;

    /**
     * The number of shards to be created on a Premium Cluster Cache.
     */
    @JsonProperty(value = "properties.shardCount")
    private Integer shardCount;

    /**
     * The full resource ID of a subnet in a virtual network to deploy the
     * Redis cache in. Example format:
     * /subscriptions/{subid}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1.
     */
    @JsonProperty(value = "properties.subnetId")
    private String subnetId;

    /**
     * Static IP address. Required when deploying a Redis cache inside an
     * existing Azure Virtual Network.
     */
    @JsonProperty(value = "properties.staticIP")
    private String staticIP;

    /**
     * The SKU of the Redis cache to deploy.
     */
    @JsonProperty(value = "properties.sku")
    private Sku sku;

    /**
     * Redis version.
     */
    @JsonProperty(value = "properties.redisVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String redisVersion;

    /**
     * Redis instance provisioning status.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Redis host name.
     */
    @JsonProperty(value = "properties.hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostName;

    /**
     * Redis non-SSL port.
     */
    @JsonProperty(value = "properties.port", access = JsonProperty.Access.WRITE_ONLY)
    private Integer port;

    /**
     * Redis SSL port.
     */
    @JsonProperty(value = "properties.sslPort", access = JsonProperty.Access.WRITE_ONLY)
    private Integer sslPort;

    /**
     * The keys of the Redis cache - not set if this object is not the response
     * to Create or Update redis cache.
     */
    @JsonProperty(value = "properties.accessKeys", access = JsonProperty.Access.WRITE_ONLY)
    private RedisAccessKeys accessKeys;

    /**
     * Get the redisConfiguration value.
     *
     * @return the redisConfiguration value
     */
    public Map<String, String> redisConfiguration() {
        return this.redisConfiguration;
    }

    /**
     * Set the redisConfiguration value.
     *
     * @param redisConfiguration the redisConfiguration value to set
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withRedisConfiguration(Map<String, String> redisConfiguration) {
        this.redisConfiguration = redisConfiguration;
        return this;
    }

    /**
     * Get the enableNonSslPort value.
     *
     * @return the enableNonSslPort value
     */
    public Boolean enableNonSslPort() {
        return this.enableNonSslPort;
    }

    /**
     * Set the enableNonSslPort value.
     *
     * @param enableNonSslPort the enableNonSslPort value to set
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withEnableNonSslPort(Boolean enableNonSslPort) {
        this.enableNonSslPort = enableNonSslPort;
        return this;
    }

    /**
     * Get the tenantSettings value.
     *
     * @return the tenantSettings value
     */
    public Map<String, String> tenantSettings() {
        return this.tenantSettings;
    }

    /**
     * Set the tenantSettings value.
     *
     * @param tenantSettings the tenantSettings value to set
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withTenantSettings(Map<String, String> tenantSettings) {
        this.tenantSettings = tenantSettings;
        return this;
    }

    /**
     * Get the shardCount value.
     *
     * @return the shardCount value
     */
    public Integer shardCount() {
        return this.shardCount;
    }

    /**
     * Set the shardCount value.
     *
     * @param shardCount the shardCount value to set
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }

    /**
     * Get the subnetId value.
     *
     * @return the subnetId value
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId value.
     *
     * @param subnetId the subnetId value to set
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the staticIP value.
     *
     * @return the staticIP value
     */
    public String staticIP() {
        return this.staticIP;
    }

    /**
     * Set the staticIP value.
     *
     * @param staticIP the staticIP value to set
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withStaticIP(String staticIP) {
        this.staticIP = staticIP;
        return this;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the RedisResourceInner object itself.
     */
    public RedisResourceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the redisVersion value.
     *
     * @return the redisVersion value
     */
    public String redisVersion() {
        return this.redisVersion;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the hostName value.
     *
     * @return the hostName value
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Get the port value.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Get the sslPort value.
     *
     * @return the sslPort value
     */
    public Integer sslPort() {
        return this.sslPort;
    }

    /**
     * Get the accessKeys value.
     *
     * @return the accessKeys value
     */
    public RedisAccessKeys accessKeys() {
        return this.accessKeys;
    }

}
