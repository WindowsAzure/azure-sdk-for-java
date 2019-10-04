/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGateway;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewaySku;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewaySslPolicy;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayOperationalState;
import java.util.List;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayIPConfiguration;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayAuthenticationCertificate;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayTrustedRootCertificate;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewaySslCertificate;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayFrontendIPConfiguration;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayFrontendPort;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayProbe;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayBackendAddressPool;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayBackendHttpSettings;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayHttpListener;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayUrlPathMap;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayRequestRoutingRule;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayRewriteRuleSet;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayRedirectConfiguration;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayWebApplicationFirewallConfiguration;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayAutoscaleConfiguration;
import com.microsoft.azure.management.network.v2019_07_01.ProvisioningState;
import com.microsoft.azure.management.network.v2019_07_01.ApplicationGatewayCustomError;
import com.microsoft.azure.management.network.v2019_07_01.ManagedServiceIdentity;

class ApplicationGatewayImpl extends GroupableResourceCoreImpl<ApplicationGateway, ApplicationGatewayInner, ApplicationGatewayImpl, NetworkManager> implements ApplicationGateway, ApplicationGateway.Definition, ApplicationGateway.Update {
    ApplicationGatewayImpl(String name, ApplicationGatewayInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ApplicationGateway> createResourceAsync() {
        ApplicationGatewaysInner client = this.manager().inner().applicationGateways();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ApplicationGateway> updateResourceAsync() {
        ApplicationGatewaysInner client = this.manager().inner().applicationGateways();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ApplicationGatewayInner> getInnerAsync() {
        ApplicationGatewaysInner client = this.manager().inner().applicationGateways();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<ApplicationGatewayAuthenticationCertificate> authenticationCertificates() {
        return this.inner().authenticationCertificates();
    }

    @Override
    public ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration() {
        return this.inner().autoscaleConfiguration();
    }

    @Override
    public List<ApplicationGatewayBackendAddressPool> backendAddressPools() {
        return this.inner().backendAddressPools();
    }

    @Override
    public List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection() {
        return this.inner().backendHttpSettingsCollection();
    }

    @Override
    public List<ApplicationGatewayCustomError> customErrorConfigurations() {
        return this.inner().customErrorConfigurations();
    }

    @Override
    public Boolean enableFips() {
        return this.inner().enableFips();
    }

    @Override
    public Boolean enableHttp2() {
        return this.inner().enableHttp2();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public SubResource firewallPolicy() {
        return this.inner().firewallPolicy();
    }

    @Override
    public List<ApplicationGatewayFrontendIPConfiguration> frontendIPConfigurations() {
        return this.inner().frontendIPConfigurations();
    }

    @Override
    public List<ApplicationGatewayFrontendPort> frontendPorts() {
        return this.inner().frontendPorts();
    }

    @Override
    public List<ApplicationGatewayIPConfiguration> gatewayIPConfigurations() {
        return this.inner().gatewayIPConfigurations();
    }

    @Override
    public List<ApplicationGatewayHttpListener> httpListeners() {
        return this.inner().httpListeners();
    }

    @Override
    public ManagedServiceIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public ApplicationGatewayOperationalState operationalState() {
        return this.inner().operationalState();
    }

    @Override
    public List<ApplicationGatewayProbe> probes() {
        return this.inner().probes();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<ApplicationGatewayRedirectConfiguration> redirectConfigurations() {
        return this.inner().redirectConfigurations();
    }

    @Override
    public List<ApplicationGatewayRequestRoutingRule> requestRoutingRules() {
        return this.inner().requestRoutingRules();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public List<ApplicationGatewayRewriteRuleSet> rewriteRuleSets() {
        return this.inner().rewriteRuleSets();
    }

    @Override
    public ApplicationGatewaySku sku() {
        return this.inner().sku();
    }

    @Override
    public List<ApplicationGatewaySslCertificate> sslCertificates() {
        return this.inner().sslCertificates();
    }

    @Override
    public ApplicationGatewaySslPolicy sslPolicy() {
        return this.inner().sslPolicy();
    }

    @Override
    public List<ApplicationGatewayTrustedRootCertificate> trustedRootCertificates() {
        return this.inner().trustedRootCertificates();
    }

    @Override
    public List<ApplicationGatewayUrlPathMap> urlPathMaps() {
        return this.inner().urlPathMaps();
    }

    @Override
    public ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration() {
        return this.inner().webApplicationFirewallConfiguration();
    }

    @Override
    public List<String> zones() {
        return this.inner().zones();
    }

    @Override
    public ApplicationGatewayImpl withAuthenticationCertificates(List<ApplicationGatewayAuthenticationCertificate> authenticationCertificates) {
        this.inner().withAuthenticationCertificates(authenticationCertificates);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withAutoscaleConfiguration(ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration) {
        this.inner().withAutoscaleConfiguration(autoscaleConfiguration);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withBackendAddressPools(List<ApplicationGatewayBackendAddressPool> backendAddressPools) {
        this.inner().withBackendAddressPools(backendAddressPools);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withBackendHttpSettingsCollection(List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection) {
        this.inner().withBackendHttpSettingsCollection(backendHttpSettingsCollection);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withCustomErrorConfigurations(List<ApplicationGatewayCustomError> customErrorConfigurations) {
        this.inner().withCustomErrorConfigurations(customErrorConfigurations);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withEnableFips(Boolean enableFips) {
        this.inner().withEnableFips(enableFips);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withEnableHttp2(Boolean enableHttp2) {
        this.inner().withEnableHttp2(enableHttp2);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withFirewallPolicy(SubResource firewallPolicy) {
        this.inner().withFirewallPolicy(firewallPolicy);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withFrontendIPConfigurations(List<ApplicationGatewayFrontendIPConfiguration> frontendIPConfigurations) {
        this.inner().withFrontendIPConfigurations(frontendIPConfigurations);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withFrontendPorts(List<ApplicationGatewayFrontendPort> frontendPorts) {
        this.inner().withFrontendPorts(frontendPorts);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withGatewayIPConfigurations(List<ApplicationGatewayIPConfiguration> gatewayIPConfigurations) {
        this.inner().withGatewayIPConfigurations(gatewayIPConfigurations);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withHttpListeners(List<ApplicationGatewayHttpListener> httpListeners) {
        this.inner().withHttpListeners(httpListeners);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withIdentity(ManagedServiceIdentity identity) {
        this.inner().withIdentity(identity);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withProbes(List<ApplicationGatewayProbe> probes) {
        this.inner().withProbes(probes);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withProvisioningState(ProvisioningState provisioningState) {
        this.inner().withProvisioningState(provisioningState);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withRedirectConfigurations(List<ApplicationGatewayRedirectConfiguration> redirectConfigurations) {
        this.inner().withRedirectConfigurations(redirectConfigurations);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withRequestRoutingRules(List<ApplicationGatewayRequestRoutingRule> requestRoutingRules) {
        this.inner().withRequestRoutingRules(requestRoutingRules);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withResourceGuid(String resourceGuid) {
        this.inner().withResourceGuid(resourceGuid);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withRewriteRuleSets(List<ApplicationGatewayRewriteRuleSet> rewriteRuleSets) {
        this.inner().withRewriteRuleSets(rewriteRuleSets);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withSku(ApplicationGatewaySku sku) {
        this.inner().withSku(sku);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withSslCertificates(List<ApplicationGatewaySslCertificate> sslCertificates) {
        this.inner().withSslCertificates(sslCertificates);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withSslPolicy(ApplicationGatewaySslPolicy sslPolicy) {
        this.inner().withSslPolicy(sslPolicy);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withTrustedRootCertificates(List<ApplicationGatewayTrustedRootCertificate> trustedRootCertificates) {
        this.inner().withTrustedRootCertificates(trustedRootCertificates);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withUrlPathMaps(List<ApplicationGatewayUrlPathMap> urlPathMaps) {
        this.inner().withUrlPathMaps(urlPathMaps);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withWebApplicationFirewallConfiguration(ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration) {
        this.inner().withWebApplicationFirewallConfiguration(webApplicationFirewallConfiguration);
        return this;
    }

    @Override
    public ApplicationGatewayImpl withZones(List<String> zones) {
        this.inner().withZones(zones);
        return this;
    }

}
