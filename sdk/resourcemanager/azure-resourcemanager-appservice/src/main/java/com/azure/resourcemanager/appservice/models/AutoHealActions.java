// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Actions which to take by the auto-heal module when a rule is triggered. */
@Fluent
public final class AutoHealActions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutoHealActions.class);

    /*
     * Predefined action to be taken.
     */
    @JsonProperty(value = "actionType")
    private AutoHealActionType actionType;

    /*
     * Custom action to be taken.
     */
    @JsonProperty(value = "customAction")
    private AutoHealCustomAction customAction;

    /*
     * Minimum time the process must execute
     * before taking the action
     */
    @JsonProperty(value = "minProcessExecutionTime")
    private String minProcessExecutionTime;

    /**
     * Get the actionType property: Predefined action to be taken.
     *
     * @return the actionType value.
     */
    public AutoHealActionType actionType() {
        return this.actionType;
    }

    /**
     * Set the actionType property: Predefined action to be taken.
     *
     * @param actionType the actionType value to set.
     * @return the AutoHealActions object itself.
     */
    public AutoHealActions withActionType(AutoHealActionType actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * Get the customAction property: Custom action to be taken.
     *
     * @return the customAction value.
     */
    public AutoHealCustomAction customAction() {
        return this.customAction;
    }

    /**
     * Set the customAction property: Custom action to be taken.
     *
     * @param customAction the customAction value to set.
     * @return the AutoHealActions object itself.
     */
    public AutoHealActions withCustomAction(AutoHealCustomAction customAction) {
        this.customAction = customAction;
        return this;
    }

    /**
     * Get the minProcessExecutionTime property: Minimum time the process must execute before taking the action.
     *
     * @return the minProcessExecutionTime value.
     */
    public String minProcessExecutionTime() {
        return this.minProcessExecutionTime;
    }

    /**
     * Set the minProcessExecutionTime property: Minimum time the process must execute before taking the action.
     *
     * @param minProcessExecutionTime the minProcessExecutionTime value to set.
     * @return the AutoHealActions object itself.
     */
    public AutoHealActions withMinProcessExecutionTime(String minProcessExecutionTime) {
        this.minProcessExecutionTime = minProcessExecutionTime;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customAction() != null) {
            customAction().validate();
        }
    }
}
