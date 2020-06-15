// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Defines weights on index fields for which matches should boost scoring in
 * search queries.
 */
@Fluent
public final class TextWeights {
    /*
     * The dictionary of per-field weights to boost document scoring. The keys
     * are field names and the values are the weights for each field.
     */
    @JsonProperty(value = "weights", required = true)
    private Map<String, Double> weights;

    /**
     * Get the weights property: The dictionary of per-field weights to boost
     * document scoring. The keys are field names and the values are the
     * weights for each field.
     *
     * @return the weights value.
     */
    public Map<String, Double> getWeights() {
        return this.weights;
    }

    /**
     * Set the weights property: The dictionary of per-field weights to boost
     * document scoring. The keys are field names and the values are the
     * weights for each field.
     *
     * @param weights the weights value to set.
     * @return the TextWeights object itself.
     */
    public TextWeights setWeights(Map<String, Double> weights) {
        this.weights = weights;
        return this;
    }
}
