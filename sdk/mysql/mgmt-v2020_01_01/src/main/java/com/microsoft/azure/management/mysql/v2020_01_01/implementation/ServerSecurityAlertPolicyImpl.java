/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2020_01_01.implementation;

import com.microsoft.azure.management.mysql.v2020_01_01.ServerSecurityAlertPolicy;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.mysql.v2020_01_01.ServerSecurityAlertPolicyState;
import java.util.List;

class ServerSecurityAlertPolicyImpl extends CreatableUpdatableImpl<ServerSecurityAlertPolicy, ServerSecurityAlertPolicyInner, ServerSecurityAlertPolicyImpl> implements ServerSecurityAlertPolicy, ServerSecurityAlertPolicy.Definition, ServerSecurityAlertPolicy.Update {
    private final MySQLManager manager;
    private String resourceGroupName;
    private String serverName;

    ServerSecurityAlertPolicyImpl(String name, MySQLManager manager) {
        super(name, new ServerSecurityAlertPolicyInner());
        this.manager = manager;
        // Set resource name
        this.serverName = name;
        //
    }

    ServerSecurityAlertPolicyImpl(ServerSecurityAlertPolicyInner inner, MySQLManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.serverName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        //
    }

    @Override
    public MySQLManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ServerSecurityAlertPolicy> createResourceAsync() {
        ServerSecurityAlertPoliciesInner client = this.manager().inner().serverSecurityAlertPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ServerSecurityAlertPolicy> updateResourceAsync() {
        ServerSecurityAlertPoliciesInner client = this.manager().inner().serverSecurityAlertPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ServerSecurityAlertPolicyInner> getInnerAsync() {
        ServerSecurityAlertPoliciesInner client = this.manager().inner().serverSecurityAlertPolicies();
        return client.getAsync(this.resourceGroupName, this.serverName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<String> disabledAlerts() {
        return this.inner().disabledAlerts();
    }

    @Override
    public Boolean emailAccountAdmins() {
        return this.inner().emailAccountAdmins();
    }

    @Override
    public List<String> emailAddresses() {
        return this.inner().emailAddresses();
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
    public Integer retentionDays() {
        return this.inner().retentionDays();
    }

    @Override
    public ServerSecurityAlertPolicyState state() {
        return this.inner().state();
    }

    @Override
    public String storageAccountAccessKey() {
        return this.inner().storageAccountAccessKey();
    }

    @Override
    public String storageEndpoint() {
        return this.inner().storageEndpoint();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ServerSecurityAlertPolicyImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    @Override
    public ServerSecurityAlertPolicyImpl withState(ServerSecurityAlertPolicyState state) {
        this.inner().withState(state);
        return this;
    }

    @Override
    public ServerSecurityAlertPolicyImpl withDisabledAlerts(List<String> disabledAlerts) {
        this.inner().withDisabledAlerts(disabledAlerts);
        return this;
    }

    @Override
    public ServerSecurityAlertPolicyImpl withEmailAccountAdmins(Boolean emailAccountAdmins) {
        this.inner().withEmailAccountAdmins(emailAccountAdmins);
        return this;
    }

    @Override
    public ServerSecurityAlertPolicyImpl withEmailAddresses(List<String> emailAddresses) {
        this.inner().withEmailAddresses(emailAddresses);
        return this;
    }

    @Override
    public ServerSecurityAlertPolicyImpl withRetentionDays(Integer retentionDays) {
        this.inner().withRetentionDays(retentionDays);
        return this;
    }

    @Override
    public ServerSecurityAlertPolicyImpl withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.inner().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    @Override
    public ServerSecurityAlertPolicyImpl withStorageEndpoint(String storageEndpoint) {
        this.inner().withStorageEndpoint(storageEndpoint);
        return this;
    }

}
