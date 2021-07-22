// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.resourcemanager.security.fluent.models.ComplianceResultInner;

/** An immutable client-side representation of ComplianceResult. */
public interface ComplianceResult {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the resourceStatus property: The status of the resource regarding a single assessment.
     *
     * @return the resourceStatus value.
     */
    ResourceStatus resourceStatus();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.ComplianceResultInner object.
     *
     * @return the inner object.
     */
    ComplianceResultInner innerModel();
}
