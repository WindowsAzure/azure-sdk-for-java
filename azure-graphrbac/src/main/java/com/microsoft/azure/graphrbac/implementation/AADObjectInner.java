/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac.implementation;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of an Active Directory object.
 */
public class AADObjectInner {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * The ID of the object.
     */
    @JsonProperty(value = "objectId")
    private String objectId;

    /**
     * The type of AAD object.
     */
    @JsonProperty(value = "objectType")
    private String objectType;

    /**
     * The display name of the object.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The principal name of the object.
     */
    @JsonProperty(value = "userPrincipalName")
    private String userPrincipalName;

    /**
     * The primary email address of the object.
     */
    @JsonProperty(value = "mail")
    private String mail;

    /**
     * Whether the AAD object is mail-enabled.
     */
    @JsonProperty(value = "mailEnabled")
    private Boolean mailEnabled;

    /**
     * The mail alias for the user.
     */
    @JsonProperty(value = "mailNickname", access = JsonProperty.Access.WRITE_ONLY)
    private String mailNickname;

    /**
     * Whether the AAD object is security-enabled.
     */
    @JsonProperty(value = "securityEnabled")
    private Boolean securityEnabled;

    /**
     * The sign-in name of the object.
     */
    @JsonProperty(value = "signInName")
    private String signInName;

    /**
     * A collection of service principal names associated with the object.
     */
    @JsonProperty(value = "servicePrincipalNames")
    private List<String> servicePrincipalNames;

    /**
     * The user type of the object.
     */
    @JsonProperty(value = "userType")
    private String userType;

    /**
     * A two letter country code (ISO standard 3166). Required for users that
     * will be assigned licenses due to legal requirement to check for
     * availability of services in countries. Examples include: "US", "JP", and
     * "GB".
     */
    @JsonProperty(value = "usageLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String usageLocation;

    /**
     * The application ID.
     */
    @JsonProperty(value = "appId", access = JsonProperty.Access.WRITE_ONLY)
    private String appId;

    /**
     * The application permissions.
     */
    @JsonProperty(value = "appPermissions", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> appPermissions;

    /**
     * Whether the application is be available to other tenants.
     */
    @JsonProperty(value = "availableToOtherTenants", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean availableToOtherTenants;

    /**
     * A collection of URIs for the application.
     */
    @JsonProperty(value = "identifierUris", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> identifierUris;

    /**
     * A collection of reply URLs for the application.
     */
    @JsonProperty(value = "replyUrls", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> replyUrls;

    /**
     * The home page of the application.
     */
    @JsonProperty(value = "homepage", access = JsonProperty.Access.WRITE_ONLY)
    private String homepage;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the ID of the object.
     *
     * @return the objectId value
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set the ID of the object.
     *
     * @param objectId the objectId value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get the type of AAD object.
     *
     * @return the objectType value
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * Set the type of AAD object.
     *
     * @param objectType the objectType value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get the display name of the object.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the object.
     *
     * @param displayName the displayName value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the principal name of the object.
     *
     * @return the userPrincipalName value
     */
    public String userPrincipalName() {
        return this.userPrincipalName;
    }

    /**
     * Set the principal name of the object.
     *
     * @param userPrincipalName the userPrincipalName value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }

    /**
     * Get the primary email address of the object.
     *
     * @return the mail value
     */
    public String mail() {
        return this.mail;
    }

    /**
     * Set the primary email address of the object.
     *
     * @param mail the mail value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withMail(String mail) {
        this.mail = mail;
        return this;
    }

    /**
     * Get whether the AAD object is mail-enabled.
     *
     * @return the mailEnabled value
     */
    public Boolean mailEnabled() {
        return this.mailEnabled;
    }

    /**
     * Set whether the AAD object is mail-enabled.
     *
     * @param mailEnabled the mailEnabled value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withMailEnabled(Boolean mailEnabled) {
        this.mailEnabled = mailEnabled;
        return this;
    }

    /**
     * Get the mail alias for the user.
     *
     * @return the mailNickname value
     */
    public String mailNickname() {
        return this.mailNickname;
    }

    /**
     * Get whether the AAD object is security-enabled.
     *
     * @return the securityEnabled value
     */
    public Boolean securityEnabled() {
        return this.securityEnabled;
    }

    /**
     * Set whether the AAD object is security-enabled.
     *
     * @param securityEnabled the securityEnabled value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withSecurityEnabled(Boolean securityEnabled) {
        this.securityEnabled = securityEnabled;
        return this;
    }

    /**
     * Get the sign-in name of the object.
     *
     * @return the signInName value
     */
    public String signInName() {
        return this.signInName;
    }

    /**
     * Set the sign-in name of the object.
     *
     * @param signInName the signInName value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withSignInName(String signInName) {
        this.signInName = signInName;
        return this;
    }

    /**
     * Get a collection of service principal names associated with the object.
     *
     * @return the servicePrincipalNames value
     */
    public List<String> servicePrincipalNames() {
        return this.servicePrincipalNames;
    }

    /**
     * Set a collection of service principal names associated with the object.
     *
     * @param servicePrincipalNames the servicePrincipalNames value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withServicePrincipalNames(List<String> servicePrincipalNames) {
        this.servicePrincipalNames = servicePrincipalNames;
        return this;
    }

    /**
     * Get the user type of the object.
     *
     * @return the userType value
     */
    public String userType() {
        return this.userType;
    }

    /**
     * Set the user type of the object.
     *
     * @param userType the userType value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    /**
     * Get a two letter country code (ISO standard 3166). Required for users that will be assigned licenses due to legal requirement to check for availability of services in countries. Examples include: "US", "JP", and "GB".
     *
     * @return the usageLocation value
     */
    public String usageLocation() {
        return this.usageLocation;
    }

    /**
     * Get the application ID.
     *
     * @return the appId value
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Get the application permissions.
     *
     * @return the appPermissions value
     */
    public List<String> appPermissions() {
        return this.appPermissions;
    }

    /**
     * Get whether the application is be available to other tenants.
     *
     * @return the availableToOtherTenants value
     */
    public Boolean availableToOtherTenants() {
        return this.availableToOtherTenants;
    }

    /**
     * Get a collection of URIs for the application.
     *
     * @return the identifierUris value
     */
    public List<String> identifierUris() {
        return this.identifierUris;
    }

    /**
     * Get a collection of reply URLs for the application.
     *
     * @return the replyUrls value
     */
    public List<String> replyUrls() {
        return this.replyUrls;
    }

    /**
     * Get the home page of the application.
     *
     * @return the homepage value
     */
    public String homepage() {
        return this.homepage;
    }

}
