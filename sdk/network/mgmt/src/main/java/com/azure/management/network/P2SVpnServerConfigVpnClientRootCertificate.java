// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The P2SVpnServerConfigVpnClientRootCertificate model. */
@JsonFlatten
@Fluent
public class P2SVpnServerConfigVpnClientRootCertificate extends SubResource {
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
     * The certificate public data.
     */
    @JsonProperty(value = "properties.publicCertData", required = true)
    private String publicCertData;

    /*
     * The provisioning state of the P2SVpnServerConfiguration VPN client root
     * certificate resource. Possible values are: 'Updating', 'Deleting', and
     * 'Failed'.
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
     * @return the P2SVpnServerConfigVpnClientRootCertificate object itself.
     */
    public P2SVpnServerConfigVpnClientRootCertificate withName(String name) {
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
     * @return the P2SVpnServerConfigVpnClientRootCertificate object itself.
     */
    public P2SVpnServerConfigVpnClientRootCertificate withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the publicCertData property: The certificate public data.
     *
     * @return the publicCertData value.
     */
    public String publicCertData() {
        return this.publicCertData;
    }

    /**
     * Set the publicCertData property: The certificate public data.
     *
     * @param publicCertData the publicCertData value to set.
     * @return the P2SVpnServerConfigVpnClientRootCertificate object itself.
     */
    public P2SVpnServerConfigVpnClientRootCertificate withPublicCertData(String publicCertData) {
        this.publicCertData = publicCertData;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the P2SVpnServerConfiguration VPN client root
     * certificate resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }
}
