// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.azure.management.appservice.ConnStringValueTypePair;
import com.azure.management.appservice.ProxyOnlyResource;
import java.util.Map;

/**
 * The ConnectionStringDictionary model.
 */
@Fluent
public final class ConnectionStringDictionaryInner extends ProxyOnlyResource {
    /*
     * Connection strings.
     */
    @JsonProperty(value = "properties")
    private Map<String, ConnStringValueTypePair> properties;

    /**
     * Get the properties property: Connection strings.
     * 
     * @return the properties value.
     */
    public Map<String, ConnStringValueTypePair> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Connection strings.
     * 
     * @param properties the properties value to set.
     * @return the ConnectionStringDictionaryInner object itself.
     */
    public ConnectionStringDictionaryInner withProperties(Map<String, ConnStringValueTypePair> properties) {
        this.properties = properties;
        return this;
    }
}
