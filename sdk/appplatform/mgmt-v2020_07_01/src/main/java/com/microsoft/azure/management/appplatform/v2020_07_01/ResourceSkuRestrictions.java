/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Restrictions where the SKU cannot be used.
 */
public class ResourceSkuRestrictions {
    /**
     * Gets the type of restrictions. Possible values include: 'Location',
     * 'Zone'.
     */
    @JsonProperty(value = "type")
    private ResourceSkuRestrictionsType type;

    /**
     * Gets the value of restrictions. If the restriction type is set to
     * location. This would be different locations where the SKU is restricted.
     */
    @JsonProperty(value = "values")
    private List<String> values;

    /**
     * Gets the information about the restriction where the SKU cannot be used.
     */
    @JsonProperty(value = "restrictionInfo")
    private ResourceSkuRestrictionInfo restrictionInfo;

    /**
     * Gets the reason for restriction. Possible values include: 'QuotaId',
     * 'NotAvailableForSubscription'.
     */
    @JsonProperty(value = "reasonCode")
    private ResourceSkuRestrictionsReasonCode reasonCode;

    /**
     * Get gets the type of restrictions. Possible values include: 'Location', 'Zone'.
     *
     * @return the type value
     */
    public ResourceSkuRestrictionsType type() {
        return this.type;
    }

    /**
     * Set gets the type of restrictions. Possible values include: 'Location', 'Zone'.
     *
     * @param type the type value to set
     * @return the ResourceSkuRestrictions object itself.
     */
    public ResourceSkuRestrictions withType(ResourceSkuRestrictionsType type) {
        this.type = type;
        return this;
    }

    /**
     * Get gets the value of restrictions. If the restriction type is set to
     location. This would be different locations where the SKU is restricted.
     *
     * @return the values value
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set gets the value of restrictions. If the restriction type is set to
     location. This would be different locations where the SKU is restricted.
     *
     * @param values the values value to set
     * @return the ResourceSkuRestrictions object itself.
     */
    public ResourceSkuRestrictions withValues(List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * Get gets the information about the restriction where the SKU cannot be used.
     *
     * @return the restrictionInfo value
     */
    public ResourceSkuRestrictionInfo restrictionInfo() {
        return this.restrictionInfo;
    }

    /**
     * Set gets the information about the restriction where the SKU cannot be used.
     *
     * @param restrictionInfo the restrictionInfo value to set
     * @return the ResourceSkuRestrictions object itself.
     */
    public ResourceSkuRestrictions withRestrictionInfo(ResourceSkuRestrictionInfo restrictionInfo) {
        this.restrictionInfo = restrictionInfo;
        return this;
    }

    /**
     * Get gets the reason for restriction. Possible values include: 'QuotaId', 'NotAvailableForSubscription'.
     *
     * @return the reasonCode value
     */
    public ResourceSkuRestrictionsReasonCode reasonCode() {
        return this.reasonCode;
    }

    /**
     * Set gets the reason for restriction. Possible values include: 'QuotaId', 'NotAvailableForSubscription'.
     *
     * @param reasonCode the reasonCode value to set
     * @return the ResourceSkuRestrictions object itself.
     */
    public ResourceSkuRestrictions withReasonCode(ResourceSkuRestrictionsReasonCode reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }

}
