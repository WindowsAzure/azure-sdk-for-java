/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.graphrbac.implementation;

import com.microsoft.azure.management.graphrbac.PasswordProfile;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request parameters for create a new work or school account user.
 */
public class UserCreateParametersInner {
    /**
     * Enable the account. If it is enabled then true else false.
     */
    @JsonProperty(required = true)
    private boolean accountEnabled;

    /**
     * User display name.
     */
    @JsonProperty(required = true)
    private String displayName;

    /**
     * Password Profile.
     */
    @JsonProperty(required = true)
    private PasswordProfile passwordProfile;

    /**
     * The user principal name (someuser@contoso.com). It must contain one of
     * the verified domains for the tenant.
     */
    @JsonProperty(required = true)
    private String userPrincipalName;

    /**
     * The mail alias for the user.
     */
    @JsonProperty(required = true)
    private String mailNickname;

    /**
     * Needs to be specified if you are using a federated domain for the
     * user's userPrincipalName (UPN) property while creating a new user
     * account. It is used to associate an on-premises Active Directory user
     * account to their Azure AD user object.
     */
    private String immutableId;

    /**
     * Get the accountEnabled value.
     *
     * @return the accountEnabled value
     */
    public boolean accountEnabled() {
        return this.accountEnabled;
    }

    /**
     * Set the accountEnabled value.
     *
     * @param accountEnabled the accountEnabled value to set
     * @return the UserCreateParametersInner object itself.
     */
    public UserCreateParametersInner withAccountEnabled(boolean accountEnabled) {
        this.accountEnabled = accountEnabled;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the UserCreateParametersInner object itself.
     */
    public UserCreateParametersInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the passwordProfile value.
     *
     * @return the passwordProfile value
     */
    public PasswordProfile passwordProfile() {
        return this.passwordProfile;
    }

    /**
     * Set the passwordProfile value.
     *
     * @param passwordProfile the passwordProfile value to set
     * @return the UserCreateParametersInner object itself.
     */
    public UserCreateParametersInner withPasswordProfile(PasswordProfile passwordProfile) {
        this.passwordProfile = passwordProfile;
        return this;
    }

    /**
     * Get the userPrincipalName value.
     *
     * @return the userPrincipalName value
     */
    public String userPrincipalName() {
        return this.userPrincipalName;
    }

    /**
     * Set the userPrincipalName value.
     *
     * @param userPrincipalName the userPrincipalName value to set
     * @return the UserCreateParametersInner object itself.
     */
    public UserCreateParametersInner withUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }

    /**
     * Get the mailNickname value.
     *
     * @return the mailNickname value
     */
    public String mailNickname() {
        return this.mailNickname;
    }

    /**
     * Set the mailNickname value.
     *
     * @param mailNickname the mailNickname value to set
     * @return the UserCreateParametersInner object itself.
     */
    public UserCreateParametersInner withMailNickname(String mailNickname) {
        this.mailNickname = mailNickname;
        return this;
    }

    /**
     * Get the immutableId value.
     *
     * @return the immutableId value
     */
    public String immutableId() {
        return this.immutableId;
    }

    /**
     * Set the immutableId value.
     *
     * @param immutableId the immutableId value to set
     * @return the UserCreateParametersInner object itself.
     */
    public UserCreateParametersInner withImmutableId(String immutableId) {
        this.immutableId = immutableId;
        return this;
    }

}
