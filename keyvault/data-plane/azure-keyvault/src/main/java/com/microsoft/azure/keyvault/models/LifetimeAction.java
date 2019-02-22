// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.keyvault.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Action and its trigger that will be performed by Key Vault over the lifetime
 * of a certificate.
 */
public class LifetimeAction {
    /**
     * The condition that will execute the action.
     */
    @JsonProperty(value = "trigger")
    private Trigger trigger;

    /**
     * The action that will be executed.
     */
    @JsonProperty(value = "action")
    private Action action;

    /**
     * Get the trigger value.
     *
     * @return the trigger value
     */
    public Trigger trigger() {
        return this.trigger;
    }

    /**
     * Set the trigger value.
     *
     * @param trigger the trigger value to set
     * @return the LifetimeAction object itself.
     */
    public LifetimeAction withTrigger(Trigger trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Get the action value.
     *
     * @return the action value
     */
    public Action action() {
        return this.action;
    }

    /**
     * Set the action value.
     *
     * @param action the action value to set
     * @return the LifetimeAction object itself.
     */
    public LifetimeAction withAction(Action action) {
        this.action = action;
        return this;
    }

}
