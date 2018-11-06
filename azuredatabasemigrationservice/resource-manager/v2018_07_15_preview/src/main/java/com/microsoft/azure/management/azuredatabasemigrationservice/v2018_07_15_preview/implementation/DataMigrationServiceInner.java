/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation;

import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.ServiceProvisioningState;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.ServiceSku;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A Database Migration Service resource.
 */
@JsonFlatten
public class DataMigrationServiceInner extends Resource {
    /**
     * HTTP strong entity tag value. Ignored if submitted.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * The resource kind. Only 'vm' (the default) is supported.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * The resource's provisioning state. Possible values include: 'Accepted',
     * 'Deleting', 'Deploying', 'Stopped', 'Stopping', 'Starting',
     * 'FailedToStart', 'FailedToStop', 'Succeeded', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ServiceProvisioningState provisioningState;

    /**
     * The public key of the service, used to encrypt secrets sent to the
     * service.
     */
    @JsonProperty(value = "properties.publicKey")
    private String publicKey;

    /**
     * The ID of the Microsoft.Network/virtualNetworks/subnets resource to
     * which the service should be joined.
     */
    @JsonProperty(value = "properties.virtualSubnetId", required = true)
    private String virtualSubnetId;

    /**
     * Service SKU.
     */
    @JsonProperty(value = "sku")
    private ServiceSku sku;

    /**
     * Get hTTP strong entity tag value. Ignored if submitted.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set hTTP strong entity tag value. Ignored if submitted.
     *
     * @param etag the etag value to set
     * @return the DataMigrationServiceInner object itself.
     */
    public DataMigrationServiceInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the resource kind. Only 'vm' (the default) is supported.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the resource kind. Only 'vm' (the default) is supported.
     *
     * @param kind the kind value to set
     * @return the DataMigrationServiceInner object itself.
     */
    public DataMigrationServiceInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the resource's provisioning state. Possible values include: 'Accepted', 'Deleting', 'Deploying', 'Stopped', 'Stopping', 'Starting', 'FailedToStart', 'FailedToStop', 'Succeeded', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ServiceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the public key of the service, used to encrypt secrets sent to the service.
     *
     * @return the publicKey value
     */
    public String publicKey() {
        return this.publicKey;
    }

    /**
     * Set the public key of the service, used to encrypt secrets sent to the service.
     *
     * @param publicKey the publicKey value to set
     * @return the DataMigrationServiceInner object itself.
     */
    public DataMigrationServiceInner withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * Get the ID of the Microsoft.Network/virtualNetworks/subnets resource to which the service should be joined.
     *
     * @return the virtualSubnetId value
     */
    public String virtualSubnetId() {
        return this.virtualSubnetId;
    }

    /**
     * Set the ID of the Microsoft.Network/virtualNetworks/subnets resource to which the service should be joined.
     *
     * @param virtualSubnetId the virtualSubnetId value to set
     * @return the DataMigrationServiceInner object itself.
     */
    public DataMigrationServiceInner withVirtualSubnetId(String virtualSubnetId) {
        this.virtualSubnetId = virtualSubnetId;
        return this;
    }

    /**
     * Get service SKU.
     *
     * @return the sku value
     */
    public ServiceSku sku() {
        return this.sku;
    }

    /**
     * Set service SKU.
     *
     * @param sku the sku value to set
     * @return the DataMigrationServiceInner object itself.
     */
    public DataMigrationServiceInner withSku(ServiceSku sku) {
        this.sku = sku;
        return this;
    }

}
