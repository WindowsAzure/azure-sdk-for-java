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

/** Provider specific switch protection input. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = SwitchProtectionProviderSpecificInput.class)
@JsonTypeName("SwitchProtectionProviderSpecificInput")
@JsonSubTypes({@JsonSubTypes.Type(name = "A2A", value = A2ASwitchProtectionInput.class)})
@Immutable
public class SwitchProtectionProviderSpecificInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SwitchProtectionProviderSpecificInput.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
