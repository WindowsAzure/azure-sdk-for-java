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
 * Defines values for DataFlowDebugCommandType.
 */
public final class DataFlowDebugCommandType extends ExpandableStringEnum<DataFlowDebugCommandType> {
    /** Static value executePreviewQuery for DataFlowDebugCommandType. */
    public static final DataFlowDebugCommandType EXECUTE_PREVIEW_QUERY = fromString("executePreviewQuery");

    /** Static value executeStatisticsQuery for DataFlowDebugCommandType. */
    public static final DataFlowDebugCommandType EXECUTE_STATISTICS_QUERY = fromString("executeStatisticsQuery");

    /** Static value executeExpressionQuery for DataFlowDebugCommandType. */
    public static final DataFlowDebugCommandType EXECUTE_EXPRESSION_QUERY = fromString("executeExpressionQuery");

    /**
     * Creates or finds a DataFlowDebugCommandType from its string representation.
     * @param name a name to look for
     * @return the corresponding DataFlowDebugCommandType
     */
    @JsonCreator
    public static DataFlowDebugCommandType fromString(String name) {
        return fromString(name, DataFlowDebugCommandType.class);
    }

    /**
     * @return known DataFlowDebugCommandType values
     */
    public static Collection<DataFlowDebugCommandType> values() {
        return values(DataFlowDebugCommandType.class);
    }
}
