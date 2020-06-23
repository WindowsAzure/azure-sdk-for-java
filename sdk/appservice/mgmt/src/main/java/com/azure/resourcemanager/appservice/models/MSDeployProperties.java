// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The MSDeployProperties model. */
@Fluent
public final class MSDeployProperties extends MSDeployCore {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MSDeployProperties.class);

    /*
     * List of Add-On packages. Add-On packages implicitly enable the Do Not
     * Delete MSDeploy rule.
     */
    @JsonProperty(value = "addOnPackages")
    private List<MSDeployCore> addOnPackages;

    /**
     * Get the addOnPackages property: List of Add-On packages. Add-On packages implicitly enable the Do Not Delete
     * MSDeploy rule.
     *
     * @return the addOnPackages value.
     */
    public List<MSDeployCore> addOnPackages() {
        return this.addOnPackages;
    }

    /**
     * Set the addOnPackages property: List of Add-On packages. Add-On packages implicitly enable the Do Not Delete
     * MSDeploy rule.
     *
     * @param addOnPackages the addOnPackages value to set.
     * @return the MSDeployProperties object itself.
     */
    public MSDeployProperties withAddOnPackages(List<MSDeployCore> addOnPackages) {
        this.addOnPackages = addOnPackages;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (addOnPackages() != null) {
            addOnPackages().forEach(e -> e.validate());
        }
    }
}
