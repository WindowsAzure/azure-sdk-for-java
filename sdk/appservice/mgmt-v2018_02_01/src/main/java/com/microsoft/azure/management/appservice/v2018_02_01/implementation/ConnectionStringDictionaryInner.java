/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import java.util.Map;
import com.microsoft.azure.management.appservice.v2018_02_01.ConnStringValueTypePair;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.management.appservice.v2018_02_01.ProxyOnlyResource;

/**
 * String dictionary resource.
 */
public class ConnectionStringDictionaryInner extends ProxyOnlyResource {
    /**
     * Connection strings.
     */
    @JsonProperty(value = "properties")
    private Map<String, ConnStringValueTypePair> properties;

    /**
     * Get connection strings.
     *
     * @return the properties value
     */
    public Map<String, ConnStringValueTypePair> properties() {
        return this.properties;
    }

    /**
     * Set connection strings.
     *
     * @param properties the properties value to set
     * @return the ConnectionStringDictionaryInner object itself.
     */
    public ConnectionStringDictionaryInner withProperties(Map<String, ConnStringValueTypePair> properties) {
        this.properties = properties;
        return this;
    }

}
