// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/** The SetAccessControlRecursiveResponse model. */
@JacksonXmlRootElement(localName = "SetAccessControlRecursiveResponse")
@Fluent
public final class SetAccessControlRecursiveResponse {
    /*
     * The directoriesSuccessful property.
     */
    @JsonProperty(value = "directoriesSuccessful")
    private Integer directoriesSuccessful;

    /*
     * The filesSuccessful property.
     */
    @JsonProperty(value = "filesSuccessful")
    private Integer filesSuccessful;

    /*
     * The failureCount property.
     */
    @JsonProperty(value = "failureCount")
    private Integer failureCount;

    /*
     * The failedEntries property.
     */
    @JsonProperty("AclFailedEntry")
    private List<AclFailedEntry> failedEntries = new ArrayList<>();

    /**
     * Get the directoriesSuccessful property: The directoriesSuccessful property.
     *
     * @return the directoriesSuccessful value.
     */
    public Integer getDirectoriesSuccessful() {
        return this.directoriesSuccessful;
    }

    /**
     * Set the directoriesSuccessful property: The directoriesSuccessful property.
     *
     * @param directoriesSuccessful the directoriesSuccessful value to set.
     * @return the SetAccessControlRecursiveResponse object itself.
     */
    public SetAccessControlRecursiveResponse setDirectoriesSuccessful(Integer directoriesSuccessful) {
        this.directoriesSuccessful = directoriesSuccessful;
        return this;
    }

    /**
     * Get the filesSuccessful property: The filesSuccessful property.
     *
     * @return the filesSuccessful value.
     */
    public Integer getFilesSuccessful() {
        return this.filesSuccessful;
    }

    /**
     * Set the filesSuccessful property: The filesSuccessful property.
     *
     * @param filesSuccessful the filesSuccessful value to set.
     * @return the SetAccessControlRecursiveResponse object itself.
     */
    public SetAccessControlRecursiveResponse setFilesSuccessful(Integer filesSuccessful) {
        this.filesSuccessful = filesSuccessful;
        return this;
    }

    /**
     * Get the failureCount property: The failureCount property.
     *
     * @return the failureCount value.
     */
    public Integer getFailureCount() {
        return this.failureCount;
    }

    /**
     * Set the failureCount property: The failureCount property.
     *
     * @param failureCount the failureCount value to set.
     * @return the SetAccessControlRecursiveResponse object itself.
     */
    public SetAccessControlRecursiveResponse setFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
        return this;
    }

    /**
     * Get the failedEntries property: The failedEntries property.
     *
     * @return the failedEntries value.
     */
    public List<AclFailedEntry> getFailedEntries() {
        return this.failedEntries;
    }

    /**
     * Set the failedEntries property: The failedEntries property.
     *
     * @param failedEntries the failedEntries value to set.
     * @return the SetAccessControlRecursiveResponse object itself.
     */
    public SetAccessControlRecursiveResponse setFailedEntries(List<AclFailedEntry> failedEntries) {
        this.failedEntries = failedEntries;
        return this;
    }
}
