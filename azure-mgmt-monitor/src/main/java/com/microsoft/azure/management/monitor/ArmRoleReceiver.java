/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An arm role receiver.
 */
public class ArmRoleReceiver {
    /**
     * The name of the arm role receiver. Names must be unique across all
     * receivers within an action group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The arm role id.
     */
    @JsonProperty(value = "roleId", required = true)
    private String roleId;

    /**
     * Indicates whether to use common alert schema.
     */
    @JsonProperty(value = "useCommonAlertSchema", required = true)
    private boolean useCommonAlertSchema;

    /**
     * Get the name of the arm role receiver. Names must be unique across all receivers within an action group.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the arm role receiver. Names must be unique across all receivers within an action group.
     *
     * @param name the name value to set
     * @return the ArmRoleReceiver object itself.
     */
    public ArmRoleReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the arm role id.
     *
     * @return the roleId value
     */
    public String roleId() {
        return this.roleId;
    }

    /**
     * Set the arm role id.
     *
     * @param roleId the roleId value to set
     * @return the ArmRoleReceiver object itself.
     */
    public ArmRoleReceiver withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * Get indicates whether to use common alert schema.
     *
     * @return the useCommonAlertSchema value
     */
    public boolean useCommonAlertSchema() {
        return this.useCommonAlertSchema;
    }

    /**
     * Set indicates whether to use common alert schema.
     *
     * @param useCommonAlertSchema the useCommonAlertSchema value to set
     * @return the ArmRoleReceiver object itself.
     */
    public ArmRoleReceiver withUseCommonAlertSchema(boolean useCommonAlertSchema) {
        this.useCommonAlertSchema = useCommonAlertSchema;
        return this;
    }

}
