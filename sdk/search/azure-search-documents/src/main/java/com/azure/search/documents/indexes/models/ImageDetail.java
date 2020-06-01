// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for ImageDetail.
 */
public final class ImageDetail extends ExpandableStringEnum<ImageDetail> {
    /**
     * Static value celebrities for ImageDetail.
     */
    public static final ImageDetail CELEBRITIES = fromString("celebrities");

    /**
     * Static value landmarks for ImageDetail.
     */
    public static final ImageDetail LANDMARKS = fromString("landmarks");

    /**
     * Creates or finds a ImageDetail from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImageDetail.
     */
    @JsonCreator
    public static ImageDetail fromString(String name) {
        return fromString(name, ImageDetail.class);
    }

    /**
     * @return known ImageDetail values.
     */
    public static Collection<ImageDetail> values() {
        return values(ImageDetail.class);
    }
}
