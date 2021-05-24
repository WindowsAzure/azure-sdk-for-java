// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for backup policy. Workload-specific backup policies are derived from this class. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "backupManagementType",
    defaultImpl = ProtectionPolicy.class)
@JsonTypeName("ProtectionPolicy")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureWorkload", value = AzureVmWorkloadProtectionPolicy.class),
    @JsonSubTypes.Type(name = "AzureStorage", value = AzureFileShareProtectionPolicy.class),
    @JsonSubTypes.Type(name = "AzureIaasVM", value = AzureIaaSvmProtectionPolicy.class),
    @JsonSubTypes.Type(name = "AzureSql", value = AzureSqlProtectionPolicy.class),
    @JsonSubTypes.Type(name = "GenericProtectionPolicy", value = GenericProtectionPolicy.class),
    @JsonSubTypes.Type(name = "MAB", value = MabProtectionPolicy.class)
})
@Fluent
public class ProtectionPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProtectionPolicy.class);

    /*
     * Number of items associated with this policy.
     */
    @JsonProperty(value = "protectedItemsCount")
    private Integer protectedItemsCount;

    /**
     * Get the protectedItemsCount property: Number of items associated with this policy.
     *
     * @return the protectedItemsCount value.
     */
    public Integer protectedItemsCount() {
        return this.protectedItemsCount;
    }

    /**
     * Set the protectedItemsCount property: Number of items associated with this policy.
     *
     * @param protectedItemsCount the protectedItemsCount value to set.
     * @return the ProtectionPolicy object itself.
     */
    public ProtectionPolicy withProtectedItemsCount(Integer protectedItemsCount) {
        this.protectedItemsCount = protectedItemsCount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
