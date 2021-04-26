// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devtestlabs.models.GalleryImageReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** A gallery image. */
@JsonFlatten
@Fluent
public class GalleryImageInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryImageInner.class);

    /*
     * The author of the gallery image.
     */
    @JsonProperty(value = "properties.author")
    private String author;

    /*
     * The creation date of the gallery image.
     */
    @JsonProperty(value = "properties.createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDate;

    /*
     * The description of the gallery image.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The image reference of the gallery image.
     */
    @JsonProperty(value = "properties.imageReference")
    private GalleryImageReference imageReference;

    /*
     * The icon of the gallery image.
     */
    @JsonProperty(value = "properties.icon")
    private String icon;

    /*
     * Indicates whether this gallery image is enabled.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /*
     * The third party plan that applies to this image
     */
    @JsonProperty(value = "properties.planId")
    private String planId;

    /*
     * Indicates if the plan has been authorized for programmatic deployment.
     */
    @JsonProperty(value = "properties.isPlanAuthorized")
    private Boolean isPlanAuthorized;

    /**
     * Get the author property: The author of the gallery image.
     *
     * @return the author value.
     */
    public String author() {
        return this.author;
    }

    /**
     * Set the author property: The author of the gallery image.
     *
     * @param author the author value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * Get the createdDate property: The creation date of the gallery image.
     *
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get the description property: The description of the gallery image.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the gallery image.
     *
     * @param description the description value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the imageReference property: The image reference of the gallery image.
     *
     * @return the imageReference value.
     */
    public GalleryImageReference imageReference() {
        return this.imageReference;
    }

    /**
     * Set the imageReference property: The image reference of the gallery image.
     *
     * @param imageReference the imageReference value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withImageReference(GalleryImageReference imageReference) {
        this.imageReference = imageReference;
        return this;
    }

    /**
     * Get the icon property: The icon of the gallery image.
     *
     * @return the icon value.
     */
    public String icon() {
        return this.icon;
    }

    /**
     * Set the icon property: The icon of the gallery image.
     *
     * @param icon the icon value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether this gallery image is enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether this gallery image is enabled.
     *
     * @param enabled the enabled value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the planId property: The third party plan that applies to this image.
     *
     * @return the planId value.
     */
    public String planId() {
        return this.planId;
    }

    /**
     * Set the planId property: The third party plan that applies to this image.
     *
     * @param planId the planId value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * Get the isPlanAuthorized property: Indicates if the plan has been authorized for programmatic deployment.
     *
     * @return the isPlanAuthorized value.
     */
    public Boolean isPlanAuthorized() {
        return this.isPlanAuthorized;
    }

    /**
     * Set the isPlanAuthorized property: Indicates if the plan has been authorized for programmatic deployment.
     *
     * @param isPlanAuthorized the isPlanAuthorized value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withIsPlanAuthorized(Boolean isPlanAuthorized) {
        this.isPlanAuthorized = isPlanAuthorized;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryImageInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryImageInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (imageReference() != null) {
            imageReference().validate();
        }
    }
}
