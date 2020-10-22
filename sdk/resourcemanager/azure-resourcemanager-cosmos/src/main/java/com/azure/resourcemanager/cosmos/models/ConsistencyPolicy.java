// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The consistency policy for the Cosmos DB database account. */
@Fluent
public final class ConsistencyPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConsistencyPolicy.class);

    /*
     * The default consistency level and configuration settings of the Cosmos
     * DB account.
     */
    @JsonProperty(value = "defaultConsistencyLevel", required = true)
    private DefaultConsistencyLevel defaultConsistencyLevel;

    /*
     * When used with the Bounded Staleness consistency level, this value
     * represents the number of stale requests tolerated. Accepted range for
     * this value is 1 – 2,147,483,647. Required when defaultConsistencyPolicy
     * is set to 'BoundedStaleness'.
     */
    @JsonProperty(value = "maxStalenessPrefix")
    private Long maxStalenessPrefix;

    /*
     * When used with the Bounded Staleness consistency level, this value
     * represents the time amount of staleness (in seconds) tolerated. Accepted
     * range for this value is 5 - 86400. Required when
     * defaultConsistencyPolicy is set to 'BoundedStaleness'.
     */
    @JsonProperty(value = "maxIntervalInSeconds")
    private Integer maxIntervalInSeconds;

    /**
     * Get the defaultConsistencyLevel property: The default consistency level and configuration settings of the Cosmos
     * DB account.
     *
     * @return the defaultConsistencyLevel value.
     */
    public DefaultConsistencyLevel defaultConsistencyLevel() {
        return this.defaultConsistencyLevel;
    }

    /**
     * Set the defaultConsistencyLevel property: The default consistency level and configuration settings of the Cosmos
     * DB account.
     *
     * @param defaultConsistencyLevel the defaultConsistencyLevel value to set.
     * @return the ConsistencyPolicy object itself.
     */
    public ConsistencyPolicy withDefaultConsistencyLevel(DefaultConsistencyLevel defaultConsistencyLevel) {
        this.defaultConsistencyLevel = defaultConsistencyLevel;
        return this;
    }

    /**
     * Get the maxStalenessPrefix property: When used with the Bounded Staleness consistency level, this value
     * represents the number of stale requests tolerated. Accepted range for this value is 1 – 2,147,483,647. Required
     * when defaultConsistencyPolicy is set to 'BoundedStaleness'.
     *
     * @return the maxStalenessPrefix value.
     */
    public Long maxStalenessPrefix() {
        return this.maxStalenessPrefix;
    }

    /**
     * Set the maxStalenessPrefix property: When used with the Bounded Staleness consistency level, this value
     * represents the number of stale requests tolerated. Accepted range for this value is 1 – 2,147,483,647. Required
     * when defaultConsistencyPolicy is set to 'BoundedStaleness'.
     *
     * @param maxStalenessPrefix the maxStalenessPrefix value to set.
     * @return the ConsistencyPolicy object itself.
     */
    public ConsistencyPolicy withMaxStalenessPrefix(Long maxStalenessPrefix) {
        this.maxStalenessPrefix = maxStalenessPrefix;
        return this;
    }

    /**
     * Get the maxIntervalInSeconds property: When used with the Bounded Staleness consistency level, this value
     * represents the time amount of staleness (in seconds) tolerated. Accepted range for this value is 5 - 86400.
     * Required when defaultConsistencyPolicy is set to 'BoundedStaleness'.
     *
     * @return the maxIntervalInSeconds value.
     */
    public Integer maxIntervalInSeconds() {
        return this.maxIntervalInSeconds;
    }

    /**
     * Set the maxIntervalInSeconds property: When used with the Bounded Staleness consistency level, this value
     * represents the time amount of staleness (in seconds) tolerated. Accepted range for this value is 5 - 86400.
     * Required when defaultConsistencyPolicy is set to 'BoundedStaleness'.
     *
     * @param maxIntervalInSeconds the maxIntervalInSeconds value to set.
     * @return the ConsistencyPolicy object itself.
     */
    public ConsistencyPolicy withMaxIntervalInSeconds(Integer maxIntervalInSeconds) {
        this.maxIntervalInSeconds = maxIntervalInSeconds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (defaultConsistencyLevel() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property defaultConsistencyLevel in model ConsistencyPolicy"));
        }
    }
}
