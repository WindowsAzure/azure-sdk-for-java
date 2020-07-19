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

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.ProtectionContainerInner;

/**
 * Container for the workloads running inside Azure Compute or Classic Compute.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "containerType", defaultImpl = AzureWorkloadContainer.class)
@JsonTypeName("AzureWorkloadContainer")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SQLAGWorkLoadContainer", value = AzureSQLAGWorkloadContainerProtectionContainer.class),
    @JsonSubTypes.Type(name = "VMAppContainer", value = AzureVMAppContainerProtectionContainer.class)
})
public class AzureWorkloadContainer extends ProtectionContainerInner {
    /**
     * ARM ID of the virtual machine represented by this Azure Workload
     * Container.
     */
    @JsonProperty(value = "sourceResourceId")
    private String sourceResourceId;

    /**
     * Time stamp when this container was updated.
     */
    @JsonProperty(value = "lastUpdatedTime")
    private DateTime lastUpdatedTime;

    /**
     * Additional details of a workload container.
     */
    @JsonProperty(value = "extendedInfo")
    private AzureWorkloadContainerExtendedInfo extendedInfo;

    /**
     * Workload type for which registration was sent. Possible values include:
     * 'Invalid', 'VM', 'FileFolder', 'AzureSqlDb', 'SQLDB', 'Exchange',
     * 'Sharepoint', 'VMwareVM', 'SystemState', 'Client', 'GenericDataSource',
     * 'SQLDataBase', 'AzureFileShare', 'SAPHanaDatabase', 'SAPAseDatabase'.
     */
    @JsonProperty(value = "workloadType")
    private WorkloadType workloadType;

    /**
     * Re-Do Operation. Possible values include: 'Invalid', 'Register',
     * 'Reregister'.
     */
    @JsonProperty(value = "operationType")
    private OperationType operationType;

    /**
     * Get aRM ID of the virtual machine represented by this Azure Workload Container.
     *
     * @return the sourceResourceId value
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Set aRM ID of the virtual machine represented by this Azure Workload Container.
     *
     * @param sourceResourceId the sourceResourceId value to set
     * @return the AzureWorkloadContainer object itself.
     */
    public AzureWorkloadContainer withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

    /**
     * Get time stamp when this container was updated.
     *
     * @return the lastUpdatedTime value
     */
    public DateTime lastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * Set time stamp when this container was updated.
     *
     * @param lastUpdatedTime the lastUpdatedTime value to set
     * @return the AzureWorkloadContainer object itself.
     */
    public AzureWorkloadContainer withLastUpdatedTime(DateTime lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * Get additional details of a workload container.
     *
     * @return the extendedInfo value
     */
    public AzureWorkloadContainerExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set additional details of a workload container.
     *
     * @param extendedInfo the extendedInfo value to set
     * @return the AzureWorkloadContainer object itself.
     */
    public AzureWorkloadContainer withExtendedInfo(AzureWorkloadContainerExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

    /**
     * Get workload type for which registration was sent. Possible values include: 'Invalid', 'VM', 'FileFolder', 'AzureSqlDb', 'SQLDB', 'Exchange', 'Sharepoint', 'VMwareVM', 'SystemState', 'Client', 'GenericDataSource', 'SQLDataBase', 'AzureFileShare', 'SAPHanaDatabase', 'SAPAseDatabase'.
     *
     * @return the workloadType value
     */
    public WorkloadType workloadType() {
        return this.workloadType;
    }

    /**
     * Set workload type for which registration was sent. Possible values include: 'Invalid', 'VM', 'FileFolder', 'AzureSqlDb', 'SQLDB', 'Exchange', 'Sharepoint', 'VMwareVM', 'SystemState', 'Client', 'GenericDataSource', 'SQLDataBase', 'AzureFileShare', 'SAPHanaDatabase', 'SAPAseDatabase'.
     *
     * @param workloadType the workloadType value to set
     * @return the AzureWorkloadContainer object itself.
     */
    public AzureWorkloadContainer withWorkloadType(WorkloadType workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * Get re-Do Operation. Possible values include: 'Invalid', 'Register', 'Reregister'.
     *
     * @return the operationType value
     */
    public OperationType operationType() {
        return this.operationType;
    }

    /**
     * Set re-Do Operation. Possible values include: 'Invalid', 'Register', 'Reregister'.
     *
     * @param operationType the operationType value to set
     * @return the AzureWorkloadContainer object itself.
     */
    public AzureWorkloadContainer withOperationType(OperationType operationType) {
        this.operationType = operationType;
        return this;
    }

}
