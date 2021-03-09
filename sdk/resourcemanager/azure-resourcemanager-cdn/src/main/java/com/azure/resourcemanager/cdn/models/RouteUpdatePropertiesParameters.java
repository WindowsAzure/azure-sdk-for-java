// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JSON object that contains the properties of the domain to create. */
@Fluent
public class RouteUpdatePropertiesParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RouteUpdatePropertiesParameters.class);

    /*
     * Domains referenced by this endpoint.
     */
    @JsonProperty(value = "customDomains")
    private List<ResourceReference> customDomains;

    /*
     * A reference to the origin group.
     */
    @JsonProperty(value = "originGroup")
    private ResourceReference originGroup;

    /*
     * A directory path on the origin that AzureFrontDoor can use to retrieve
     * content from, e.g. contoso.cloudapp.net/originpath.
     */
    @JsonProperty(value = "originPath")
    private String originPath;

    /*
     * rule sets referenced by this endpoint.
     */
    @JsonProperty(value = "ruleSets")
    private List<ResourceReference> ruleSets;

    /*
     * List of supported protocols for this route.
     */
    @JsonProperty(value = "supportedProtocols")
    private List<AfdEndpointProtocols> supportedProtocols;

    /*
     * The route patterns of the rule.
     */
    @JsonProperty(value = "patternsToMatch")
    private List<String> patternsToMatch;

    /*
     * compression settings.
     */
    @JsonProperty(value = "compressionSettings")
    private Object compressionSettings;

    /*
     * Defines how CDN caches requests that include query strings. You can
     * ignore any query strings when caching, bypass caching to prevent
     * requests that contain query strings from being cached, or cache every
     * request with a unique URL.
     */
    @JsonProperty(value = "queryStringCachingBehavior")
    private AfdQueryStringCachingBehavior queryStringCachingBehavior;

    /*
     * Protocol this rule will use when forwarding traffic to backends.
     */
    @JsonProperty(value = "forwardingProtocol")
    private ForwardingProtocol forwardingProtocol;

    /*
     * whether this route will be linked to the default endpoint domain.
     */
    @JsonProperty(value = "linkToDefaultDomain")
    private LinkToDefaultDomain linkToDefaultDomain;

    /*
     * Whether to automatically redirect HTTP traffic to HTTPS traffic. Note
     * that this is a easy way to set up this rule and it will be the first
     * rule that gets executed.
     */
    @JsonProperty(value = "httpsRedirect")
    private HttpsRedirect httpsRedirect;

    /*
     * Whether to enable use of this rule. Permitted values are 'Enabled' or
     * 'Disabled'
     */
    @JsonProperty(value = "enabledState")
    private EnabledState enabledState;

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
     * @return the RouteUpdatePropertiesParameters object itself.
     */
    public RouteUpdatePropertiesParameters withCustomDomains(List<ResourceReference> customDomains) {
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
     * @return the RouteUpdatePropertiesParameters object itself.
     */
    public RouteUpdatePropertiesParameters withOriginGroup(ResourceReference originGroup) {
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
     * @return the RouteUpdatePropertiesParameters object itself.
     */
    public RouteUpdatePropertiesParameters withOriginPath(String originPath) {
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
     * @return the RouteUpdatePropertiesParameters object itself.
     */
    public RouteUpdatePropertiesParameters withRuleSets(List<ResourceReference> ruleSets) {
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
     * @return the RouteUpdatePropertiesParameters object itself.
     */
    public RouteUpdatePropertiesParameters withSupportedProtocols(List<AfdEndpointProtocols> supportedProtocols) {
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
     * @return the RouteUpdatePropertiesParameters object itself.
     */
    public RouteUpdatePropertiesParameters withPatternsToMatch(List<String> patternsToMatch) {
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
     * @return the RouteUpdatePropertiesParameters object itself.
     */
    public RouteUpdatePropertiesParameters withCompressionSettings(Object compressionSettings) {
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
     * @return the RouteUpdatePropertiesParameters object itself.
     */
    public RouteUpdatePropertiesParameters withQueryStringCachingBehavior(
        AfdQueryStringCachingBehavior queryStringCachingBehavior) {
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
     * @return the RouteUpdatePropertiesParameters object itself.
     */
    public RouteUpdatePropertiesParameters withForwardingProtocol(ForwardingProtocol forwardingProtocol) {
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
     * @return the RouteUpdatePropertiesParameters object itself.
     */
    public RouteUpdatePropertiesParameters withLinkToDefaultDomain(LinkToDefaultDomain linkToDefaultDomain) {
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
     * @return the RouteUpdatePropertiesParameters object itself.
     */
    public RouteUpdatePropertiesParameters withHttpsRedirect(HttpsRedirect httpsRedirect) {
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
     * @return the RouteUpdatePropertiesParameters object itself.
     */
    public RouteUpdatePropertiesParameters withEnabledState(EnabledState enabledState) {
        this.enabledState = enabledState;
        return this;
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
    }
}
