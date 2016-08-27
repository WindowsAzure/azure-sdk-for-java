/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.implementation;

import com.microsoft.azure.management.redis.RedisAccessKeys;
import com.microsoft.azure.management.redis.Sku;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A redis item in CreateOrUpdate Operation response.
 */
@JsonFlatten
public class RedisResourceWithAccessKeyInner extends Resource {
    /**
     * RedisVersion parameter has been deprecated. As such, it is no longer
     * necessary to provide this parameter and any value specified is ignored.
     */
    @JsonProperty(value = "properties.redisVersion")
    private String redisVersion;

    /**
     * What sku of redis cache to deploy.
     */
    @JsonProperty(value = "properties.sku", required = true)
    private Sku sku;

    /**
     * All Redis Settings. Few possible keys:
     * rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value
     * etc.
     */
    @JsonProperty(value = "properties.redisConfiguration")
    private Map<String, String> redisConfiguration;

    /**
     * If the value is true, then the non-ssl redis server port (6379) will be
     * enabled.
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
     * The exact ARM resource ID of the virtual network to deploy the redis
     * cache in. Example format:
     * /subscriptions/{subid}/resourceGroups/{resourceGroupName}/Microsoft.ClassicNetwork/VirtualNetworks/vnet1.
     */
    @JsonProperty(value = "properties.virtualNetwork")
    private String virtualNetwork;

    /**
     * Required when deploying a redis cache inside an existing Azure Virtual
     * Network.
     */
    @JsonProperty(value = "properties.subnet")
    private String subnet;

    /**
     * Required when deploying a redis cache inside an existing Azure Virtual
     * Network.
     */
    @JsonProperty(value = "properties.staticIP")
    private String staticIP;

    /**
     * Redis instance provisioning status.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Redis host name.
     */
    @JsonProperty(value = "properties.hostName")
    private String hostName;

    /**
     * Redis non-ssl port.
     */
    @JsonProperty(value = "properties.port")
    private Integer port;

    /**
     * Redis ssl port.
     */
    @JsonProperty(value = "properties.sslPort")
    private Integer sslPort;

    /**
     * Redis cache access keys.
     */
    @JsonProperty(value = "properties.accessKeys")
    private RedisAccessKeys accessKeys;

    /**
     * Get the redisVersion value.
     *
     * @return the redisVersion value
     */
    public String redisVersion() {
        return this.redisVersion;
    }

    /**
     * Set the redisVersion value.
     *
     * @param redisVersion the redisVersion value to set
     * @return the RedisResourceWithAccessKeyInner object itself.
     */
    public RedisResourceWithAccessKeyInner withRedisVersion(String redisVersion) {
        this.redisVersion = redisVersion;
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
     * @return the RedisResourceWithAccessKeyInner object itself.
     */
    public RedisResourceWithAccessKeyInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

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
     * @return the RedisResourceWithAccessKeyInner object itself.
     */
    public RedisResourceWithAccessKeyInner withRedisConfiguration(Map<String, String> redisConfiguration) {
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
     * @return the RedisResourceWithAccessKeyInner object itself.
     */
    public RedisResourceWithAccessKeyInner withEnableNonSslPort(Boolean enableNonSslPort) {
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
     * @return the RedisResourceWithAccessKeyInner object itself.
     */
    public RedisResourceWithAccessKeyInner withTenantSettings(Map<String, String> tenantSettings) {
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
     * @return the RedisResourceWithAccessKeyInner object itself.
     */
    public RedisResourceWithAccessKeyInner withShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }

    /**
     * Get the virtualNetwork value.
     *
     * @return the virtualNetwork value
     */
    public String virtualNetwork() {
        return this.virtualNetwork;
    }

    /**
     * Set the virtualNetwork value.
     *
     * @param virtualNetwork the virtualNetwork value to set
     * @return the RedisResourceWithAccessKeyInner object itself.
     */
    public RedisResourceWithAccessKeyInner withVirtualNetwork(String virtualNetwork) {
        this.virtualNetwork = virtualNetwork;
        return this;
    }

    /**
     * Get the subnet value.
     *
     * @return the subnet value
     */
    public String subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet value.
     *
     * @param subnet the subnet value to set
     * @return the RedisResourceWithAccessKeyInner object itself.
     */
    public RedisResourceWithAccessKeyInner withSubnet(String subnet) {
        this.subnet = subnet;
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
     * @return the RedisResourceWithAccessKeyInner object itself.
     */
    public RedisResourceWithAccessKeyInner withStaticIP(String staticIP) {
        this.staticIP = staticIP;
        return this;
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
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the RedisResourceWithAccessKeyInner object itself.
     */
    public RedisResourceWithAccessKeyInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
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
     * Set the hostName value.
     *
     * @param hostName the hostName value to set
     * @return the RedisResourceWithAccessKeyInner object itself.
     */
    public RedisResourceWithAccessKeyInner withHostName(String hostName) {
        this.hostName = hostName;
        return this;
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
     * Set the port value.
     *
     * @param port the port value to set
     * @return the RedisResourceWithAccessKeyInner object itself.
     */
    public RedisResourceWithAccessKeyInner withPort(Integer port) {
        this.port = port;
        return this;
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
     * Set the sslPort value.
     *
     * @param sslPort the sslPort value to set
     * @return the RedisResourceWithAccessKeyInner object itself.
     */
    public RedisResourceWithAccessKeyInner withSslPort(Integer sslPort) {
        this.sslPort = sslPort;
        return this;
    }

    /**
     * Get the accessKeys value.
     *
     * @return the accessKeys value
     */
    public RedisAccessKeys accessKeys() {
        return this.accessKeys;
    }

    /**
     * Set the accessKeys value.
     *
     * @param accessKeys the accessKeys value to set
     * @return the RedisResourceWithAccessKeyInner object itself.
     */
    public RedisResourceWithAccessKeyInner withAccessKeys(RedisAccessKeys accessKeys) {
        this.accessKeys = accessKeys;
        return this;
    }

}
