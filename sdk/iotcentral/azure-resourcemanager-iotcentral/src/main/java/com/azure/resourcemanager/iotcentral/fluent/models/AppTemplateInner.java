// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iotcentral.models.AppTemplateLocations;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** IoT Central Application Template. */
@Immutable
public final class AppTemplateInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppTemplateInner.class);

    /*
     * The ID of the template.
     */
    @JsonProperty(value = "manifestId", access = JsonProperty.Access.WRITE_ONLY)
    private String manifestId;

    /*
     * The version of the template.
     */
    @JsonProperty(value = "manifestVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String manifestVersion;

    /*
     * The name of the template.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The title of the template.
     */
    @JsonProperty(value = "title", access = JsonProperty.Access.WRITE_ONLY)
    private String title;

    /*
     * The order of the template in the templates list.
     */
    @JsonProperty(value = "order", access = JsonProperty.Access.WRITE_ONLY)
    private Float order;

    /*
     * The description of the template.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * The industry of the template.
     */
    @JsonProperty(value = "industry", access = JsonProperty.Access.WRITE_ONLY)
    private String industry;

    /*
     * A list of locations that support the template.
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<AppTemplateLocations> locations;

    /**
     * Get the manifestId property: The ID of the template.
     *
     * @return the manifestId value.
     */
    public String manifestId() {
        return this.manifestId;
    }

    /**
     * Get the manifestVersion property: The version of the template.
     *
     * @return the manifestVersion value.
     */
    public String manifestVersion() {
        return this.manifestVersion;
    }

    /**
     * Get the name property: The name of the template.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the title property: The title of the template.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Get the order property: The order of the template in the templates list.
     *
     * @return the order value.
     */
    public Float order() {
        return this.order;
    }

    /**
     * Get the description property: The description of the template.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the industry property: The industry of the template.
     *
     * @return the industry value.
     */
    public String industry() {
        return this.industry;
    }

    /**
     * Get the locations property: A list of locations that support the template.
     *
     * @return the locations value.
     */
    public List<AppTemplateLocations> locations() {
        return this.locations;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (locations() != null) {
            locations().forEach(e -> e.validate());
        }
    }
}
