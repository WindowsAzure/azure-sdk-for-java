// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AutoHealRules model.
 */
@Fluent
public final class AutoHealRules {
    /*
     * Triggers for auto-heal.
     */
    @JsonProperty(value = "triggers")
    private AutoHealTriggers triggers;

    /*
     * Actions which to take by the auto-heal module when a rule is triggered.
     */
    @JsonProperty(value = "actions")
    private AutoHealActions actions;

    /**
     * Get the triggers property: Triggers for auto-heal.
     * 
     * @return the triggers value.
     */
    public AutoHealTriggers triggers() {
        return this.triggers;
    }

    /**
     * Set the triggers property: Triggers for auto-heal.
     * 
     * @param triggers the triggers value to set.
     * @return the AutoHealRules object itself.
     */
    public AutoHealRules withTriggers(AutoHealTriggers triggers) {
        this.triggers = triggers;
        return this;
    }

    /**
     * Get the actions property: Actions which to take by the auto-heal module
     * when a rule is triggered.
     * 
     * @return the actions value.
     */
    public AutoHealActions actions() {
        return this.actions;
    }

    /**
     * Set the actions property: Actions which to take by the auto-heal module
     * when a rule is triggered.
     * 
     * @param actions the actions value to set.
     * @return the AutoHealRules object itself.
     */
    public AutoHealRules withActions(AutoHealActions actions) {
        this.actions = actions;
        return this;
    }
}
