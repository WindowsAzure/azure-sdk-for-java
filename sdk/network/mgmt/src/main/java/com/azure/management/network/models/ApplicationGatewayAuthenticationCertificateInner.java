// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ApplicationGatewayAuthenticationCertificate model. */
@JsonFlatten
@Fluent
public class ApplicationGatewayAuthenticationCertificateInner extends SubResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ApplicationGatewayAuthenticationCertificateInner.class);

    /*
     * Name of the authentication certificate that is unique within an
     * Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Certificate public data.
     */
    @JsonProperty(value = "properties.data")
    private String data;

    /*
     * Provisioning state of the authentication certificate resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the name property: Name of the authentication certificate that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the authentication certificate that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayAuthenticationCertificateInner object itself.
     */
    public ApplicationGatewayAuthenticationCertificateInner withName(String name) {
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
     * @return the ApplicationGatewayAuthenticationCertificateInner object itself.
     */
    public ApplicationGatewayAuthenticationCertificateInner withEtag(String etag) {
        this.etag = etag;
        return this;
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
     * Set the type property: Type of the resource.
     *
     * @param type the type value to set.
     * @return the ApplicationGatewayAuthenticationCertificateInner object itself.
     */
    public ApplicationGatewayAuthenticationCertificateInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the data property: Certificate public data.
     *
     * @return the data value.
     */
    public String data() {
        return this.data;
    }

    /**
     * Set the data property: Certificate public data.
     *
     * @param data the data value to set.
     * @return the ApplicationGatewayAuthenticationCertificateInner object itself.
     */
    public ApplicationGatewayAuthenticationCertificateInner withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the authentication certificate resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the authentication certificate resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayAuthenticationCertificateInner object itself.
     */
    public ApplicationGatewayAuthenticationCertificateInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
