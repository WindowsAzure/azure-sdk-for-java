/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01.implementation;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.microsoft.azure.management.edgegateway.v2019_03_01.ARMBaseModel;
import com.microsoft.azure.management.edgegateway.v2019_03_01.FileEventTrigger;
import com.microsoft.azure.management.edgegateway.v2019_03_01.PeriodicTimerEventTrigger;

/**
 * Trigger details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Trigger")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "FileEvent", value = FileEventTrigger.class),
    @JsonSubTypes.Type(name = "PeriodicTimerEvent", value = PeriodicTimerEventTrigger.class)
})
public class TriggerInner extends ARMBaseModel {
}
