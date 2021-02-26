// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Parameters for DataStore. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = DataStoreParameters.class)
@JsonTypeName("DataStoreParameters")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureOperationalStoreParameters", value = AzureOperationalStoreParameters.class)
})
@Fluent
public class DataStoreParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataStoreParameters.class);

    /*
     * type of datastore; Operational/Vault/Archive
     */
    @JsonProperty(value = "dataStoreType", required = true)
    private DataStoreTypes dataStoreType;

    /**
     * Get the dataStoreType property: type of datastore; Operational/Vault/Archive.
     *
     * @return the dataStoreType value.
     */
    public DataStoreTypes dataStoreType() {
        return this.dataStoreType;
    }

    /**
     * Set the dataStoreType property: type of datastore; Operational/Vault/Archive.
     *
     * @param dataStoreType the dataStoreType value to set.
     * @return the DataStoreParameters object itself.
     */
    public DataStoreParameters withDataStoreType(DataStoreTypes dataStoreType) {
        this.dataStoreType = dataStoreType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataStoreType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dataStoreType in model DataStoreParameters"));
        }
    }
}
