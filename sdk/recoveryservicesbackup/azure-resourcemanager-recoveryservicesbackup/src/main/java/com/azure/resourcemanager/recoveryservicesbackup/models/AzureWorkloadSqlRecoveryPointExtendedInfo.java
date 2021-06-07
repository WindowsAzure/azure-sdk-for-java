// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Extended info class details. */
@Fluent
public final class AzureWorkloadSqlRecoveryPointExtendedInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureWorkloadSqlRecoveryPointExtendedInfo.class);

    /*
     * UTC time at which data directory info was captured
     */
    @JsonProperty(value = "dataDirectoryTimeInUTC")
    private OffsetDateTime dataDirectoryTimeInUtc;

    /*
     * List of data directory paths during restore operation.
     */
    @JsonProperty(value = "dataDirectoryPaths")
    private List<SqlDataDirectory> dataDirectoryPaths;

    /**
     * Get the dataDirectoryTimeInUtc property: UTC time at which data directory info was captured.
     *
     * @return the dataDirectoryTimeInUtc value.
     */
    public OffsetDateTime dataDirectoryTimeInUtc() {
        return this.dataDirectoryTimeInUtc;
    }

    /**
     * Set the dataDirectoryTimeInUtc property: UTC time at which data directory info was captured.
     *
     * @param dataDirectoryTimeInUtc the dataDirectoryTimeInUtc value to set.
     * @return the AzureWorkloadSqlRecoveryPointExtendedInfo object itself.
     */
    public AzureWorkloadSqlRecoveryPointExtendedInfo withDataDirectoryTimeInUtc(OffsetDateTime dataDirectoryTimeInUtc) {
        this.dataDirectoryTimeInUtc = dataDirectoryTimeInUtc;
        return this;
    }

    /**
     * Get the dataDirectoryPaths property: List of data directory paths during restore operation.
     *
     * @return the dataDirectoryPaths value.
     */
    public List<SqlDataDirectory> dataDirectoryPaths() {
        return this.dataDirectoryPaths;
    }

    /**
     * Set the dataDirectoryPaths property: List of data directory paths during restore operation.
     *
     * @param dataDirectoryPaths the dataDirectoryPaths value to set.
     * @return the AzureWorkloadSqlRecoveryPointExtendedInfo object itself.
     */
    public AzureWorkloadSqlRecoveryPointExtendedInfo withDataDirectoryPaths(List<SqlDataDirectory> dataDirectoryPaths) {
        this.dataDirectoryPaths = dataDirectoryPaths;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataDirectoryPaths() != null) {
            dataDirectoryPaths().forEach(e -> e.validate());
        }
    }
}
