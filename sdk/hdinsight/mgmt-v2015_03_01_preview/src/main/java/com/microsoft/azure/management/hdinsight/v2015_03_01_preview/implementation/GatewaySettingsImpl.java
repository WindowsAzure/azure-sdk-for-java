/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview.implementation;

import com.microsoft.azure.management.hdinsight.v2015_03_01_preview.GatewaySettings;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class GatewaySettingsImpl extends WrapperImpl<GatewaySettingsInner> implements GatewaySettings {
    private final HDInsightManager manager;
    GatewaySettingsImpl(GatewaySettingsInner inner, HDInsightManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public HDInsightManager manager() {
        return this.manager;
    }

    @Override
    public String isCredentialEnabled() {
        return this.inner().isCredentialEnabled();
    }

    @Override
    public String password() {
        return this.inner().password();
    }

    @Override
    public String userName() {
        return this.inner().userName();
    }

}
