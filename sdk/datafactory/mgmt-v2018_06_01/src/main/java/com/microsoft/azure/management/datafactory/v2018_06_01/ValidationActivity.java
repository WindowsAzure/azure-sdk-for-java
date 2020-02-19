/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * This activity verifies that an external resource exists.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = ValidationActivity.class)
@JsonTypeName("Validation")
@JsonFlatten
public class ValidationActivity extends ControlActivity {
    /**
     * Specifies the timeout for the activity to run. If there is no value
     * specified, it takes the value of TimeSpan.FromDays(7) which is 1 week as
     * default. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "typeProperties.timeout")
    private Object timeout;

    /**
     * A delay in seconds between validation attempts. If no value is
     * specified, 10 seconds will be used as the default. Type: integer (or
     * Expression with resultType integer).
     */
    @JsonProperty(value = "typeProperties.sleep")
    private Object sleep;

    /**
     * Can be used if dataset points to a file. The file must be greater than
     * or equal in size to the value specified. Type: integer (or Expression
     * with resultType integer).
     */
    @JsonProperty(value = "typeProperties.minimumSize")
    private Object minimumSize;

    /**
     * Can be used if dataset points to a folder. If set to true, the folder
     * must have at least one file. If set to false, the folder must be empty.
     * Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "typeProperties.childItems")
    private Object childItems;

    /**
     * Validation activity dataset reference.
     */
    @JsonProperty(value = "typeProperties.dataset", required = true)
    private DatasetReference dataset;

    /**
     * Get specifies the timeout for the activity to run. If there is no value specified, it takes the value of TimeSpan.FromDays(7) which is 1 week as default. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the timeout value
     */
    public Object timeout() {
        return this.timeout;
    }

    /**
     * Set specifies the timeout for the activity to run. If there is no value specified, it takes the value of TimeSpan.FromDays(7) which is 1 week as default. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param timeout the timeout value to set
     * @return the ValidationActivity object itself.
     */
    public ValidationActivity withTimeout(Object timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get a delay in seconds between validation attempts. If no value is specified, 10 seconds will be used as the default. Type: integer (or Expression with resultType integer).
     *
     * @return the sleep value
     */
    public Object sleep() {
        return this.sleep;
    }

    /**
     * Set a delay in seconds between validation attempts. If no value is specified, 10 seconds will be used as the default. Type: integer (or Expression with resultType integer).
     *
     * @param sleep the sleep value to set
     * @return the ValidationActivity object itself.
     */
    public ValidationActivity withSleep(Object sleep) {
        this.sleep = sleep;
        return this;
    }

    /**
     * Get can be used if dataset points to a file. The file must be greater than or equal in size to the value specified. Type: integer (or Expression with resultType integer).
     *
     * @return the minimumSize value
     */
    public Object minimumSize() {
        return this.minimumSize;
    }

    /**
     * Set can be used if dataset points to a file. The file must be greater than or equal in size to the value specified. Type: integer (or Expression with resultType integer).
     *
     * @param minimumSize the minimumSize value to set
     * @return the ValidationActivity object itself.
     */
    public ValidationActivity withMinimumSize(Object minimumSize) {
        this.minimumSize = minimumSize;
        return this;
    }

    /**
     * Get can be used if dataset points to a folder. If set to true, the folder must have at least one file. If set to false, the folder must be empty. Type: boolean (or Expression with resultType boolean).
     *
     * @return the childItems value
     */
    public Object childItems() {
        return this.childItems;
    }

    /**
     * Set can be used if dataset points to a folder. If set to true, the folder must have at least one file. If set to false, the folder must be empty. Type: boolean (or Expression with resultType boolean).
     *
     * @param childItems the childItems value to set
     * @return the ValidationActivity object itself.
     */
    public ValidationActivity withChildItems(Object childItems) {
        this.childItems = childItems;
        return this;
    }

    /**
     * Get validation activity dataset reference.
     *
     * @return the dataset value
     */
    public DatasetReference dataset() {
        return this.dataset;
    }

    /**
     * Set validation activity dataset reference.
     *
     * @param dataset the dataset value to set
     * @return the ValidationActivity object itself.
     */
    public ValidationActivity withDataset(DatasetReference dataset) {
        this.dataset = dataset;
        return this;
    }

}
