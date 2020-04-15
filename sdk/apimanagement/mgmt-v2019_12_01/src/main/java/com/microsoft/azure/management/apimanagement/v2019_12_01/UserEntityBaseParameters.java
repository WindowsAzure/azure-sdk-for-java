/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import java.util.List;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.UserIdentityContractInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User Entity Base Parameters set.
 */
public class UserEntityBaseParameters {
    /**
     * Account state. Specifies whether the user is active or not. Blocked
     * users are unable to sign into the developer portal or call any APIs of
     * subscribed products. Default state is Active. Possible values include:
     * 'active', 'blocked', 'pending', 'deleted'.
     */
    @JsonProperty(value = "state")
    private UserState state;

    /**
     * Optional note about a user set by the administrator.
     */
    @JsonProperty(value = "note")
    private String note;

    /**
     * Collection of user identities.
     */
    @JsonProperty(value = "identities")
    private List<UserIdentityContractInner> identities;

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
     * @return the UserEntityBaseParameters object itself.
     */
    public UserEntityBaseParameters withState(UserState state) {
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
     * @return the UserEntityBaseParameters object itself.
     */
    public UserEntityBaseParameters withNote(String note) {
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
     * @return the UserEntityBaseParameters object itself.
     */
    public UserEntityBaseParameters withIdentities(List<UserIdentityContractInner> identities) {
        this.identities = identities;
        return this;
    }

}
