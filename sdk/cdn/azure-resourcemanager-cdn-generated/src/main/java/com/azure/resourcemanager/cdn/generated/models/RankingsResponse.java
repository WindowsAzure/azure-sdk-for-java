// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.resourcemanager.cdn.generated.fluent.models.RankingsResponseInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of RankingsResponse. */
public interface RankingsResponse {
    /**
     * Gets the dateTimeBegin property: The dateTimeBegin property.
     *
     * @return the dateTimeBegin value.
     */
    OffsetDateTime dateTimeBegin();

    /**
     * Gets the dateTimeEnd property: The dateTimeEnd property.
     *
     * @return the dateTimeEnd value.
     */
    OffsetDateTime dateTimeEnd();

    /**
     * Gets the tables property: The tables property.
     *
     * @return the tables value.
     */
    List<RankingsResponseTablesItem> tables();

    /**
     * Gets the inner com.azure.resourcemanager.cdn.generated.fluent.models.RankingsResponseInner object.
     *
     * @return the inner object.
     */
    RankingsResponseInner innerModel();
}
