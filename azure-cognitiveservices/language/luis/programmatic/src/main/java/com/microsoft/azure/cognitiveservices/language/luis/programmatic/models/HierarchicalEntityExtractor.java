/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.programmatic.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Hierarchical Entity Extractor.
 */
public class HierarchicalEntityExtractor extends ModelInfo {
    /**
     * List of child entities.
     */
    @JsonProperty(value = "children")
    private List<ChildEntity> children;

    /**
     * Get the children value.
     *
     * @return the children value
     */
    public List<ChildEntity> children() {
        return this.children;
    }

    /**
     * Set the children value.
     *
     * @param children the children value to set
     * @return the HierarchicalEntityExtractor object itself.
     */
    public HierarchicalEntityExtractor withChildren(List<ChildEntity> children) {
        this.children = children;
        return this;
    }

}
