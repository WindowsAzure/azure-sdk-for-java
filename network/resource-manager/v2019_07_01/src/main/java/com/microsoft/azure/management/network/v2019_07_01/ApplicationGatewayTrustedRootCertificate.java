/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Trusted Root certificates of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewayTrustedRootCertificate extends SubResource {
    /**
     * Certificate public data.
     */
    @JsonProperty(value = "properties.data")
    private String data;

    /**
     * Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate'
     * object stored in KeyVault.
     */
    @JsonProperty(value = "properties.keyVaultSecretId")
    private String keyVaultSecretId;

    /**
     * The provisioning state of the trusted root certificate resource.
     * Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * Name of the trusted root certificate that is unique within an
     * Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get certificate public data.
     *
     * @return the data value
     */
    public String data() {
        return this.data;
    }

    /**
     * Set certificate public data.
     *
     * @param data the data value to set
     * @return the ApplicationGatewayTrustedRootCertificate object itself.
     */
    public ApplicationGatewayTrustedRootCertificate withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate' object stored in KeyVault.
     *
     * @return the keyVaultSecretId value
     */
    public String keyVaultSecretId() {
        return this.keyVaultSecretId;
    }

    /**
     * Set secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate' object stored in KeyVault.
     *
     * @param keyVaultSecretId the keyVaultSecretId value to set
     * @return the ApplicationGatewayTrustedRootCertificate object itself.
     */
    public ApplicationGatewayTrustedRootCertificate withKeyVaultSecretId(String keyVaultSecretId) {
        this.keyVaultSecretId = keyVaultSecretId;
        return this;
    }

    /**
     * Get the provisioning state of the trusted root certificate resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the trusted root certificate resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ApplicationGatewayTrustedRootCertificate object itself.
     */
    public ApplicationGatewayTrustedRootCertificate withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get name of the trusted root certificate that is unique within an Application Gateway.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the trusted root certificate that is unique within an Application Gateway.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayTrustedRootCertificate object itself.
     */
    public ApplicationGatewayTrustedRootCertificate withName(String name) {
        this.name = name;
        return this;
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
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the ApplicationGatewayTrustedRootCertificate object itself.
     */
    public ApplicationGatewayTrustedRootCertificate withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set type of the resource.
     *
     * @param type the type value to set
     * @return the ApplicationGatewayTrustedRootCertificate object itself.
     */
    public ApplicationGatewayTrustedRootCertificate withType(String type) {
        this.type = type;
        return this;
    }

}
