/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccountMap;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.logic.v2016_06_01.MapType;
import com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccountMapPropertiesParametersSchema;
import org.joda.time.DateTime;
import com.microsoft.azure.management.logic.v2016_06_01.ContentLink;

class IntegrationAccountMapImpl extends CreatableUpdatableImpl<IntegrationAccountMap, IntegrationAccountMapInner, IntegrationAccountMapImpl> implements IntegrationAccountMap, IntegrationAccountMap.Definition, IntegrationAccountMap.Update {
    private final LogicManager manager;
    private String resourceGroupName;
    private String integrationAccountName;
    private String mapName;

    IntegrationAccountMapImpl(String name, LogicManager manager) {
        super(name, new IntegrationAccountMapInner());
        this.manager = manager;
        // Set resource name
        this.mapName = name;
        //
    }

    IntegrationAccountMapImpl(IntegrationAccountMapInner inner, LogicManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.mapName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.integrationAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "integrationAccounts");
        this.mapName = IdParsingUtils.getValueFromIdByName(inner.id(), "maps");
        //
    }

    @Override
    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public Observable<IntegrationAccountMap> createResourceAsync() {
        MapsInner client = this.manager().inner().maps();
        return client.createOrUpdateAsync(this.resourceGroupName, this.integrationAccountName, this.mapName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<IntegrationAccountMap> updateResourceAsync() {
        MapsInner client = this.manager().inner().maps();
        return client.createOrUpdateAsync(this.resourceGroupName, this.integrationAccountName, this.mapName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<IntegrationAccountMapInner> getInnerAsync() {
        MapsInner client = this.manager().inner().maps();
        return client.getAsync(this.resourceGroupName, this.integrationAccountName, this.mapName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public DateTime changedTime() {
        return this.inner().changedTime();
    }

    @Override
    public String content() {
        return this.inner().content();
    }

    @Override
    public ContentLink contentLink() {
        return this.inner().contentLink();
    }

    @Override
    public String contentType() {
        return this.inner().contentType();
    }

    @Override
    public DateTime createdTime() {
        return this.inner().createdTime();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public MapType mapType() {
        return this.inner().mapType();
    }

    @Override
    public Object metadata() {
        return this.inner().metadata();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public IntegrationAccountMapPropertiesParametersSchema parametersSchema() {
        return this.inner().parametersSchema();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public IntegrationAccountMapImpl withExistingIntegrationAccount(String resourceGroupName, String integrationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.integrationAccountName = integrationAccountName;
        return this;
    }

    @Override
    public IntegrationAccountMapImpl withMapType(MapType mapType) {
        this.inner().withMapType(mapType);
        return this;
    }

    @Override
    public IntegrationAccountMapImpl withContent(String content) {
        this.inner().withContent(content);
        return this;
    }

    @Override
    public IntegrationAccountMapImpl withContentType(String contentType) {
        this.inner().withContentType(contentType);
        return this;
    }

    @Override
    public IntegrationAccountMapImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public IntegrationAccountMapImpl withMetadata(Object metadata) {
        this.inner().withMetadata(metadata);
        return this;
    }

    @Override
    public IntegrationAccountMapImpl withParametersSchema(IntegrationAccountMapPropertiesParametersSchema parametersSchema) {
        this.inner().withParametersSchema(parametersSchema);
        return this;
    }

    @Override
    public IntegrationAccountMapImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

}
