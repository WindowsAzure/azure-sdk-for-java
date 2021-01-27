/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RestorableMongodbDatabasePropertiesResource model.
 */
public class RestorableMongodbDatabasePropertiesResource {
    /**
     * A system generated property. A unique identifier.
     */
    @JsonProperty(value = "_rid", access = JsonProperty.Access.WRITE_ONLY)
    private String _rid;

    /**
     * The operation type of this database event. Possible values include:
     * 'Create', 'Replace', 'Delete', 'SystemOperation'.
     */
    @JsonProperty(value = "operationType", access = JsonProperty.Access.WRITE_ONLY)
    private OperationType operationType;

    /**
     * The timestamp of this database event.
     */
    @JsonProperty(value = "eventTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String eventTimestamp;

    /**
     * The name of this restorable MongoDB database.
     */
    @JsonProperty(value = "ownerId", access = JsonProperty.Access.WRITE_ONLY)
    private String ownerId;

    /**
     * The resource Id of this restorable MongoDB database.
     */
    @JsonProperty(value = "ownerResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String ownerResourceId;

    /**
     * Get a system generated property. A unique identifier.
     *
     * @return the _rid value
     */
    public String _rid() {
        return this._rid;
    }

    /**
     * Get the operation type of this database event. Possible values include: 'Create', 'Replace', 'Delete', 'SystemOperation'.
     *
     * @return the operationType value
     */
    public OperationType operationType() {
        return this.operationType;
    }

    /**
     * Get the timestamp of this database event.
     *
     * @return the eventTimestamp value
     */
    public String eventTimestamp() {
        return this.eventTimestamp;
    }

    /**
     * Get the name of this restorable MongoDB database.
     *
     * @return the ownerId value
     */
    public String ownerId() {
        return this.ownerId;
    }

    /**
     * Get the resource Id of this restorable MongoDB database.
     *
     * @return the ownerResourceId value
     */
    public String ownerResourceId() {
        return this.ownerResourceId;
    }

}
