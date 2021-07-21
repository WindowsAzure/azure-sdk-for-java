// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.resourcemanager.security.fluent.models.RegulatoryComplianceControlInner;

/** An immutable client-side representation of RegulatoryComplianceControl. */
public interface RegulatoryComplianceControl {
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
     * Gets the description property: The description of the regulatory compliance control.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the state property: Aggregative state based on the control's supported assessments states.
     *
     * @return the state value.
     */
    State state();

    /**
     * Gets the passedAssessments property: The number of supported regulatory compliance assessments of the given
     * control with a passed state.
     *
     * @return the passedAssessments value.
     */
    Integer passedAssessments();

    /**
     * Gets the failedAssessments property: The number of supported regulatory compliance assessments of the given
     * control with a failed state.
     *
     * @return the failedAssessments value.
     */
    Integer failedAssessments();

    /**
     * Gets the skippedAssessments property: The number of supported regulatory compliance assessments of the given
     * control with a skipped state.
     *
     * @return the skippedAssessments value.
     */
    Integer skippedAssessments();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.RegulatoryComplianceControlInner object.
     *
     * @return the inner object.
     */
    RegulatoryComplianceControlInner innerModel();
}
