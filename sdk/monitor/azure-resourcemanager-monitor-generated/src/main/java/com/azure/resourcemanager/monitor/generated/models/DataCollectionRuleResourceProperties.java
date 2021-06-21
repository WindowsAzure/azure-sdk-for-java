// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

/** Resource properties. */
@Immutable
public final class DataCollectionRuleResourceProperties extends DataCollectionRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataCollectionRuleResourceProperties.class);

    /** {@inheritDoc} */
    @Override
    public DataCollectionRuleResourceProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionRuleResourceProperties withDataSources(DataCollectionRuleDataSources dataSources) {
        super.withDataSources(dataSources);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionRuleResourceProperties withDestinations(DataCollectionRuleDestinations destinations) {
        super.withDestinations(destinations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionRuleResourceProperties withDataFlows(List<DataFlow> dataFlows) {
        super.withDataFlows(dataFlows);
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
