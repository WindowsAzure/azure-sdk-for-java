/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of Mount Targets.
 */
public class MountTargetList {
    /**
     * A list of Mount targets.
     */
    @JsonProperty(value = "value")
    private List<MountTarget> value;

    /**
     * Get a list of Mount targets.
     *
     * @return the value value
     */
    public List<MountTarget> value() {
        return this.value;
    }

    /**
     * Set a list of Mount targets.
     *
     * @param value the value value to set
     * @return the MountTargetList object itself.
     */
    public MountTargetList withValue(List<MountTarget> value) {
        this.value = value;
        return this;
    }

}
