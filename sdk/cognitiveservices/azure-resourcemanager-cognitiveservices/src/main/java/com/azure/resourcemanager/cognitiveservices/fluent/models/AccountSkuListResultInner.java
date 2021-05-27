// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cognitiveservices.models.AccountSku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of cognitive services accounts operation response. */
@Fluent
public final class AccountSkuListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AccountSkuListResultInner.class);

    /*
     * Gets the list of Cognitive Services accounts and their properties.
     */
    @JsonProperty(value = "value")
    private List<AccountSku> value;

    /**
     * Get the value property: Gets the list of Cognitive Services accounts and their properties.
     *
     * @return the value value.
     */
    public List<AccountSku> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets the list of Cognitive Services accounts and their properties.
     *
     * @param value the value value to set.
     * @return the AccountSkuListResultInner object itself.
     */
    public AccountSkuListResultInner withValue(List<AccountSku> value) {
        this.value = value;
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
