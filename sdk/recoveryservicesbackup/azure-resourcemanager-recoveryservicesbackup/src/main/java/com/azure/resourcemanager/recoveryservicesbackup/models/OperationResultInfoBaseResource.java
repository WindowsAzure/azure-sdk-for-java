// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.OperationResultInfoBaseResourceInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of OperationResultInfoBaseResource. */
public interface OperationResultInfoBaseResource {
    /**
     * Gets the statusCode property: HTTP Status Code of the operation.
     *
     * @return the statusCode value.
     */
    HttpStatusCode statusCode();

    /**
     * Gets the headers property: HTTP headers associated with this operation.
     *
     * @return the headers value.
     */
    Map<String, List<String>> headers();

    /**
     * Gets the operation property: OperationResultInfoBaseResource operation.
     *
     * @return the operation value.
     */
    OperationResultInfoBase operation();

    /**
     * Gets the inner
     * com.azure.resourcemanager.recoveryservicesbackup.fluent.models.OperationResultInfoBaseResourceInner object.
     *
     * @return the inner object.
     */
    OperationResultInfoBaseResourceInner innerModel();
}
