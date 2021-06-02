// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Detail information for the data. */
@Immutable
public final class TilesetDetailInfo {
    /*
     * The unique tileset id for the tileset.
     */
    @JsonProperty(value = "tilesetId", access = JsonProperty.Access.WRITE_ONLY)
    private String tilesetId;

    /*
     * The ontology version of this dataset.
     */
    @JsonProperty(value = "ontology", access = JsonProperty.Access.WRITE_ONLY)
    private String ontology;

    /*
     * The unique dataset Id used to create the tileset.
     */
    @JsonProperty(value = "datasetId", access = JsonProperty.Access.WRITE_ONLY)
    private String datasetId;

    /*
     * The description the caller provided when creating the tileset. Maximum
     * length 1024 characters.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * The lowest tile zoom level tile generated for the tileset.
     */
    @JsonProperty(value = "minZoom", access = JsonProperty.Access.WRITE_ONLY)
    private Integer minZoom;

    /*
     * The highest tile zoom level tile generated for the tileset.
     */
    @JsonProperty(value = "maxZoom", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxZoom;

    /*
     * Bounding box which all features of the tileset lay within. Projection
     * used - EPSG:3857. Format : 'minLon, minLat, maxLon, maxLat'.
     */
    @JsonProperty(value = "bbox", access = JsonProperty.Access.WRITE_ONLY)
    private List<Float> bbox;

    /**
     * Get the tilesetId property: The unique tileset id for the tileset.
     *
     * @return the tilesetId value.
     */
    public String getTilesetId() {
        return this.tilesetId;
    }

    /**
     * Get the ontology property: The ontology version of this dataset.
     *
     * @return the ontology value.
     */
    public String getOntology() {
        return this.ontology;
    }

    /**
     * Get the datasetId property: The unique dataset Id used to create the tileset.
     *
     * @return the datasetId value.
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * Get the description property: The description the caller provided when creating the tileset. Maximum length 1024
     * characters.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the minZoom property: The lowest tile zoom level tile generated for the tileset.
     *
     * @return the minZoom value.
     */
    public Integer getMinZoom() {
        return this.minZoom;
    }

    /**
     * Get the maxZoom property: The highest tile zoom level tile generated for the tileset.
     *
     * @return the maxZoom value.
     */
    public Integer getMaxZoom() {
        return this.maxZoom;
    }

    /**
     * Get the bbox property: Bounding box which all features of the tileset lay within. Projection used - EPSG:3857.
     * Format : 'minLon, minLat, maxLon, maxLat'.
     *
     * @return the bbox value.
     */
    public List<Float> getBbox() {
        return this.bbox;
    }
}
