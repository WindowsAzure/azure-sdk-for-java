// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GalleryImageIdentifier model. */
@Fluent
public final class GalleryImageIdentifier {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryImageIdentifier.class);

    /*
     * The name of the gallery Image Definition publisher.
     */
    @JsonProperty(value = "publisher", required = true)
    private String publisher;

    /*
     * The name of the gallery Image Definition offer.
     */
    @JsonProperty(value = "offer", required = true)
    private String offer;

    /*
     * The name of the gallery Image Definition SKU.
     */
    @JsonProperty(value = "sku", required = true)
    private String sku;

    /**
     * Get the publisher property: The name of the gallery Image Definition publisher.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The name of the gallery Image Definition publisher.
     *
     * @param publisher the publisher value to set.
     * @return the GalleryImageIdentifier object itself.
     */
    public GalleryImageIdentifier withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the offer property: The name of the gallery Image Definition offer.
     *
     * @return the offer value.
     */
    public String offer() {
        return this.offer;
    }

    /**
     * Set the offer property: The name of the gallery Image Definition offer.
     *
     * @param offer the offer value to set.
     * @return the GalleryImageIdentifier object itself.
     */
    public GalleryImageIdentifier withOffer(String offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Get the sku property: The name of the gallery Image Definition SKU.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The name of the gallery Image Definition SKU.
     *
     * @param sku the sku value to set.
     * @return the GalleryImageIdentifier object itself.
     */
    public GalleryImageIdentifier withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publisher() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property publisher in model GalleryImageIdentifier"));
        }
        if (offer() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property offer in model GalleryImageIdentifier"));
        }
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model GalleryImageIdentifier"));
        }
    }
}
