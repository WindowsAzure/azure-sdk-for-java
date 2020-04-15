// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ArmRoleReceiver model. */
@Fluent
public final class ArmRoleReceiver {
    /*
     * The name of the arm role receiver. Names must be unique across all
     * receivers within an action group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The arm role id.
     */
    @JsonProperty(value = "roleId", required = true)
    private String roleId;

    /*
     * Indicates whether to use common alert schema.
     */
    @JsonProperty(value = "useCommonAlertSchema", required = true)
    private boolean useCommonAlertSchema;

    /**
     * Get the name property: The name of the arm role receiver. Names must be unique across all receivers within an
     * action group.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the arm role receiver. Names must be unique across all receivers within an
     * action group.
     *
     * @param name the name value to set.
     * @return the ArmRoleReceiver object itself.
     */
    public ArmRoleReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the roleId property: The arm role id.
     *
     * @return the roleId value.
     */
    public String roleId() {
        return this.roleId;
    }

    /**
     * Set the roleId property: The arm role id.
     *
     * @param roleId the roleId value to set.
     * @return the ArmRoleReceiver object itself.
     */
    public ArmRoleReceiver withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * Get the useCommonAlertSchema property: Indicates whether to use common alert schema.
     *
     * @return the useCommonAlertSchema value.
     */
    public boolean useCommonAlertSchema() {
        return this.useCommonAlertSchema;
    }

    /**
     * Set the useCommonAlertSchema property: Indicates whether to use common alert schema.
     *
     * @param useCommonAlertSchema the useCommonAlertSchema value to set.
     * @return the ArmRoleReceiver object itself.
     */
    public ArmRoleReceiver withUseCommonAlertSchema(boolean useCommonAlertSchema) {
        this.useCommonAlertSchema = useCommonAlertSchema;
        return this;
    }
}
