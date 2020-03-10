/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2019_11_01.VpnGatewayTunnelingProtocol;
import com.microsoft.azure.management.network.v2019_11_01.VpnAuthenticationType;
import com.microsoft.azure.management.network.v2019_11_01.VpnServerConfigVpnClientRootCertificate;
import com.microsoft.azure.management.network.v2019_11_01.VpnServerConfigVpnClientRevokedCertificate;
import com.microsoft.azure.management.network.v2019_11_01.VpnServerConfigRadiusServerRootCertificate;
import com.microsoft.azure.management.network.v2019_11_01.VpnServerConfigRadiusClientRootCertificate;
import com.microsoft.azure.management.network.v2019_11_01.IpsecPolicy;
import com.microsoft.azure.management.network.v2019_11_01.AadAuthenticationParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * VpnServerConfiguration Resource.
 */
@JsonFlatten
@SkipParentValidation
public class VpnServerConfigurationInner extends Resource {
    /**
     * The name of the VpnServerConfiguration that is unique within a resource
     * group.
     */
    @JsonProperty(value = "properties.name")
    private String vpnServerConfigurationName;

    /**
     * VPN protocols for the VpnServerConfiguration.
     */
    @JsonProperty(value = "properties.vpnProtocols")
    private List<VpnGatewayTunnelingProtocol> vpnProtocols;

    /**
     * VPN authentication types for the VpnServerConfiguration.
     */
    @JsonProperty(value = "properties.vpnAuthenticationTypes")
    private List<VpnAuthenticationType> vpnAuthenticationTypes;

    /**
     * VPN client root certificate of VpnServerConfiguration.
     */
    @JsonProperty(value = "properties.vpnClientRootCertificates")
    private List<VpnServerConfigVpnClientRootCertificate> vpnClientRootCertificates;

    /**
     * VPN client revoked certificate of VpnServerConfiguration.
     */
    @JsonProperty(value = "properties.vpnClientRevokedCertificates")
    private List<VpnServerConfigVpnClientRevokedCertificate> vpnClientRevokedCertificates;

    /**
     * Radius Server root certificate of VpnServerConfiguration.
     */
    @JsonProperty(value = "properties.radiusServerRootCertificates")
    private List<VpnServerConfigRadiusServerRootCertificate> radiusServerRootCertificates;

    /**
     * Radius client root certificate of VpnServerConfiguration.
     */
    @JsonProperty(value = "properties.radiusClientRootCertificates")
    private List<VpnServerConfigRadiusClientRootCertificate> radiusClientRootCertificates;

    /**
     * VpnClientIpsecPolicies for VpnServerConfiguration.
     */
    @JsonProperty(value = "properties.vpnClientIpsecPolicies")
    private List<IpsecPolicy> vpnClientIpsecPolicies;

    /**
     * The radius server address property of the VpnServerConfiguration
     * resource for point to site client connection.
     */
    @JsonProperty(value = "properties.radiusServerAddress")
    private String radiusServerAddress;

    /**
     * The radius secret property of the VpnServerConfiguration resource for
     * point to site client connection.
     */
    @JsonProperty(value = "properties.radiusServerSecret")
    private String radiusServerSecret;

    /**
     * The set of aad vpn authentication parameters.
     */
    @JsonProperty(value = "properties.aadAuthenticationParameters")
    private AadAuthenticationParameters aadAuthenticationParameters;

    /**
     * The provisioning state of the VpnServerConfiguration resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * List of references to P2SVpnGateways.
     */
    @JsonProperty(value = "properties.p2SVpnGateways", access = JsonProperty.Access.WRITE_ONLY)
    private List<P2SVpnGatewayInner> p2SVpnGateways;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "properties.etag", access = JsonProperty.Access.WRITE_ONLY)
    private String vpnServerConfigurationPropertiesEtag;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the name of the VpnServerConfiguration that is unique within a resource group.
     *
     * @return the vpnServerConfigurationName value
     */
    public String vpnServerConfigurationName() {
        return this.vpnServerConfigurationName;
    }

    /**
     * Set the name of the VpnServerConfiguration that is unique within a resource group.
     *
     * @param vpnServerConfigurationName the vpnServerConfigurationName value to set
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withVpnServerConfigurationName(String vpnServerConfigurationName) {
        this.vpnServerConfigurationName = vpnServerConfigurationName;
        return this;
    }

    /**
     * Get vPN protocols for the VpnServerConfiguration.
     *
     * @return the vpnProtocols value
     */
    public List<VpnGatewayTunnelingProtocol> vpnProtocols() {
        return this.vpnProtocols;
    }

    /**
     * Set vPN protocols for the VpnServerConfiguration.
     *
     * @param vpnProtocols the vpnProtocols value to set
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withVpnProtocols(List<VpnGatewayTunnelingProtocol> vpnProtocols) {
        this.vpnProtocols = vpnProtocols;
        return this;
    }

    /**
     * Get vPN authentication types for the VpnServerConfiguration.
     *
     * @return the vpnAuthenticationTypes value
     */
    public List<VpnAuthenticationType> vpnAuthenticationTypes() {
        return this.vpnAuthenticationTypes;
    }

    /**
     * Set vPN authentication types for the VpnServerConfiguration.
     *
     * @param vpnAuthenticationTypes the vpnAuthenticationTypes value to set
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withVpnAuthenticationTypes(List<VpnAuthenticationType> vpnAuthenticationTypes) {
        this.vpnAuthenticationTypes = vpnAuthenticationTypes;
        return this;
    }

    /**
     * Get vPN client root certificate of VpnServerConfiguration.
     *
     * @return the vpnClientRootCertificates value
     */
    public List<VpnServerConfigVpnClientRootCertificate> vpnClientRootCertificates() {
        return this.vpnClientRootCertificates;
    }

    /**
     * Set vPN client root certificate of VpnServerConfiguration.
     *
     * @param vpnClientRootCertificates the vpnClientRootCertificates value to set
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withVpnClientRootCertificates(List<VpnServerConfigVpnClientRootCertificate> vpnClientRootCertificates) {
        this.vpnClientRootCertificates = vpnClientRootCertificates;
        return this;
    }

    /**
     * Get vPN client revoked certificate of VpnServerConfiguration.
     *
     * @return the vpnClientRevokedCertificates value
     */
    public List<VpnServerConfigVpnClientRevokedCertificate> vpnClientRevokedCertificates() {
        return this.vpnClientRevokedCertificates;
    }

    /**
     * Set vPN client revoked certificate of VpnServerConfiguration.
     *
     * @param vpnClientRevokedCertificates the vpnClientRevokedCertificates value to set
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withVpnClientRevokedCertificates(List<VpnServerConfigVpnClientRevokedCertificate> vpnClientRevokedCertificates) {
        this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
        return this;
    }

    /**
     * Get radius Server root certificate of VpnServerConfiguration.
     *
     * @return the radiusServerRootCertificates value
     */
    public List<VpnServerConfigRadiusServerRootCertificate> radiusServerRootCertificates() {
        return this.radiusServerRootCertificates;
    }

    /**
     * Set radius Server root certificate of VpnServerConfiguration.
     *
     * @param radiusServerRootCertificates the radiusServerRootCertificates value to set
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withRadiusServerRootCertificates(List<VpnServerConfigRadiusServerRootCertificate> radiusServerRootCertificates) {
        this.radiusServerRootCertificates = radiusServerRootCertificates;
        return this;
    }

    /**
     * Get radius client root certificate of VpnServerConfiguration.
     *
     * @return the radiusClientRootCertificates value
     */
    public List<VpnServerConfigRadiusClientRootCertificate> radiusClientRootCertificates() {
        return this.radiusClientRootCertificates;
    }

    /**
     * Set radius client root certificate of VpnServerConfiguration.
     *
     * @param radiusClientRootCertificates the radiusClientRootCertificates value to set
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withRadiusClientRootCertificates(List<VpnServerConfigRadiusClientRootCertificate> radiusClientRootCertificates) {
        this.radiusClientRootCertificates = radiusClientRootCertificates;
        return this;
    }

    /**
     * Get vpnClientIpsecPolicies for VpnServerConfiguration.
     *
     * @return the vpnClientIpsecPolicies value
     */
    public List<IpsecPolicy> vpnClientIpsecPolicies() {
        return this.vpnClientIpsecPolicies;
    }

    /**
     * Set vpnClientIpsecPolicies for VpnServerConfiguration.
     *
     * @param vpnClientIpsecPolicies the vpnClientIpsecPolicies value to set
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withVpnClientIpsecPolicies(List<IpsecPolicy> vpnClientIpsecPolicies) {
        this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
        return this;
    }

    /**
     * Get the radius server address property of the VpnServerConfiguration resource for point to site client connection.
     *
     * @return the radiusServerAddress value
     */
    public String radiusServerAddress() {
        return this.radiusServerAddress;
    }

    /**
     * Set the radius server address property of the VpnServerConfiguration resource for point to site client connection.
     *
     * @param radiusServerAddress the radiusServerAddress value to set
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withRadiusServerAddress(String radiusServerAddress) {
        this.radiusServerAddress = radiusServerAddress;
        return this;
    }

    /**
     * Get the radius secret property of the VpnServerConfiguration resource for point to site client connection.
     *
     * @return the radiusServerSecret value
     */
    public String radiusServerSecret() {
        return this.radiusServerSecret;
    }

    /**
     * Set the radius secret property of the VpnServerConfiguration resource for point to site client connection.
     *
     * @param radiusServerSecret the radiusServerSecret value to set
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withRadiusServerSecret(String radiusServerSecret) {
        this.radiusServerSecret = radiusServerSecret;
        return this;
    }

    /**
     * Get the set of aad vpn authentication parameters.
     *
     * @return the aadAuthenticationParameters value
     */
    public AadAuthenticationParameters aadAuthenticationParameters() {
        return this.aadAuthenticationParameters;
    }

    /**
     * Set the set of aad vpn authentication parameters.
     *
     * @param aadAuthenticationParameters the aadAuthenticationParameters value to set
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withAadAuthenticationParameters(AadAuthenticationParameters aadAuthenticationParameters) {
        this.aadAuthenticationParameters = aadAuthenticationParameters;
        return this;
    }

    /**
     * Get the provisioning state of the VpnServerConfiguration resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get list of references to P2SVpnGateways.
     *
     * @return the p2SVpnGateways value
     */
    public List<P2SVpnGatewayInner> p2SVpnGateways() {
        return this.p2SVpnGateways;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the vpnServerConfigurationPropertiesEtag value
     */
    public String vpnServerConfigurationPropertiesEtag() {
        return this.vpnServerConfigurationPropertiesEtag;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the VpnServerConfigurationInner object itself.
     */
    public VpnServerConfigurationInner withId(String id) {
        this.id = id;
        return this;
    }

}
