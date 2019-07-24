/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines contents of a web application firewall global configuration.
 */
public class PolicySettings {
    /**
     * Describes if the policy is in enabled state or disabled state. Possible
     * values include: 'Disabled', 'Enabled'.
     */
    @JsonProperty(value = "enabledState")
    private WebApplicationFirewallEnabledState enabledState;

    /**
     * Describes if it is in detection mode or prevention mode at policy level.
     * Possible values include: 'Prevention', 'Detection'.
     */
    @JsonProperty(value = "mode")
    private WebApplicationFirewallMode mode;

    /**
     * Get describes if the policy is in enabled state or disabled state. Possible values include: 'Disabled', 'Enabled'.
     *
     * @return the enabledState value
     */
    public WebApplicationFirewallEnabledState enabledState() {
        return this.enabledState;
    }

    /**
     * Set describes if the policy is in enabled state or disabled state. Possible values include: 'Disabled', 'Enabled'.
     *
     * @param enabledState the enabledState value to set
     * @return the PolicySettings object itself.
     */
    public PolicySettings withEnabledState(WebApplicationFirewallEnabledState enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Get describes if it is in detection mode or prevention mode at policy level. Possible values include: 'Prevention', 'Detection'.
     *
     * @return the mode value
     */
    public WebApplicationFirewallMode mode() {
        return this.mode;
    }

    /**
     * Set describes if it is in detection mode or prevention mode at policy level. Possible values include: 'Prevention', 'Detection'.
     *
     * @param mode the mode value to set
     * @return the PolicySettings object itself.
     */
    public PolicySettings withMode(WebApplicationFirewallMode mode) {
        this.mode = mode;
        return this;
    }

}
