/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01.implementation;

import com.microsoft.azure.management.mysql.v2017_12_01.Configuration;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class ConfigurationImpl extends CreatableUpdatableImpl<Configuration, ConfigurationInner, ConfigurationImpl> implements Configuration, Configuration.Definition, Configuration.Update {
    private final MySQLManager manager;
    private String resourceGroupName;
    private String serverName;
    private String configurationName;

    ConfigurationImpl(String name, MySQLManager manager) {
        super(name, new ConfigurationInner());
        this.manager = manager;
        // Set resource name
        this.configurationName = name;
        //
    }

    ConfigurationImpl(ConfigurationInner inner, MySQLManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.configurationName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.configurationName = IdParsingUtils.getValueFromIdByName(inner.id(), "configurations");
        //
    }

    @Override
    public MySQLManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Configuration> createResourceAsync() {
        ConfigurationsInner client = this.manager().inner().configurations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.configurationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Configuration> updateResourceAsync() {
        ConfigurationsInner client = this.manager().inner().configurations();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.configurationName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ConfigurationInner> getInnerAsync() {
        ConfigurationsInner client = this.manager().inner().configurations();
        return client.getAsync(this.resourceGroupName, this.serverName, this.configurationName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String allowedValues() {
        return this.inner().allowedValues();
    }

    @Override
    public String dataType() {
        return this.inner().dataType();
    }

    @Override
    public String defaultValue() {
        return this.inner().defaultValue();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String source() {
        return this.inner().source();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String value() {
        return this.inner().value();
    }

    @Override
    public ConfigurationImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    @Override
    public ConfigurationImpl withSource(String source) {
        this.inner().withSource(source);
        return this;
    }

    @Override
    public ConfigurationImpl withValue(String value) {
        this.inner().withValue(value);
        return this;
    }

}
