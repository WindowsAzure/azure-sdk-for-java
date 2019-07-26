/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The base definition of a secret type.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "authorizationType")
@JsonTypeName("LinkedIntegrationRuntimeProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "RBAC", value = LinkedIntegrationRuntimeRbac.class),
    @JsonSubTypes.Type(name = "Key", value = LinkedIntegrationRuntimeKey.class)
})
public class LinkedIntegrationRuntimeProperties {
}
