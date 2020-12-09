// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Represents input files for a Job. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@odata\\.type",
    defaultImpl = JobInputClip.class)
@JsonTypeName("#Microsoft.Media.JobInputClip")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.JobInputAsset", value = JobInputAsset.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.JobInputHttp", value = JobInputHttp.class)
})
@JsonFlatten
@Fluent
public class JobInputClip extends JobInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobInputClip.class);

    /*
     * List of files. Required for JobInputHttp. Maximum of 4000 characters
     * each.
     */
    @JsonProperty(value = "files")
    private List<String> files;

    /*
     * Defines a point on the timeline of the input media at which processing
     * will start. Defaults to the beginning of the input media.
     */
    @JsonProperty(value = "start")
    private ClipTime start;

    /*
     * Defines a point on the timeline of the input media at which processing
     * will end. Defaults to the end of the input media.
     */
    @JsonProperty(value = "end")
    private ClipTime end;

    /*
     * A label that is assigned to a JobInputClip, that is used to satisfy a
     * reference used in the Transform. For example, a Transform can be
     * authored so as to take an image file with the label 'xyz' and apply it
     * as an overlay onto the input video before it is encoded. When submitting
     * a Job, exactly one of the JobInputs should be the image file, and it
     * should have the label 'xyz'.
     */
    @JsonProperty(value = "label")
    private String label;

    /**
     * Get the files property: List of files. Required for JobInputHttp. Maximum of 4000 characters each.
     *
     * @return the files value.
     */
    public List<String> files() {
        return this.files;
    }

    /**
     * Set the files property: List of files. Required for JobInputHttp. Maximum of 4000 characters each.
     *
     * @param files the files value to set.
     * @return the JobInputClip object itself.
     */
    public JobInputClip withFiles(List<String> files) {
        this.files = files;
        return this;
    }

    /**
     * Get the start property: Defines a point on the timeline of the input media at which processing will start.
     * Defaults to the beginning of the input media.
     *
     * @return the start value.
     */
    public ClipTime start() {
        return this.start;
    }

    /**
     * Set the start property: Defines a point on the timeline of the input media at which processing will start.
     * Defaults to the beginning of the input media.
     *
     * @param start the start value to set.
     * @return the JobInputClip object itself.
     */
    public JobInputClip withStart(ClipTime start) {
        this.start = start;
        return this;
    }

    /**
     * Get the end property: Defines a point on the timeline of the input media at which processing will end. Defaults
     * to the end of the input media.
     *
     * @return the end value.
     */
    public ClipTime end() {
        return this.end;
    }

    /**
     * Set the end property: Defines a point on the timeline of the input media at which processing will end. Defaults
     * to the end of the input media.
     *
     * @param end the end value to set.
     * @return the JobInputClip object itself.
     */
    public JobInputClip withEnd(ClipTime end) {
        this.end = end;
        return this;
    }

    /**
     * Get the label property: A label that is assigned to a JobInputClip, that is used to satisfy a reference used in
     * the Transform. For example, a Transform can be authored so as to take an image file with the label 'xyz' and
     * apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the
     * JobInputs should be the image file, and it should have the label 'xyz'.
     *
     * @return the label value.
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label property: A label that is assigned to a JobInputClip, that is used to satisfy a reference used in
     * the Transform. For example, a Transform can be authored so as to take an image file with the label 'xyz' and
     * apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the
     * JobInputs should be the image file, and it should have the label 'xyz'.
     *
     * @param label the label value to set.
     * @return the JobInputClip object itself.
     */
    public JobInputClip withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (start() != null) {
            start().validate();
        }
        if (end() != null) {
            end().validate();
        }
    }
}
