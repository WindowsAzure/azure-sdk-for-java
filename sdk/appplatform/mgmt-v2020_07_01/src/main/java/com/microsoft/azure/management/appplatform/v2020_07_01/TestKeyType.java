/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TestKeyType.
 */
public final class TestKeyType extends ExpandableStringEnum<TestKeyType> {
    /** Static value Primary for TestKeyType. */
    public static final TestKeyType PRIMARY = fromString("Primary");

    /** Static value Secondary for TestKeyType. */
    public static final TestKeyType SECONDARY = fromString("Secondary");

    /**
     * Creates or finds a TestKeyType from its string representation.
     * @param name a name to look for
     * @return the corresponding TestKeyType
     */
    @JsonCreator
    public static TestKeyType fromString(String name) {
        return fromString(name, TestKeyType.class);
    }

    /**
     * @return known TestKeyType values
     */
    public static Collection<TestKeyType> values() {
        return values(TestKeyType.class);
    }
}
