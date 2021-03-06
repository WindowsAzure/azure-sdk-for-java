// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.resourcemanager.consumption.fluent.models.ForecastInner;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Forecast. */
public interface Forecast {
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
     * Gets the usageDate property: The usage date of the forecast.
     *
     * @return the usageDate value.
     */
    String usageDate();

    /**
     * Gets the grain property: The granularity of forecast. Please note that Yearly is not currently supported in this
     * API. The API will provide responses in the Monthly grain if Yearly is selected. To get yearly grain data, please
     * use our newer Forecast API.
     *
     * @return the grain value.
     */
    Grain grain();

    /**
     * Gets the charge property: The amount of charge.
     *
     * @return the charge value.
     */
    BigDecimal charge();

    /**
     * Gets the currency property: The ISO currency in which the meter is charged, for example, USD.
     *
     * @return the currency value.
     */
    String currency();

    /**
     * Gets the chargeType property: The type of the charge. Could be actual or forecast.
     *
     * @return the chargeType value.
     */
    ChargeType chargeType();

    /**
     * Gets the confidenceLevels property: The details about the forecast confidence levels. This is populated only when
     * chargeType is Forecast.
     *
     * @return the confidenceLevels value.
     */
    List<ForecastPropertiesConfidenceLevelsItem> confidenceLevels();

    /**
     * Gets the etag property: Resource etag.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the inner com.azure.resourcemanager.consumption.fluent.models.ForecastInner object.
     *
     * @return the inner object.
     */
    ForecastInner innerModel();
}
