// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The IndexBatch model. */
@Fluent
public final class IndexBatch {
    /*
     * The actions in the batch.
     */
    @JsonProperty(value = "value", required = true)
    private List<IndexAction> actions;

    /**
     * Get the actions property: The actions in the batch.
     *
     * @return the actions value.
     */
    public List<IndexAction> getActions() {
        return this.actions;
    }

    /**
     * Set the actions property: The actions in the batch.
     *
     * @param actions the actions value to set.
     * @return the IndexBatch object itself.
     */
    public IndexBatch setActions(List<IndexAction> actions) {
        this.actions = actions;
        return this;
    }
}
