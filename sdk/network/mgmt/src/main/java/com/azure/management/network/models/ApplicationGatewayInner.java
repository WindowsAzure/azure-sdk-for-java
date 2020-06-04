// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.network.ApplicationGatewayAutoscaleConfiguration;
import com.azure.management.network.ApplicationGatewayBackendAddressPool;
import com.azure.management.network.ApplicationGatewayBackendHttpSettings;
import com.azure.management.network.ApplicationGatewayCustomError;
import com.azure.management.network.ApplicationGatewayFrontendIpConfiguration;
import com.azure.management.network.ApplicationGatewayFrontendPort;
import com.azure.management.network.ApplicationGatewayHttpListener;
import com.azure.management.network.ApplicationGatewayOperationalState;
import com.azure.management.network.ApplicationGatewayRewriteRuleSet;
import com.azure.management.network.ApplicationGatewaySku;
import com.azure.management.network.ApplicationGatewaySslPolicy;
import com.azure.management.network.ApplicationGatewayTrustedRootCertificate;
import com.azure.management.network.ApplicationGatewayWebApplicationFirewallConfiguration;
import com.azure.management.network.ManagedServiceIdentity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ApplicationGateway model. */
@JsonFlatten
@Fluent
public class ApplicationGatewayInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * A list of availability zones denoting where the resource needs to come
     * from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * The identity of the application gateway, if configured.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * SKU of the application gateway resource.
     */
    @JsonProperty(value = "properties.sku")
    private ApplicationGatewaySku sku;

    /*
     * SSL policy of the application gateway resource.
     */
    @JsonProperty(value = "properties.sslPolicy")
    private ApplicationGatewaySslPolicy sslPolicy;

    /*
     * Operational state of the application gateway resource.
     */
    @JsonProperty(value = "properties.operationalState", access = JsonProperty.Access.WRITE_ONLY)
    private ApplicationGatewayOperationalState operationalState;

    /*
     * Subnets of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "properties.gatewayIPConfigurations")
    private List<ApplicationGatewayIpConfigurationInner> gatewayIpConfigurations;

    /*
     * Authentication certificates of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "properties.authenticationCertificates")
    private List<ApplicationGatewayAuthenticationCertificateInner> authenticationCertificates;

    /*
     * Trusted Root certificates of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "properties.trustedRootCertificates")
    private List<ApplicationGatewayTrustedRootCertificate> trustedRootCertificates;

    /*
     * SSL certificates of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "properties.sslCertificates")
    private List<ApplicationGatewaySslCertificateInner> sslCertificates;

    /*
     * Frontend IP addresses of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "properties.frontendIPConfigurations")
    private List<ApplicationGatewayFrontendIpConfiguration> frontendIpConfigurations;

    /*
     * Frontend ports of the application gateway resource. For default limits,
     * see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "properties.frontendPorts")
    private List<ApplicationGatewayFrontendPort> frontendPorts;

    /*
     * Probes of the application gateway resource.
     */
    @JsonProperty(value = "properties.probes")
    private List<ApplicationGatewayProbeInner> probes;

    /*
     * Backend address pool of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "properties.backendAddressPools")
    private List<ApplicationGatewayBackendAddressPool> backendAddressPools;

    /*
     * Backend http settings of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "properties.backendHttpSettingsCollection")
    private List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection;

    /*
     * Http listeners of the application gateway resource. For default limits,
     * see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "properties.httpListeners")
    private List<ApplicationGatewayHttpListener> httpListeners;

    /*
     * URL path map of the application gateway resource. For default limits,
     * see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "properties.urlPathMaps")
    private List<ApplicationGatewayUrlPathMapInner> urlPathMaps;

    /*
     * Request routing rules of the application gateway resource.
     */
    @JsonProperty(value = "properties.requestRoutingRules")
    private List<ApplicationGatewayRequestRoutingRuleInner> requestRoutingRules;

    /*
     * Rewrite rules for the application gateway resource.
     */
    @JsonProperty(value = "properties.rewriteRuleSets")
    private List<ApplicationGatewayRewriteRuleSet> rewriteRuleSets;

    /*
     * Redirect configurations of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "properties.redirectConfigurations")
    private List<ApplicationGatewayRedirectConfigurationInner> redirectConfigurations;

    /*
     * Web application firewall configuration.
     */
    @JsonProperty(value = "properties.webApplicationFirewallConfiguration")
    private ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration;

    /*
     * Reference of the FirewallPolicy resource.
     */
    @JsonProperty(value = "properties.firewallPolicy")
    private SubResource firewallPolicy;

    /*
     * Whether HTTP2 is enabled on the application gateway resource.
     */
    @JsonProperty(value = "properties.enableHttp2")
    private Boolean enableHttp2;

    /*
     * Whether FIPS is enabled on the application gateway resource.
     */
    @JsonProperty(value = "properties.enableFips")
    private Boolean enableFips;

    /*
     * Autoscale Configuration.
     */
    @JsonProperty(value = "properties.autoscaleConfiguration")
    private ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration;

    /*
     * Resource GUID property of the application gateway resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /*
     * Provisioning state of the application gateway resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * Custom error configurations of the application gateway resource.
     */
    @JsonProperty(value = "properties.customErrorConfigurations")
    private List<ApplicationGatewayCustomError> customErrorConfigurations;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the zones property: A list of availability zones denoting where the resource needs to come from.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting where the resource needs to come from.
     *
     * @param zones the zones value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the identity property: The identity of the application gateway, if configured.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the application gateway, if configured.
     *
     * @param identity the identity value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the sku property: SKU of the application gateway resource.
     *
     * @return the sku value.
     */
    public ApplicationGatewaySku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU of the application gateway resource.
     *
     * @param sku the sku value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withSku(ApplicationGatewaySku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the sslPolicy property: SSL policy of the application gateway resource.
     *
     * @return the sslPolicy value.
     */
    public ApplicationGatewaySslPolicy sslPolicy() {
        return this.sslPolicy;
    }

    /**
     * Set the sslPolicy property: SSL policy of the application gateway resource.
     *
     * @param sslPolicy the sslPolicy value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withSslPolicy(ApplicationGatewaySslPolicy sslPolicy) {
        this.sslPolicy = sslPolicy;
        return this;
    }

    /**
     * Get the operationalState property: Operational state of the application gateway resource.
     *
     * @return the operationalState value.
     */
    public ApplicationGatewayOperationalState operationalState() {
        return this.operationalState;
    }

    /**
     * Get the gatewayIpConfigurations property: Subnets of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the gatewayIpConfigurations value.
     */
    public List<ApplicationGatewayIpConfigurationInner> gatewayIpConfigurations() {
        return this.gatewayIpConfigurations;
    }

    /**
     * Set the gatewayIpConfigurations property: Subnets of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param gatewayIpConfigurations the gatewayIpConfigurations value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withGatewayIpConfigurations(
        List<ApplicationGatewayIpConfigurationInner> gatewayIpConfigurations) {
        this.gatewayIpConfigurations = gatewayIpConfigurations;
        return this;
    }

    /**
     * Get the authenticationCertificates property: Authentication certificates of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the authenticationCertificates value.
     */
    public List<ApplicationGatewayAuthenticationCertificateInner> authenticationCertificates() {
        return this.authenticationCertificates;
    }

    /**
     * Set the authenticationCertificates property: Authentication certificates of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param authenticationCertificates the authenticationCertificates value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withAuthenticationCertificates(
        List<ApplicationGatewayAuthenticationCertificateInner> authenticationCertificates) {
        this.authenticationCertificates = authenticationCertificates;
        return this;
    }

    /**
     * Get the trustedRootCertificates property: Trusted Root certificates of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the trustedRootCertificates value.
     */
    public List<ApplicationGatewayTrustedRootCertificate> trustedRootCertificates() {
        return this.trustedRootCertificates;
    }

    /**
     * Set the trustedRootCertificates property: Trusted Root certificates of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param trustedRootCertificates the trustedRootCertificates value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withTrustedRootCertificates(
        List<ApplicationGatewayTrustedRootCertificate> trustedRootCertificates) {
        this.trustedRootCertificates = trustedRootCertificates;
        return this;
    }

    /**
     * Get the sslCertificates property: SSL certificates of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the sslCertificates value.
     */
    public List<ApplicationGatewaySslCertificateInner> sslCertificates() {
        return this.sslCertificates;
    }

    /**
     * Set the sslCertificates property: SSL certificates of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param sslCertificates the sslCertificates value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withSslCertificates(List<ApplicationGatewaySslCertificateInner> sslCertificates) {
        this.sslCertificates = sslCertificates;
        return this;
    }

    /**
     * Get the frontendIpConfigurations property: Frontend IP addresses of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the frontendIpConfigurations value.
     */
    public List<ApplicationGatewayFrontendIpConfiguration> frontendIpConfigurations() {
        return this.frontendIpConfigurations;
    }

    /**
     * Set the frontendIpConfigurations property: Frontend IP addresses of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param frontendIpConfigurations the frontendIpConfigurations value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withFrontendIpConfigurations(
        List<ApplicationGatewayFrontendIpConfiguration> frontendIpConfigurations) {
        this.frontendIpConfigurations = frontendIpConfigurations;
        return this;
    }

    /**
     * Get the frontendPorts property: Frontend ports of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the frontendPorts value.
     */
    public List<ApplicationGatewayFrontendPort> frontendPorts() {
        return this.frontendPorts;
    }

    /**
     * Set the frontendPorts property: Frontend ports of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param frontendPorts the frontendPorts value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withFrontendPorts(List<ApplicationGatewayFrontendPort> frontendPorts) {
        this.frontendPorts = frontendPorts;
        return this;
    }

    /**
     * Get the probes property: Probes of the application gateway resource.
     *
     * @return the probes value.
     */
    public List<ApplicationGatewayProbeInner> probes() {
        return this.probes;
    }

    /**
     * Set the probes property: Probes of the application gateway resource.
     *
     * @param probes the probes value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withProbes(List<ApplicationGatewayProbeInner> probes) {
        this.probes = probes;
        return this;
    }

    /**
     * Get the backendAddressPools property: Backend address pool of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the backendAddressPools value.
     */
    public List<ApplicationGatewayBackendAddressPool> backendAddressPools() {
        return this.backendAddressPools;
    }

    /**
     * Set the backendAddressPools property: Backend address pool of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param backendAddressPools the backendAddressPools value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withBackendAddressPools(
        List<ApplicationGatewayBackendAddressPool> backendAddressPools) {
        this.backendAddressPools = backendAddressPools;
        return this;
    }

    /**
     * Get the backendHttpSettingsCollection property: Backend http settings of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the backendHttpSettingsCollection value.
     */
    public List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection() {
        return this.backendHttpSettingsCollection;
    }

    /**
     * Set the backendHttpSettingsCollection property: Backend http settings of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param backendHttpSettingsCollection the backendHttpSettingsCollection value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withBackendHttpSettingsCollection(
        List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection) {
        this.backendHttpSettingsCollection = backendHttpSettingsCollection;
        return this;
    }

    /**
     * Get the httpListeners property: Http listeners of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the httpListeners value.
     */
    public List<ApplicationGatewayHttpListener> httpListeners() {
        return this.httpListeners;
    }

    /**
     * Set the httpListeners property: Http listeners of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param httpListeners the httpListeners value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withHttpListeners(List<ApplicationGatewayHttpListener> httpListeners) {
        this.httpListeners = httpListeners;
        return this;
    }

    /**
     * Get the urlPathMaps property: URL path map of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the urlPathMaps value.
     */
    public List<ApplicationGatewayUrlPathMapInner> urlPathMaps() {
        return this.urlPathMaps;
    }

    /**
     * Set the urlPathMaps property: URL path map of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param urlPathMaps the urlPathMaps value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withUrlPathMaps(List<ApplicationGatewayUrlPathMapInner> urlPathMaps) {
        this.urlPathMaps = urlPathMaps;
        return this;
    }

    /**
     * Get the requestRoutingRules property: Request routing rules of the application gateway resource.
     *
     * @return the requestRoutingRules value.
     */
    public List<ApplicationGatewayRequestRoutingRuleInner> requestRoutingRules() {
        return this.requestRoutingRules;
    }

    /**
     * Set the requestRoutingRules property: Request routing rules of the application gateway resource.
     *
     * @param requestRoutingRules the requestRoutingRules value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withRequestRoutingRules(
        List<ApplicationGatewayRequestRoutingRuleInner> requestRoutingRules) {
        this.requestRoutingRules = requestRoutingRules;
        return this;
    }

    /**
     * Get the rewriteRuleSets property: Rewrite rules for the application gateway resource.
     *
     * @return the rewriteRuleSets value.
     */
    public List<ApplicationGatewayRewriteRuleSet> rewriteRuleSets() {
        return this.rewriteRuleSets;
    }

    /**
     * Set the rewriteRuleSets property: Rewrite rules for the application gateway resource.
     *
     * @param rewriteRuleSets the rewriteRuleSets value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withRewriteRuleSets(List<ApplicationGatewayRewriteRuleSet> rewriteRuleSets) {
        this.rewriteRuleSets = rewriteRuleSets;
        return this;
    }

    /**
     * Get the redirectConfigurations property: Redirect configurations of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the redirectConfigurations value.
     */
    public List<ApplicationGatewayRedirectConfigurationInner> redirectConfigurations() {
        return this.redirectConfigurations;
    }

    /**
     * Set the redirectConfigurations property: Redirect configurations of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param redirectConfigurations the redirectConfigurations value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withRedirectConfigurations(
        List<ApplicationGatewayRedirectConfigurationInner> redirectConfigurations) {
        this.redirectConfigurations = redirectConfigurations;
        return this;
    }

    /**
     * Get the webApplicationFirewallConfiguration property: Web application firewall configuration.
     *
     * @return the webApplicationFirewallConfiguration value.
     */
    public ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration() {
        return this.webApplicationFirewallConfiguration;
    }

    /**
     * Set the webApplicationFirewallConfiguration property: Web application firewall configuration.
     *
     * @param webApplicationFirewallConfiguration the webApplicationFirewallConfiguration value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withWebApplicationFirewallConfiguration(
        ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration) {
        this.webApplicationFirewallConfiguration = webApplicationFirewallConfiguration;
        return this;
    }

    /**
     * Get the firewallPolicy property: Reference of the FirewallPolicy resource.
     *
     * @return the firewallPolicy value.
     */
    public SubResource firewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * Set the firewallPolicy property: Reference of the FirewallPolicy resource.
     *
     * @param firewallPolicy the firewallPolicy value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withFirewallPolicy(SubResource firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
        return this;
    }

    /**
     * Get the enableHttp2 property: Whether HTTP2 is enabled on the application gateway resource.
     *
     * @return the enableHttp2 value.
     */
    public Boolean enableHttp2() {
        return this.enableHttp2;
    }

    /**
     * Set the enableHttp2 property: Whether HTTP2 is enabled on the application gateway resource.
     *
     * @param enableHttp2 the enableHttp2 value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withEnableHttp2(Boolean enableHttp2) {
        this.enableHttp2 = enableHttp2;
        return this;
    }

    /**
     * Get the enableFips property: Whether FIPS is enabled on the application gateway resource.
     *
     * @return the enableFips value.
     */
    public Boolean enableFips() {
        return this.enableFips;
    }

    /**
     * Set the enableFips property: Whether FIPS is enabled on the application gateway resource.
     *
     * @param enableFips the enableFips value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withEnableFips(Boolean enableFips) {
        this.enableFips = enableFips;
        return this;
    }

    /**
     * Get the autoscaleConfiguration property: Autoscale Configuration.
     *
     * @return the autoscaleConfiguration value.
     */
    public ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration() {
        return this.autoscaleConfiguration;
    }

    /**
     * Set the autoscaleConfiguration property: Autoscale Configuration.
     *
     * @param autoscaleConfiguration the autoscaleConfiguration value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withAutoscaleConfiguration(
        ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration) {
        this.autoscaleConfiguration = autoscaleConfiguration;
        return this;
    }

    /**
     * Get the resourceGuid property: Resource GUID property of the application gateway resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid property: Resource GUID property of the application gateway resource.
     *
     * @param resourceGuid the resourceGuid value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the application gateway resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the application gateway resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the customErrorConfigurations property: Custom error configurations of the application gateway resource.
     *
     * @return the customErrorConfigurations value.
     */
    public List<ApplicationGatewayCustomError> customErrorConfigurations() {
        return this.customErrorConfigurations;
    }

    /**
     * Set the customErrorConfigurations property: Custom error configurations of the application gateway resource.
     *
     * @param customErrorConfigurations the customErrorConfigurations value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withCustomErrorConfigurations(
        List<ApplicationGatewayCustomError> customErrorConfigurations) {
        this.customErrorConfigurations = customErrorConfigurations;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the ApplicationGatewayInner object itself.
     */
    public ApplicationGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (sslPolicy() != null) {
            sslPolicy().validate();
        }
        if (gatewayIpConfigurations() != null) {
            gatewayIpConfigurations().forEach(e -> e.validate());
        }
        if (authenticationCertificates() != null) {
            authenticationCertificates().forEach(e -> e.validate());
        }
        if (trustedRootCertificates() != null) {
            trustedRootCertificates().forEach(e -> e.validate());
        }
        if (sslCertificates() != null) {
            sslCertificates().forEach(e -> e.validate());
        }
        if (frontendIpConfigurations() != null) {
            frontendIpConfigurations().forEach(e -> e.validate());
        }
        if (frontendPorts() != null) {
            frontendPorts().forEach(e -> e.validate());
        }
        if (probes() != null) {
            probes().forEach(e -> e.validate());
        }
        if (backendAddressPools() != null) {
            backendAddressPools().forEach(e -> e.validate());
        }
        if (backendHttpSettingsCollection() != null) {
            backendHttpSettingsCollection().forEach(e -> e.validate());
        }
        if (httpListeners() != null) {
            httpListeners().forEach(e -> e.validate());
        }
        if (urlPathMaps() != null) {
            urlPathMaps().forEach(e -> e.validate());
        }
        if (requestRoutingRules() != null) {
            requestRoutingRules().forEach(e -> e.validate());
        }
        if (rewriteRuleSets() != null) {
            rewriteRuleSets().forEach(e -> e.validate());
        }
        if (redirectConfigurations() != null) {
            redirectConfigurations().forEach(e -> e.validate());
        }
        if (webApplicationFirewallConfiguration() != null) {
            webApplicationFirewallConfiguration().validate();
        }
        if (autoscaleConfiguration() != null) {
            autoscaleConfiguration().validate();
        }
        if (customErrorConfigurations() != null) {
            customErrorConfigurations().forEach(e -> e.validate());
        }
    }
}
