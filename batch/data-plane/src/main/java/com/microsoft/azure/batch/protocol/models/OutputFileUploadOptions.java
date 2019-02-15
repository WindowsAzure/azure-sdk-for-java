// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details about an output file upload operation, including under what
 * conditions to perform the upload.
 */
public class OutputFileUploadOptions {
    /**
     * The conditions under which the task output file or set of files should
     * be uploaded.
     * The default is taskcompletion. Possible values include: 'taskSuccess',
     * 'taskFailure', 'taskCompletion'.
     */
    @JsonProperty(value = "uploadCondition", required = true)
    private OutputFileUploadCondition uploadCondition;

    /**
     * Get the default is taskcompletion. Possible values include: 'taskSuccess', 'taskFailure', 'taskCompletion'.
     *
     * @return the uploadCondition value
     */
    public OutputFileUploadCondition uploadCondition() {
        return this.uploadCondition;
    }

    /**
     * Set the default is taskcompletion. Possible values include: 'taskSuccess', 'taskFailure', 'taskCompletion'.
     *
     * @param uploadCondition the uploadCondition value to set
     * @return the OutputFileUploadOptions object itself.
     */
    public OutputFileUploadOptions withUploadCondition(OutputFileUploadCondition uploadCondition) {
        this.uploadCondition = uploadCondition;
        return this;
    }

}
