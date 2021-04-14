// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.resourcemanager.hdinsight.fluent.models.NameAvailabilityCheckResultInner;

/** An immutable client-side representation of NameAvailabilityCheckResult. */
public interface NameAvailabilityCheckResult {
    /**
     * Gets the nameAvailable property: This indicates whether the name is available.
     *
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * Gets the reason property: The reason of the result.
     *
     * @return the reason value.
     */
    String reason();

    /**
     * Gets the message property: The related message.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.hdinsight.fluent.models.NameAvailabilityCheckResultInner object.
     *
     * @return the inner object.
     */
    NameAvailabilityCheckResultInner innerModel();
}
