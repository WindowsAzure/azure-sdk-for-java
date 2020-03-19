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
 * List of QnADTO.
 */
public class QnADocumentsDTO {
    /**
     * List of answers.
     */
    @JsonProperty(value = "qnaDocuments")
    private List<QnADTO> qnaDocuments;

    /**
     * Get the qnaDocuments value.
     *
     * @return the qnaDocuments value
     */
    public List<QnADTO> qnaDocuments() {
        return this.qnaDocuments;
    }

    /**
     * Set the qnaDocuments value.
     *
     * @param qnaDocuments the qnaDocuments value to set
     * @return the QnADocumentsDTO object itself.
     */
    public QnADocumentsDTO withQnaDocuments(List<QnADTO> qnaDocuments) {
        this.qnaDocuments = qnaDocuments;
        return this;
    }

}
