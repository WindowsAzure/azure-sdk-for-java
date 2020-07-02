/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The alias type.
 */
public class AliasType {
    /**
     * The alias name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The paths for an alias.
     */
    @JsonProperty(value = "paths")
    private List<AliasPathType> paths;

    /**
     * Get the alias name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the alias name.
     *
     * @param name the name value to set
     * @return the AliasType object itself.
     */
    public AliasType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the paths for an alias.
     *
     * @return the paths value
     */
    public List<AliasPathType> paths() {
        return this.paths;
    }

    /**
     * Set the paths for an alias.
     *
     * @param paths the paths value to set
     * @return the AliasType object itself.
     */
    public AliasType withPaths(List<AliasPathType> paths) {
        this.paths = paths;
        return this;
    }

}
