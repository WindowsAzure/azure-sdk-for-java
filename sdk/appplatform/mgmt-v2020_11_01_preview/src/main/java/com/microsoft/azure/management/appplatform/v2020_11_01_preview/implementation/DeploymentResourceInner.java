/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation;

import com.microsoft.azure.management.appplatform.v2020_11_01_preview.DeploymentResourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.ProxyResource;

/**
 * Deployment resource payload.
 */
public class DeploymentResourceInner extends ProxyResource {
    /**
     * Properties of the Deployment resource.
     */
    @JsonProperty(value = "properties")
    private DeploymentResourceProperties properties;

    /**
     * Sku of the Deployment resource.
     */
    @JsonProperty(value = "sku")
    private SkuInner sku;

    /**
     * Get properties of the Deployment resource.
     *
     * @return the properties value
     */
    public DeploymentResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set properties of the Deployment resource.
     *
     * @param properties the properties value to set
     * @return the DeploymentResourceInner object itself.
     */
    public DeploymentResourceInner withProperties(DeploymentResourceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get sku of the Deployment resource.
     *
     * @return the sku value
     */
    public SkuInner sku() {
        return this.sku;
    }

    /**
     * Set sku of the Deployment resource.
     *
     * @param sku the sku value to set
     * @return the DeploymentResourceInner object itself.
     */
    public DeploymentResourceInner withSku(SkuInner sku) {
        this.sku = sku;
        return this;
    }

}
