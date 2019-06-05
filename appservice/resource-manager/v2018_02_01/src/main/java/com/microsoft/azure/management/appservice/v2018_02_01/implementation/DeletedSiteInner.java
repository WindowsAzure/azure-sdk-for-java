/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2018_02_01.ProxyOnlyResource;

/**
 * A deleted app.
 */
@JsonFlatten
public class DeletedSiteInner extends ProxyOnlyResource {
    /**
     * Numeric id for the deleted site.
     */
    @JsonProperty(value = "properties.deletedSiteId", access = JsonProperty.Access.WRITE_ONLY)
    private Integer deletedSiteId;

    /**
     * Time in UTC when the app was deleted.
     */
    @JsonProperty(value = "properties.deletedTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String deletedTimestamp;

    /**
     * Subscription containing the deleted site.
     */
    @JsonProperty(value = "properties.subscription", access = JsonProperty.Access.WRITE_ONLY)
    private String subscription;

    /**
     * ResourceGroup that contained the deleted site.
     */
    @JsonProperty(value = "properties.resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /**
     * Name of the deleted site.
     */
    @JsonProperty(value = "properties.deletedSiteName", access = JsonProperty.Access.WRITE_ONLY)
    private String deletedSiteName;

    /**
     * Slot of the deleted site.
     */
    @JsonProperty(value = "properties.slot", access = JsonProperty.Access.WRITE_ONLY)
    private String slot;

    /**
     * Kind of site that was deleted.
     */
    @JsonProperty(value = "properties.kind", access = JsonProperty.Access.WRITE_ONLY)
    private String deletedSiteKind;

    /**
     * Geo Region of the deleted site.
     */
    @JsonProperty(value = "properties.geoRegionName", access = JsonProperty.Access.WRITE_ONLY)
    private String geoRegionName;

    /**
     * Get numeric id for the deleted site.
     *
     * @return the deletedSiteId value
     */
    public Integer deletedSiteId() {
        return this.deletedSiteId;
    }

    /**
     * Get time in UTC when the app was deleted.
     *
     * @return the deletedTimestamp value
     */
    public String deletedTimestamp() {
        return this.deletedTimestamp;
    }

    /**
     * Get subscription containing the deleted site.
     *
     * @return the subscription value
     */
    public String subscription() {
        return this.subscription;
    }

    /**
     * Get resourceGroup that contained the deleted site.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get name of the deleted site.
     *
     * @return the deletedSiteName value
     */
    public String deletedSiteName() {
        return this.deletedSiteName;
    }

    /**
     * Get slot of the deleted site.
     *
     * @return the slot value
     */
    public String slot() {
        return this.slot;
    }

    /**
     * Get kind of site that was deleted.
     *
     * @return the deletedSiteKind value
     */
    public String deletedSiteKind() {
        return this.deletedSiteKind;
    }

    /**
     * Get geo Region of the deleted site.
     *
     * @return the geoRegionName value
     */
    public String geoRegionName() {
        return this.geoRegionName;
    }

}
