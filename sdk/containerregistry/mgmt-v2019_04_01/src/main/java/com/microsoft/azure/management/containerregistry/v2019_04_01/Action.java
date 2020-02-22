/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Action.
 */
public final class Action extends ExpandableStringEnum<Action> {
    /** Static value Allow for Action. */
    public static final Action ALLOW = fromString("Allow");

    /**
     * Creates or finds a Action from its string representation.
     * @param name a name to look for
     * @return the corresponding Action
     */
    @JsonCreator
    public static Action fromString(String name) {
        return fromString(name, Action.class);
    }

    /**
     * @return known Action values
     */
    public static Collection<Action> values() {
        return values(Action.class);
    }
}
