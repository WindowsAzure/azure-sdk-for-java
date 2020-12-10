// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.resourcemanager.cdn.generated.fluent.models.ValidateSecretOutputInner;

/** An immutable client-side representation of ValidateSecretOutput. */
public interface ValidateSecretOutput {
    /**
     * Gets the status property: The validation status.
     *
     * @return the status value.
     */
    Status status();

    /**
     * Gets the message property: Detailed error message.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.cdn.generated.fluent.models.ValidateSecretOutputInner object.
     *
     * @return the inner object.
     */
    ValidateSecretOutputInner innerModel();
}
