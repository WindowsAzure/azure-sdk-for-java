/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2020_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mysql.v2020_01_01.implementation.QueryStatisticInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mysql.v2020_01_01.implementation.MySQLManager;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing QueryStatistic.
 */
public interface QueryStatistic extends HasInner<QueryStatisticInner>, Indexable, Refreshable<QueryStatistic>, HasManager<MySQLManager> {
    /**
     * @return the aggregationFunction value.
     */
    String aggregationFunction();

    /**
     * @return the databaseNames value.
     */
    List<String> databaseNames();

    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the metricDisplayName value.
     */
    String metricDisplayName();

    /**
     * @return the metricName value.
     */
    String metricName();

    /**
     * @return the metricValue value.
     */
    Double metricValue();

    /**
     * @return the metricValueUnit value.
     */
    String metricValueUnit();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the queryExecutionCount value.
     */
    Long queryExecutionCount();

    /**
     * @return the queryId value.
     */
    String queryId();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the type value.
     */
    String type();

}
