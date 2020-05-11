// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AppRole model. */
@Fluent
public final class AppRole {
    /*
     * Unique role identifier inside the appRoles collection.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Specifies whether this app role definition can be assigned to users and
     * groups by setting to 'User', or to other applications (that are
     * accessing this application in daemon service scenarios) by setting to
     * 'Application', or to both.
     */
    @JsonProperty(value = "allowedMemberTypes")
    private List<String> allowedMemberTypes;

    /*
     * Permission help text that appears in the admin app assignment and
     * consent experiences.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Display name for the permission that appears in the admin consent and
     * app assignment experiences.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * When creating or updating a role definition, this must be set to true
     * (which is the default). To delete a role, this must first be set to
     * false. At that point, in a subsequent call, this role may be removed.
     */
    @JsonProperty(value = "isEnabled")
    private Boolean isEnabled;

    /*
     * Specifies the value of the roles claim that the application should
     * expect in the authentication and access tokens.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the id property: Unique role identifier inside the appRoles collection.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Unique role identifier inside the appRoles collection.
     *
     * @param id the id value to set.
     * @return the AppRole object itself.
     */
    public AppRole withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the allowedMemberTypes property: Specifies whether this app role definition can be assigned to users and
     * groups by setting to 'User', or to other applications (that are accessing this application in daemon service
     * scenarios) by setting to 'Application', or to both.
     *
     * @return the allowedMemberTypes value.
     */
    public List<String> allowedMemberTypes() {
        return this.allowedMemberTypes;
    }

    /**
     * Set the allowedMemberTypes property: Specifies whether this app role definition can be assigned to users and
     * groups by setting to 'User', or to other applications (that are accessing this application in daemon service
     * scenarios) by setting to 'Application', or to both.
     *
     * @param allowedMemberTypes the allowedMemberTypes value to set.
     * @return the AppRole object itself.
     */
    public AppRole withAllowedMemberTypes(List<String> allowedMemberTypes) {
        this.allowedMemberTypes = allowedMemberTypes;
        return this;
    }

    /**
     * Get the description property: Permission help text that appears in the admin app assignment and consent
     * experiences.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Permission help text that appears in the admin app assignment and consent
     * experiences.
     *
     * @param description the description value to set.
     * @return the AppRole object itself.
     */
    public AppRole withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: Display name for the permission that appears in the admin consent and app
     * assignment experiences.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name for the permission that appears in the admin consent and app
     * assignment experiences.
     *
     * @param displayName the displayName value to set.
     * @return the AppRole object itself.
     */
    public AppRole withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the isEnabled property: When creating or updating a role definition, this must be set to true (which is the
     * default). To delete a role, this must first be set to false. At that point, in a subsequent call, this role may
     * be removed.
     *
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: When creating or updating a role definition, this must be set to true (which is the
     * default). To delete a role, this must first be set to false. At that point, in a subsequent call, this role may
     * be removed.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the AppRole object itself.
     */
    public AppRole withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the value property: Specifies the value of the roles claim that the application should expect in the
     * authentication and access tokens.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Specifies the value of the roles claim that the application should expect in the
     * authentication and access tokens.
     *
     * @param value the value value to set.
     * @return the AppRole object itself.
     */
    public AppRole withValue(String value) {
        this.value = value;
        return this;
    }
}
