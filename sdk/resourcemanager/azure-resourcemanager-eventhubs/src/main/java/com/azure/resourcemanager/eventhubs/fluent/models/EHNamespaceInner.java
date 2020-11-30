// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Single Namespace item in List or Get Operation. */
@JsonFlatten
@Fluent
public class EHNamespaceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EHNamespaceInner.class);

    /*
     * Properties of sku resource
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Provisioning state of the Namespace.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The time the Namespace was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * The time the Namespace was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /*
     * Endpoint you can use to perform Service Bus operations.
     */
    @JsonProperty(value = "properties.serviceBusEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceBusEndpoint;

    /*
     * Identifier for Azure Insights metrics.
     */
    @JsonProperty(value = "properties.metricId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricId;

    /*
     * Value that indicates whether AutoInflate is enabled for eventhub
     * namespace.
     */
    @JsonProperty(value = "properties.isAutoInflateEnabled")
    private Boolean isAutoInflateEnabled;

    /*
     * Upper limit of throughput units when AutoInflate is enabled, value
     * should be within 0 to 20 throughput units. ( '0' if AutoInflateEnabled =
     * true)
     */
    @JsonProperty(value = "properties.maximumThroughputUnits")
    private Integer maximumThroughputUnits;

    /*
     * Value that indicates whether Kafka is enabled for eventhub namespace.
     */
    @JsonProperty(value = "properties.kafkaEnabled")
    private Boolean kafkaEnabled;

    /**
     * Get the sku property: Properties of sku resource.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Properties of sku resource.
     *
     * @param sku the sku value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Namespace.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the createdAt property: The time the Namespace was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: The time the Namespace was updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the serviceBusEndpoint property: Endpoint you can use to perform Service Bus operations.
     *
     * @return the serviceBusEndpoint value.
     */
    public String serviceBusEndpoint() {
        return this.serviceBusEndpoint;
    }

    /**
     * Get the metricId property: Identifier for Azure Insights metrics.
     *
     * @return the metricId value.
     */
    public String metricId() {
        return this.metricId;
    }

    /**
     * Get the isAutoInflateEnabled property: Value that indicates whether AutoInflate is enabled for eventhub
     * namespace.
     *
     * @return the isAutoInflateEnabled value.
     */
    public Boolean isAutoInflateEnabled() {
        return this.isAutoInflateEnabled;
    }

    /**
     * Set the isAutoInflateEnabled property: Value that indicates whether AutoInflate is enabled for eventhub
     * namespace.
     *
     * @param isAutoInflateEnabled the isAutoInflateEnabled value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withIsAutoInflateEnabled(Boolean isAutoInflateEnabled) {
        this.isAutoInflateEnabled = isAutoInflateEnabled;
        return this;
    }

    /**
     * Get the maximumThroughputUnits property: Upper limit of throughput units when AutoInflate is enabled, value
     * should be within 0 to 20 throughput units. ( '0' if AutoInflateEnabled = true).
     *
     * @return the maximumThroughputUnits value.
     */
    public Integer maximumThroughputUnits() {
        return this.maximumThroughputUnits;
    }

    /**
     * Set the maximumThroughputUnits property: Upper limit of throughput units when AutoInflate is enabled, value
     * should be within 0 to 20 throughput units. ( '0' if AutoInflateEnabled = true).
     *
     * @param maximumThroughputUnits the maximumThroughputUnits value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withMaximumThroughputUnits(Integer maximumThroughputUnits) {
        this.maximumThroughputUnits = maximumThroughputUnits;
        return this;
    }

    /**
     * Get the kafkaEnabled property: Value that indicates whether Kafka is enabled for eventhub namespace.
     *
     * @return the kafkaEnabled value.
     */
    public Boolean kafkaEnabled() {
        return this.kafkaEnabled;
    }

    /**
     * Set the kafkaEnabled property: Value that indicates whether Kafka is enabled for eventhub namespace.
     *
     * @param kafkaEnabled the kafkaEnabled value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withKafkaEnabled(Boolean kafkaEnabled) {
        this.kafkaEnabled = kafkaEnabled;
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
    }
}
