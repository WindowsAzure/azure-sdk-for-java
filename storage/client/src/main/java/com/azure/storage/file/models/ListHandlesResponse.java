// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * An enumeration of handles.
 */
@JacksonXmlRootElement(localName = "EnumerationResults")
public final class ListHandlesResponse {
    private static final class EntriesWrapper {
        @JacksonXmlProperty(localName = "Handle")
        private final List<HandleItem> items;

        @JsonCreator
        private EntriesWrapper(@JacksonXmlProperty(localName = "Handle") List<HandleItem> items) {
            this.items = items;
        }
    }

    /*
     * The handleList property.
     */
    @JsonProperty(value = "Entries")
    private EntriesWrapper handleList;

    /*
     * The nextMarker property.
     */
    @JsonProperty(value = "NextMarker", required = true)
    private String nextMarker;

    /**
     * Get the handleList property: The handleList property.
     *
     * @return the handleList value.
     */
    public List<HandleItem> handleList() {
        if (this.handleList == null) {
            this.handleList = new EntriesWrapper(new ArrayList<HandleItem>());
        }
        return this.handleList.items;
    }

    /**
     * Set the handleList property: The handleList property.
     *
     * @param handleList the handleList value to set.
     * @return the ListHandlesResponse object itself.
     */
    public ListHandlesResponse handleList(List<HandleItem> handleList) {
        this.handleList = new EntriesWrapper(handleList);
        return this;
    }

    /**
     * Get the nextMarker property: The nextMarker property.
     *
     * @return the nextMarker value.
     */
    public String nextMarker() {
        return this.nextMarker;
    }

    /**
     * Set the nextMarker property: The nextMarker property.
     *
     * @param nextMarker the nextMarker value to set.
     * @return the ListHandlesResponse object itself.
     */
    public ListHandlesResponse nextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
}
