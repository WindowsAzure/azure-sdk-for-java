// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes one input parameter of a function. */
@Fluent
public final class FunctionInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FunctionInput.class);

    /*
     * The (Azure Stream Analytics supported) data type of the function input
     * parameter. A list of valid Azure Stream Analytics data types are
     * described at
     * https://msdn.microsoft.com/en-us/library/azure/dn835065.aspx
     */
    @JsonProperty(value = "dataType")
    private String dataType;

    /*
     * A flag indicating if the parameter is a configuration parameter. True if
     * this input parameter is expected to be a constant. Default is false.
     */
    @JsonProperty(value = "isConfigurationParameter")
    private Boolean isConfigurationParameter;

    /**
     * Get the dataType property: The (Azure Stream Analytics supported) data type of the function input parameter. A
     * list of valid Azure Stream Analytics data types are described at
     * https://msdn.microsoft.com/en-us/library/azure/dn835065.aspx.
     *
     * @return the dataType value.
     */
    public String dataType() {
        return this.dataType;
    }

    /**
     * Set the dataType property: The (Azure Stream Analytics supported) data type of the function input parameter. A
     * list of valid Azure Stream Analytics data types are described at
     * https://msdn.microsoft.com/en-us/library/azure/dn835065.aspx.
     *
     * @param dataType the dataType value to set.
     * @return the FunctionInput object itself.
     */
    public FunctionInput withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Get the isConfigurationParameter property: A flag indicating if the parameter is a configuration parameter. True
     * if this input parameter is expected to be a constant. Default is false.
     *
     * @return the isConfigurationParameter value.
     */
    public Boolean isConfigurationParameter() {
        return this.isConfigurationParameter;
    }

    /**
     * Set the isConfigurationParameter property: A flag indicating if the parameter is a configuration parameter. True
     * if this input parameter is expected to be a constant. Default is false.
     *
     * @param isConfigurationParameter the isConfigurationParameter value to set.
     * @return the FunctionInput object itself.
     */
    public FunctionInput withIsConfigurationParameter(Boolean isConfigurationParameter) {
        this.isConfigurationParameter = isConfigurationParameter;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
