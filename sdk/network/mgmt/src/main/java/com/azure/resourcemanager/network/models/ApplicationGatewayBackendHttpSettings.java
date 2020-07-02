// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ApplicationGatewayBackendHttpSettings model. */
@JsonFlatten
@Fluent
public class ApplicationGatewayBackendHttpSettings extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayBackendHttpSettings.class);

    /*
     * Name of the backend http settings that is unique within an Application
     * Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The destination port on the backend.
     */
    @JsonProperty(value = "properties.port")
    private Integer port;

    /*
     * The protocol used to communicate with the backend.
     */
    @JsonProperty(value = "properties.protocol")
    private ApplicationGatewayProtocol protocol;

    /*
     * Cookie based affinity.
     */
    @JsonProperty(value = "properties.cookieBasedAffinity")
    private ApplicationGatewayCookieBasedAffinity cookieBasedAffinity;

    /*
     * Request timeout in seconds. Application Gateway will fail the request if
     * response is not received within RequestTimeout. Acceptable values are
     * from 1 second to 86400 seconds.
     */
    @JsonProperty(value = "properties.requestTimeout")
    private Integer requestTimeout;

    /*
     * Probe resource of an application gateway.
     */
    @JsonProperty(value = "properties.probe")
    private SubResource probe;

    /*
     * Array of references to application gateway authentication certificates.
     */
    @JsonProperty(value = "properties.authenticationCertificates")
    private List<SubResource> authenticationCertificates;

    /*
     * Array of references to application gateway trusted root certificates.
     */
    @JsonProperty(value = "properties.trustedRootCertificates")
    private List<SubResource> trustedRootCertificates;

    /*
     * Connection draining of the backend http settings resource.
     */
    @JsonProperty(value = "properties.connectionDraining")
    private ApplicationGatewayConnectionDraining connectionDraining;

    /*
     * Host header to be sent to the backend servers.
     */
    @JsonProperty(value = "properties.hostName")
    private String hostname;

    /*
     * Whether to pick host header should be picked from the host name of the
     * backend server. Default value is false.
     */
    @JsonProperty(value = "properties.pickHostNameFromBackendAddress")
    private Boolean pickHostnameFromBackendAddress;

    /*
     * Cookie name to use for the affinity cookie.
     */
    @JsonProperty(value = "properties.affinityCookieName")
    private String affinityCookieName;

    /*
     * Whether the probe is enabled. Default value is false.
     */
    @JsonProperty(value = "properties.probeEnabled")
    private Boolean probeEnabled;

    /*
     * Path which should be used as a prefix for all HTTP requests. Null means
     * no path will be prefixed. Default value is null.
     */
    @JsonProperty(value = "properties.path")
    private String path;

    /*
     * The provisioning state of the backend HTTP settings resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: Name of the backend http settings that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the backend http settings that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the port property: The destination port on the backend.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The destination port on the backend.
     *
     * @param port the port value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the protocol property: The protocol used to communicate with the backend.
     *
     * @return the protocol value.
     */
    public ApplicationGatewayProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The protocol used to communicate with the backend.
     *
     * @param protocol the protocol value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withProtocol(ApplicationGatewayProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the cookieBasedAffinity property: Cookie based affinity.
     *
     * @return the cookieBasedAffinity value.
     */
    public ApplicationGatewayCookieBasedAffinity cookieBasedAffinity() {
        return this.cookieBasedAffinity;
    }

    /**
     * Set the cookieBasedAffinity property: Cookie based affinity.
     *
     * @param cookieBasedAffinity the cookieBasedAffinity value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withCookieBasedAffinity(
        ApplicationGatewayCookieBasedAffinity cookieBasedAffinity) {
        this.cookieBasedAffinity = cookieBasedAffinity;
        return this;
    }

    /**
     * Get the requestTimeout property: Request timeout in seconds. Application Gateway will fail the request if
     * response is not received within RequestTimeout. Acceptable values are from 1 second to 86400 seconds.
     *
     * @return the requestTimeout value.
     */
    public Integer requestTimeout() {
        return this.requestTimeout;
    }

    /**
     * Set the requestTimeout property: Request timeout in seconds. Application Gateway will fail the request if
     * response is not received within RequestTimeout. Acceptable values are from 1 second to 86400 seconds.
     *
     * @param requestTimeout the requestTimeout value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }

    /**
     * Get the probe property: Probe resource of an application gateway.
     *
     * @return the probe value.
     */
    public SubResource probe() {
        return this.probe;
    }

    /**
     * Set the probe property: Probe resource of an application gateway.
     *
     * @param probe the probe value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withProbe(SubResource probe) {
        this.probe = probe;
        return this;
    }

    /**
     * Get the authenticationCertificates property: Array of references to application gateway authentication
     * certificates.
     *
     * @return the authenticationCertificates value.
     */
    public List<SubResource> authenticationCertificates() {
        return this.authenticationCertificates;
    }

    /**
     * Set the authenticationCertificates property: Array of references to application gateway authentication
     * certificates.
     *
     * @param authenticationCertificates the authenticationCertificates value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withAuthenticationCertificates(
        List<SubResource> authenticationCertificates) {
        this.authenticationCertificates = authenticationCertificates;
        return this;
    }

    /**
     * Get the trustedRootCertificates property: Array of references to application gateway trusted root certificates.
     *
     * @return the trustedRootCertificates value.
     */
    public List<SubResource> trustedRootCertificates() {
        return this.trustedRootCertificates;
    }

    /**
     * Set the trustedRootCertificates property: Array of references to application gateway trusted root certificates.
     *
     * @param trustedRootCertificates the trustedRootCertificates value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withTrustedRootCertificates(
        List<SubResource> trustedRootCertificates) {
        this.trustedRootCertificates = trustedRootCertificates;
        return this;
    }

    /**
     * Get the connectionDraining property: Connection draining of the backend http settings resource.
     *
     * @return the connectionDraining value.
     */
    public ApplicationGatewayConnectionDraining connectionDraining() {
        return this.connectionDraining;
    }

    /**
     * Set the connectionDraining property: Connection draining of the backend http settings resource.
     *
     * @param connectionDraining the connectionDraining value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withConnectionDraining(
        ApplicationGatewayConnectionDraining connectionDraining) {
        this.connectionDraining = connectionDraining;
        return this;
    }

    /**
     * Get the hostname property: Host header to be sent to the backend servers.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: Host header to be sent to the backend servers.
     *
     * @param hostname the hostname value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the pickHostnameFromBackendAddress property: Whether to pick host header should be picked from the host name
     * of the backend server. Default value is false.
     *
     * @return the pickHostnameFromBackendAddress value.
     */
    public Boolean pickHostnameFromBackendAddress() {
        return this.pickHostnameFromBackendAddress;
    }

    /**
     * Set the pickHostnameFromBackendAddress property: Whether to pick host header should be picked from the host name
     * of the backend server. Default value is false.
     *
     * @param pickHostnameFromBackendAddress the pickHostnameFromBackendAddress value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withPickHostnameFromBackendAddress(
        Boolean pickHostnameFromBackendAddress) {
        this.pickHostnameFromBackendAddress = pickHostnameFromBackendAddress;
        return this;
    }

    /**
     * Get the affinityCookieName property: Cookie name to use for the affinity cookie.
     *
     * @return the affinityCookieName value.
     */
    public String affinityCookieName() {
        return this.affinityCookieName;
    }

    /**
     * Set the affinityCookieName property: Cookie name to use for the affinity cookie.
     *
     * @param affinityCookieName the affinityCookieName value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withAffinityCookieName(String affinityCookieName) {
        this.affinityCookieName = affinityCookieName;
        return this;
    }

    /**
     * Get the probeEnabled property: Whether the probe is enabled. Default value is false.
     *
     * @return the probeEnabled value.
     */
    public Boolean probeEnabled() {
        return this.probeEnabled;
    }

    /**
     * Set the probeEnabled property: Whether the probe is enabled. Default value is false.
     *
     * @param probeEnabled the probeEnabled value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withProbeEnabled(Boolean probeEnabled) {
        this.probeEnabled = probeEnabled;
        return this;
    }

    /**
     * Get the path property: Path which should be used as a prefix for all HTTP requests. Null means no path will be
     * prefixed. Default value is null.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Path which should be used as a prefix for all HTTP requests. Null means no path will be
     * prefixed. Default value is null.
     *
     * @param path the path value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the backend HTTP settings resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connectionDraining() != null) {
            connectionDraining().validate();
        }
    }
}
