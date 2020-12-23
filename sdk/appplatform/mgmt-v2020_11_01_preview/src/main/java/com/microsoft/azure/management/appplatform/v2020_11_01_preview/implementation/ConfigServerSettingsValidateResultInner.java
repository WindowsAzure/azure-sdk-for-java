/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.ConfigServerSettingsErrorRecord;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Validation result for config server settings.
 */
public class ConfigServerSettingsValidateResultInner {
    /**
     * Indicate if the config server settings are valid.
     */
    @JsonProperty(value = "isValid")
    private Boolean isValid;

    /**
     * The detail validation results.
     */
    @JsonProperty(value = "details")
    private List<ConfigServerSettingsErrorRecord> details;

    /**
     * Get indicate if the config server settings are valid.
     *
     * @return the isValid value
     */
    public Boolean isValid() {
        return this.isValid;
    }

    /**
     * Set indicate if the config server settings are valid.
     *
     * @param isValid the isValid value to set
     * @return the ConfigServerSettingsValidateResultInner object itself.
     */
    public ConfigServerSettingsValidateResultInner withIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    /**
     * Get the detail validation results.
     *
     * @return the details value
     */
    public List<ConfigServerSettingsErrorRecord> details() {
        return this.details;
    }

    /**
     * Set the detail validation results.
     *
     * @param details the details value to set
     * @return the ConfigServerSettingsValidateResultInner object itself.
     */
    public ConfigServerSettingsValidateResultInner withDetails(List<ConfigServerSettingsErrorRecord> details) {
        this.details = details;
        return this;
    }

}
