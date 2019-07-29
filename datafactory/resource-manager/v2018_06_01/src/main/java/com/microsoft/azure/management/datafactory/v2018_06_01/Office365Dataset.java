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
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.DatasetInner;

/**
 * The Office365 account.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Office365Table")
@JsonFlatten
public class Office365Dataset extends DatasetInner {
    /**
     * Name of the dataset to extract from Office 365. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tableName", required = true)
    private Object tableName;

    /**
     * A predicate expression that can be used to filter the specific rows to
     * extract from Office 365. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.predicate")
    private Object predicate;

    /**
     * Get name of the dataset to extract from Office 365. Type: string (or Expression with resultType string).
     *
     * @return the tableName value
     */
    public Object tableName() {
        return this.tableName;
    }

    /**
     * Set name of the dataset to extract from Office 365. Type: string (or Expression with resultType string).
     *
     * @param tableName the tableName value to set
     * @return the Office365Dataset object itself.
     */
    public Office365Dataset withTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get a predicate expression that can be used to filter the specific rows to extract from Office 365. Type: string (or Expression with resultType string).
     *
     * @return the predicate value
     */
    public Object predicate() {
        return this.predicate;
    }

    /**
     * Set a predicate expression that can be used to filter the specific rows to extract from Office 365. Type: string (or Expression with resultType string).
     *
     * @param predicate the predicate value to set
     * @return the Office365Dataset object itself.
     */
    public Office365Dataset withPredicate(Object predicate) {
        this.predicate = predicate;
        return this;
    }

}
