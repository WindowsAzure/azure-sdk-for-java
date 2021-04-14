// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.resourcemanager.datafactory.fluent.models.DataFlowDebugCommandResponseInner;

/** An immutable client-side representation of DataFlowDebugCommandResponse. */
public interface DataFlowDebugCommandResponse {
    /**
     * Gets the status property: The run status of data preview, statistics or expression preview.
     *
     * @return the status value.
     */
    String status();

    /**
     * Gets the data property: The result data of data preview, statistics or expression preview.
     *
     * @return the data value.
     */
    String data();

    /**
     * Gets the inner com.azure.resourcemanager.datafactory.fluent.models.DataFlowDebugCommandResponseInner object.
     *
     * @return the inner object.
     */
    DataFlowDebugCommandResponseInner innerModel();
}
