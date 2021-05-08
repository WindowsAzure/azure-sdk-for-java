// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.resourcemanager.applicationinsights.fluent.models.WorkItemConfigurationInner;

/** An immutable client-side representation of WorkItemConfiguration. */
public interface WorkItemConfiguration {
    /**
     * Gets the connectorId property: Connector identifier where work item is created.
     *
     * @return the connectorId value.
     */
    String connectorId();

    /**
     * Gets the configDisplayName property: Configuration friendly name.
     *
     * @return the configDisplayName value.
     */
    String configDisplayName();

    /**
     * Gets the isDefault property: Boolean value indicating whether configuration is default.
     *
     * @return the isDefault value.
     */
    Boolean isDefault();

    /**
     * Gets the id property: Unique Id for work item.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the configProperties property: Serialized JSON object for detailed properties.
     *
     * @return the configProperties value.
     */
    String configProperties();

    /**
     * Gets the inner com.azure.resourcemanager.applicationinsights.fluent.models.WorkItemConfigurationInner object.
     *
     * @return the inner object.
     */
    WorkItemConfigurationInner innerModel();
}
