// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The properties that are associated with an Azure Synapse output. */
@Immutable
public final class AzureSynapseOutputDataSourceProperties extends AzureSynapseDataSourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureSynapseOutputDataSourceProperties.class);

    /** {@inheritDoc} */
    @Override
    public AzureSynapseOutputDataSourceProperties withServer(String server) {
        super.withServer(server);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSynapseOutputDataSourceProperties withDatabase(String database) {
        super.withDatabase(database);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSynapseOutputDataSourceProperties withTable(String table) {
        super.withTable(table);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSynapseOutputDataSourceProperties withUser(String user) {
        super.withUser(user);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSynapseOutputDataSourceProperties withPassword(String password) {
        super.withPassword(password);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
