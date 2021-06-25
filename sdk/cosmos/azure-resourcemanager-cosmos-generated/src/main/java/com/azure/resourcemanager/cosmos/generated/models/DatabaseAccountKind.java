// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DatabaseAccountKind. */
public final class DatabaseAccountKind extends ExpandableStringEnum<DatabaseAccountKind> {
    /** Static value GlobalDocumentDB for DatabaseAccountKind. */
    public static final DatabaseAccountKind GLOBAL_DOCUMENT_DB = fromString("GlobalDocumentDB");

    /** Static value MongoDB for DatabaseAccountKind. */
    public static final DatabaseAccountKind MONGO_DB = fromString("MongoDB");

    /** Static value Parse for DatabaseAccountKind. */
    public static final DatabaseAccountKind PARSE = fromString("Parse");

    /**
     * Creates or finds a DatabaseAccountKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DatabaseAccountKind.
     */
    @JsonCreator
    public static DatabaseAccountKind fromString(String name) {
        return fromString(name, DatabaseAccountKind.class);
    }

    /** @return known DatabaseAccountKind values. */
    public static Collection<DatabaseAccountKind> values() {
        return values(DatabaseAccountKind.class);
    }
}
