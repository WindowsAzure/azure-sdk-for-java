// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.implementation;

import com.azure.storage.queue.models.ListQueuesIncludeType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.List;

/**
 * A wrapper around List&lt;ListQueuesIncludeType&gt; which provides top-level metadata for serialization.
 */
@JacksonXmlRootElement(localName = "ListQueuesIncludeType")
public final class ListQueuesIncludeTypeWrapper {
    @JacksonXmlProperty(localName = "ListQueuesIncludeType")
    private final List<ListQueuesIncludeType> listQueuesIncludeType;

    /**
     * Creates an instance of ListQueuesIncludeTypeWrapper.
     *
     * @param listQueuesIncludeType the list.
     */
    @JsonCreator
    public ListQueuesIncludeTypeWrapper(@JsonProperty("ListQueuesIncludeType") List<ListQueuesIncludeType> listQueuesIncludeType) {
        this.listQueuesIncludeType = listQueuesIncludeType;
    }

    /**
     * Get the List&lt;ListQueuesIncludeType&gt; contained in this wrapper.
     *
     * @return the List&lt;ListQueuesIncludeType&gt;.
     */
    public List<ListQueuesIncludeType> items() {
        return listQueuesIncludeType;
    }
}
