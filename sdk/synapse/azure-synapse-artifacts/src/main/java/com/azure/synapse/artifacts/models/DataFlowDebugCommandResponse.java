// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response body structure of data flow result for data preview, statistics or expression preview. */
@Fluent
public final class DataFlowDebugCommandResponse {
    /*
     * The run status of data preview, statistics or expression preview.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * The result data of data preview, statistics or expression preview.
     */
    @JsonProperty(value = "data")
    private String data;

    /**
     * Get the status property: The run status of data preview, statistics or expression preview.
     *
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The run status of data preview, statistics or expression preview.
     *
     * @param status the status value to set.
     * @return the DataFlowDebugCommandResponse object itself.
     */
    public DataFlowDebugCommandResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the data property: The result data of data preview, statistics or expression preview.
     *
     * @return the data value.
     */
    public String getData() {
        return this.data;
    }

    /**
     * Set the data property: The result data of data preview, statistics or expression preview.
     *
     * @param data the data value to set.
     * @return the DataFlowDebugCommandResponse object itself.
     */
    public DataFlowDebugCommandResponse setData(String data) {
        this.data = data;
        return this;
    }
}
