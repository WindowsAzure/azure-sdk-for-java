/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.store.models;

import org.joda.time.DateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Basic Data Lake Store account information, returned on list calls.
 */
@JsonFlatten
public class DataLakeStoreAccountBasic extends Resource {
    /**
     * the provisioning status of the Data Lake Store account. Possible values
     * include: 'Failed', 'Creating', 'Running', 'Succeeded', 'Patching',
     * 'Suspending', 'Resuming', 'Deleting', 'Deleted'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private DataLakeStoreAccountStatus provisioningState;

    /**
     * the state of the Data Lake Store account. Possible values include:
     * 'Active', 'Suspended'.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private DataLakeStoreAccountState state;

    /**
     * the account creation time.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationTime;

    /**
     * the account last modified time.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedTime;

    /**
     * the full CName endpoint for this account.
     */
    @JsonProperty(value = "properties.endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /**
     * The unique identifier associated with this Data Lake Store account.
     */
    @JsonProperty(value = "properties.accountId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID accountId;

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public DataLakeStoreAccountStatus provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public DataLakeStoreAccountState state() {
        return this.state;
    }

    /**
     * Get the creationTime value.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the lastModifiedTime value.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the endpoint value.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Get the accountId value.
     *
     * @return the accountId value
     */
    public UUID accountId() {
        return this.accountId;
    }

}
