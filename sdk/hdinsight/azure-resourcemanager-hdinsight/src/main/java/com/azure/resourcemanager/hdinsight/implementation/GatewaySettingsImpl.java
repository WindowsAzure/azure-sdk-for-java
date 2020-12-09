// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.implementation;

import com.azure.resourcemanager.hdinsight.HDInsightManager;
import com.azure.resourcemanager.hdinsight.fluent.models.GatewaySettingsInner;
import com.azure.resourcemanager.hdinsight.models.GatewaySettings;

public final class GatewaySettingsImpl implements GatewaySettings {
    private GatewaySettingsInner innerObject;

    private final HDInsightManager serviceManager;

    public GatewaySettingsImpl(GatewaySettingsInner innerObject, HDInsightManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String isCredentialEnabled() {
        return this.innerModel().isCredentialEnabled();
    }

    public String username() {
        return this.innerModel().username();
    }

    public String password() {
        return this.innerModel().password();
    }

    public GatewaySettingsInner innerModel() {
        return this.innerObject;
    }

    private HDInsightManager manager() {
        return this.serviceManager;
    }
}
