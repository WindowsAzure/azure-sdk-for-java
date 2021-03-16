// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.models.UserIdentityContractInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Parameters supplied to the Update User operation. */
@Fluent
public final class UserUpdateParametersProperties extends UserEntityBaseParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserUpdateParametersProperties.class);

    /*
     * Email address. Must not be empty and must be unique within the service
     * instance.
     */
    @JsonProperty(value = "email")
    private String email;

    /*
     * User Password.
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * First name.
     */
    @JsonProperty(value = "firstName")
    private String firstName;

    /*
     * Last name.
     */
    @JsonProperty(value = "lastName")
    private String lastName;

    /**
     * Get the email property: Email address. Must not be empty and must be unique within the service instance.
     *
     * @return the email value.
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email property: Email address. Must not be empty and must be unique within the service instance.
     *
     * @param email the email value to set.
     * @return the UserUpdateParametersProperties object itself.
     */
    public UserUpdateParametersProperties withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the password property: User Password.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: User Password.
     *
     * @param password the password value to set.
     * @return the UserUpdateParametersProperties object itself.
     */
    public UserUpdateParametersProperties withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the firstName property: First name.
     *
     * @return the firstName value.
     */
    public String firstName() {
        return this.firstName;
    }

    /**
     * Set the firstName property: First name.
     *
     * @param firstName the firstName value to set.
     * @return the UserUpdateParametersProperties object itself.
     */
    public UserUpdateParametersProperties withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get the lastName property: Last name.
     *
     * @return the lastName value.
     */
    public String lastName() {
        return this.lastName;
    }

    /**
     * Set the lastName property: Last name.
     *
     * @param lastName the lastName value to set.
     * @return the UserUpdateParametersProperties object itself.
     */
    public UserUpdateParametersProperties withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UserUpdateParametersProperties withState(UserState state) {
        super.withState(state);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UserUpdateParametersProperties withNote(String note) {
        super.withNote(note);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UserUpdateParametersProperties withIdentities(List<UserIdentityContractInner> identities) {
        super.withIdentities(identities);
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
    }
}
