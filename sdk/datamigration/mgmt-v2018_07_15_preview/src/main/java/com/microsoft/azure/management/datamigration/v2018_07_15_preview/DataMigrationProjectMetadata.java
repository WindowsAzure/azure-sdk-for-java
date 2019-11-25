/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Common metadata for migration projects.
 */
public class DataMigrationProjectMetadata {
    /**
     * Source server name.
     */
    @JsonProperty(value = "sourceServerName", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerName;

    /**
     * Source server port number.
     */
    @JsonProperty(value = "sourceServerPort", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerPort;

    /**
     * Source username.
     */
    @JsonProperty(value = "sourceUsername", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceUsername;

    /**
     * Target server name.
     */
    @JsonProperty(value = "targetServerName", access = JsonProperty.Access.WRITE_ONLY)
    private String targetServerName;

    /**
     * Target username.
     */
    @JsonProperty(value = "targetUsername", access = JsonProperty.Access.WRITE_ONLY)
    private String targetUsername;

    /**
     * Target database name.
     */
    @JsonProperty(value = "targetDbName", access = JsonProperty.Access.WRITE_ONLY)
    private String targetDbName;

    /**
     * Whether target connection is Windows authentication.
     */
    @JsonProperty(value = "targetUsingWinAuth", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean targetUsingWinAuth;

    /**
     * List of tables selected for migration.
     */
    @JsonProperty(value = "selectedMigrationTables", access = JsonProperty.Access.WRITE_ONLY)
    private List<MigrationTableMetadata> selectedMigrationTables;

    /**
     * Get source server name.
     *
     * @return the sourceServerName value
     */
    public String sourceServerName() {
        return this.sourceServerName;
    }

    /**
     * Get source server port number.
     *
     * @return the sourceServerPort value
     */
    public String sourceServerPort() {
        return this.sourceServerPort;
    }

    /**
     * Get source username.
     *
     * @return the sourceUsername value
     */
    public String sourceUsername() {
        return this.sourceUsername;
    }

    /**
     * Get target server name.
     *
     * @return the targetServerName value
     */
    public String targetServerName() {
        return this.targetServerName;
    }

    /**
     * Get target username.
     *
     * @return the targetUsername value
     */
    public String targetUsername() {
        return this.targetUsername;
    }

    /**
     * Get target database name.
     *
     * @return the targetDbName value
     */
    public String targetDbName() {
        return this.targetDbName;
    }

    /**
     * Get whether target connection is Windows authentication.
     *
     * @return the targetUsingWinAuth value
     */
    public Boolean targetUsingWinAuth() {
        return this.targetUsingWinAuth;
    }

    /**
     * Get list of tables selected for migration.
     *
     * @return the selectedMigrationTables value
     */
    public List<MigrationTableMetadata> selectedMigrationTables() {
        return this.selectedMigrationTables;
    }

}
