// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The MSDeployProperties model.
 */
@Fluent
public final class MSDeployProperties extends MSDeployCore {
    /*
     * List of Add-On packages. Add-On packages implicitly enable the Do Not
     * Delete MSDeploy rule.
     */
    @JsonProperty(value = "addOnPackages")
    private List<MSDeployCore> addOnPackages;

    /**
     * Get the addOnPackages property: List of Add-On packages. Add-On packages
     * implicitly enable the Do Not Delete MSDeploy rule.
     * 
     * @return the addOnPackages value.
     */
    public List<MSDeployCore> addOnPackages() {
        return this.addOnPackages;
    }

    /**
     * Set the addOnPackages property: List of Add-On packages. Add-On packages
     * implicitly enable the Do Not Delete MSDeploy rule.
     * 
     * @param addOnPackages the addOnPackages value to set.
     * @return the MSDeployProperties object itself.
     */
    public MSDeployProperties withAddOnPackages(List<MSDeployCore> addOnPackages) {
        this.addOnPackages = addOnPackages;
        return this;
    }
}
