/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description of an additional API Management resource location.
 */
public class AdditionalLocation {
    /**
     * The location name of the additional region among Azure Data center
     * regions.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * SKU properties of the API Management service.
     */
    @JsonProperty(value = "sku", required = true)
    private ApiManagementServiceSkuProperties sku;

    /**
     * Public Static Load Balanced IP addresses of the API Management service
     * in the additional location. Available only for Basic, Standard and
     * Premium SKU.
     */
    @JsonProperty(value = "publicIPAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> publicIPAddresses;

    /**
     * Private Static Load Balanced IP addresses of the API Management service
     * which is deployed in an Internal Virtual Network in a particular
     * additional location. Available only for Basic, Standard and Premium SKU.
     */
    @JsonProperty(value = "privateIPAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> privateIPAddresses;

    /**
     * Virtual network configuration for the location.
     */
    @JsonProperty(value = "virtualNetworkConfiguration")
    private VirtualNetworkConfiguration virtualNetworkConfiguration;

    /**
     * Gateway URL of the API Management service in the Region.
     */
    @JsonProperty(value = "gatewayRegionalUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String gatewayRegionalUrl;

    /**
     * Get the location name of the additional region among Azure Data center regions.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location name of the additional region among Azure Data center regions.
     *
     * @param location the location value to set
     * @return the AdditionalLocation object itself.
     */
    public AdditionalLocation withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get sKU properties of the API Management service.
     *
     * @return the sku value
     */
    public ApiManagementServiceSkuProperties sku() {
        return this.sku;
    }

    /**
     * Set sKU properties of the API Management service.
     *
     * @param sku the sku value to set
     * @return the AdditionalLocation object itself.
     */
    public AdditionalLocation withSku(ApiManagementServiceSkuProperties sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get public Static Load Balanced IP addresses of the API Management service in the additional location. Available only for Basic, Standard and Premium SKU.
     *
     * @return the publicIPAddresses value
     */
    public List<String> publicIPAddresses() {
        return this.publicIPAddresses;
    }

    /**
     * Get private Static Load Balanced IP addresses of the API Management service which is deployed in an Internal Virtual Network in a particular additional location. Available only for Basic, Standard and Premium SKU.
     *
     * @return the privateIPAddresses value
     */
    public List<String> privateIPAddresses() {
        return this.privateIPAddresses;
    }

    /**
     * Get virtual network configuration for the location.
     *
     * @return the virtualNetworkConfiguration value
     */
    public VirtualNetworkConfiguration virtualNetworkConfiguration() {
        return this.virtualNetworkConfiguration;
    }

    /**
     * Set virtual network configuration for the location.
     *
     * @param virtualNetworkConfiguration the virtualNetworkConfiguration value to set
     * @return the AdditionalLocation object itself.
     */
    public AdditionalLocation withVirtualNetworkConfiguration(VirtualNetworkConfiguration virtualNetworkConfiguration) {
        this.virtualNetworkConfiguration = virtualNetworkConfiguration;
        return this;
    }

    /**
     * Get gateway URL of the API Management service in the Region.
     *
     * @return the gatewayRegionalUrl value
     */
    public String gatewayRegionalUrl() {
        return this.gatewayRegionalUrl;
    }

}
