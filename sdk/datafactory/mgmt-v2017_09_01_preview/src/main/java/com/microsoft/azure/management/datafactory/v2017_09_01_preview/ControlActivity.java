/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for all control activities like IfCondition, ForEach , Until.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = ControlActivity.class)
@JsonTypeName("Container")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Filter", value = FilterActivity.class),
    @JsonSubTypes.Type(name = "Until", value = UntilActivity.class),
    @JsonSubTypes.Type(name = "Wait", value = WaitActivity.class),
    @JsonSubTypes.Type(name = "ForEach", value = ForEachActivity.class),
    @JsonSubTypes.Type(name = "IfCondition", value = IfConditionActivity.class),
    @JsonSubTypes.Type(name = "ExecutePipeline", value = ExecutePipelineActivity.class)
})
public class ControlActivity extends Activity {
}
