/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Describes all the properties of a JobOutput.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = JobOutput.class)
@JsonTypeName("JobOutput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.JobOutputAsset", value = JobOutputAsset.class)
})
public class JobOutput {
    /**
     * If the JobOutput is in the Error state, it contains the details of the
     * error.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private JobError error;

    /**
     * Describes the state of the JobOutput. Possible values include:
     * 'Canceled', 'Canceling', 'Error', 'Finished', 'Processing', 'Queued',
     * 'Scheduled'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private JobState state;

    /**
     * If the JobOutput is in a Processing state, this contains the job
     * completion percentage.  The value is an estimate and not intended to be
     * used to predict job completion times. To determine if the JobOutput is
     * complete, use the State property.
     */
    @JsonProperty(value = "progress", access = JsonProperty.Access.WRITE_ONLY)
    private int progress;

    /**
     * Get if the JobOutput is in the Error state, it contains the details of the error.
     *
     * @return the error value
     */
    public JobError error() {
        return this.error;
    }

    /**
     * Get describes the state of the JobOutput. Possible values include: 'Canceled', 'Canceling', 'Error', 'Finished', 'Processing', 'Queued', 'Scheduled'.
     *
     * @return the state value
     */
    public JobState state() {
        return this.state;
    }

    /**
     * Get if the JobOutput is in a Processing state, this contains the job completion percentage.  The value is an estimate and not intended to be used to predict job completion times. To determine if the JobOutput is complete, use the State property.
     *
     * @return the progress value
     */
    public int progress() {
        return this.progress;
    }

}
