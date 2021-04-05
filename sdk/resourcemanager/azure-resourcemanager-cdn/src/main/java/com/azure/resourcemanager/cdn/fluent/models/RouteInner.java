// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.models.AfdEndpointProtocols;
import com.azure.resourcemanager.cdn.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.models.AfdQueryStringCachingBehavior;
import com.azure.resourcemanager.cdn.models.DeploymentStatus;
import com.azure.resourcemanager.cdn.models.EnabledState;
import com.azure.resourcemanager.cdn.models.ForwardingProtocol;
import com.azure.resourcemanager.cdn.models.HttpsRedirect;
import com.azure.resourcemanager.cdn.models.LinkToDefaultDomain;
import com.azure.resourcemanager.cdn.models.ResourceReference;
import com.azure.resourcemanager.cdn.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Friendly Routes name mapping to the any Routes or secret related information. */
@JsonFlatten
@Fluent
public class RouteInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RouteInner.class);

    /*
     * Domains referenced by this endpoint.
     */
    @JsonProperty(value = "properties.customDomains")
    private List<ResourceReference> customDomains;

    /*
     * A reference to the origin group.
     */
    @JsonProperty(value = "properties.originGroup")
    private ResourceReference originGroup;

    /*
     * A directory path on the origin that AzureFrontDoor can use to retrieve
     * content from, e.g. contoso.cloudapp.net/originpath.
     */
    @JsonProperty(value = "properties.originPath")
    private String originPath;

    /*
     * rule sets referenced by this endpoint.
     */
    @JsonProperty(value = "properties.ruleSets")
    private List<ResourceReference> ruleSets;

    /*
     * List of supported protocols for this route.
     */
    @JsonProperty(value = "properties.supportedProtocols")
    private List<AfdEndpointProtocols> supportedProtocols;

    /*
     * The route patterns of the rule.
     */
    @JsonProperty(value = "properties.patternsToMatch")
    private List<String> patternsToMatch;

    /*
     * compression settings.
     */
    @JsonProperty(value = "properties.compressionSettings")
    private Object compressionSettings;

    /*
     * Defines how CDN caches requests that include query strings. You can
     * ignore any query strings when caching, bypass caching to prevent
     * requests that contain query strings from being cached, or cache every
     * request with a unique URL.
     */
    @JsonProperty(value = "properties.queryStringCachingBehavior")
    private AfdQueryStringCachingBehavior queryStringCachingBehavior;

    /*
     * Protocol this rule will use when forwarding traffic to backends.
     */
    @JsonProperty(value = "properties.forwardingProtocol")
    private ForwardingProtocol forwardingProtocol;

    /*
     * whether this route will be linked to the default endpoint domain.
     */
    @JsonProperty(value = "properties.linkToDefaultDomain")
    private LinkToDefaultDomain linkToDefaultDomain;

    /*
     * Whether to automatically redirect HTTP traffic to HTTPS traffic. Note
     * that this is a easy way to set up this rule and it will be the first
     * rule that gets executed.
     */
    @JsonProperty(value = "properties.httpsRedirect")
    private HttpsRedirect httpsRedirect;

    /*
     * Whether to enable use of this rule. Permitted values are 'Enabled' or
     * 'Disabled'
     */
    @JsonProperty(value = "properties.enabledState")
    private EnabledState enabledState;

    /*
     * Provisioning status
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private AfdProvisioningState provisioningState;

    /*
     * The deploymentStatus property.
     */
    @JsonProperty(value = "properties.deploymentStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DeploymentStatus deploymentStatus;

    /*
     * Read only system data
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the customDomains property: Domains referenced by this endpoint.
     *
     * @return the customDomains value.
     */
    public List<ResourceReference> customDomains() {
        return this.customDomains;
    }

    /**
     * Set the customDomains property: Domains referenced by this endpoint.
     *
     * @param customDomains the customDomains value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withCustomDomains(List<ResourceReference> customDomains) {
        this.customDomains = customDomains;
        return this;
    }

    /**
     * Get the originGroup property: A reference to the origin group.
     *
     * @return the originGroup value.
     */
    public ResourceReference originGroup() {
        return this.originGroup;
    }

    /**
     * Set the originGroup property: A reference to the origin group.
     *
     * @param originGroup the originGroup value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withOriginGroup(ResourceReference originGroup) {
        this.originGroup = originGroup;
        return this;
    }

    /**
     * Get the originPath property: A directory path on the origin that AzureFrontDoor can use to retrieve content from,
     * e.g. contoso.cloudapp.net/originpath.
     *
     * @return the originPath value.
     */
    public String originPath() {
        return this.originPath;
    }

    /**
     * Set the originPath property: A directory path on the origin that AzureFrontDoor can use to retrieve content from,
     * e.g. contoso.cloudapp.net/originpath.
     *
     * @param originPath the originPath value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withOriginPath(String originPath) {
        this.originPath = originPath;
        return this;
    }

    /**
     * Get the ruleSets property: rule sets referenced by this endpoint.
     *
     * @return the ruleSets value.
     */
    public List<ResourceReference> ruleSets() {
        return this.ruleSets;
    }

    /**
     * Set the ruleSets property: rule sets referenced by this endpoint.
     *
     * @param ruleSets the ruleSets value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withRuleSets(List<ResourceReference> ruleSets) {
        this.ruleSets = ruleSets;
        return this;
    }

    /**
     * Get the supportedProtocols property: List of supported protocols for this route.
     *
     * @return the supportedProtocols value.
     */
    public List<AfdEndpointProtocols> supportedProtocols() {
        return this.supportedProtocols;
    }

    /**
     * Set the supportedProtocols property: List of supported protocols for this route.
     *
     * @param supportedProtocols the supportedProtocols value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withSupportedProtocols(List<AfdEndpointProtocols> supportedProtocols) {
        this.supportedProtocols = supportedProtocols;
        return this;
    }

    /**
     * Get the patternsToMatch property: The route patterns of the rule.
     *
     * @return the patternsToMatch value.
     */
    public List<String> patternsToMatch() {
        return this.patternsToMatch;
    }

    /**
     * Set the patternsToMatch property: The route patterns of the rule.
     *
     * @param patternsToMatch the patternsToMatch value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withPatternsToMatch(List<String> patternsToMatch) {
        this.patternsToMatch = patternsToMatch;
        return this;
    }

    /**
     * Get the compressionSettings property: compression settings.
     *
     * @return the compressionSettings value.
     */
    public Object compressionSettings() {
        return this.compressionSettings;
    }

    /**
     * Set the compressionSettings property: compression settings.
     *
     * @param compressionSettings the compressionSettings value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withCompressionSettings(Object compressionSettings) {
        this.compressionSettings = compressionSettings;
        return this;
    }

    /**
     * Get the queryStringCachingBehavior property: Defines how CDN caches requests that include query strings. You can
     * ignore any query strings when caching, bypass caching to prevent requests that contain query strings from being
     * cached, or cache every request with a unique URL.
     *
     * @return the queryStringCachingBehavior value.
     */
    public AfdQueryStringCachingBehavior queryStringCachingBehavior() {
        return this.queryStringCachingBehavior;
    }

    /**
     * Set the queryStringCachingBehavior property: Defines how CDN caches requests that include query strings. You can
     * ignore any query strings when caching, bypass caching to prevent requests that contain query strings from being
     * cached, or cache every request with a unique URL.
     *
     * @param queryStringCachingBehavior the queryStringCachingBehavior value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withQueryStringCachingBehavior(AfdQueryStringCachingBehavior queryStringCachingBehavior) {
        this.queryStringCachingBehavior = queryStringCachingBehavior;
        return this;
    }

    /**
     * Get the forwardingProtocol property: Protocol this rule will use when forwarding traffic to backends.
     *
     * @return the forwardingProtocol value.
     */
    public ForwardingProtocol forwardingProtocol() {
        return this.forwardingProtocol;
    }

    /**
     * Set the forwardingProtocol property: Protocol this rule will use when forwarding traffic to backends.
     *
     * @param forwardingProtocol the forwardingProtocol value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withForwardingProtocol(ForwardingProtocol forwardingProtocol) {
        this.forwardingProtocol = forwardingProtocol;
        return this;
    }

    /**
     * Get the linkToDefaultDomain property: whether this route will be linked to the default endpoint domain.
     *
     * @return the linkToDefaultDomain value.
     */
    public LinkToDefaultDomain linkToDefaultDomain() {
        return this.linkToDefaultDomain;
    }

    /**
     * Set the linkToDefaultDomain property: whether this route will be linked to the default endpoint domain.
     *
     * @param linkToDefaultDomain the linkToDefaultDomain value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withLinkToDefaultDomain(LinkToDefaultDomain linkToDefaultDomain) {
        this.linkToDefaultDomain = linkToDefaultDomain;
        return this;
    }

    /**
     * Get the httpsRedirect property: Whether to automatically redirect HTTP traffic to HTTPS traffic. Note that this
     * is a easy way to set up this rule and it will be the first rule that gets executed.
     *
     * @return the httpsRedirect value.
     */
    public HttpsRedirect httpsRedirect() {
        return this.httpsRedirect;
    }

    /**
     * Set the httpsRedirect property: Whether to automatically redirect HTTP traffic to HTTPS traffic. Note that this
     * is a easy way to set up this rule and it will be the first rule that gets executed.
     *
     * @param httpsRedirect the httpsRedirect value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withHttpsRedirect(HttpsRedirect httpsRedirect) {
        this.httpsRedirect = httpsRedirect;
        return this;
    }

    /**
     * Get the enabledState property: Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'.
     *
     * @return the enabledState value.
     */
    public EnabledState enabledState() {
        return this.enabledState;
    }

    /**
     * Set the enabledState property: Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'.
     *
     * @param enabledState the enabledState value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withEnabledState(EnabledState enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning status.
     *
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     *
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * Get the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customDomains() != null) {
            customDomains().forEach(e -> e.validate());
        }
        if (originGroup() != null) {
            originGroup().validate();
        }
        if (ruleSets() != null) {
            ruleSets().forEach(e -> e.validate());
        }
        if (systemData() != null) {
            systemData().validate();
        }
    }
}
