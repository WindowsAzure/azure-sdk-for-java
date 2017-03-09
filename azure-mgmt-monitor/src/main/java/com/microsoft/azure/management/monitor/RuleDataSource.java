/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The resource from which the rule collects its data.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata.type")
@JsonTypeName("RuleDataSource")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Microsoft.Azure.Management.Insights.Models.RuleMetricDataSource", value = RuleMetricDataSource.class),
    @JsonSubTypes.Type(name = "Microsoft.Azure.Management.Insights.Models.RuleManagementEventDataSource", value = RuleManagementEventDataSource.class)
})
public class RuleDataSource {
}
