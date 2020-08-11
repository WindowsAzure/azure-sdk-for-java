// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The UserListResult model. */
@Fluent
public final class UserListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserListResultInner.class);

    /*
     * the list of users.
     */
    @JsonProperty(value = "value")
    private List<UserInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "odata.nextLink")
    private String odataNextLink;

    /**
     * Get the value property: the list of users.
     *
     * @return the value value.
     */
    public List<UserInner> value() {
        return this.value;
    }

    /**
     * Set the value property: the list of users.
     *
     * @param value the value value to set.
     * @return the UserListResultInner object itself.
     */
    public UserListResultInner withValue(List<UserInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the odataNextLink property: The URL to get the next set of results.
     *
     * @return the odataNextLink value.
     */
    public String odataNextLink() {
        return this.odataNextLink;
    }

    /**
     * Set the odataNextLink property: The URL to get the next set of results.
     *
     * @param odataNextLink the odataNextLink value to set.
     * @return the UserListResultInner object itself.
     */
    public UserListResultInner withOdataNextLink(String odataNextLink) {
        this.odataNextLink = odataNextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
