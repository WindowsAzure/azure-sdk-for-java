/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The PredictionQueryResult model.
 */
public class PredictionQueryResult {
    /**
     * The token property.
     */
    @JsonProperty(value = "token", access = JsonProperty.Access.WRITE_ONLY)
    private PredictionQueryToken token;

    /**
     * The results property.
     */
    @JsonProperty(value = "results", access = JsonProperty.Access.WRITE_ONLY)
    private List<StoredImagePrediction> results;

    /**
     * Get the token value.
     *
     * @return the token value
     */
    public PredictionQueryToken token() {
        return this.token;
    }

    /**
     * Get the results value.
     *
     * @return the results value
     */
    public List<StoredImagePrediction> results() {
        return this.results;
    }

}
