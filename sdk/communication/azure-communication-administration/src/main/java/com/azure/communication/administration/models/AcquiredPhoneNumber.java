// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AcquiredPhoneNumber model. */
@Fluent
public final class AcquiredPhoneNumber {
    /*
     * String of the E.164 format of the phone number
     */
    @JsonProperty(value = "phoneNumber", required = true)
    private String phoneNumber;

    /*
     * The set of all acquired capabilities of the phone number.
     */
    @JsonProperty(value = "acquiredCapabilities", required = true)
    private List<Capability> acquiredCapabilities;

    /*
     * The set of all available capabilities that can be acquired for this
     * phone number.
     */
    @JsonProperty(value = "availableCapabilities", required = true)
    private List<Capability> availableCapabilities;

    /*
     * The assignment status of the phone number. Conveys what type of entity
     * the number is assigned to.
     */
    @JsonProperty(value = "assignmentStatus")
    private AssignmentStatus assignmentStatus;

    /*
     * The name of the place of the phone number.
     */
    @JsonProperty(value = "placeName")
    private String placeName;

    /*
     * The activation state of the phone number. Can be "Activated",
     * "AssignmentPending", "AssignmentFailed", "UpdatePending", "UpdateFailed"
     */
    @JsonProperty(value = "activationState")
    private ActivationState activationState;

    /**
     * Get the phoneNumber property: String of the E.164 format of the phone number.
     *
     * @return the phoneNumber value.
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Set the phoneNumber property: String of the E.164 format of the phone number.
     *
     * @param phoneNumber the phoneNumber value to set.
     * @return the AcquiredPhoneNumber object itself.
     */
    public AcquiredPhoneNumber setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get the acquiredCapabilities property: The set of all acquired capabilities of the phone number.
     *
     * @return the acquiredCapabilities value.
     */
    public List<Capability> getAcquiredCapabilities() {
        return this.acquiredCapabilities;
    }

    /**
     * Set the acquiredCapabilities property: The set of all acquired capabilities of the phone number.
     *
     * @param acquiredCapabilities the acquiredCapabilities value to set.
     * @return the AcquiredPhoneNumber object itself.
     */
    public AcquiredPhoneNumber setAcquiredCapabilities(List<Capability> acquiredCapabilities) {
        this.acquiredCapabilities = acquiredCapabilities;
        return this;
    }

    /**
     * Get the availableCapabilities property: The set of all available capabilities that can be acquired for this phone
     * number.
     *
     * @return the availableCapabilities value.
     */
    public List<Capability> getAvailableCapabilities() {
        return this.availableCapabilities;
    }

    /**
     * Set the availableCapabilities property: The set of all available capabilities that can be acquired for this phone
     * number.
     *
     * @param availableCapabilities the availableCapabilities value to set.
     * @return the AcquiredPhoneNumber object itself.
     */
    public AcquiredPhoneNumber setAvailableCapabilities(List<Capability> availableCapabilities) {
        this.availableCapabilities = availableCapabilities;
        return this;
    }

    /**
     * Get the assignmentStatus property: The assignment status of the phone number. Conveys what type of entity the
     * number is assigned to.
     *
     * @return the assignmentStatus value.
     */
    public AssignmentStatus getAssignmentStatus() {
        return this.assignmentStatus;
    }

    /**
     * Set the assignmentStatus property: The assignment status of the phone number. Conveys what type of entity the
     * number is assigned to.
     *
     * @param assignmentStatus the assignmentStatus value to set.
     * @return the AcquiredPhoneNumber object itself.
     */
    public AcquiredPhoneNumber setAssignmentStatus(AssignmentStatus assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
        return this;
    }

    /**
     * Get the placeName property: The name of the place of the phone number.
     *
     * @return the placeName value.
     */
    public String getPlaceName() {
        return this.placeName;
    }

    /**
     * Set the placeName property: The name of the place of the phone number.
     *
     * @param placeName the placeName value to set.
     * @return the AcquiredPhoneNumber object itself.
     */
    public AcquiredPhoneNumber setPlaceName(String placeName) {
        this.placeName = placeName;
        return this;
    }

    /**
     * Get the activationState property: The activation state of the phone number. Can be "Activated",
     * "AssignmentPending", "AssignmentFailed", "UpdatePending", "UpdateFailed".
     *
     * @return the activationState value.
     */
    public ActivationState getActivationState() {
        return this.activationState;
    }

    /**
     * Set the activationState property: The activation state of the phone number. Can be "Activated",
     * "AssignmentPending", "AssignmentFailed", "UpdatePending", "UpdateFailed".
     *
     * @param activationState the activationState value to set.
     * @return the AcquiredPhoneNumber object itself.
     */
    public AcquiredPhoneNumber setActivationState(ActivationState activationState) {
        this.activationState = activationState;
        return this;
    }
}
