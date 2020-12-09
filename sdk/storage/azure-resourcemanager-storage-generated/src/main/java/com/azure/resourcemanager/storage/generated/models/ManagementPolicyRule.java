// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An object that wraps the Lifecycle rule. Each rule is uniquely defined by name. */
@Fluent
public final class ManagementPolicyRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagementPolicyRule.class);

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
    private RuleType type;

    /*
     * An object that defines the Lifecycle rule.
     */
    @JsonProperty(value = "definition", required = true)
    private ManagementPolicyDefinition definition;

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
    public RuleType type() {
        return this.type;
    }

    /**
     * Set the type property: The valid value is Lifecycle.
     *
     * @param type the type value to set.
     * @return the ManagementPolicyRule object itself.
     */
    public ManagementPolicyRule withType(RuleType type) {
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

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model ManagementPolicyRule"));
        }
        if (type() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model ManagementPolicyRule"));
        }
        if (definition() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property definition in model ManagementPolicyRule"));
        } else {
            definition().validate();
        }
    }
}
