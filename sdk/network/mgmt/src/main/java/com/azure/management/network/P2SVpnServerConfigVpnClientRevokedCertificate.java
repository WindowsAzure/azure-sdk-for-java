// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The P2SVpnServerConfigVpnClientRevokedCertificate model. */
@JsonFlatten
@Fluent
public class P2SVpnServerConfigVpnClientRevokedCertificate extends SubResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(P2SVpnServerConfigVpnClientRevokedCertificate.class);

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * The revoked VPN client certificate thumbprint.
     */
    @JsonProperty(value = "properties.thumbprint")
    private String thumbprint;

    /*
     * The provisioning state of the VPN client revoked certificate resource.
     * Possible values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the P2SVpnServerConfigVpnClientRevokedCertificate object itself.
     */
    public P2SVpnServerConfigVpnClientRevokedCertificate withName(String name) {
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
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the P2SVpnServerConfigVpnClientRevokedCertificate object itself.
     */
    public P2SVpnServerConfigVpnClientRevokedCertificate withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the thumbprint property: The revoked VPN client certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: The revoked VPN client certificate thumbprint.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the P2SVpnServerConfigVpnClientRevokedCertificate object itself.
     */
    public P2SVpnServerConfigVpnClientRevokedCertificate withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN client revoked certificate resource.
     * Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
