/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Provider specific input for container creation operation.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("ReplicationProviderSpecificContainerCreationInput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "A2A", value = A2AContainerCreationInput.class),
    @JsonSubTypes.Type(name = "6c7da455-506f-43ff-a16a-8eb101aebb70", value = VMwareCbtContainerCreationInput.class)
})
public class ReplicationProviderSpecificContainerCreationInput {
}
