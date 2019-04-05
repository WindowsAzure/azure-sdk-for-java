// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.applicationconfig.implementation;

import com.azure.applicationconfig.models.ConfigurationSetting;
import com.azure.common.http.rest.Page;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * An instance of this class defines a page of Azure App Configuration {@link ConfigurationSetting} resources and a link
 * to get the next page of resources, if any.
 */
public final class ConfigurationSettingPage implements Page<ConfigurationSetting> {
    @JsonProperty("@nextLink")
    private String nextLink;

    @JsonProperty("items")
    private List<ConfigurationSetting> items;

    /**
     * Gets the link to the next page.
     *
     * @return the link to the next page.
     */
    @Override
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Gets the list of items.
     *
     * @return the list of items in {@link List}.
     */
    @Override
    public List<ConfigurationSetting> items() {
        return items;
    }
}
