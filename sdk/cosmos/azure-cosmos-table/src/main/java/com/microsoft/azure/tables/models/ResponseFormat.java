package com.microsoft.azure.tables.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResponseFormat. */
public final class ResponseFormat extends ExpandableStringEnum<ResponseFormat> {
    /** Static value return-no-content for ResponseFormat. */
    public static final ResponseFormat RETURN_NO_CONTENT = fromString("return-no-content");

    /** Static value return-content for ResponseFormat. */
    public static final ResponseFormat RETURN_CONTENT = fromString("return-content");

    /**
     * Creates or finds a ResponseFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResponseFormat.
     */
    @JsonCreator
    public static ResponseFormat fromString(String name) {
        return fromString(name, ResponseFormat.class);
    }

    /** @return known ResponseFormat values. */
    public static Collection<ResponseFormat> values() {
        return values(ResponseFormat.class);
    }
}
