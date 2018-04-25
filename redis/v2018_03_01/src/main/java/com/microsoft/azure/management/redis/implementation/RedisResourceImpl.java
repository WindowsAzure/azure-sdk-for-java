/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.redis.RedisResource;
import rx.Observable;
import com.microsoft.azure.management.redis.RedisUpdateParameters;
import java.util.Map;
import com.microsoft.azure.management.redis.RedisCreateParameters;
import java.util.List;
import com.microsoft.azure.management.redis.RedisLinkedServer;
import com.microsoft.azure.management.redis.TlsVersion;
import com.microsoft.azure.management.redis.ProvisioningState;
import com.microsoft.azure.management.redis.Sku;
import rx.functions.Func1;

class RedisResourceImpl extends GroupableResourceCoreImpl<RedisResource, RedisResourceInner, RedisResourceImpl, CacheManager> implements RedisResource, RedisResource.Definition, RedisResource.Update {
    private RedisCreateParameters createParameter;
    private RedisUpdateParameters updateParameter;
    RedisResourceImpl(String name, RedisResourceInner inner, CacheManager manager) {
        super(name, inner, manager);
        this.createParameter = new RedisCreateParameters();
        this.updateParameter = new RedisUpdateParameters();
    }

    @Override
    public Observable<RedisResource> createResourceAsync() {
        RedisInner client = this.manager().inner().redis();
    this.createParameter.withLocation(inner().location());
    this.createParameter.withTags(inner().getTags());
        return client.createAsync(this.resourceGroupName(), this.name(), this.createParameter)
            .map(new Func1<RedisResourceInner, RedisResourceInner>() {
               @Override
               public RedisResourceInner call(RedisResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<RedisResource> updateResourceAsync() {
        RedisInner client = this.manager().inner().redis();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<RedisResourceInner, RedisResourceInner>() {
               @Override
               public RedisResourceInner call(RedisResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RedisResourceInner> getInnerAsync() {
        RedisInner client = this.manager().inner().redis();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new RedisCreateParameters();
        this.updateParameter = new RedisUpdateParameters();
    }

    @Override
    public RedisAccessKeysInner accessKeys() {
        return this.inner().accessKeys();
    }

    @Override
    public Boolean enableNonSslPort() {
        return this.inner().enableNonSslPort();
    }

    @Override
    public String hostName() {
        return this.inner().hostName();
    }

    @Override
    public List<RedisLinkedServer> linkedServers() {
        return this.inner().linkedServers();
    }

    @Override
    public TlsVersion minimumTlsVersion() {
        return this.inner().minimumTlsVersion();
    }

    @Override
    public Integer port() {
        return this.inner().port();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Map<String, String> redisConfiguration() {
        return this.inner().redisConfiguration();
    }

    @Override
    public String redisVersion() {
        return this.inner().redisVersion();
    }

    @Override
    public Integer shardCount() {
        return this.inner().shardCount();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public Integer sslPort() {
        return this.inner().sslPort();
    }

    @Override
    public String staticIP() {
        return this.inner().staticIP();
    }

    @Override
    public String subnetId() {
        return this.inner().subnetId();
    }

    @Override
    public Map<String, String> tenantSettings() {
        return this.inner().tenantSettings();
    }

    @Override
    public List<String> zones() {
        return this.inner().zones();
    }

    @Override
    public RedisResourceImpl withStaticIP(String staticIP) {
        this.createParameter.withStaticIP(staticIP);
        return this;
    }

    @Override
    public RedisResourceImpl withSubnetId(String subnetId) {
        this.createParameter.withSubnetId(subnetId);
        return this;
    }

    @Override
    public RedisResourceImpl withZones(List<String> zones) {
        this.createParameter.withZones(zones);
        return this;
    }

    @Override
    public RedisResourceImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.createParameter.withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

    @Override
    public RedisResourceImpl withEnableNonSslPort(Boolean enableNonSslPort) {
        if (isInCreateMode()) {
            this.createParameter.withEnableNonSslPort(enableNonSslPort);
        } else {
            this.updateParameter.withEnableNonSslPort(enableNonSslPort);
        }
        return this;
    }

    @Override
    public RedisResourceImpl withMinimumTlsVersion(TlsVersion minimumTlsVersion) {
        if (isInCreateMode()) {
            this.createParameter.withMinimumTlsVersion(minimumTlsVersion);
        } else {
            this.updateParameter.withMinimumTlsVersion(minimumTlsVersion);
        }
        return this;
    }

    @Override
    public RedisResourceImpl withRedisConfiguration(Map<String, String> redisConfiguration) {
        if (isInCreateMode()) {
            this.createParameter.withRedisConfiguration(redisConfiguration);
        } else {
            this.updateParameter.withRedisConfiguration(redisConfiguration);
        }
        return this;
    }

    @Override
    public RedisResourceImpl withShardCount(Integer shardCount) {
        if (isInCreateMode()) {
            this.createParameter.withShardCount(shardCount);
        } else {
            this.updateParameter.withShardCount(shardCount);
        }
        return this;
    }

    @Override
    public RedisResourceImpl withTenantSettings(Map<String, String> tenantSettings) {
        if (isInCreateMode()) {
            this.createParameter.withTenantSettings(tenantSettings);
        } else {
            this.updateParameter.withTenantSettings(tenantSettings);
        }
        return this;
    }

}
