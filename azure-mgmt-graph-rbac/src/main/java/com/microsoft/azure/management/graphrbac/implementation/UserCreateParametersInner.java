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
 * Request parameters for creating a new work or school account user.
 */
public class UserCreateParametersInner {
    /**
     * Whether the account is enabled.
     */
    @JsonProperty(value = "accountEnabled", required = true)
    private boolean accountEnabled;

    /**
     * The display name of the user.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /**
     * Password Profile.
     */
    @JsonProperty(value = "passwordProfile", required = true)
    private PasswordProfile passwordProfile;

    /**
     * The user principal name (someuser@contoso.com). It must contain one of
     * the verified domains for the tenant.
     */
    @JsonProperty(value = "userPrincipalName", required = true)
    private String userPrincipalName;

    /**
     * The mail alias for the user.
     */
    @JsonProperty(value = "mailNickname", required = true)
    private String mailNickname;

    /**
     * This must be specified if you are using a federated domain for the
     * user's userPrincipalName (UPN) property when creating a new user
     * account. It is used to associate an on-premises Active Directory user
     * account with their Azure AD user object.
     */
    @JsonProperty(value = "immutableId")
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
