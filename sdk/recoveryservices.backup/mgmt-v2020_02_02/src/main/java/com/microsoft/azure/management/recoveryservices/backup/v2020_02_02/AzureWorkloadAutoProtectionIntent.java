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
 * Azure Recovery Services Vault specific protection intent item.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectionIntentItemType", defaultImpl = AzureWorkloadAutoProtectionIntent.class)
@JsonTypeName("AzureWorkloadAutoProtectionIntent")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureWorkloadSQLAutoProtectionIntent", value = AzureWorkloadSQLAutoProtectionIntent.class)
})
public class AzureWorkloadAutoProtectionIntent extends AzureRecoveryServiceVaultProtectionIntent {
}
