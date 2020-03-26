// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ProviderOperation model.
 */
@Fluent
public final class ProviderOperation {
    /*
     * The operation name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The operation display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The operation description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The operation origin.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * The dataAction flag to specify the operation type.
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /**
     * Get the name property: The operation name.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The operation name.
     * 
     * @param name the name value to set.
     * @return the ProviderOperation object itself.
     */
    public ProviderOperation setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: The operation display name.
     * 
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The operation display name.
     * 
     * @param displayName the displayName value to set.
     * @return the ProviderOperation object itself.
     */
    public ProviderOperation setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: The operation description.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The operation description.
     * 
     * @param description the description value to set.
     * @return the ProviderOperation object itself.
     */
    public ProviderOperation setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the origin property: The operation origin.
     * 
     * @return the origin value.
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * Set the origin property: The operation origin.
     * 
     * @param origin the origin value to set.
     * @return the ProviderOperation object itself.
     */
    public ProviderOperation setOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the isDataAction property: The dataAction flag to specify the
     * operation type.
     * 
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the isDataAction property: The dataAction flag to specify the
     * operation type.
     * 
     * @param isDataAction the isDataAction value to set.
     * @return the ProviderOperation object itself.
     */
    public ProviderOperation setIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }
}
