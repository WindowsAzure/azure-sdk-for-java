/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.imagebuilder.v2020_02_14;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes an image source from [Azure Gallery
 * Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = ImageTemplatePlatformImageSource.class)
@JsonTypeName("PlatformImage")
public class ImageTemplatePlatformImageSource extends ImageTemplateSource {
    /**
     * Image Publisher in [Azure Gallery
     * Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /**
     * Image offer from the [Azure Gallery
     * Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     */
    @JsonProperty(value = "offer")
    private String offer;

    /**
     * Image sku from the [Azure Gallery
     * Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     */
    @JsonProperty(value = "sku")
    private String sku;

    /**
     * Image version from the [Azure Gallery
     * Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Optional configuration of purchase plan for platform image.
     */
    @JsonProperty(value = "planInfo")
    private PlatformImagePurchasePlan planInfo;

    /**
     * Get image Publisher in [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     *
     * @return the publisher value
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set image Publisher in [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     *
     * @param publisher the publisher value to set
     * @return the ImageTemplatePlatformImageSource object itself.
     */
    public ImageTemplatePlatformImageSource withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get image offer from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     *
     * @return the offer value
     */
    public String offer() {
        return this.offer;
    }

    /**
     * Set image offer from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     *
     * @param offer the offer value to set
     * @return the ImageTemplatePlatformImageSource object itself.
     */
    public ImageTemplatePlatformImageSource withOffer(String offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Get image sku from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     *
     * @return the sku value
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set image sku from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     *
     * @param sku the sku value to set
     * @return the ImageTemplatePlatformImageSource object itself.
     */
    public ImageTemplatePlatformImageSource withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get image version from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set image version from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     *
     * @param version the version value to set
     * @return the ImageTemplatePlatformImageSource object itself.
     */
    public ImageTemplatePlatformImageSource withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get optional configuration of purchase plan for platform image.
     *
     * @return the planInfo value
     */
    public PlatformImagePurchasePlan planInfo() {
        return this.planInfo;
    }

    /**
     * Set optional configuration of purchase plan for platform image.
     *
     * @param planInfo the planInfo value to set
     * @return the ImageTemplatePlatformImageSource object itself.
     */
    public ImageTemplatePlatformImageSource withPlanInfo(PlatformImagePurchasePlan planInfo) {
        this.planInfo = planInfo;
        return this;
    }

}
