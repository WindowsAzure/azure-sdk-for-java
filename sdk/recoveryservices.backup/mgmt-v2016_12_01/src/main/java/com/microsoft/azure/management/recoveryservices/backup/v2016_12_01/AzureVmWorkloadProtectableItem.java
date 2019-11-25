/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Azure VM workload-specific protectable item.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectableItemType")
@JsonTypeName("AzureVmWorkloadProtectableItem")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SAPHanaDatabase", value = AzureVmWorkloadSAPHanaDatabaseProtectableItem.class),
    @JsonSubTypes.Type(name = "SAPHanaSystem", value = AzureVmWorkloadSAPHanaSystemProtectableItem.class),
    @JsonSubTypes.Type(name = "SQLAvailabilityGroupContainer", value = AzureVmWorkloadSQLAvailabilityGroupProtectableItem.class),
    @JsonSubTypes.Type(name = "SQLDataBase", value = AzureVmWorkloadSQLDatabaseProtectableItem.class),
    @JsonSubTypes.Type(name = "SQLInstance", value = AzureVmWorkloadSQLInstanceProtectableItem.class)
})
public class AzureVmWorkloadProtectableItem extends WorkloadProtectableItem {
    /**
     * Name for instance or AG.
     */
    @JsonProperty(value = "parentName")
    private String parentName;

    /**
     * Parent Unique Name is added to provide the service formatted URI Name of
     * the Parent
     * Only Applicable for data bases where the parent would be either Instance
     * or a SQL AG.
     */
    @JsonProperty(value = "parentUniqueName")
    private String parentUniqueName;

    /**
     * Host/Cluster Name for instance or AG.
     */
    @JsonProperty(value = "serverName")
    private String serverName;

    /**
     * Indicates if protectable item is auto-protectable.
     */
    @JsonProperty(value = "isAutoProtectable")
    private Boolean isAutoProtectable;

    /**
     * For instance or AG, indicates number of DB's present.
     */
    @JsonProperty(value = "subinquireditemcount")
    private Integer subinquireditemcount;

    /**
     * For instance or AG, indicates number of DB's to be protected.
     */
    @JsonProperty(value = "subprotectableitemcount")
    private Integer subprotectableitemcount;

    /**
     * Pre-backup validation for protectable objects.
     */
    @JsonProperty(value = "prebackupvalidation")
    private PreBackupValidation prebackupvalidation;

    /**
     * Get name for instance or AG.
     *
     * @return the parentName value
     */
    public String parentName() {
        return this.parentName;
    }

    /**
     * Set name for instance or AG.
     *
     * @param parentName the parentName value to set
     * @return the AzureVmWorkloadProtectableItem object itself.
     */
    public AzureVmWorkloadProtectableItem withParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }

    /**
     * Get parent Unique Name is added to provide the service formatted URI Name of the Parent
                 Only Applicable for data bases where the parent would be either Instance or a SQL AG.
     *
     * @return the parentUniqueName value
     */
    public String parentUniqueName() {
        return this.parentUniqueName;
    }

    /**
     * Set parent Unique Name is added to provide the service formatted URI Name of the Parent
                 Only Applicable for data bases where the parent would be either Instance or a SQL AG.
     *
     * @param parentUniqueName the parentUniqueName value to set
     * @return the AzureVmWorkloadProtectableItem object itself.
     */
    public AzureVmWorkloadProtectableItem withParentUniqueName(String parentUniqueName) {
        this.parentUniqueName = parentUniqueName;
        return this;
    }

    /**
     * Get host/Cluster Name for instance or AG.
     *
     * @return the serverName value
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Set host/Cluster Name for instance or AG.
     *
     * @param serverName the serverName value to set
     * @return the AzureVmWorkloadProtectableItem object itself.
     */
    public AzureVmWorkloadProtectableItem withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get indicates if protectable item is auto-protectable.
     *
     * @return the isAutoProtectable value
     */
    public Boolean isAutoProtectable() {
        return this.isAutoProtectable;
    }

    /**
     * Set indicates if protectable item is auto-protectable.
     *
     * @param isAutoProtectable the isAutoProtectable value to set
     * @return the AzureVmWorkloadProtectableItem object itself.
     */
    public AzureVmWorkloadProtectableItem withIsAutoProtectable(Boolean isAutoProtectable) {
        this.isAutoProtectable = isAutoProtectable;
        return this;
    }

    /**
     * Get for instance or AG, indicates number of DB's present.
     *
     * @return the subinquireditemcount value
     */
    public Integer subinquireditemcount() {
        return this.subinquireditemcount;
    }

    /**
     * Set for instance or AG, indicates number of DB's present.
     *
     * @param subinquireditemcount the subinquireditemcount value to set
     * @return the AzureVmWorkloadProtectableItem object itself.
     */
    public AzureVmWorkloadProtectableItem withSubinquireditemcount(Integer subinquireditemcount) {
        this.subinquireditemcount = subinquireditemcount;
        return this;
    }

    /**
     * Get for instance or AG, indicates number of DB's to be protected.
     *
     * @return the subprotectableitemcount value
     */
    public Integer subprotectableitemcount() {
        return this.subprotectableitemcount;
    }

    /**
     * Set for instance or AG, indicates number of DB's to be protected.
     *
     * @param subprotectableitemcount the subprotectableitemcount value to set
     * @return the AzureVmWorkloadProtectableItem object itself.
     */
    public AzureVmWorkloadProtectableItem withSubprotectableitemcount(Integer subprotectableitemcount) {
        this.subprotectableitemcount = subprotectableitemcount;
        return this;
    }

    /**
     * Get pre-backup validation for protectable objects.
     *
     * @return the prebackupvalidation value
     */
    public PreBackupValidation prebackupvalidation() {
        return this.prebackupvalidation;
    }

    /**
     * Set pre-backup validation for protectable objects.
     *
     * @param prebackupvalidation the prebackupvalidation value to set
     * @return the AzureVmWorkloadProtectableItem object itself.
     */
    public AzureVmWorkloadProtectableItem withPrebackupvalidation(PreBackupValidation prebackupvalidation) {
        this.prebackupvalidation = prebackupvalidation;
        return this;
    }

}
