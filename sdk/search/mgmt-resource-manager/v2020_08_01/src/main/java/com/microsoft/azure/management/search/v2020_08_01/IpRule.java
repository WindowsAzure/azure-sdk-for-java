/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IP restriction rule of the Azure Cognitive Search service.
 */
public class IpRule {
    /**
     * Value corresponding to a single IPv4 address (eg., 123.1.2.3) or an IP
     * range in CIDR format (eg., 123.1.2.3/24) to be allowed.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get value corresponding to a single IPv4 address (eg., 123.1.2.3) or an IP range in CIDR format (eg., 123.1.2.3/24) to be allowed.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set value corresponding to a single IPv4 address (eg., 123.1.2.3) or an IP range in CIDR format (eg., 123.1.2.3/24) to be allowed.
     *
     * @param value the value value to set
     * @return the IpRule object itself.
     */
    public IpRule withValue(String value) {
        this.value = value;
        return this;
    }

}
