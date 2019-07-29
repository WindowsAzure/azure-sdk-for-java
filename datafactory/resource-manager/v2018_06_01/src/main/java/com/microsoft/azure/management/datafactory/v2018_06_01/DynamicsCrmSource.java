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

/**
 * A copy activity Dynamics CRM source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DynamicsCrmSource")
public class DynamicsCrmSource extends CopySource {
    /**
     * FetchXML is a proprietary query language that is used in Microsoft
     * Dynamics CRM (online &amp; on-premises). Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /**
     * Get fetchXML is a proprietary query language that is used in Microsoft Dynamics CRM (online &amp; on-premises). Type: string (or Expression with resultType string).
     *
     * @return the query value
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set fetchXML is a proprietary query language that is used in Microsoft Dynamics CRM (online &amp; on-premises). Type: string (or Expression with resultType string).
     *
     * @param query the query value to set
     * @return the DynamicsCrmSource object itself.
     */
    public DynamicsCrmSource withQuery(Object query) {
        this.query = query;
        return this;
    }

}
