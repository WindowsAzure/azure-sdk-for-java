/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TestResultStatus.
 */
public final class TestResultStatus extends ExpandableStringEnum<TestResultStatus> {
    /** Static value undefined for TestResultStatus. */
    public static final TestResultStatus UNDEFINED = fromString("undefined");

    /** Static value false for TestResultStatus. */
    public static final TestResultStatus FALSE = fromString("false");

    /** Static value true for TestResultStatus. */
    public static final TestResultStatus TRUE = fromString("true");

    /**
     * Creates or finds a TestResultStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding TestResultStatus
     */
    @JsonCreator
    public static TestResultStatus fromString(String name) {
        return fromString(name, TestResultStatus.class);
    }

    /**
     * @return known TestResultStatus values
     */
    public static Collection<TestResultStatus> values() {
        return values(TestResultStatus.class);
    }
}
