// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class representing detector definition. */
@JsonFlatten
@Immutable
public class DetectorDefinitionInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DetectorDefinitionInner.class);

    /*
     * Display name of the detector
     */
    @JsonProperty(value = "properties.displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * Description of the detector
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Detector Rank
     */
    @JsonProperty(value = "properties.rank", access = JsonProperty.Access.WRITE_ONLY)
    private Double rank;

    /*
     * Flag representing whether detector is enabled or not.
     */
    @JsonProperty(value = "properties.isEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isEnabled;

    /**
     * Get the displayName property: Display name of the detector.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the description property: Description of the detector.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the rank property: Detector Rank.
     *
     * @return the rank value.
     */
    public Double rank() {
        return this.rank;
    }

    /**
     * Get the isEnabled property: Flag representing whether detector is enabled or not.
     *
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.isEnabled;
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
