/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2017_11_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Base class for migration task input.
 */
public class SqlMigrationTaskInput {
    /**
     * Information for connecting to source.
     */
    @JsonProperty(value = "sourceConnectionInfo", required = true)
    private SqlConnectionInfo sourceConnectionInfo;

    /**
     * Information for connecting to target.
     */
    @JsonProperty(value = "targetConnectionInfo", required = true)
    private SqlConnectionInfo targetConnectionInfo;

    /**
     * Get information for connecting to source.
     *
     * @return the sourceConnectionInfo value
     */
    public SqlConnectionInfo sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Set information for connecting to source.
     *
     * @param sourceConnectionInfo the sourceConnectionInfo value to set
     * @return the SqlMigrationTaskInput object itself.
     */
    public SqlMigrationTaskInput withSourceConnectionInfo(SqlConnectionInfo sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        return this;
    }

    /**
     * Get information for connecting to target.
     *
     * @return the targetConnectionInfo value
     */
    public SqlConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set information for connecting to target.
     *
     * @param targetConnectionInfo the targetConnectionInfo value to set
     * @return the SqlMigrationTaskInput object itself.
     */
    public SqlMigrationTaskInput withTargetConnectionInfo(SqlConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
        return this;
    }

}
