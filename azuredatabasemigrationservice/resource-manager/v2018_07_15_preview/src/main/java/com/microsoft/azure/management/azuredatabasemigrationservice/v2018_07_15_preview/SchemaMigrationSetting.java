/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings for migrating schema from source to target.
 */
public class SchemaMigrationSetting {
    /**
     * Option on how to migrate the schema. Possible values include: 'None',
     * 'ExtractFromSource', 'UseStorageFile'.
     */
    @JsonProperty(value = "schemaOption")
    private SchemaMigrationOption schemaOption;

    /**
     * Resource Identifier of a file resource containing the uploaded schema
     * file.
     */
    @JsonProperty(value = "fileId")
    private String fileId;

    /**
     * Get option on how to migrate the schema. Possible values include: 'None', 'ExtractFromSource', 'UseStorageFile'.
     *
     * @return the schemaOption value
     */
    public SchemaMigrationOption schemaOption() {
        return this.schemaOption;
    }

    /**
     * Set option on how to migrate the schema. Possible values include: 'None', 'ExtractFromSource', 'UseStorageFile'.
     *
     * @param schemaOption the schemaOption value to set
     * @return the SchemaMigrationSetting object itself.
     */
    public SchemaMigrationSetting withSchemaOption(SchemaMigrationOption schemaOption) {
        this.schemaOption = schemaOption;
        return this;
    }

    /**
     * Get resource Identifier of a file resource containing the uploaded schema file.
     *
     * @return the fileId value
     */
    public String fileId() {
        return this.fileId;
    }

    /**
     * Set resource Identifier of a file resource containing the uploaded schema file.
     *
     * @param fileId the fileId value to set
     * @return the SchemaMigrationSetting object itself.
     */
    public SchemaMigrationSetting withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

}
