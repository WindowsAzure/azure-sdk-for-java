/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.postgresql.v2017_12_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.postgresql.v2017_12_01_preview.Configurations;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.postgresql.v2017_12_01_preview.Configuration;

class ConfigurationsImpl extends WrapperImpl<ConfigurationsInner> implements Configurations {
    private final DBforPostgreSQLManager manager;

    ConfigurationsImpl(DBforPostgreSQLManager manager) {
        super(manager.inner().configurations());
        this.manager = manager;
    }

    public DBforPostgreSQLManager manager() {
        return this.manager;
    }

    @Override
    public ConfigurationImpl define(String name) {
        return wrapModel(name);
    }

    private ConfigurationImpl wrapModel(ConfigurationInner inner) {
        return  new ConfigurationImpl(inner, manager());
    }

    private ConfigurationImpl wrapModel(String name) {
        return new ConfigurationImpl(name, this.manager());
    }

    @Override
    public Observable<Configuration> listByServerAsync(String resourceGroupName, String serverName) {
        ConfigurationsInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMap(new Func1<List<ConfigurationInner>, Observable<ConfigurationInner>>() {
            @Override
            public Observable<ConfigurationInner> call(List<ConfigurationInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<ConfigurationInner, Configuration>() {
            @Override
            public Configuration call(ConfigurationInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Configuration> getAsync(String resourceGroupName, String serverName, String configurationName) {
        ConfigurationsInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, configurationName)
        .map(new Func1<ConfigurationInner, Configuration>() {
            @Override
            public Configuration call(ConfigurationInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
