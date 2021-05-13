// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.resourcemanager.logic.fluent.models.WorkflowVersionInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of WorkflowVersion. */
public interface WorkflowVersion {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    WorkflowProvisioningState provisioningState();

    /**
     * Gets the createdTime property: Gets the created time.
     *
     * @return the createdTime value.
     */
    OffsetDateTime createdTime();

    /**
     * Gets the changedTime property: Gets the changed time.
     *
     * @return the changedTime value.
     */
    OffsetDateTime changedTime();

    /**
     * Gets the state property: The state.
     *
     * @return the state value.
     */
    WorkflowState state();

    /**
     * Gets the version property: Gets the version.
     *
     * @return the version value.
     */
    String version();

    /**
     * Gets the accessEndpoint property: Gets the access endpoint.
     *
     * @return the accessEndpoint value.
     */
    String accessEndpoint();

    /**
     * Gets the endpointsConfiguration property: The endpoints configuration.
     *
     * @return the endpointsConfiguration value.
     */
    FlowEndpointsConfiguration endpointsConfiguration();

    /**
     * Gets the accessControl property: The access control configuration.
     *
     * @return the accessControl value.
     */
    FlowAccessControlConfiguration accessControl();

    /**
     * Gets the sku property: The sku.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the integrationAccount property: The integration account.
     *
     * @return the integrationAccount value.
     */
    ResourceReference integrationAccount();

    /**
     * Gets the definition property: The definition.
     *
     * @return the definition value.
     */
    Object definition();

    /**
     * Gets the parameters property: The parameters.
     *
     * @return the parameters value.
     */
    Map<String, WorkflowParameter> parameters();

    /**
     * Gets the inner com.azure.resourcemanager.logic.fluent.models.WorkflowVersionInner object.
     *
     * @return the inner object.
     */
    WorkflowVersionInner innerModel();
}
