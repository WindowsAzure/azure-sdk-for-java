// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.appservice.AzureStorageInfoValue;
import com.azure.management.appservice.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The AzureStoragePropertyDictionaryResource model. */
@Fluent
public final class AzureStoragePropertyDictionaryResourceInner extends ProxyOnlyResource {
    /*
     * Azure storage accounts.
     */
    @JsonProperty(value = "properties")
    private Map<String, AzureStorageInfoValue> properties;

    /**
     * Get the properties property: Azure storage accounts.
     *
     * @return the properties value.
     */
    public Map<String, AzureStorageInfoValue> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Azure storage accounts.
     *
     * @param properties the properties value to set.
     * @return the AzureStoragePropertyDictionaryResourceInner object itself.
     */
    public AzureStoragePropertyDictionaryResourceInner withProperties(Map<String, AzureStorageInfoValue> properties) {
        this.properties = properties;
        return this;
    }
}
