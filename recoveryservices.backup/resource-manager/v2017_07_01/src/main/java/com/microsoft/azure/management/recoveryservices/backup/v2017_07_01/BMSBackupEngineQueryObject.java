/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Query parameters to fetch list of backup engines.
 */
public class BMSBackupEngineQueryObject {
    /**
     * attribute to add extended info.
     */
    @JsonProperty(value = "expand")
    private String expand;

    /**
     * Get attribute to add extended info.
     *
     * @return the expand value
     */
    public String expand() {
        return this.expand;
    }

    /**
     * Set attribute to add extended info.
     *
     * @param expand the expand value to set
     * @return the BMSBackupEngineQueryObject object itself.
     */
    public BMSBackupEngineQueryObject withExpand(String expand) {
        this.expand = expand;
        return this;
    }

}
