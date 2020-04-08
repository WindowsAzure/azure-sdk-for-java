// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The OpenShiftManagedClusterBaseIdentityProvider model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = OpenShiftManagedClusterBaseIdentityProvider.class)
@JsonTypeName("OpenShiftManagedClusterBaseIdentityProvider")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AADIdentityProvider", value = OpenShiftManagedClusterAADIdentityProvider.class)
})
@Immutable
public class OpenShiftManagedClusterBaseIdentityProvider {
}
