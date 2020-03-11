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
 * Migration provider specific settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType", defaultImpl = MigrationProviderSpecificSettings.class)
@JsonTypeName("MigrationProviderSpecificSettings")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "VMwareCbt", value = VMwareCbtMigrationDetails.class)
})
public class MigrationProviderSpecificSettings {
}
