// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.fluent.models.StorageAccountCredentialInner;
import com.azure.resourcemanager.databoxedge.models.AccountType;
import com.azure.resourcemanager.databoxedge.models.AsymmetricEncryptedSecret;
import com.azure.resourcemanager.databoxedge.models.SslStatus;
import com.azure.resourcemanager.databoxedge.models.StorageAccountCredential;

public final class StorageAccountCredentialImpl
    implements StorageAccountCredential, StorageAccountCredential.Definition, StorageAccountCredential.Update {
    private StorageAccountCredentialInner innerObject;

    private final com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String alias() {
        return this.innerModel().alias();
    }

    public String username() {
        return this.innerModel().username();
    }

    public AsymmetricEncryptedSecret accountKey() {
        return this.innerModel().accountKey();
    }

    public String connectionString() {
        return this.innerModel().connectionString();
    }

    public SslStatus sslStatus() {
        return this.innerModel().sslStatus();
    }

    public String blobDomainName() {
        return this.innerModel().blobDomainName();
    }

    public AccountType accountType() {
        return this.innerModel().accountType();
    }

    public String storageAccountId() {
        return this.innerModel().storageAccountId();
    }

    public StorageAccountCredentialInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }

    private String deviceName;

    private String name;

    private String resourceGroupName;

    public StorageAccountCredentialImpl withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        this.deviceName = deviceName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public StorageAccountCredential create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccountCredentials()
                .createOrUpdate(deviceName, name, resourceGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public StorageAccountCredential create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccountCredentials()
                .createOrUpdate(deviceName, name, resourceGroupName, this.innerModel(), context);
        return this;
    }

    StorageAccountCredentialImpl(String name, com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager) {
        this.innerObject = new StorageAccountCredentialInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public StorageAccountCredentialImpl update() {
        return this;
    }

    public StorageAccountCredential apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccountCredentials()
                .createOrUpdate(deviceName, name, resourceGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public StorageAccountCredential apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccountCredentials()
                .createOrUpdate(deviceName, name, resourceGroupName, this.innerModel(), context);
        return this;
    }

    StorageAccountCredentialImpl(
        StorageAccountCredentialInner innerObject,
        com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.deviceName = Utils.getValueFromIdByName(innerObject.id(), "dataBoxEdgeDevices");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "storageAccountCredentials");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
    }

    public StorageAccountCredential refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccountCredentials()
                .getWithResponse(deviceName, name, resourceGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public StorageAccountCredential refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageAccountCredentials()
                .getWithResponse(deviceName, name, resourceGroupName, context)
                .getValue();
        return this;
    }

    public StorageAccountCredentialImpl withAlias(String alias) {
        this.innerModel().withAlias(alias);
        return this;
    }

    public StorageAccountCredentialImpl withSslStatus(SslStatus sslStatus) {
        this.innerModel().withSslStatus(sslStatus);
        return this;
    }

    public StorageAccountCredentialImpl withAccountType(AccountType accountType) {
        this.innerModel().withAccountType(accountType);
        return this;
    }

    public StorageAccountCredentialImpl withUsername(String username) {
        this.innerModel().withUsername(username);
        return this;
    }

    public StorageAccountCredentialImpl withAccountKey(AsymmetricEncryptedSecret accountKey) {
        this.innerModel().withAccountKey(accountKey);
        return this;
    }

    public StorageAccountCredentialImpl withConnectionString(String connectionString) {
        this.innerModel().withConnectionString(connectionString);
        return this;
    }

    public StorageAccountCredentialImpl withBlobDomainName(String blobDomainName) {
        this.innerModel().withBlobDomainName(blobDomainName);
        return this;
    }

    public StorageAccountCredentialImpl withStorageAccountId(String storageAccountId) {
        this.innerModel().withStorageAccountId(storageAccountId);
        return this;
    }
}
