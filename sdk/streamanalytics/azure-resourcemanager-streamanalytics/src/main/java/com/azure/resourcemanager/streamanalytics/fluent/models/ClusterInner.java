// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.streamanalytics.models.ClusterProperties;
import com.azure.resourcemanager.streamanalytics.models.ClusterSku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** A Stream Analytics Cluster object. */
@Fluent
public final class ClusterInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterInner.class);

    /*
     * The SKU of the cluster. This determines the size/capacity of the
     * cluster. Required on PUT (CreateOrUpdate) requests.
     */
    @JsonProperty(value = "sku")
    private ClusterSku sku;

    /*
     * The current entity tag for the cluster. This is an opaque string. You
     * can use it to detect whether the resource has changed between requests.
     * You can also use it in the If-Match or If-None-Match headers for write
     * operations for optimistic concurrency.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The properties associated with a Stream Analytics cluster.
     */
    @JsonProperty(value = "properties")
    private ClusterProperties properties;

    /**
     * Get the sku property: The SKU of the cluster. This determines the size/capacity of the cluster. Required on PUT
     * (CreateOrUpdate) requests.
     *
     * @return the sku value.
     */
    public ClusterSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the cluster. This determines the size/capacity of the cluster. Required on PUT
     * (CreateOrUpdate) requests.
     *
     * @param sku the sku value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withSku(ClusterSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the etag property: The current entity tag for the cluster. This is an opaque string. You can use it to detect
     * whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers
     * for write operations for optimistic concurrency.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the properties property: The properties associated with a Stream Analytics cluster.
     *
     * @return the properties value.
     */
    public ClusterProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties associated with a Stream Analytics cluster.
     *
     * @param properties the properties value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withProperties(ClusterProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ClusterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }
}
