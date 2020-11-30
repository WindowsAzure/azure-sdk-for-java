// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.accesscontrol.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Synapse role definition details. */
@Fluent
public final class SynapseRbacPermission {
    /*
     * List of actions
     */
    @JsonProperty(value = "actions")
    private List<String> actions;

    /*
     * List of Not actions
     */
    @JsonProperty(value = "notActions")
    private List<String> notActions;

    /*
     * List of data actions
     */
    @JsonProperty(value = "dataActions")
    private List<String> dataActions;

    /*
     * List of Not data actions
     */
    @JsonProperty(value = "notDataActions")
    private List<String> notDataActions;

    /**
     * Get the actions property: List of actions.
     *
     * @return the actions value.
     */
    public List<String> getActions() {
        return this.actions;
    }

    /**
     * Set the actions property: List of actions.
     *
     * @param actions the actions value to set.
     * @return the SynapseRbacPermission object itself.
     */
    public SynapseRbacPermission setActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the notActions property: List of Not actions.
     *
     * @return the notActions value.
     */
    public List<String> getNotActions() {
        return this.notActions;
    }

    /**
     * Set the notActions property: List of Not actions.
     *
     * @param notActions the notActions value to set.
     * @return the SynapseRbacPermission object itself.
     */
    public SynapseRbacPermission setNotActions(List<String> notActions) {
        this.notActions = notActions;
        return this;
    }

    /**
     * Get the dataActions property: List of data actions.
     *
     * @return the dataActions value.
     */
    public List<String> getDataActions() {
        return this.dataActions;
    }

    /**
     * Set the dataActions property: List of data actions.
     *
     * @param dataActions the dataActions value to set.
     * @return the SynapseRbacPermission object itself.
     */
    public SynapseRbacPermission setDataActions(List<String> dataActions) {
        this.dataActions = dataActions;
        return this;
    }

    /**
     * Get the notDataActions property: List of Not data actions.
     *
     * @return the notDataActions value.
     */
    public List<String> getNotDataActions() {
        return this.notDataActions;
    }

    /**
     * Set the notDataActions property: List of Not data actions.
     *
     * @param notDataActions the notDataActions value to set.
     * @return the SynapseRbacPermission object itself.
     */
    public SynapseRbacPermission setNotDataActions(List<String> notDataActions) {
        this.notDataActions = notDataActions;
        return this;
    }
}
