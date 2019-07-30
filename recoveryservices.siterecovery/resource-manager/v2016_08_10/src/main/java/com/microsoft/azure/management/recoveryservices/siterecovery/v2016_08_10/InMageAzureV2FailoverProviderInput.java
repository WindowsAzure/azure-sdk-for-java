/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InMageAzureV2 provider specific input for failover.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageAzureV2")
public class InMageAzureV2FailoverProviderInput extends ProviderSpecificFailoverInput {
    /**
     * Location of the vault.
     */
    @JsonProperty(value = "vaultLocation")
    private String vaultLocation;

    /**
     * The recovery point id to be passed to failover to a particular recovery
     * point. In case of latest recovery point, null should be passed.
     */
    @JsonProperty(value = "recoveryPointId")
    private String recoveryPointId;

    /**
     * Get location of the vault.
     *
     * @return the vaultLocation value
     */
    public String vaultLocation() {
        return this.vaultLocation;
    }

    /**
     * Set location of the vault.
     *
     * @param vaultLocation the vaultLocation value to set
     * @return the InMageAzureV2FailoverProviderInput object itself.
     */
    public InMageAzureV2FailoverProviderInput withVaultLocation(String vaultLocation) {
        this.vaultLocation = vaultLocation;
        return this;
    }

    /**
     * Get the recovery point id to be passed to failover to a particular recovery point. In case of latest recovery point, null should be passed.
     *
     * @return the recoveryPointId value
     */
    public String recoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * Set the recovery point id to be passed to failover to a particular recovery point. In case of latest recovery point, null should be passed.
     *
     * @param recoveryPointId the recoveryPointId value to set
     * @return the InMageAzureV2FailoverProviderInput object itself.
     */
    public InMageAzureV2FailoverProviderInput withRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
        return this;
    }

}
