// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ManagementPolicyRule model. */
@Fluent
public final class ManagementPolicyRule {
    /*
     * Rule is enabled if set to true.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * A rule name can contain any combination of alpha numeric characters.
     * Rule name is case-sensitive. It must be unique within a policy.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The valid value is Lifecycle
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * An object that defines the Lifecycle rule.
     */
    @JsonProperty(value = "definition", required = true)
    private ManagementPolicyDefinition definition;

    /** Creates an instance of ManagementPolicyRule class. */
    public ManagementPolicyRule() {
        type = "Lifecycle";
    }

    /**
     * Get the enabled property: Rule is enabled if set to true.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Rule is enabled if set to true.
     *
     * @param enabled the enabled value to set.
     * @return the ManagementPolicyRule object itself.
     */
    public ManagementPolicyRule withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the name property: A rule name can contain any combination of alpha numeric characters. Rule name is
     * case-sensitive. It must be unique within a policy.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: A rule name can contain any combination of alpha numeric characters. Rule name is
     * case-sensitive. It must be unique within a policy.
     *
     * @param name the name value to set.
     * @return the ManagementPolicyRule object itself.
     */
    public ManagementPolicyRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The valid value is Lifecycle.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The valid value is Lifecycle.
     *
     * @param type the type value to set.
     * @return the ManagementPolicyRule object itself.
     */
    public ManagementPolicyRule withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the definition property: An object that defines the Lifecycle rule.
     *
     * @return the definition value.
     */
    public ManagementPolicyDefinition definition() {
        return this.definition;
    }

    /**
     * Set the definition property: An object that defines the Lifecycle rule.
     *
     * @param definition the definition value to set.
     * @return the ManagementPolicyRule object itself.
     */
    public ManagementPolicyRule withDefinition(ManagementPolicyDefinition definition) {
        this.definition = definition;
        return this;
    }
}
