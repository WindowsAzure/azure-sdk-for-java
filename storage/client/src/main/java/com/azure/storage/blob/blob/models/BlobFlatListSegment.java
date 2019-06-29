// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.blob.models;

import com.azure.storage.blob.models.BlobItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * The BlobFlatListSegment model.
 */
@JacksonXmlRootElement(localName = "Blobs")
public final class BlobFlatListSegment {
    /*
     * The blobItems property.
     */
    @JsonProperty("Blob")
    private List<com.azure.storage.blob.models.BlobItem> blobItems = new ArrayList<>();

    /**
     * Get the blobItems property: The blobItems property.
     *
     * @return the blobItems value.
     */
    public List<com.azure.storage.blob.models.BlobItem> blobItems() {
        return this.blobItems;
    }

    /**
     * Set the blobItems property: The blobItems property.
     *
     * @param blobItems the blobItems value to set.
     * @return the BlobFlatListSegment object itself.
     */
    public BlobFlatListSegment blobItems(List<BlobItem> blobItems) {
        this.blobItems = blobItems;
        return this;
    }
}
