/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.management.logic.v2016_06_01.IntegrationAccountSession;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import org.joda.time.DateTime;

class IntegrationAccountSessionImpl extends CreatableUpdatableImpl<IntegrationAccountSession, IntegrationAccountSessionInner, IntegrationAccountSessionImpl> implements IntegrationAccountSession, IntegrationAccountSession.Definition, IntegrationAccountSession.Update {
    private final LogicManager manager;
    private String resourceGroupName;
    private String integrationAccountName;
    private String sessionName;

    IntegrationAccountSessionImpl(String name, LogicManager manager) {
        super(name, new IntegrationAccountSessionInner());
        this.manager = manager;
        // Set resource name
        this.sessionName = name;
        //
    }

    IntegrationAccountSessionImpl(IntegrationAccountSessionInner inner, LogicManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.sessionName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.integrationAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "integrationAccounts");
        this.sessionName = IdParsingUtils.getValueFromIdByName(inner.id(), "sessions");
        //
    }

    @Override
    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public Observable<IntegrationAccountSession> createResourceAsync() {
        SessionsInner client = this.manager().inner().sessions();
        return client.createOrUpdateAsync(this.resourceGroupName, this.integrationAccountName, this.sessionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<IntegrationAccountSession> updateResourceAsync() {
        SessionsInner client = this.manager().inner().sessions();
        return client.createOrUpdateAsync(this.resourceGroupName, this.integrationAccountName, this.sessionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<IntegrationAccountSessionInner> getInnerAsync() {
        SessionsInner client = this.manager().inner().sessions();
        return client.getAsync(this.resourceGroupName, this.integrationAccountName, this.sessionName);
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
    public Object content() {
        return this.inner().content();
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
    public String name() {
        return this.inner().name();
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
    public IntegrationAccountSessionImpl withExistingIntegrationAccount(String resourceGroupName, String integrationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.integrationAccountName = integrationAccountName;
        return this;
    }

    @Override
    public IntegrationAccountSessionImpl withContent(Object content) {
        this.inner().withContent(content);
        return this;
    }

    @Override
    public IntegrationAccountSessionImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public IntegrationAccountSessionImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

}
