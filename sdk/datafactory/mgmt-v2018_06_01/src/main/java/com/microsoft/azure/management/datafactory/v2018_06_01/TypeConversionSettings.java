/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Type conversion settings.
 */
public class TypeConversionSettings {
    /**
     * Whether to allow data truncation when converting the data. Type: boolean
     * (or Expression with resultType boolean).
     */
    @JsonProperty(value = "allowDataTruncation")
    private Object allowDataTruncation;

    /**
     * Whether to treat boolean values as numbers. Type: boolean (or Expression
     * with resultType boolean).
     */
    @JsonProperty(value = "treatBooleanAsNumber")
    private Object treatBooleanAsNumber;

    /**
     * The format for DateTime values. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "dateTimeFormat")
    private Object dateTimeFormat;

    /**
     * The format for DateTimeOffset values. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "dateTimeOffsetFormat")
    private Object dateTimeOffsetFormat;

    /**
     * The format for TimeSpan values. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "timeSpanFormat")
    private Object timeSpanFormat;

    /**
     * The culture used to convert data from/to string. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "culture")
    private Object culture;

    /**
     * Get whether to allow data truncation when converting the data. Type: boolean (or Expression with resultType boolean).
     *
     * @return the allowDataTruncation value
     */
    public Object allowDataTruncation() {
        return this.allowDataTruncation;
    }

    /**
     * Set whether to allow data truncation when converting the data. Type: boolean (or Expression with resultType boolean).
     *
     * @param allowDataTruncation the allowDataTruncation value to set
     * @return the TypeConversionSettings object itself.
     */
    public TypeConversionSettings withAllowDataTruncation(Object allowDataTruncation) {
        this.allowDataTruncation = allowDataTruncation;
        return this;
    }

    /**
     * Get whether to treat boolean values as numbers. Type: boolean (or Expression with resultType boolean).
     *
     * @return the treatBooleanAsNumber value
     */
    public Object treatBooleanAsNumber() {
        return this.treatBooleanAsNumber;
    }

    /**
     * Set whether to treat boolean values as numbers. Type: boolean (or Expression with resultType boolean).
     *
     * @param treatBooleanAsNumber the treatBooleanAsNumber value to set
     * @return the TypeConversionSettings object itself.
     */
    public TypeConversionSettings withTreatBooleanAsNumber(Object treatBooleanAsNumber) {
        this.treatBooleanAsNumber = treatBooleanAsNumber;
        return this;
    }

    /**
     * Get the format for DateTime values. Type: string (or Expression with resultType string).
     *
     * @return the dateTimeFormat value
     */
    public Object dateTimeFormat() {
        return this.dateTimeFormat;
    }

    /**
     * Set the format for DateTime values. Type: string (or Expression with resultType string).
     *
     * @param dateTimeFormat the dateTimeFormat value to set
     * @return the TypeConversionSettings object itself.
     */
    public TypeConversionSettings withDateTimeFormat(Object dateTimeFormat) {
        this.dateTimeFormat = dateTimeFormat;
        return this;
    }

    /**
     * Get the format for DateTimeOffset values. Type: string (or Expression with resultType string).
     *
     * @return the dateTimeOffsetFormat value
     */
    public Object dateTimeOffsetFormat() {
        return this.dateTimeOffsetFormat;
    }

    /**
     * Set the format for DateTimeOffset values. Type: string (or Expression with resultType string).
     *
     * @param dateTimeOffsetFormat the dateTimeOffsetFormat value to set
     * @return the TypeConversionSettings object itself.
     */
    public TypeConversionSettings withDateTimeOffsetFormat(Object dateTimeOffsetFormat) {
        this.dateTimeOffsetFormat = dateTimeOffsetFormat;
        return this;
    }

    /**
     * Get the format for TimeSpan values. Type: string (or Expression with resultType string).
     *
     * @return the timeSpanFormat value
     */
    public Object timeSpanFormat() {
        return this.timeSpanFormat;
    }

    /**
     * Set the format for TimeSpan values. Type: string (or Expression with resultType string).
     *
     * @param timeSpanFormat the timeSpanFormat value to set
     * @return the TypeConversionSettings object itself.
     */
    public TypeConversionSettings withTimeSpanFormat(Object timeSpanFormat) {
        this.timeSpanFormat = timeSpanFormat;
        return this;
    }

    /**
     * Get the culture used to convert data from/to string. Type: string (or Expression with resultType string).
     *
     * @return the culture value
     */
    public Object culture() {
        return this.culture;
    }

    /**
     * Set the culture used to convert data from/to string. Type: string (or Expression with resultType string).
     *
     * @param culture the culture value to set
     * @return the TypeConversionSettings object itself.
     */
    public TypeConversionSettings withCulture(Object culture) {
        this.culture = culture;
        return this;
    }

}
