/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation;

import com.microsoft.azure.management.datafactoryv2.v2018_06_01.LinkedServiceResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.IntegrationRuntimeReference;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.ParameterSpecification;
import java.util.List;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.;
import rx.functions.Func1;

class LinkedServiceResourceImpl extends CreatableUpdatableImpl<LinkedServiceResource, LinkedServiceResourceInner, LinkedServiceResourceImpl> implements LinkedServiceResource, LinkedServiceResource.Definition, LinkedServiceResource.Update {
    private final DataFactoryManager manager;
    private String resourceGroupName;
    private String factoryName;
    private String linkedServiceName;
    private String cifMatch;
    private LinkedServiceInner cproperties;
    private String uifMatch;
    private LinkedServiceInner uproperties;

    LinkedServiceResourceImpl(String name, DataFactoryManager manager) {
        super(name, new LinkedServiceResourceInner());
        this.manager = manager;
        // Set resource name
        this.linkedServiceName = name;
        //
        this.cproperties = new LinkedServiceInner();
        this.uproperties = new LinkedServiceInner();
    }

    LinkedServiceResourceImpl(LinkedServiceResourceInner inner, DataFactoryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.linkedServiceName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.factoryName = IdParsingUtils.getValueFromIdByName(inner.id(), "factories");
        this.linkedServiceName = IdParsingUtils.getValueFromIdByName(inner.id(), "linkedservices");
        //
        this.cproperties = new LinkedServiceInner();
        this.uproperties = new LinkedServiceInner();
    }

    @Override
    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<LinkedServiceResource> createResourceAsync() {
        LinkedServicesInner client = this.manager().inner().linkedServices();
        return client.createOrUpdateAsync(this.resourceGroupName, this.factoryName, this.linkedServiceName, this.cproperties, this.cifMatch)
            .map(new Func1<LinkedServiceResourceInner, LinkedServiceResourceInner>() {
               @Override
               public LinkedServiceResourceInner call(LinkedServiceResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<LinkedServiceResource> updateResourceAsync() {
        LinkedServicesInner client = this.manager().inner().linkedServices();
        return client.createOrUpdateAsync(this.resourceGroupName, this.factoryName, this.linkedServiceName, this.uproperties, this.uifMatch)
            .map(new Func1<LinkedServiceResourceInner, LinkedServiceResourceInner>() {
               @Override
               public LinkedServiceResourceInner call(LinkedServiceResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<LinkedServiceResourceInner> getInnerAsync() {
        LinkedServicesInner client = this.manager().inner().linkedServices();
        return client.getAsync(this.resourceGroupName, this.factoryName, this.linkedServiceName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new LinkedServiceInner();
        this.uproperties = new LinkedServiceInner();
    }

    @Override
    public String etag() {
        return this.inner().etag();
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
    public LinkedServiceInner properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public LinkedServiceResourceImpl withExistingFactory(String resourceGroupName, String factoryName) {
        this.resourceGroupName = resourceGroupName;
        this.factoryName = factoryName;
        return this;
    }

    @Override
    public LinkedServiceResourceImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public LinkedServiceResourceImpl withProperties(LinkedServiceInner properties) {
        if (isInCreateMode()) {
            this.cproperties = properties;
        } else {
            this.uproperties = properties;
        }
        return this;
    }

}
