// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.implementation;

import com.azure.resourcemanager.hdinsight.HDInsightManager;
import com.azure.resourcemanager.hdinsight.fluent.models.HostInfoInner;
import com.azure.resourcemanager.hdinsight.models.HostInfo;

public final class HostInfoImpl implements HostInfo {
    private HostInfoInner innerObject;

    private final HDInsightManager serviceManager;

    HostInfoImpl(HostInfoInner innerObject, HDInsightManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String fqdn() {
        return this.innerModel().fqdn();
    }

    public String effectiveDiskEncryptionKeyUrl() {
        return this.innerModel().effectiveDiskEncryptionKeyUrl();
    }

    public HostInfoInner innerModel() {
        return this.innerObject;
    }

    private HDInsightManager manager() {
        return this.serviceManager;
    }
}
