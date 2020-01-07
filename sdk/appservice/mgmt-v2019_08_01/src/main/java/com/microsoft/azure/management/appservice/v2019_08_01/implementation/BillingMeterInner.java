/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2019_08_01.ProxyOnlyResource;

/**
 * App Service billing entity that contains information about meter which the
 * Azure billing system utilizes to charge users for services.
 */
@JsonFlatten
public class BillingMeterInner extends ProxyOnlyResource {
    /**
     * Meter GUID onboarded in Commerce.
     */
    @JsonProperty(value = "properties.meterId")
    private String meterId;

    /**
     * Azure Location of billable resource.
     */
    @JsonProperty(value = "properties.billingLocation")
    private String billingLocation;

    /**
     * Short Name from App Service Azure pricing Page.
     */
    @JsonProperty(value = "properties.shortName")
    private String shortName;

    /**
     * Friendly name of the meter.
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /**
     * App Service ResourceType meter used for.
     */
    @JsonProperty(value = "properties.resourceType")
    private String resourceType;

    /**
     * App Service OS type meter used for.
     */
    @JsonProperty(value = "properties.osType")
    private String osType;

    /**
     * Get meter GUID onboarded in Commerce.
     *
     * @return the meterId value
     */
    public String meterId() {
        return this.meterId;
    }

    /**
     * Set meter GUID onboarded in Commerce.
     *
     * @param meterId the meterId value to set
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withMeterId(String meterId) {
        this.meterId = meterId;
        return this;
    }

    /**
     * Get azure Location of billable resource.
     *
     * @return the billingLocation value
     */
    public String billingLocation() {
        return this.billingLocation;
    }

    /**
     * Set azure Location of billable resource.
     *
     * @param billingLocation the billingLocation value to set
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withBillingLocation(String billingLocation) {
        this.billingLocation = billingLocation;
        return this;
    }

    /**
     * Get short Name from App Service Azure pricing Page.
     *
     * @return the shortName value
     */
    public String shortName() {
        return this.shortName;
    }

    /**
     * Set short Name from App Service Azure pricing Page.
     *
     * @param shortName the shortName value to set
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * Get friendly name of the meter.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of the meter.
     *
     * @param friendlyName the friendlyName value to set
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get app Service ResourceType meter used for.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set app Service ResourceType meter used for.
     *
     * @param resourceType the resourceType value to set
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get app Service OS type meter used for.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set app Service OS type meter used for.
     *
     * @param osType the osType value to set
     * @return the BillingMeterInner object itself.
     */
    public BillingMeterInner withOsType(String osType) {
        this.osType = osType;
        return this;
    }

}
