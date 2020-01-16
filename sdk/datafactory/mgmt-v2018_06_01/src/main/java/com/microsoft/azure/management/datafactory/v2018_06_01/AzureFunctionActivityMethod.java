/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AzureFunctionActivityMethod.
 */
public final class AzureFunctionActivityMethod extends ExpandableStringEnum<AzureFunctionActivityMethod> {
    /** Static value GET for AzureFunctionActivityMethod. */
    public static final AzureFunctionActivityMethod GET = fromString("GET");

    /** Static value POST for AzureFunctionActivityMethod. */
    public static final AzureFunctionActivityMethod POST = fromString("POST");

    /** Static value PUT for AzureFunctionActivityMethod. */
    public static final AzureFunctionActivityMethod PUT = fromString("PUT");

    /** Static value DELETE for AzureFunctionActivityMethod. */
    public static final AzureFunctionActivityMethod DELETE = fromString("DELETE");

    /** Static value OPTIONS for AzureFunctionActivityMethod. */
    public static final AzureFunctionActivityMethod OPTIONS = fromString("OPTIONS");

    /** Static value HEAD for AzureFunctionActivityMethod. */
    public static final AzureFunctionActivityMethod HEAD = fromString("HEAD");

    /** Static value TRACE for AzureFunctionActivityMethod. */
    public static final AzureFunctionActivityMethod TRACE = fromString("TRACE");

    /**
     * Creates or finds a AzureFunctionActivityMethod from its string representation.
     * @param name a name to look for
     * @return the corresponding AzureFunctionActivityMethod
     */
    @JsonCreator
    public static AzureFunctionActivityMethod fromString(String name) {
        return fromString(name, AzureFunctionActivityMethod.class);
    }

    /**
     * @return known AzureFunctionActivityMethod values
     */
    public static Collection<AzureFunctionActivityMethod> values() {
        return values(AzureFunctionActivityMethod.class);
    }
}
