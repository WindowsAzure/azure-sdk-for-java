// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Abstract for entries that can be listed from Directory.
 */
@JacksonXmlRootElement(localName = "Entries")
public final class FilesAndDirectoriesListSegment {
    /*
     * The directoryItems property.
     */
    @JsonProperty("Directory")
    private List<DirectoryItem> directoryItems = new ArrayList<>();

    /*
     * The fileItems property.
     */
    @JsonProperty("File")
    private List<FileItem> fileItems = new ArrayList<>();

    /**
     * Get the directoryItems property: The directoryItems property.
     *
     * @return the directoryItems value.
     */
    public List<DirectoryItem> directoryItems() {
        return this.directoryItems;
    }

    /**
     * Set the directoryItems property: The directoryItems property.
     *
     * @param directoryItems the directoryItems value to set.
     * @return the FilesAndDirectoriesListSegment object itself.
     */
    public FilesAndDirectoriesListSegment directoryItems(List<DirectoryItem> directoryItems) {
        this.directoryItems = directoryItems;
        return this;
    }

    /**
     * Get the fileItems property: The fileItems property.
     *
     * @return the fileItems value.
     */
    public List<FileItem> fileItems() {
        return this.fileItems;
    }

    /**
     * Set the fileItems property: The fileItems property.
     *
     * @param fileItems the fileItems value to set.
     * @return the FilesAndDirectoriesListSegment object itself.
     */
    public FilesAndDirectoriesListSegment fileItems(List<FileItem> fileItems) {
        this.fileItems = fileItems;
        return this;
    }
}
