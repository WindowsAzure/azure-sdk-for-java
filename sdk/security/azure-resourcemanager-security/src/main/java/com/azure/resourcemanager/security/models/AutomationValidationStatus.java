// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.resourcemanager.security.fluent.models.AutomationValidationStatusInner;

/** An immutable client-side representation of AutomationValidationStatus. */
public interface AutomationValidationStatus {
    /**
     * Gets the isValid property: Indicates whether the model is valid or not.
     *
     * @return the isValid value.
     */
    Boolean isValid();

    /**
     * Gets the message property: The validation message.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.AutomationValidationStatusInner object.
     *
     * @return the inner object.
     */
    AutomationValidationStatusInner innerModel();
}
