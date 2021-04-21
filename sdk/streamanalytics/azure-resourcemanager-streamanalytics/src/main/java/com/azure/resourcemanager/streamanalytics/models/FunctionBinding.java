// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The physical binding of the function. For example, in the Azure Machine Learning web service’s case, this describes
 * the endpoint.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = FunctionBinding.class)
@JsonTypeName("FunctionBinding")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "Microsoft.MachineLearning/WebService",
        value = AzureMachineLearningStudioFunctionBinding.class),
    @JsonSubTypes.Type(name = "Microsoft.StreamAnalytics/JavascriptUdf", value = JavaScriptFunctionBinding.class),
    @JsonSubTypes.Type(name = "Microsoft.StreamAnalytics/CLRUdf", value = CSharpFunctionBinding.class),
    @JsonSubTypes.Type(
        name = "Microsoft.MachineLearningServices",
        value = AzureMachineLearningServiceFunctionBinding.class)
})
@Immutable
public class FunctionBinding {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FunctionBinding.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
