/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Map of filter type and the details to filter. This field is required only if
 * the TransferConfigurationType is given as TransferUsingFilter.
 */
public class TransferConfigurationTransferFilterDetails {
    /**
     * Details of the filtering the transfer of data.
     */
    @JsonProperty(value = "include")
    private TransferFilterDetails include;

    /**
     * Get details of the filtering the transfer of data.
     *
     * @return the include value
     */
    public TransferFilterDetails include() {
        return this.include;
    }

    /**
     * Set details of the filtering the transfer of data.
     *
     * @param include the include value to set
     * @return the TransferConfigurationTransferFilterDetails object itself.
     */
    public TransferConfigurationTransferFilterDetails withInclude(TransferFilterDetails include) {
        this.include = include;
        return this;
    }

}
