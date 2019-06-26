/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DefaultAction.
 */
public final class DefaultAction extends ExpandableStringEnum<DefaultAction> {
    /** Static value Allow for DefaultAction. */
    public static final DefaultAction ALLOW = fromString("Allow");

    /** Static value Deny for DefaultAction. */
    public static final DefaultAction DENY = fromString("Deny");

    /**
     * Creates or finds a DefaultAction from its string representation.
     * @param name a name to look for
     * @return the corresponding DefaultAction
     */
    @JsonCreator
    public static DefaultAction fromString(String name) {
        return fromString(name, DefaultAction.class);
    }

    /**
     * @return known DefaultAction values
     */
    public static Collection<DefaultAction> values() {
        return values(DefaultAction.class);
    }
}
