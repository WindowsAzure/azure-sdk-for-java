/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.entitysearch.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AnswerType.
 */
public final class AnswerType extends ExpandableStringEnum<AnswerType> {
    /** Static value Entities for AnswerType. */
    public static final AnswerType ENTITIES = fromString("Entities");

    /** Static value Places for AnswerType. */
    public static final AnswerType PLACES = fromString("Places");

    /**
     * Creates or finds a AnswerType from its string representation.
     * @param name a name to look for
     * @return the corresponding AnswerType
     */
    @JsonCreator
    public static AnswerType fromString(String name) {
        return fromString(name, AnswerType.class);
    }

    /**
     * @return known AnswerType values
     */
    public static Collection<AnswerType> values() {
        return values(AnswerType.class);
    }
}
