/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * exportPolicy.
 * Set of export policy rules.
 */
public class VolumePatchPropertiesExportPolicy {
    /**
     * Export policy rule.
     * Export policy rule.
     */
    @JsonProperty(value = "rules")
    private List<ExportPolicyRule> rules;

    /**
     * Get export policy rule.
     *
     * @return the rules value
     */
    public List<ExportPolicyRule> rules() {
        return this.rules;
    }

    /**
     * Set export policy rule.
     *
     * @param rules the rules value to set
     * @return the VolumePatchPropertiesExportPolicy object itself.
     */
    public VolumePatchPropertiesExportPolicy withRules(List<ExportPolicyRule> rules) {
        this.rules = rules;
        return this;
    }

}
