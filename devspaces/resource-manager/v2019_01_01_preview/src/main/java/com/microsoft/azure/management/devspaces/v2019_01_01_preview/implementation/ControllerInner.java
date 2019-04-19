/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devspaces.v2019_01_01_preview.implementation;

import com.microsoft.azure.management.devspaces.v2019_01_01_preview.ProvisioningState;
import com.microsoft.azure.management.devspaces.v2019_01_01_preview.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The ControllerInner model.
 */
@JsonFlatten
@SkipParentValidation
public class ControllerInner extends Resource {
    /**
     * Provisioning state of the Azure Dev Spaces Controller. Possible values
     * include: 'Succeeded', 'Failed', 'Canceled', 'Updating', 'Creating',
     * 'Deleting', 'Deleted'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * DNS suffix for public endpoints running in the Azure Dev Spaces
     * Controller.
     */
    @JsonProperty(value = "properties.hostSuffix", access = JsonProperty.Access.WRITE_ONLY)
    private String hostSuffix;

    /**
     * DNS name for accessing DataPlane services.
     */
    @JsonProperty(value = "properties.dataPlaneFqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String dataPlaneFqdn;

    /**
     * Resource ID of the target container host.
     */
    @JsonProperty(value = "properties.targetContainerHostResourceId", required = true)
    private String targetContainerHostResourceId;

    /**
     * Credentials of the target container host (base64).
     */
    @JsonProperty(value = "properties.targetContainerHostCredentialsBase64", required = true)
    private String targetContainerHostCredentialsBase64;

    /**
     * The sku property.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /**
     * Get provisioning state of the Azure Dev Spaces Controller. Possible values include: 'Succeeded', 'Failed', 'Canceled', 'Updating', 'Creating', 'Deleting', 'Deleted'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get dNS suffix for public endpoints running in the Azure Dev Spaces Controller.
     *
     * @return the hostSuffix value
     */
    public String hostSuffix() {
        return this.hostSuffix;
    }

    /**
     * Get dNS name for accessing DataPlane services.
     *
     * @return the dataPlaneFqdn value
     */
    public String dataPlaneFqdn() {
        return this.dataPlaneFqdn;
    }

    /**
     * Get resource ID of the target container host.
     *
     * @return the targetContainerHostResourceId value
     */
    public String targetContainerHostResourceId() {
        return this.targetContainerHostResourceId;
    }

    /**
     * Set resource ID of the target container host.
     *
     * @param targetContainerHostResourceId the targetContainerHostResourceId value to set
     * @return the ControllerInner object itself.
     */
    public ControllerInner withTargetContainerHostResourceId(String targetContainerHostResourceId) {
        this.targetContainerHostResourceId = targetContainerHostResourceId;
        return this;
    }

    /**
     * Get credentials of the target container host (base64).
     *
     * @return the targetContainerHostCredentialsBase64 value
     */
    public String targetContainerHostCredentialsBase64() {
        return this.targetContainerHostCredentialsBase64;
    }

    /**
     * Set credentials of the target container host (base64).
     *
     * @param targetContainerHostCredentialsBase64 the targetContainerHostCredentialsBase64 value to set
     * @return the ControllerInner object itself.
     */
    public ControllerInner withTargetContainerHostCredentialsBase64(String targetContainerHostCredentialsBase64) {
        this.targetContainerHostCredentialsBase64 = targetContainerHostCredentialsBase64;
        return this;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the ControllerInner object itself.
     */
    public ControllerInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

}
