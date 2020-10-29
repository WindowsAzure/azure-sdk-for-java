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
 * Configuration for defining the transfer of data.
 */
public class TransferConfiguration {
    /**
     * Type of the configuration for transfer. Possible values include:
     * 'TransferAll', 'TransferUsingFilter'.
     */
    @JsonProperty(value = "transferConfigurationType", required = true)
    private TransferConfigurationType transferConfigurationType;

    /**
     * Map of filter type and the details to filter. This field is required
     * only if the TransferConfigurationType is given as TransferUsingFilter.
     */
    @JsonProperty(value = "transferFilterDetails")
    private TransferConfigurationTransferFilterDetails transferFilterDetails;

    /**
     * Map of filter type and the details to transfer all data. This field is
     * required only if the TransferConfigurationType is given as TransferAll.
     */
    @JsonProperty(value = "transferAllDetails")
    private TransferConfigurationTransferAllDetails transferAllDetails;

    /**
     * Get type of the configuration for transfer. Possible values include: 'TransferAll', 'TransferUsingFilter'.
     *
     * @return the transferConfigurationType value
     */
    public TransferConfigurationType transferConfigurationType() {
        return this.transferConfigurationType;
    }

    /**
     * Set type of the configuration for transfer. Possible values include: 'TransferAll', 'TransferUsingFilter'.
     *
     * @param transferConfigurationType the transferConfigurationType value to set
     * @return the TransferConfiguration object itself.
     */
    public TransferConfiguration withTransferConfigurationType(TransferConfigurationType transferConfigurationType) {
        this.transferConfigurationType = transferConfigurationType;
        return this;
    }

    /**
     * Get map of filter type and the details to filter. This field is required only if the TransferConfigurationType is given as TransferUsingFilter.
     *
     * @return the transferFilterDetails value
     */
    public TransferConfigurationTransferFilterDetails transferFilterDetails() {
        return this.transferFilterDetails;
    }

    /**
     * Set map of filter type and the details to filter. This field is required only if the TransferConfigurationType is given as TransferUsingFilter.
     *
     * @param transferFilterDetails the transferFilterDetails value to set
     * @return the TransferConfiguration object itself.
     */
    public TransferConfiguration withTransferFilterDetails(TransferConfigurationTransferFilterDetails transferFilterDetails) {
        this.transferFilterDetails = transferFilterDetails;
        return this;
    }

    /**
     * Get map of filter type and the details to transfer all data. This field is required only if the TransferConfigurationType is given as TransferAll.
     *
     * @return the transferAllDetails value
     */
    public TransferConfigurationTransferAllDetails transferAllDetails() {
        return this.transferAllDetails;
    }

    /**
     * Set map of filter type and the details to transfer all data. This field is required only if the TransferConfigurationType is given as TransferAll.
     *
     * @param transferAllDetails the transferAllDetails value to set
     * @return the TransferConfiguration object itself.
     */
    public TransferConfiguration withTransferAllDetails(TransferConfigurationTransferAllDetails transferAllDetails) {
        this.transferAllDetails = transferAllDetails;
        return this;
    }

}
