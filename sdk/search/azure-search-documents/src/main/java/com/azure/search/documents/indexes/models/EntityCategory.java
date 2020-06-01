// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for EntityCategory.
 */
public final class EntityCategory extends ExpandableStringEnum<EntityCategory> {
    /**
     * Static value location for EntityCategory.
     */
    public static final EntityCategory LOCATION = fromString("location");

    /**
     * Static value organization for EntityCategory.
     */
    public static final EntityCategory ORGANIZATION = fromString("organization");

    /**
     * Static value person for EntityCategory.
     */
    public static final EntityCategory PERSON = fromString("person");

    /**
     * Static value quantity for EntityCategory.
     */
    public static final EntityCategory QUANTITY = fromString("quantity");

    /**
     * Static value datetime for EntityCategory.
     */
    public static final EntityCategory DATETIME = fromString("datetime");

    /**
     * Static value url for EntityCategory.
     */
    public static final EntityCategory URL = fromString("url");

    /**
     * Static value email for EntityCategory.
     */
    public static final EntityCategory EMAIL = fromString("email");

    /**
     * Creates or finds a EntityCategory from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EntityCategory.
     */
    @JsonCreator
    public static EntityCategory fromString(String name) {
        return fromString(name, EntityCategory.class);
    }

    /**
     * @return known EntityCategory values.
     */
    public static Collection<EntityCategory> values() {
        return values(EntityCategory.class);
    }
}
