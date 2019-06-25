/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MessageFilterType.
 */
public final class MessageFilterType extends ExpandableStringEnum<MessageFilterType> {
    /** Static value NotSpecified for MessageFilterType. */
    public static final MessageFilterType NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Include for MessageFilterType. */
    public static final MessageFilterType INCLUDE = fromString("Include");

    /** Static value Exclude for MessageFilterType. */
    public static final MessageFilterType EXCLUDE = fromString("Exclude");

    /**
     * Creates or finds a MessageFilterType from its string representation.
     * @param name a name to look for
     * @return the corresponding MessageFilterType
     */
    @JsonCreator
    public static MessageFilterType fromString(String name) {
        return fromString(name, MessageFilterType.class);
    }

    /**
     * @return known MessageFilterType values
     */
    public static Collection<MessageFilterType> values() {
        return values(MessageFilterType.class);
    }
}
