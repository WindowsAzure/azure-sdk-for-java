/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.imagesearch;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines a list of previously recognized entities.
 */
public class RecognizedEntitiesModule {
    /**
     * A list of recognized entities.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<RecognizedEntityGroup> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<RecognizedEntityGroup> value() {
        return this.value;
    }

}
