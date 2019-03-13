/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac;

import java.util.List;
import com.microsoft.azure.graphrbac.implementation.KeyCredentialInner;
import com.microsoft.azure.graphrbac.implementation.PasswordCredentialInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Active Directory service principal common properties shared among GET, POST
 * and PATCH.
 */
public class ServicePrincipalBase {
    /**
     * whether or not the service principal account is enabled.
     */
    @JsonProperty(value = "accountEnabled")
    private String accountEnabled;

    /**
     * Specifies whether an AppRoleAssignment to a user or group is required
     * before Azure AD will issue a user or access token to the application.
     */
    @JsonProperty(value = "appRoleAssignmentRequired")
    private Boolean appRoleAssignmentRequired;

    /**
     * The collection of key credentials associated with the service principal.
     */
    @JsonProperty(value = "keyCredentials")
    private List<KeyCredentialInner> keyCredentials;

    /**
     * The collection of password credentials associated with the service
     * principal.
     */
    @JsonProperty(value = "passwordCredentials")
    private List<PasswordCredentialInner> passwordCredentials;

    /**
     * the type of the service principal.
     */
    @JsonProperty(value = "servicePrincipalType")
    private String servicePrincipalType;

    /**
     * Optional list of tags that you can apply to your service principals. Not
     * nullable.
     */
    @JsonProperty(value = "tags")
    private List<String> tags;

    /**
     * Get whether or not the service principal account is enabled.
     *
     * @return the accountEnabled value
     */
    public String accountEnabled() {
        return this.accountEnabled;
    }

    /**
     * Set whether or not the service principal account is enabled.
     *
     * @param accountEnabled the accountEnabled value to set
     * @return the ServicePrincipalBase object itself.
     */
    public ServicePrincipalBase withAccountEnabled(String accountEnabled) {
        this.accountEnabled = accountEnabled;
        return this;
    }

    /**
     * Get specifies whether an AppRoleAssignment to a user or group is required before Azure AD will issue a user or access token to the application.
     *
     * @return the appRoleAssignmentRequired value
     */
    public Boolean appRoleAssignmentRequired() {
        return this.appRoleAssignmentRequired;
    }

    /**
     * Set specifies whether an AppRoleAssignment to a user or group is required before Azure AD will issue a user or access token to the application.
     *
     * @param appRoleAssignmentRequired the appRoleAssignmentRequired value to set
     * @return the ServicePrincipalBase object itself.
     */
    public ServicePrincipalBase withAppRoleAssignmentRequired(Boolean appRoleAssignmentRequired) {
        this.appRoleAssignmentRequired = appRoleAssignmentRequired;
        return this;
    }

    /**
     * Get the collection of key credentials associated with the service principal.
     *
     * @return the keyCredentials value
     */
    public List<KeyCredentialInner> keyCredentials() {
        return this.keyCredentials;
    }

    /**
     * Set the collection of key credentials associated with the service principal.
     *
     * @param keyCredentials the keyCredentials value to set
     * @return the ServicePrincipalBase object itself.
     */
    public ServicePrincipalBase withKeyCredentials(List<KeyCredentialInner> keyCredentials) {
        this.keyCredentials = keyCredentials;
        return this;
    }

    /**
     * Get the collection of password credentials associated with the service principal.
     *
     * @return the passwordCredentials value
     */
    public List<PasswordCredentialInner> passwordCredentials() {
        return this.passwordCredentials;
    }

    /**
     * Set the collection of password credentials associated with the service principal.
     *
     * @param passwordCredentials the passwordCredentials value to set
     * @return the ServicePrincipalBase object itself.
     */
    public ServicePrincipalBase withPasswordCredentials(List<PasswordCredentialInner> passwordCredentials) {
        this.passwordCredentials = passwordCredentials;
        return this;
    }

    /**
     * Get the type of the service principal.
     *
     * @return the servicePrincipalType value
     */
    public String servicePrincipalType() {
        return this.servicePrincipalType;
    }

    /**
     * Set the type of the service principal.
     *
     * @param servicePrincipalType the servicePrincipalType value to set
     * @return the ServicePrincipalBase object itself.
     */
    public ServicePrincipalBase withServicePrincipalType(String servicePrincipalType) {
        this.servicePrincipalType = servicePrincipalType;
        return this;
    }

    /**
     * Get optional list of tags that you can apply to your service principals. Not nullable.
     *
     * @return the tags value
     */
    public List<String> tags() {
        return this.tags;
    }

    /**
     * Set optional list of tags that you can apply to your service principals. Not nullable.
     *
     * @param tags the tags value to set
     * @return the ServicePrincipalBase object itself.
     */
    public ServicePrincipalBase withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

}
