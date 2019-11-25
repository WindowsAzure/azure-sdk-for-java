/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The physical binding of the function. For example, in the Azure Machine
 * Learning web service’s case, this describes the endpoint.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("FunctionBinding")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Microsoft.StreamAnalytics/JavascriptUdf", value = JavaScriptFunctionBinding.class),
    @JsonSubTypes.Type(name = "Microsoft.MachineLearning/WebService", value = AzureMachineLearningWebServiceFunctionBinding.class)
})
public class FunctionBinding {
}
