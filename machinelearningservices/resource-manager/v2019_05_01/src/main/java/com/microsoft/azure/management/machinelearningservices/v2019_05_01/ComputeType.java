/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningservices.v2019_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ComputeType.
 */
public final class ComputeType extends ExpandableStringEnum<ComputeType> {
    /** Static value AKS for ComputeType. */
    public static final ComputeType AKS = fromString("AKS");

    /** Static value AmlCompute for ComputeType. */
    public static final ComputeType AML_COMPUTE = fromString("AmlCompute");

    /** Static value DataFactory for ComputeType. */
    public static final ComputeType DATA_FACTORY = fromString("DataFactory");

    /** Static value VirtualMachine for ComputeType. */
    public static final ComputeType VIRTUAL_MACHINE = fromString("VirtualMachine");

    /** Static value HDInsight for ComputeType. */
    public static final ComputeType HDINSIGHT = fromString("HDInsight");

    /** Static value Databricks for ComputeType. */
    public static final ComputeType DATABRICKS = fromString("Databricks");

    /** Static value DataLakeAnalytics for ComputeType. */
    public static final ComputeType DATA_LAKE_ANALYTICS = fromString("DataLakeAnalytics");

    /**
     * Creates or finds a ComputeType from its string representation.
     * @param name a name to look for
     * @return the corresponding ComputeType
     */
    @JsonCreator
    public static ComputeType fromString(String name) {
        return fromString(name, ComputeType.class);
    }

    /**
     * @return known ComputeType values
     */
    public static Collection<ComputeType> values() {
        return values(ComputeType.class);
    }
}
