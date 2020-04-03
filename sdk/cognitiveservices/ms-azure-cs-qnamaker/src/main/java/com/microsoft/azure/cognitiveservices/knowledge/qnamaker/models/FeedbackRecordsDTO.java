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
 * Active learning feedback records.
 */
public class FeedbackRecordsDTO {
    /**
     * List of feedback records.
     */
    @JsonProperty(value = "feedbackRecords")
    private List<FeedbackRecordDTO> feedbackRecords;

    /**
     * Get the feedbackRecords value.
     *
     * @return the feedbackRecords value
     */
    public List<FeedbackRecordDTO> feedbackRecords() {
        return this.feedbackRecords;
    }

    /**
     * Set the feedbackRecords value.
     *
     * @param feedbackRecords the feedbackRecords value to set
     * @return the FeedbackRecordsDTO object itself.
     */
    public FeedbackRecordsDTO withFeedbackRecords(List<FeedbackRecordDTO> feedbackRecords) {
        this.feedbackRecords = feedbackRecords;
        return this;
    }

}
