/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SkuDisabledReason.
 */
public enum SkuDisabledReason {
    /** SKU is not disabled. */
    NONE("None"),

    /** SKU is not available in the requested country. */
    COUNTRY("Country"),

    /** SKU is not available to push data to the requested Azure region. */
    REGION("Region"),

    /** Required features are not enabled for the SKU. */
    FEATURE("Feature"),

    /** Subscription does not have required offer types for the SKU. */
    OFFER_TYPE("OfferType"),

    /** Subscription has not registered to Microsoft.DataBox and Service does not have the subscription notification. */
    NO_SUBSCRIPTION_INFO("NoSubscriptionInfo");

    /** The actual serialized value for a SkuDisabledReason instance. */
    private String value;

    SkuDisabledReason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SkuDisabledReason instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SkuDisabledReason object, or null if unable to parse.
     */
    @JsonCreator
    public static SkuDisabledReason fromString(String value) {
        SkuDisabledReason[] items = SkuDisabledReason.values();
        for (SkuDisabledReason item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
