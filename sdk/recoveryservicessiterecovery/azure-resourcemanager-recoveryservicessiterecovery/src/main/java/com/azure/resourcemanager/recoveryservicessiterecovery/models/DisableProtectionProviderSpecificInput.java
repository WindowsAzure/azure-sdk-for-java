// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Disable protection provider specific input. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = DisableProtectionProviderSpecificInput.class)
@JsonTypeName("DisableProtectionProviderSpecificInput")
@JsonSubTypes({@JsonSubTypes.Type(name = "InMage", value = InMageDisableProtectionProviderSpecificInput.class)})
@Immutable
public class DisableProtectionProviderSpecificInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DisableProtectionProviderSpecificInput.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
