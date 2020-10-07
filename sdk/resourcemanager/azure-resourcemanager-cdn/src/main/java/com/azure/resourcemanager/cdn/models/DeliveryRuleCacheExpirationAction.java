// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Defines the cache expiration action for the delivery rule. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "name")
@JsonTypeName("CacheExpiration")
@Fluent
public final class DeliveryRuleCacheExpirationAction extends DeliveryRuleAction {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeliveryRuleCacheExpirationAction.class);

    /*
     * Defines the parameters for the action.
     */
    @JsonProperty(value = "parameters", required = true)
    private CacheExpirationActionParameters parameters;

    /**
     * Get the parameters property: Defines the parameters for the action.
     *
     * @return the parameters value.
     */
    public CacheExpirationActionParameters parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Defines the parameters for the action.
     *
     * @param parameters the parameters value to set.
     * @return the DeliveryRuleCacheExpirationAction object itself.
     */
    public DeliveryRuleCacheExpirationAction withParameters(CacheExpirationActionParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (parameters() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property parameters in model DeliveryRuleCacheExpirationAction"));
        } else {
            parameters().validate();
        }
    }
}
