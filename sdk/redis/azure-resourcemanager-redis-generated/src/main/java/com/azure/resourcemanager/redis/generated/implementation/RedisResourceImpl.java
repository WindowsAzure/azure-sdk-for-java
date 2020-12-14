// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.redis.generated.RedisManager;
import com.azure.resourcemanager.redis.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.redis.generated.fluent.models.RedisAccessKeysInner;
import com.azure.resourcemanager.redis.generated.fluent.models.RedisResourceInner;
import com.azure.resourcemanager.redis.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.redis.generated.models.ProvisioningState;
import com.azure.resourcemanager.redis.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.redis.generated.models.RedisAccessKeys;
import com.azure.resourcemanager.redis.generated.models.RedisCreateParameters;
import com.azure.resourcemanager.redis.generated.models.RedisInstanceDetails;
import com.azure.resourcemanager.redis.generated.models.RedisLinkedServer;
import com.azure.resourcemanager.redis.generated.models.RedisResource;
import com.azure.resourcemanager.redis.generated.models.RedisUpdateParameters;
import com.azure.resourcemanager.redis.generated.models.Sku;
import com.azure.resourcemanager.redis.generated.models.TlsVersion;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class RedisResourceImpl implements RedisResource, RedisResource.Definition, RedisResource.Update {
    private RedisResourceInner innerObject;

    private final RedisManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Map<String, String> redisConfiguration() {
        Map<String, String> inner = this.innerModel().redisConfiguration();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Boolean enableNonSslPort() {
        return this.innerModel().enableNonSslPort();
    }

    public Integer replicasPerMaster() {
        return this.innerModel().replicasPerMaster();
    }

    public Map<String, String> tenantSettings() {
        Map<String, String> inner = this.innerModel().tenantSettings();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Integer shardCount() {
        return this.innerModel().shardCount();
    }

    public TlsVersion minimumTlsVersion() {
        return this.innerModel().minimumTlsVersion();
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public String subnetId() {
        return this.innerModel().subnetId();
    }

    public String staticIp() {
        return this.innerModel().staticIp();
    }

    public String redisVersion() {
        return this.innerModel().redisVersion();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String hostname() {
        return this.innerModel().hostname();
    }

    public Integer port() {
        return this.innerModel().port();
    }

    public Integer sslPort() {
        return this.innerModel().sslPort();
    }

    public RedisAccessKeys accessKeys() {
        RedisAccessKeysInner inner = this.innerModel().accessKeys();
        if (inner != null) {
            return new RedisAccessKeysImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<RedisLinkedServer> linkedServers() {
        List<RedisLinkedServer> inner = this.innerModel().linkedServers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<RedisInstanceDetails> instances() {
        List<RedisInstanceDetails> inner = this.innerModel().instances();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public RedisResourceInner innerModel() {
        return this.innerObject;
    }

    private RedisManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private RedisCreateParameters createParameters;

    private RedisUpdateParameters updateParameters;

    public RedisResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public RedisResource create() {
        this.innerObject =
            serviceManager.serviceClient().getRedis().create(resourceGroupName, name, createParameters, Context.NONE);
        return this;
    }

    public RedisResource create(Context context) {
        this.innerObject =
            serviceManager.serviceClient().getRedis().create(resourceGroupName, name, createParameters, context);
        return this;
    }

    public RedisResourceImpl(String name, RedisManager serviceManager) {
        this.innerObject = new RedisResourceInner();
        this.serviceManager = serviceManager;
        this.name = name;
        this.createParameters = new RedisCreateParameters();
    }

    public RedisResourceImpl update() {
        this.updateParameters = new RedisUpdateParameters();
        return this;
    }

    public RedisResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRedis()
                .updateWithResponse(resourceGroupName, name, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public RedisResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRedis()
                .updateWithResponse(resourceGroupName, name, updateParameters, context)
                .getValue();
        return this;
    }

    public RedisResourceImpl(RedisResourceInner innerObject, RedisManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "redis");
    }

    public RedisResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRedis()
                .getByResourceGroupWithResponse(resourceGroupName, name, Context.NONE)
                .getValue();
        return this;
    }

    public RedisResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRedis()
                .getByResourceGroupWithResponse(resourceGroupName, name, context)
                .getValue();
        return this;
    }

    public RedisResourceImpl withRegion(Region location) {
        this.createParameters.withLocation(location.toString());
        return this;
    }

    public RedisResourceImpl withRegion(String location) {
        this.createParameters.withLocation(location);
        return this;
    }

    public RedisResourceImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.createParameters.withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public RedisResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createParameters.withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public RedisResourceImpl withZones(List<String> zones) {
        this.createParameters.withZones(zones);
        return this;
    }

    public RedisResourceImpl withRedisConfiguration(Map<String, String> redisConfiguration) {
        if (isInCreateMode()) {
            this.createParameters.withRedisConfiguration(redisConfiguration);
            return this;
        } else {
            this.updateParameters.withRedisConfiguration(redisConfiguration);
            return this;
        }
    }

    public RedisResourceImpl withEnableNonSslPort(Boolean enableNonSslPort) {
        if (isInCreateMode()) {
            this.createParameters.withEnableNonSslPort(enableNonSslPort);
            return this;
        } else {
            this.updateParameters.withEnableNonSslPort(enableNonSslPort);
            return this;
        }
    }

    public RedisResourceImpl withReplicasPerMaster(Integer replicasPerMaster) {
        if (isInCreateMode()) {
            this.createParameters.withReplicasPerMaster(replicasPerMaster);
            return this;
        } else {
            this.updateParameters.withReplicasPerMaster(replicasPerMaster);
            return this;
        }
    }

    public RedisResourceImpl withTenantSettings(Map<String, String> tenantSettings) {
        if (isInCreateMode()) {
            this.createParameters.withTenantSettings(tenantSettings);
            return this;
        } else {
            this.updateParameters.withTenantSettings(tenantSettings);
            return this;
        }
    }

    public RedisResourceImpl withShardCount(Integer shardCount) {
        if (isInCreateMode()) {
            this.createParameters.withShardCount(shardCount);
            return this;
        } else {
            this.updateParameters.withShardCount(shardCount);
            return this;
        }
    }

    public RedisResourceImpl withMinimumTlsVersion(TlsVersion minimumTlsVersion) {
        if (isInCreateMode()) {
            this.createParameters.withMinimumTlsVersion(minimumTlsVersion);
            return this;
        } else {
            this.updateParameters.withMinimumTlsVersion(minimumTlsVersion);
            return this;
        }
    }

    public RedisResourceImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (isInCreateMode()) {
            this.createParameters.withPublicNetworkAccess(publicNetworkAccess);
            return this;
        } else {
            this.updateParameters.withPublicNetworkAccess(publicNetworkAccess);
            return this;
        }
    }

    public RedisResourceImpl withSubnetId(String subnetId) {
        this.createParameters.withSubnetId(subnetId);
        return this;
    }

    public RedisResourceImpl withStaticIp(String staticIp) {
        this.createParameters.withStaticIp(staticIp);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
