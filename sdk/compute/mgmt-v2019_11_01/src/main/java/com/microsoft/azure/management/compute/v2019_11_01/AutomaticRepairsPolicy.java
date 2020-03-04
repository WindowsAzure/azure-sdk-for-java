/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the configuration parameters for automatic repairs on the virtual
 * machine scale set.
 */
public class AutomaticRepairsPolicy {
    /**
     * Specifies whether automatic repairs should be enabled on the virtual
     * machine scale set. The default value is false.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * The amount of time for which automatic repairs are suspended due to a
     * state change on VM. The grace time starts after the state change has
     * completed. This helps avoid premature or accidental repairs. The time
     * duration should be specified in ISO 8601 format. The minimum allowed
     * grace period is 30 minutes (PT30M), which is also the default value.
     */
    @JsonProperty(value = "gracePeriod")
    private String gracePeriod;

    /**
     * Get specifies whether automatic repairs should be enabled on the virtual machine scale set. The default value is false.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set specifies whether automatic repairs should be enabled on the virtual machine scale set. The default value is false.
     *
     * @param enabled the enabled value to set
     * @return the AutomaticRepairsPolicy object itself.
     */
    public AutomaticRepairsPolicy withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the amount of time for which automatic repairs are suspended due to a state change on VM. The grace time starts after the state change has completed. This helps avoid premature or accidental repairs. The time duration should be specified in ISO 8601 format. The minimum allowed grace period is 30 minutes (PT30M), which is also the default value.
     *
     * @return the gracePeriod value
     */
    public String gracePeriod() {
        return this.gracePeriod;
    }

    /**
     * Set the amount of time for which automatic repairs are suspended due to a state change on VM. The grace time starts after the state change has completed. This helps avoid premature or accidental repairs. The time duration should be specified in ISO 8601 format. The minimum allowed grace period is 30 minutes (PT30M), which is also the default value.
     *
     * @param gracePeriod the gracePeriod value to set
     * @return the AutomaticRepairsPolicy object itself.
     */
    public AutomaticRepairsPolicy withGracePeriod(String gracePeriod) {
        this.gracePeriod = gracePeriod;
        return this;
    }

}
