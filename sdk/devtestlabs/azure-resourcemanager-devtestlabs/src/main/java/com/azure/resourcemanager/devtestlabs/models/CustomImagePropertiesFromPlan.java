// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties for plan on a custom image. */
@Fluent
public final class CustomImagePropertiesFromPlan {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomImagePropertiesFromPlan.class);

    /*
     * The id of the plan, equivalent to name of the plan
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The publisher for the plan from the marketplace image the custom image
     * is derived from
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /*
     * The offer for the plan from the marketplace image the custom image is
     * derived from
     */
    @JsonProperty(value = "offer")
    private String offer;

    /**
     * Get the id property: The id of the plan, equivalent to name of the plan.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The id of the plan, equivalent to name of the plan.
     *
     * @param id the id value to set.
     * @return the CustomImagePropertiesFromPlan object itself.
     */
    public CustomImagePropertiesFromPlan withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the publisher property: The publisher for the plan from the marketplace image the custom image is derived
     * from.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The publisher for the plan from the marketplace image the custom image is derived
     * from.
     *
     * @param publisher the publisher value to set.
     * @return the CustomImagePropertiesFromPlan object itself.
     */
    public CustomImagePropertiesFromPlan withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the offer property: The offer for the plan from the marketplace image the custom image is derived from.
     *
     * @return the offer value.
     */
    public String offer() {
        return this.offer;
    }

    /**
     * Set the offer property: The offer for the plan from the marketplace image the custom image is derived from.
     *
     * @param offer the offer value to set.
     * @return the CustomImagePropertiesFromPlan object itself.
     */
    public CustomImagePropertiesFromPlan withOffer(String offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
