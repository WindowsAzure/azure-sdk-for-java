/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Collection of knowledgebases owned by a user.
 */
public class KnowledgebasesDTO {
    /**
     * Collection of knowledgebase records.
     */
    @JsonProperty(value = "knowledgebases")
    private List<KnowledgebaseDTO> knowledgebases;

    /**
     * Get the knowledgebases value.
     *
     * @return the knowledgebases value
     */
    public List<KnowledgebaseDTO> knowledgebases() {
        return this.knowledgebases;
    }

    /**
     * Set the knowledgebases value.
     *
     * @param knowledgebases the knowledgebases value to set
     * @return the KnowledgebasesDTO object itself.
     */
    public KnowledgebasesDTO withKnowledgebases(List<KnowledgebaseDTO> knowledgebases) {
        this.knowledgebases = knowledgebases;
        return this;
    }

}
