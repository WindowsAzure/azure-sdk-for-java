// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The UserCreateParameters model. */
@Fluent
public final class UserCreateParameters extends UserBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserCreateParameters.class);

    /*
     * Whether the account is enabled.
     */
    @JsonProperty(value = "accountEnabled", required = true)
    private boolean accountEnabled;

    /*
     * The display name of the user.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /*
     * Password Profile
     */
    @JsonProperty(value = "passwordProfile", required = true)
    private PasswordProfile passwordProfile;

    /*
     * The user principal name (someuser@contoso.com). It must contain one of
     * the verified domains for the tenant.
     */
    @JsonProperty(value = "userPrincipalName", required = true)
    private String userPrincipalName;

    /*
     * The mail alias for the user.
     */
    @JsonProperty(value = "mailNickname", required = true)
    private String mailNickname;

    /*
     * The primary email address of the user.
     */
    @JsonProperty(value = "mail")
    private String mail;

    /**
     * Get the accountEnabled property: Whether the account is enabled.
     *
     * @return the accountEnabled value.
     */
    public boolean accountEnabled() {
        return this.accountEnabled;
    }

    /**
     * Set the accountEnabled property: Whether the account is enabled.
     *
     * @param accountEnabled the accountEnabled value to set.
     * @return the UserCreateParameters object itself.
     */
    public UserCreateParameters withAccountEnabled(boolean accountEnabled) {
        this.accountEnabled = accountEnabled;
        return this;
    }

    /**
     * Get the displayName property: The display name of the user.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the user.
     *
     * @param displayName the displayName value to set.
     * @return the UserCreateParameters object itself.
     */
    public UserCreateParameters withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the passwordProfile property: Password Profile.
     *
     * @return the passwordProfile value.
     */
    public PasswordProfile passwordProfile() {
        return this.passwordProfile;
    }

    /**
     * Set the passwordProfile property: Password Profile.
     *
     * @param passwordProfile the passwordProfile value to set.
     * @return the UserCreateParameters object itself.
     */
    public UserCreateParameters withPasswordProfile(PasswordProfile passwordProfile) {
        this.passwordProfile = passwordProfile;
        return this;
    }

    /**
     * Get the userPrincipalName property: The user principal name (someuser@contoso.com). It must contain one of the
     * verified domains for the tenant.
     *
     * @return the userPrincipalName value.
     */
    public String userPrincipalName() {
        return this.userPrincipalName;
    }

    /**
     * Set the userPrincipalName property: The user principal name (someuser@contoso.com). It must contain one of the
     * verified domains for the tenant.
     *
     * @param userPrincipalName the userPrincipalName value to set.
     * @return the UserCreateParameters object itself.
     */
    public UserCreateParameters withUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }

    /**
     * Get the mailNickname property: The mail alias for the user.
     *
     * @return the mailNickname value.
     */
    public String mailNickname() {
        return this.mailNickname;
    }

    /**
     * Set the mailNickname property: The mail alias for the user.
     *
     * @param mailNickname the mailNickname value to set.
     * @return the UserCreateParameters object itself.
     */
    public UserCreateParameters withMailNickname(String mailNickname) {
        this.mailNickname = mailNickname;
        return this;
    }

    /**
     * Get the mail property: The primary email address of the user.
     *
     * @return the mail value.
     */
    public String mail() {
        return this.mail;
    }

    /**
     * Set the mail property: The primary email address of the user.
     *
     * @param mail the mail value to set.
     * @return the UserCreateParameters object itself.
     */
    public UserCreateParameters withMail(String mail) {
        this.mail = mail;
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
        if (displayName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property displayName in model UserCreateParameters"));
        }
        if (passwordProfile() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property passwordProfile in model UserCreateParameters"));
        } else {
            passwordProfile().validate();
        }
        if (userPrincipalName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property userPrincipalName in model UserCreateParameters"));
        }
        if (mailNickname() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property mailNickname in model UserCreateParameters"));
        }
    }
}
