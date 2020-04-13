// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.azure.management.graphrbac.models.KeyCredentialInner;
import com.azure.management.graphrbac.models.PasswordCredentialInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ServicePrincipalBase model. */
@Fluent
public class ServicePrincipalBase {
    /*
     * whether or not the service principal account is enabled
     */
    @JsonProperty(value = "accountEnabled")
    private Boolean accountEnabled;

    /*
     * Specifies whether an AppRoleAssignment to a user or group is required
     * before Azure AD will issue a user or access token to the application.
     */
    @JsonProperty(value = "appRoleAssignmentRequired")
    private Boolean appRoleAssignmentRequired;

    /*
     * The collection of key credentials associated with the service principal.
     */
    @JsonProperty(value = "keyCredentials")
    private List<KeyCredentialInner> keyCredentials;

    /*
     * The collection of password credentials associated with the service
     * principal.
     */
    @JsonProperty(value = "passwordCredentials")
    private List<PasswordCredentialInner> passwordCredentials;

    /*
     * the type of the service principal
     */
    @JsonProperty(value = "servicePrincipalType")
    private String servicePrincipalType;

    /*
     * Optional list of tags that you can apply to your service principals. Not
     * nullable.
     */
    @JsonProperty(value = "tags")
    private List<String> tags;

    /**
     * Get the accountEnabled property: whether or not the service principal account is enabled.
     *
     * @return the accountEnabled value.
     */
    public Boolean accountEnabled() {
        return this.accountEnabled;
    }

    /**
     * Set the accountEnabled property: whether or not the service principal account is enabled.
     *
     * @param accountEnabled the accountEnabled value to set.
     * @return the ServicePrincipalBase object itself.
     */
    public ServicePrincipalBase withAccountEnabled(Boolean accountEnabled) {
        this.accountEnabled = accountEnabled;
        return this;
    }

    /**
     * Get the appRoleAssignmentRequired property: Specifies whether an AppRoleAssignment to a user or group is required
     * before Azure AD will issue a user or access token to the application.
     *
     * @return the appRoleAssignmentRequired value.
     */
    public Boolean appRoleAssignmentRequired() {
        return this.appRoleAssignmentRequired;
    }

    /**
     * Set the appRoleAssignmentRequired property: Specifies whether an AppRoleAssignment to a user or group is required
     * before Azure AD will issue a user or access token to the application.
     *
     * @param appRoleAssignmentRequired the appRoleAssignmentRequired value to set.
     * @return the ServicePrincipalBase object itself.
     */
    public ServicePrincipalBase withAppRoleAssignmentRequired(Boolean appRoleAssignmentRequired) {
        this.appRoleAssignmentRequired = appRoleAssignmentRequired;
        return this;
    }

    /**
     * Get the keyCredentials property: The collection of key credentials associated with the service principal.
     *
     * @return the keyCredentials value.
     */
    public List<KeyCredentialInner> keyCredentials() {
        return this.keyCredentials;
    }

    /**
     * Set the keyCredentials property: The collection of key credentials associated with the service principal.
     *
     * @param keyCredentials the keyCredentials value to set.
     * @return the ServicePrincipalBase object itself.
     */
    public ServicePrincipalBase withKeyCredentials(List<KeyCredentialInner> keyCredentials) {
        this.keyCredentials = keyCredentials;
        return this;
    }

    /**
     * Get the passwordCredentials property: The collection of password credentials associated with the service
     * principal.
     *
     * @return the passwordCredentials value.
     */
    public List<PasswordCredentialInner> passwordCredentials() {
        return this.passwordCredentials;
    }

    /**
     * Set the passwordCredentials property: The collection of password credentials associated with the service
     * principal.
     *
     * @param passwordCredentials the passwordCredentials value to set.
     * @return the ServicePrincipalBase object itself.
     */
    public ServicePrincipalBase withPasswordCredentials(List<PasswordCredentialInner> passwordCredentials) {
        this.passwordCredentials = passwordCredentials;
        return this;
    }

    /**
     * Get the servicePrincipalType property: the type of the service principal.
     *
     * @return the servicePrincipalType value.
     */
    public String servicePrincipalType() {
        return this.servicePrincipalType;
    }

    /**
     * Set the servicePrincipalType property: the type of the service principal.
     *
     * @param servicePrincipalType the servicePrincipalType value to set.
     * @return the ServicePrincipalBase object itself.
     */
    public ServicePrincipalBase withServicePrincipalType(String servicePrincipalType) {
        this.servicePrincipalType = servicePrincipalType;
        return this;
    }

    /**
     * Get the tags property: Optional list of tags that you can apply to your service principals. Not nullable.
     *
     * @return the tags value.
     */
    public List<String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Optional list of tags that you can apply to your service principals. Not nullable.
     *
     * @param tags the tags value to set.
     * @return the ServicePrincipalBase object itself.
     */
    public ServicePrincipalBase withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }
}
