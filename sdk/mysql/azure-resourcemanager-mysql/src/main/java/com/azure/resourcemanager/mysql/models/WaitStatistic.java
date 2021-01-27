// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.models;

import com.azure.resourcemanager.mysql.fluent.models.WaitStatisticInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of WaitStatistic. */
public interface WaitStatistic {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the startTime property: Observation start time.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: Observation end time.
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the eventName property: Wait event name.
     *
     * @return the eventName value.
     */
    String eventName();

    /**
     * Gets the eventTypeName property: Wait event type name.
     *
     * @return the eventTypeName value.
     */
    String eventTypeName();

    /**
     * Gets the queryId property: Database query identifier.
     *
     * @return the queryId value.
     */
    Long queryId();

    /**
     * Gets the databaseName property: Database Name.
     *
     * @return the databaseName value.
     */
    String databaseName();

    /**
     * Gets the userId property: Database user identifier.
     *
     * @return the userId value.
     */
    Long userId();

    /**
     * Gets the count property: Wait event count observed in this time interval.
     *
     * @return the count value.
     */
    Long count();

    /**
     * Gets the totalTimeInMs property: Total time of wait in milliseconds in this time interval.
     *
     * @return the totalTimeInMs value.
     */
    Double totalTimeInMs();

    /**
     * Gets the inner com.azure.resourcemanager.mysql.fluent.models.WaitStatisticInner object.
     *
     * @return the inner object.
     */
    WaitStatisticInner innerModel();
}
