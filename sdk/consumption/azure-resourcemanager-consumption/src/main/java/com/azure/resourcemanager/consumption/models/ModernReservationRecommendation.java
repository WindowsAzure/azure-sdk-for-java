// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.fluent.models.ReservationRecommendationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** Modern reservation recommendation. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("modern")
@JsonFlatten
@Immutable
public class ModernReservationRecommendation extends ReservationRecommendationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ModernReservationRecommendation.class);

    /*
     * Resource eTag.
     */
    @JsonProperty(value = "eTag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource Location.
     */
    @JsonProperty(value = "properties.location", access = JsonProperty.Access.WRITE_ONLY)
    private String locationPropertiesLocation;

    /*
     * The number of days of usage to look back for recommendation.
     */
    @JsonProperty(value = "properties.lookBackPeriod", access = JsonProperty.Access.WRITE_ONLY)
    private Integer lookBackPeriod;

    /*
     * The instance Flexibility Ratio.
     */
    @JsonProperty(value = "properties.instanceFlexibilityRatio", access = JsonProperty.Access.WRITE_ONLY)
    private Float instanceFlexibilityRatio;

    /*
     * The instance Flexibility Group.
     */
    @JsonProperty(value = "properties.instanceFlexibilityGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceFlexibilityGroup;

    /*
     * The normalized Size.
     */
    @JsonProperty(value = "properties.normalizedSize", access = JsonProperty.Access.WRITE_ONLY)
    private String normalizedSize;

    /*
     * The recommended Quantity Normalized.
     */
    @JsonProperty(value = "properties.recommendedQuantityNormalized", access = JsonProperty.Access.WRITE_ONLY)
    private Float recommendedQuantityNormalized;

    /*
     * The meter id (GUID)
     */
    @JsonProperty(value = "properties.meterId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID meterId;

    /*
     * RI recommendations in one or three year terms.
     */
    @JsonProperty(value = "properties.term", access = JsonProperty.Access.WRITE_ONLY)
    private String term;

    /*
     * The total amount of cost without reserved instances.
     */
    @JsonProperty(value = "properties.costWithNoReservedInstances", access = JsonProperty.Access.WRITE_ONLY)
    private Amount costWithNoReservedInstances;

    /*
     * Recommended quality for reserved instances.
     */
    @JsonProperty(value = "properties.recommendedQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal recommendedQuantity;

    /*
     * The total amount of cost with reserved instances.
     */
    @JsonProperty(value = "properties.totalCostWithReservedInstances", access = JsonProperty.Access.WRITE_ONLY)
    private Amount totalCostWithReservedInstances;

    /*
     * Total estimated savings with reserved instances.
     */
    @JsonProperty(value = "properties.netSavings", access = JsonProperty.Access.WRITE_ONLY)
    private Amount netSavings;

    /*
     * The usage date for looking back.
     */
    @JsonProperty(value = "properties.firstUsageDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime firstUsageDate;

    /*
     * Shared or single recommendation.
     */
    @JsonProperty(value = "properties.scope", access = JsonProperty.Access.WRITE_ONLY)
    private String scope;

    /*
     * List of sku properties
     */
    @JsonProperty(value = "properties.skuProperties", access = JsonProperty.Access.WRITE_ONLY)
    private List<SkuProperty> skuProperties;

    /*
     * This is the ARM Sku name.
     */
    @JsonProperty(value = "properties.skuName", access = JsonProperty.Access.WRITE_ONLY)
    private String skuName;

    /*
     * The Azure resource type.
     */
    @JsonProperty(value = "properties.resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /*
     * The Azure subscription ID.
     */
    @JsonProperty(value = "properties.subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /**
     * Get the etag property: Resource eTag.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the locationPropertiesLocation property: Resource Location.
     *
     * @return the locationPropertiesLocation value.
     */
    public String locationPropertiesLocation() {
        return this.locationPropertiesLocation;
    }

    /**
     * Get the lookBackPeriod property: The number of days of usage to look back for recommendation.
     *
     * @return the lookBackPeriod value.
     */
    public Integer lookBackPeriod() {
        return this.lookBackPeriod;
    }

    /**
     * Get the instanceFlexibilityRatio property: The instance Flexibility Ratio.
     *
     * @return the instanceFlexibilityRatio value.
     */
    public Float instanceFlexibilityRatio() {
        return this.instanceFlexibilityRatio;
    }

    /**
     * Get the instanceFlexibilityGroup property: The instance Flexibility Group.
     *
     * @return the instanceFlexibilityGroup value.
     */
    public String instanceFlexibilityGroup() {
        return this.instanceFlexibilityGroup;
    }

    /**
     * Get the normalizedSize property: The normalized Size.
     *
     * @return the normalizedSize value.
     */
    public String normalizedSize() {
        return this.normalizedSize;
    }

    /**
     * Get the recommendedQuantityNormalized property: The recommended Quantity Normalized.
     *
     * @return the recommendedQuantityNormalized value.
     */
    public Float recommendedQuantityNormalized() {
        return this.recommendedQuantityNormalized;
    }

    /**
     * Get the meterId property: The meter id (GUID).
     *
     * @return the meterId value.
     */
    public UUID meterId() {
        return this.meterId;
    }

    /**
     * Get the term property: RI recommendations in one or three year terms.
     *
     * @return the term value.
     */
    public String term() {
        return this.term;
    }

    /**
     * Get the costWithNoReservedInstances property: The total amount of cost without reserved instances.
     *
     * @return the costWithNoReservedInstances value.
     */
    public Amount costWithNoReservedInstances() {
        return this.costWithNoReservedInstances;
    }

    /**
     * Get the recommendedQuantity property: Recommended quality for reserved instances.
     *
     * @return the recommendedQuantity value.
     */
    public BigDecimal recommendedQuantity() {
        return this.recommendedQuantity;
    }

    /**
     * Get the totalCostWithReservedInstances property: The total amount of cost with reserved instances.
     *
     * @return the totalCostWithReservedInstances value.
     */
    public Amount totalCostWithReservedInstances() {
        return this.totalCostWithReservedInstances;
    }

    /**
     * Get the netSavings property: Total estimated savings with reserved instances.
     *
     * @return the netSavings value.
     */
    public Amount netSavings() {
        return this.netSavings;
    }

    /**
     * Get the firstUsageDate property: The usage date for looking back.
     *
     * @return the firstUsageDate value.
     */
    public OffsetDateTime firstUsageDate() {
        return this.firstUsageDate;
    }

    /**
     * Get the scope property: Shared or single recommendation.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Get the skuProperties property: List of sku properties.
     *
     * @return the skuProperties value.
     */
    public List<SkuProperty> skuProperties() {
        return this.skuProperties;
    }

    /**
     * Get the skuName property: This is the ARM Sku name.
     *
     * @return the skuName value.
     */
    public String skuName() {
        return this.skuName;
    }

    /**
     * Get the resourceType property: The Azure resource type.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the subscriptionId property: The Azure subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (costWithNoReservedInstances() != null) {
            costWithNoReservedInstances().validate();
        }
        if (totalCostWithReservedInstances() != null) {
            totalCostWithReservedInstances().validate();
        }
        if (netSavings() != null) {
            netSavings().validate();
        }
        if (skuProperties() != null) {
            skuProperties().forEach(e -> e.validate());
        }
    }
}
