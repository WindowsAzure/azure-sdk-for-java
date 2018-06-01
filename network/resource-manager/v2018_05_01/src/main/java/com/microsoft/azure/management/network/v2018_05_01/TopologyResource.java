/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The network resource topology information for the given resource group.
 */
public class TopologyResource {
    /**
     * Name of the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * ID of the resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Holds the associations the resource has with other resources in the
     * resource group.
     */
    @JsonProperty(value = "associations")
    private List<TopologyAssociation> associations;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the TopologyResource object itself.
     */
    public TopologyResource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the TopologyResource object itself.
     */
    public TopologyResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the TopologyResource object itself.
     */
    public TopologyResource withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the associations value.
     *
     * @return the associations value
     */
    public List<TopologyAssociation> associations() {
        return this.associations;
    }

    /**
     * Set the associations value.
     *
     * @param associations the associations value to set
     * @return the TopologyResource object itself.
     */
    public TopologyResource withAssociations(List<TopologyAssociation> associations) {
        this.associations = associations;
        return this;
    }

}
