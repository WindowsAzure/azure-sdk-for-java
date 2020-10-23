/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01.implementation;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.microsoft.azure.management.databoxedge.v2019_08_01.ARMBaseModel;

/**
 * Trigger details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = TriggerInner.class)
@JsonTypeName("Trigger")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "FileEvent", value = FileEventTrigger.class),
    @JsonSubTypes.Type(name = "PeriodicTimerEvent", value = PeriodicTimerEventTrigger.class)
})
public class TriggerInner extends ARMBaseModel {
}
