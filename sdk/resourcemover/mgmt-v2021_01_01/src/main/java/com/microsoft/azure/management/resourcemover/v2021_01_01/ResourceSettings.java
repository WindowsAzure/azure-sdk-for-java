/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcemover.v2021_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Gets or sets the resource settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resourceType", defaultImpl = ResourceSettings.class)
@JsonTypeName("ResourceSettings")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Microsoft.Compute/virtualMachines", value = VirtualMachineResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Compute/availabilitySets", value = AvailabilitySetResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Network/virtualNetworks", value = VirtualNetworkResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Network/networkInterfaces", value = NetworkInterfaceResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Network/networkSecurityGroups", value = NetworkSecurityGroupResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Network/loadBalancers", value = LoadBalancerResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Sql/servers", value = SqlServerResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Sql/servers/elasticPools", value = SqlElasticPoolResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Sql/servers/databases", value = SqlDatabaseResourceSettings.class),
    @JsonSubTypes.Type(name = "resourceGroups", value = ResourceGroupResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Network/publicIPAddresses", value = PublicIPAddressResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.KeyVault/vaults", value = KeyVaultResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Compute/diskEncryptionSets", value = DiskEncryptionSetResourceSettings.class)
})
public class ResourceSettings {
    /**
     * Gets or sets the target Resource name.
     */
    @JsonProperty(value = "targetResourceName", required = true)
    private String targetResourceName;

    /**
     * Get gets or sets the target Resource name.
     *
     * @return the targetResourceName value
     */
    public String targetResourceName() {
        return this.targetResourceName;
    }

    /**
     * Set gets or sets the target Resource name.
     *
     * @param targetResourceName the targetResourceName value to set
     * @return the ResourceSettings object itself.
     */
    public ResourceSettings withTargetResourceName(String targetResourceName) {
        this.targetResourceName = targetResourceName;
        return this;
    }

}
