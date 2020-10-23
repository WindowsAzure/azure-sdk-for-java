/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the mapping between this particular user and the type of access he
 * has on shares on this device.
 */
public class ShareAccessRight {
    /**
     * The share ID.
     */
    @JsonProperty(value = "shareId", required = true)
    private String shareId;

    /**
     * Type of access to be allowed on the share for this user. Possible values
     * include: 'Change', 'Read', 'Custom'.
     */
    @JsonProperty(value = "accessType", required = true)
    private ShareAccessType accessType;

    /**
     * Get the share ID.
     *
     * @return the shareId value
     */
    public String shareId() {
        return this.shareId;
    }

    /**
     * Set the share ID.
     *
     * @param shareId the shareId value to set
     * @return the ShareAccessRight object itself.
     */
    public ShareAccessRight withShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }

    /**
     * Get type of access to be allowed on the share for this user. Possible values include: 'Change', 'Read', 'Custom'.
     *
     * @return the accessType value
     */
    public ShareAccessType accessType() {
        return this.accessType;
    }

    /**
     * Set type of access to be allowed on the share for this user. Possible values include: 'Change', 'Read', 'Custom'.
     *
     * @param accessType the accessType value to set
     * @return the ShareAccessRight object itself.
     */
    public ShareAccessRight withAccessType(ShareAccessType accessType) {
        this.accessType = accessType;
        return this;
    }

}
