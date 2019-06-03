/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Actions which to take by the auto-heal module when a rule is triggered.
 */
public class AutoHealActions {
    /**
     * Predefined action to be taken. Possible values include: 'Recycle',
     * 'LogEvent', 'CustomAction'.
     */
    @JsonProperty(value = "actionType")
    private AutoHealActionType actionType;

    /**
     * Custom action to be taken.
     */
    @JsonProperty(value = "customAction")
    private AutoHealCustomAction customAction;

    /**
     * Minimum time the process must execute
     * before taking the action.
     */
    @JsonProperty(value = "minProcessExecutionTime")
    private String minProcessExecutionTime;

    /**
     * Get predefined action to be taken. Possible values include: 'Recycle', 'LogEvent', 'CustomAction'.
     *
     * @return the actionType value
     */
    public AutoHealActionType actionType() {
        return this.actionType;
    }

    /**
     * Set predefined action to be taken. Possible values include: 'Recycle', 'LogEvent', 'CustomAction'.
     *
     * @param actionType the actionType value to set
     * @return the AutoHealActions object itself.
     */
    public AutoHealActions withActionType(AutoHealActionType actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * Get custom action to be taken.
     *
     * @return the customAction value
     */
    public AutoHealCustomAction customAction() {
        return this.customAction;
    }

    /**
     * Set custom action to be taken.
     *
     * @param customAction the customAction value to set
     * @return the AutoHealActions object itself.
     */
    public AutoHealActions withCustomAction(AutoHealCustomAction customAction) {
        this.customAction = customAction;
        return this;
    }

    /**
     * Get minimum time the process must execute
     before taking the action.
     *
     * @return the minProcessExecutionTime value
     */
    public String minProcessExecutionTime() {
        return this.minProcessExecutionTime;
    }

    /**
     * Set minimum time the process must execute
     before taking the action.
     *
     * @param minProcessExecutionTime the minProcessExecutionTime value to set
     * @return the AutoHealActions object itself.
     */
    public AutoHealActions withMinProcessExecutionTime(String minProcessExecutionTime) {
        this.minProcessExecutionTime = minProcessExecutionTime;
        return this;
    }

}
