/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Workspace patch details.
 */
@JsonFlatten
public class WorkspacePatchInfo {
    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The identity of the workspace.
     */
    @JsonProperty(value = "identity")
    private ManagedIdentity identity;

    /**
     * SQL administrator login password.
     */
    @JsonProperty(value = "properties.sqlAdministratorLoginPassword")
    private String sqlAdministratorLoginPassword;

    /**
     * Resource provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the WorkspacePatchInfo object itself.
     */
    public WorkspacePatchInfo withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity of the workspace.
     *
     * @return the identity value
     */
    public ManagedIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity of the workspace.
     *
     * @param identity the identity value to set
     * @return the WorkspacePatchInfo object itself.
     */
    public WorkspacePatchInfo withIdentity(ManagedIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get sQL administrator login password.
     *
     * @return the sqlAdministratorLoginPassword value
     */
    public String sqlAdministratorLoginPassword() {
        return this.sqlAdministratorLoginPassword;
    }

    /**
     * Set sQL administrator login password.
     *
     * @param sqlAdministratorLoginPassword the sqlAdministratorLoginPassword value to set
     * @return the WorkspacePatchInfo object itself.
     */
    public WorkspacePatchInfo withSqlAdministratorLoginPassword(String sqlAdministratorLoginPassword) {
        this.sqlAdministratorLoginPassword = sqlAdministratorLoginPassword;
        return this;
    }

    /**
     * Get resource provisioning state.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

}
