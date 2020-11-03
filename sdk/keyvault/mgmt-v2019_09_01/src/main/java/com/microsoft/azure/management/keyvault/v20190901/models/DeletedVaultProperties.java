/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01.models;

import org.joda.time.DateTime;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the deleted vault.
 */
public class DeletedVaultProperties {
    /**
     * The resource id of the original vault.
     */
    @JsonProperty(value = "vaultId", access = JsonProperty.Access.WRITE_ONLY)
    private String vaultId;

    /**
     * The location of the original vault.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * The deleted date.
     */
    @JsonProperty(value = "deletionDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime deletionDate;

    /**
     * The scheduled purged date.
     */
    @JsonProperty(value = "scheduledPurgeDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime scheduledPurgeDate;

    /**
     * Tags of the original vault.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the resource id of the original vault.
     *
     * @return the vaultId value
     */
    public String vaultId() {
        return this.vaultId;
    }

    /**
     * Get the location of the original vault.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the deleted date.
     *
     * @return the deletionDate value
     */
    public DateTime deletionDate() {
        return this.deletionDate;
    }

    /**
     * Get the scheduled purged date.
     *
     * @return the scheduledPurgeDate value
     */
    public DateTime scheduledPurgeDate() {
        return this.scheduledPurgeDate;
    }

    /**
     * Get tags of the original vault.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

}
