// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.resourcemanager.datafactory.fluent.models.AddDataFlowToDebugSessionResponseInner;

/** An immutable client-side representation of AddDataFlowToDebugSessionResponse. */
public interface AddDataFlowToDebugSessionResponse {
    /**
     * Gets the jobVersion property: The ID of data flow debug job version.
     *
     * @return the jobVersion value.
     */
    String jobVersion();

    /**
     * Gets the inner com.azure.resourcemanager.datafactory.fluent.models.AddDataFlowToDebugSessionResponseInner object.
     *
     * @return the inner object.
     */
    AddDataFlowToDebugSessionResponseInner innerModel();
}
