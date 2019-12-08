/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IP access control.
 */
public class IPAccessControl {
    /**
     * The IP allow list.
     */
    @JsonProperty(value = "allow")
    private List<IPRange> allow;

    /**
     * Get the IP allow list.
     *
     * @return the allow value
     */
    public List<IPRange> allow() {
        return this.allow;
    }

    /**
     * Set the IP allow list.
     *
     * @param allow the allow value to set
     * @return the IPAccessControl object itself.
     */
    public IPAccessControl withAllow(List<IPRange> allow) {
        this.allow = allow;
        return this;
    }

}
