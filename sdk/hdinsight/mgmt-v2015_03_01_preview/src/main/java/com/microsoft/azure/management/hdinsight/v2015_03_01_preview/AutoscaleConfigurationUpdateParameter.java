/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The autoscale configuration update parameter.
 */
public class AutoscaleConfigurationUpdateParameter {
    /**
     * The autoscale configuration.
     */
    @JsonProperty(value = "autoscale")
    private Autoscale autoscale;

    /**
     * Get the autoscale configuration.
     *
     * @return the autoscale value
     */
    public Autoscale autoscale() {
        return this.autoscale;
    }

    /**
     * Set the autoscale configuration.
     *
     * @param autoscale the autoscale value to set
     * @return the AutoscaleConfigurationUpdateParameter object itself.
     */
    public AutoscaleConfigurationUpdateParameter withAutoscale(Autoscale autoscale) {
        this.autoscale = autoscale;
        return this;
    }

}
