/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import java.util.List;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.UserIdentityContractInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * User update parameters.
 */
@JsonFlatten
public class UserUpdateParameters {
    /**
     * Account state. Specifies whether the user is active or not. Blocked
     * users are unable to sign into the developer portal or call any APIs of
     * subscribed products. Default state is Active. Possible values include:
     * 'active', 'blocked', 'pending', 'deleted'.
     */
    @JsonProperty(value = "properties.state")
    private UserState state;

    /**
     * Optional note about a user set by the administrator.
     */
    @JsonProperty(value = "properties.note")
    private String note;

    /**
     * Collection of user identities.
     */
    @JsonProperty(value = "properties.identities")
    private List<UserIdentityContractInner> identities;

    /**
     * Email address. Must not be empty and must be unique within the service
     * instance.
     */
    @JsonProperty(value = "properties.email")
    private String email;

    /**
     * User Password.
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /**
     * First name.
     */
    @JsonProperty(value = "properties.firstName")
    private String firstName;

    /**
     * Last name.
     */
    @JsonProperty(value = "properties.lastName")
    private String lastName;

    /**
     * Get account state. Specifies whether the user is active or not. Blocked users are unable to sign into the developer portal or call any APIs of subscribed products. Default state is Active. Possible values include: 'active', 'blocked', 'pending', 'deleted'.
     *
     * @return the state value
     */
    public UserState state() {
        return this.state;
    }

    /**
     * Set account state. Specifies whether the user is active or not. Blocked users are unable to sign into the developer portal or call any APIs of subscribed products. Default state is Active. Possible values include: 'active', 'blocked', 'pending', 'deleted'.
     *
     * @param state the state value to set
     * @return the UserUpdateParameters object itself.
     */
    public UserUpdateParameters withState(UserState state) {
        this.state = state;
        return this;
    }

    /**
     * Get optional note about a user set by the administrator.
     *
     * @return the note value
     */
    public String note() {
        return this.note;
    }

    /**
     * Set optional note about a user set by the administrator.
     *
     * @param note the note value to set
     * @return the UserUpdateParameters object itself.
     */
    public UserUpdateParameters withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * Get collection of user identities.
     *
     * @return the identities value
     */
    public List<UserIdentityContractInner> identities() {
        return this.identities;
    }

    /**
     * Set collection of user identities.
     *
     * @param identities the identities value to set
     * @return the UserUpdateParameters object itself.
     */
    public UserUpdateParameters withIdentities(List<UserIdentityContractInner> identities) {
        this.identities = identities;
        return this;
    }

    /**
     * Get email address. Must not be empty and must be unique within the service instance.
     *
     * @return the email value
     */
    public String email() {
        return this.email;
    }

    /**
     * Set email address. Must not be empty and must be unique within the service instance.
     *
     * @param email the email value to set
     * @return the UserUpdateParameters object itself.
     */
    public UserUpdateParameters withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get user Password.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set user Password.
     *
     * @param password the password value to set
     * @return the UserUpdateParameters object itself.
     */
    public UserUpdateParameters withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get first name.
     *
     * @return the firstName value
     */
    public String firstName() {
        return this.firstName;
    }

    /**
     * Set first name.
     *
     * @param firstName the firstName value to set
     * @return the UserUpdateParameters object itself.
     */
    public UserUpdateParameters withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get last name.
     *
     * @return the lastName value
     */
    public String lastName() {
        return this.lastName;
    }

    /**
     * Set last name.
     *
     * @param lastName the lastName value to set
     * @return the UserUpdateParameters object itself.
     */
    public UserUpdateParameters withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

}
