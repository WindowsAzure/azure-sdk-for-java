// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Trigger context. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = TriggerContext.class)
@JsonTypeName("TriggerContext")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AdhocBasedTriggerContext", value = AdhocBasedTriggerContext.class),
    @JsonSubTypes.Type(name = "ScheduleBasedTriggerContext", value = ScheduleBasedTriggerContext.class)
})
@Immutable
public class TriggerContext {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TriggerContext.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
