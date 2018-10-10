/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Describes how the service is partitioned.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "PartitionScheme")
@JsonTypeName("PartitionSchemeDescription")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Named", value = NamedPartitionSchemeDescription.class),
    @JsonSubTypes.Type(name = "Singleton", value = SingletonPartitionSchemeDescription.class),
    @JsonSubTypes.Type(name = "UniformInt64Range", value = UniformInt64RangePartitionSchemeDescription.class)
})
public class PartitionSchemeDescription {
}
