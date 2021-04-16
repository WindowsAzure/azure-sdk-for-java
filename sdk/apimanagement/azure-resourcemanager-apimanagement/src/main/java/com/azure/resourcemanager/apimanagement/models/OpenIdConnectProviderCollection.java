// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.models.OpenidConnectProviderContractInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Paged OpenIdProviders list representation. */
@Fluent
public final class OpenIdConnectProviderCollection {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OpenIdConnectProviderCollection.class);

    /*
     * Page values.
     */
    @JsonProperty(value = "value")
    private List<OpenidConnectProviderContractInner> value;

    /*
     * Total record count number across all pages.
     */
    @JsonProperty(value = "count")
    private Long count;

    /*
     * Next page link if any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Page values.
     *
     * @return the value value.
     */
    public List<OpenidConnectProviderContractInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Page values.
     *
     * @param value the value value to set.
     * @return the OpenIdConnectProviderCollection object itself.
     */
    public OpenIdConnectProviderCollection withValue(List<OpenidConnectProviderContractInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the count property: Total record count number across all pages.
     *
     * @return the count value.
     */
    public Long count() {
        return this.count;
    }

    /**
     * Set the count property: Total record count number across all pages.
     *
     * @param count the count value to set.
     * @return the OpenIdConnectProviderCollection object itself.
     */
    public OpenIdConnectProviderCollection withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Get the nextLink property: Next page link if any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Next page link if any.
     *
     * @param nextLink the nextLink value to set.
     * @return the OpenIdConnectProviderCollection object itself.
     */
    public OpenIdConnectProviderCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
