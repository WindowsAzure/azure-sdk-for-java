/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for retention policy.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "retentionPolicyType", defaultImpl = RetentionPolicy.class)
@JsonTypeName("RetentionPolicy")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "LongTermRetentionPolicy", value = LongTermRetentionPolicy.class),
    @JsonSubTypes.Type(name = "SimpleRetentionPolicy", value = SimpleRetentionPolicy.class)
})
public class RetentionPolicy {
}
