/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details about target workload during restore operation.
 */
public class TargetRestoreInfo {
    /**
     * Can Overwrite if Target DataBase already exists. Possible values
     * include: 'Invalid', 'FailOnConflict', 'Overwrite'.
     */
    @JsonProperty(value = "overwriteOption")
    private OverwriteOptions overwriteOption;

    /**
     * Resource Id name of the container in which Target DataBase resides.
     */
    @JsonProperty(value = "containerId")
    private String containerId;

    /**
     * Database name InstanceName/DataBaseName for SQL or System/DbName for SAP
     * Hana.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /**
     * Get can Overwrite if Target DataBase already exists. Possible values include: 'Invalid', 'FailOnConflict', 'Overwrite'.
     *
     * @return the overwriteOption value
     */
    public OverwriteOptions overwriteOption() {
        return this.overwriteOption;
    }

    /**
     * Set can Overwrite if Target DataBase already exists. Possible values include: 'Invalid', 'FailOnConflict', 'Overwrite'.
     *
     * @param overwriteOption the overwriteOption value to set
     * @return the TargetRestoreInfo object itself.
     */
    public TargetRestoreInfo withOverwriteOption(OverwriteOptions overwriteOption) {
        this.overwriteOption = overwriteOption;
        return this;
    }

    /**
     * Get resource Id name of the container in which Target DataBase resides.
     *
     * @return the containerId value
     */
    public String containerId() {
        return this.containerId;
    }

    /**
     * Set resource Id name of the container in which Target DataBase resides.
     *
     * @param containerId the containerId value to set
     * @return the TargetRestoreInfo object itself.
     */
    public TargetRestoreInfo withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * Get database name InstanceName/DataBaseName for SQL or System/DbName for SAP Hana.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set database name InstanceName/DataBaseName for SQL or System/DbName for SAP Hana.
     *
     * @param databaseName the databaseName value to set
     * @return the TargetRestoreInfo object itself.
     */
    public TargetRestoreInfo withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

}
