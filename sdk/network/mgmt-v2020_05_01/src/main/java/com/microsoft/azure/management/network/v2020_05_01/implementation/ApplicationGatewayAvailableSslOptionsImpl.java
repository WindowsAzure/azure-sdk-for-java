/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.management.network.v2020_05_01.ApplicationGatewayAvailableSslOptions;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.network.v2020_05_01.ApplicationGatewaySslCipherSuite;
import com.microsoft.azure.management.network.v2020_05_01.ApplicationGatewaySslProtocol;
import com.microsoft.azure.management.network.v2020_05_01.ApplicationGatewaySslPolicyName;
import com.microsoft.azure.SubResource;
import java.util.Map;

class ApplicationGatewayAvailableSslOptionsImpl extends WrapperImpl<ApplicationGatewayAvailableSslOptionsInner> implements ApplicationGatewayAvailableSslOptions {
    private final NetworkManager manager;
    ApplicationGatewayAvailableSslOptionsImpl(ApplicationGatewayAvailableSslOptionsInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public List<ApplicationGatewaySslCipherSuite> availableCipherSuites() {
        return this.inner().availableCipherSuites();
    }

    @Override
    public List<ApplicationGatewaySslProtocol> availableProtocols() {
        return this.inner().availableProtocols();
    }

    @Override
    public ApplicationGatewaySslPolicyName defaultPolicy() {
        return this.inner().defaultPolicy();
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
    public List<SubResource> predefinedPolicies() {
        return this.inner().predefinedPolicies();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
