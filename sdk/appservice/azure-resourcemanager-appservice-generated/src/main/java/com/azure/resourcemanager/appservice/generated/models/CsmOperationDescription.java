// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.CsmOperationDescriptionInner;

/** An immutable client-side representation of CsmOperationDescription. */
public interface CsmOperationDescription {
    /**
     * Gets the name property: The name property.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the isDataAction property: The isDataAction property.
     *
     * @return the isDataAction value.
     */
    Boolean isDataAction();

    /**
     * Gets the display property: Meta data about operation used for display in portal.
     *
     * @return the display value.
     */
    CsmOperationDisplay display();

    /**
     * Gets the origin property: The origin property.
     *
     * @return the origin value.
     */
    String origin();

    /**
     * Gets the properties property: Properties available for a Microsoft.Web resource provider operation.
     *
     * @return the properties value.
     */
    CsmOperationDescriptionProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.CsmOperationDescriptionInner object.
     *
     * @return the inner object.
     */
    CsmOperationDescriptionInner innerModel();
}
