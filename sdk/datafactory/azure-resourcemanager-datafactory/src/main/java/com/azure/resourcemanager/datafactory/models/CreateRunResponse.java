// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.resourcemanager.datafactory.fluent.models.CreateRunResponseInner;

/** An immutable client-side representation of CreateRunResponse. */
public interface CreateRunResponse {
    /**
     * Gets the runId property: Identifier of a run.
     *
     * @return the runId value.
     */
    String runId();

    /**
     * Gets the inner com.azure.resourcemanager.datafactory.fluent.models.CreateRunResponseInner object.
     *
     * @return the inner object.
     */
    CreateRunResponseInner innerModel();
}
