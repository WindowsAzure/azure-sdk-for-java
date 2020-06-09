/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object model for adding a batch of sublists to an existing list entity.
 */
public class ClosedListModelPatchObject {
    /**
     * Sublists to add.
     */
    @JsonProperty(value = "subLists")
    private List<WordListObject> subLists;

    /**
     * Get the subLists value.
     *
     * @return the subLists value
     */
    public List<WordListObject> subLists() {
        return this.subLists;
    }

    /**
     * Set the subLists value.
     *
     * @param subLists the subLists value to set
     * @return the ClosedListModelPatchObject object itself.
     */
    public ClosedListModelPatchObject withSubLists(List<WordListObject> subLists) {
        this.subLists = subLists;
        return this;
    }

}
