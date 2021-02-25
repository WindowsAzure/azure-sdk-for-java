// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Parameters supplied to the Update Redis operation. */
@JsonFlatten
@Fluent
public class RedisUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RedisUpdateParameters.class);

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * All Redis Settings. Few possible keys:
     * rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value
     * etc.
     */
    @JsonProperty(value = "properties.redisConfiguration")
    private Map<String, String> redisConfiguration;

    /*
     * Specifies whether the non-ssl Redis server port (6379) is enabled.
     */
    @JsonProperty(value = "properties.enableNonSslPort")
    private Boolean enableNonSslPort;

    /*
     * The number of replicas to be created per master.
     */
    @JsonProperty(value = "properties.replicasPerMaster")
    private Integer replicasPerMaster;

    /*
     * A dictionary of tenant settings
     */
    @JsonProperty(value = "properties.tenantSettings")
    private Map<String, String> tenantSettings;

    /*
     * The number of shards to be created on a Premium Cluster Cache.
     */
    @JsonProperty(value = "properties.shardCount")
    private Integer shardCount;

    /*
     * Optional: requires clients to use a specified TLS version (or higher) to
     * connect (e,g, '1.0', '1.1', '1.2')
     */
    @JsonProperty(value = "properties.minimumTlsVersion")
    private TlsVersion minimumTlsVersion;

    /*
     * Whether or not public endpoint access is allowed for this cache.  Value
     * is optional but if passed in, must be 'Enabled' or 'Disabled'. If
     * 'Disabled', private endpoints are the exclusive access method. Default
     * value is 'Enabled'
     */
    @JsonProperty(value = "properties.publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * The SKU of the Redis cache to deploy.
     */
    @JsonProperty(value = "properties.sku")
    private Sku sku;

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the redisConfiguration property: All Redis Settings. Few possible keys:
     * rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value
     * etc.
     *
     * @return the redisConfiguration value.
     */
    public Map<String, String> redisConfiguration() {
        return this.redisConfiguration;
    }

    /**
     * Set the redisConfiguration property: All Redis Settings. Few possible keys:
     * rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value
     * etc.
     *
     * @param redisConfiguration the redisConfiguration value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withRedisConfiguration(Map<String, String> redisConfiguration) {
        this.redisConfiguration = redisConfiguration;
        return this;
    }

    /**
     * Get the enableNonSslPort property: Specifies whether the non-ssl Redis server port (6379) is enabled.
     *
     * @return the enableNonSslPort value.
     */
    public Boolean enableNonSslPort() {
        return this.enableNonSslPort;
    }

    /**
     * Set the enableNonSslPort property: Specifies whether the non-ssl Redis server port (6379) is enabled.
     *
     * @param enableNonSslPort the enableNonSslPort value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withEnableNonSslPort(Boolean enableNonSslPort) {
        this.enableNonSslPort = enableNonSslPort;
        return this;
    }

    /**
     * Get the replicasPerMaster property: The number of replicas to be created per master.
     *
     * @return the replicasPerMaster value.
     */
    public Integer replicasPerMaster() {
        return this.replicasPerMaster;
    }

    /**
     * Set the replicasPerMaster property: The number of replicas to be created per master.
     *
     * @param replicasPerMaster the replicasPerMaster value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withReplicasPerMaster(Integer replicasPerMaster) {
        this.replicasPerMaster = replicasPerMaster;
        return this;
    }

    /**
     * Get the tenantSettings property: A dictionary of tenant settings.
     *
     * @return the tenantSettings value.
     */
    public Map<String, String> tenantSettings() {
        return this.tenantSettings;
    }

    /**
     * Set the tenantSettings property: A dictionary of tenant settings.
     *
     * @param tenantSettings the tenantSettings value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withTenantSettings(Map<String, String> tenantSettings) {
        this.tenantSettings = tenantSettings;
        return this;
    }

    /**
     * Get the shardCount property: The number of shards to be created on a Premium Cluster Cache.
     *
     * @return the shardCount value.
     */
    public Integer shardCount() {
        return this.shardCount;
    }

    /**
     * Set the shardCount property: The number of shards to be created on a Premium Cluster Cache.
     *
     * @param shardCount the shardCount value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }

    /**
     * Get the minimumTlsVersion property: Optional: requires clients to use a specified TLS version (or higher) to
     * connect (e,g, '1.0', '1.1', '1.2').
     *
     * @return the minimumTlsVersion value.
     */
    public TlsVersion minimumTlsVersion() {
        return this.minimumTlsVersion;
    }

    /**
     * Set the minimumTlsVersion property: Optional: requires clients to use a specified TLS version (or higher) to
     * connect (e,g, '1.0', '1.1', '1.2').
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withMinimumTlsVersion(TlsVersion minimumTlsVersion) {
        this.minimumTlsVersion = minimumTlsVersion;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether or not public endpoint access is allowed for this cache. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'. If 'Disabled', private endpoints are the exclusive
     * access method. Default value is 'Enabled'.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether or not public endpoint access is allowed for this cache. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'. If 'Disabled', private endpoints are the exclusive
     * access method. Default value is 'Enabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the sku property: The SKU of the Redis cache to deploy.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the Redis cache to deploy.
     *
     * @param sku the sku value to set.
     * @return the RedisUpdateParameters object itself.
     */
    public RedisUpdateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
    }
}
