/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TextOperationResult model.
 */
public class TextOperationResult {
    /**
     * Status of the text operation. Possible values include: 'Not Started',
     * 'Running', 'Failed', 'Succeeded'.
     */
    @JsonProperty(value = "status")
    private TextOperationStatusCodes status;

    /**
     * The recognitionResult property.
     */
    @JsonProperty(value = "recognitionResult")
    private RecognitionResult recognitionResult;

    /**
     * Get status of the text operation. Possible values include: 'Not Started', 'Running', 'Failed', 'Succeeded'.
     *
     * @return the status value
     */
    public TextOperationStatusCodes status() {
        return this.status;
    }

    /**
     * Set status of the text operation. Possible values include: 'Not Started', 'Running', 'Failed', 'Succeeded'.
     *
     * @param status the status value to set
     * @return the TextOperationResult object itself.
     */
    public TextOperationResult withStatus(TextOperationStatusCodes status) {
        this.status = status;
        return this;
    }

    /**
     * Get the recognitionResult value.
     *
     * @return the recognitionResult value
     */
    public RecognitionResult recognitionResult() {
        return this.recognitionResult;
    }

    /**
     * Set the recognitionResult value.
     *
     * @param recognitionResult the recognitionResult value to set
     * @return the TextOperationResult object itself.
     */
    public TextOperationResult withRecognitionResult(RecognitionResult recognitionResult) {
        this.recognitionResult = recognitionResult;
        return this;
    }

}
