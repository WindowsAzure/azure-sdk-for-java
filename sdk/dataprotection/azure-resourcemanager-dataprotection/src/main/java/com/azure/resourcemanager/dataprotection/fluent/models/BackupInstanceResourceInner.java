// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dataprotection.models.Datasource;
import com.azure.resourcemanager.dataprotection.models.DatasourceSet;
import com.azure.resourcemanager.dataprotection.models.DppResource;
import com.azure.resourcemanager.dataprotection.models.PolicyInfo;
import com.azure.resourcemanager.dataprotection.models.ProtectionStatusDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** BackupInstance Resource. */
@JsonFlatten
@Fluent
public class BackupInstanceResourceInner extends DppResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupInstanceResourceInner.class);

    /*
     * Gets or sets the data source information.
     */
    @JsonProperty(value = "properties.dataSourceInfo")
    private Datasource dataSourceInfo;

    /*
     * Gets or sets the data source set information.
     */
    @JsonProperty(value = "properties.dataSourceSetInfo")
    private DatasourceSet dataSourceSetInfo;

    /*
     * The objectType property.
     */
    @JsonProperty(value = "properties.objectType")
    private String objectType;

    /*
     * Gets or sets the policy information.
     */
    @JsonProperty(value = "properties.policyInfo")
    private PolicyInfo policyInfo;

    /*
     * Specifies the protection status of the resource
     */
    @JsonProperty(value = "properties.protectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ProtectionStatusDetails protectionStatus;

    /*
     * Specifies the provisioning state of the resource i.e.
     * provisioning/updating/Succeeded/Failed
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the dataSourceInfo property: Gets or sets the data source information.
     *
     * @return the dataSourceInfo value.
     */
    public Datasource dataSourceInfo() {
        return this.dataSourceInfo;
    }

    /**
     * Set the dataSourceInfo property: Gets or sets the data source information.
     *
     * @param dataSourceInfo the dataSourceInfo value to set.
     * @return the BackupInstanceResourceInner object itself.
     */
    public BackupInstanceResourceInner withDataSourceInfo(Datasource dataSourceInfo) {
        this.dataSourceInfo = dataSourceInfo;
        return this;
    }

    /**
     * Get the dataSourceSetInfo property: Gets or sets the data source set information.
     *
     * @return the dataSourceSetInfo value.
     */
    public DatasourceSet dataSourceSetInfo() {
        return this.dataSourceSetInfo;
    }

    /**
     * Set the dataSourceSetInfo property: Gets or sets the data source set information.
     *
     * @param dataSourceSetInfo the dataSourceSetInfo value to set.
     * @return the BackupInstanceResourceInner object itself.
     */
    public BackupInstanceResourceInner withDataSourceSetInfo(DatasourceSet dataSourceSetInfo) {
        this.dataSourceSetInfo = dataSourceSetInfo;
        return this;
    }

    /**
     * Get the objectType property: The objectType property.
     *
     * @return the objectType value.
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * Set the objectType property: The objectType property.
     *
     * @param objectType the objectType value to set.
     * @return the BackupInstanceResourceInner object itself.
     */
    public BackupInstanceResourceInner withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get the policyInfo property: Gets or sets the policy information.
     *
     * @return the policyInfo value.
     */
    public PolicyInfo policyInfo() {
        return this.policyInfo;
    }

    /**
     * Set the policyInfo property: Gets or sets the policy information.
     *
     * @param policyInfo the policyInfo value to set.
     * @return the BackupInstanceResourceInner object itself.
     */
    public BackupInstanceResourceInner withPolicyInfo(PolicyInfo policyInfo) {
        this.policyInfo = policyInfo;
        return this;
    }

    /**
     * Get the protectionStatus property: Specifies the protection status of the resource.
     *
     * @return the protectionStatus value.
     */
    public ProtectionStatusDetails protectionStatus() {
        return this.protectionStatus;
    }

    /**
     * Get the provisioningState property: Specifies the provisioning state of the resource i.e.
     * provisioning/updating/Succeeded/Failed.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (dataSourceInfo() != null) {
            dataSourceInfo().validate();
        }
        if (dataSourceSetInfo() != null) {
            dataSourceSetInfo().validate();
        }
        if (policyInfo() != null) {
            policyInfo().validate();
        }
        if (protectionStatus() != null) {
            protectionStatus().validate();
        }
    }
}
