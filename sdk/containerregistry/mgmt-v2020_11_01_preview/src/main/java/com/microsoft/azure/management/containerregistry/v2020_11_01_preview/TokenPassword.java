/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The password that will be used for authenticating the token of a container
 * registry.
 */
public class TokenPassword {
    /**
     * The creation datetime of the password.
     */
    @JsonProperty(value = "creationTime")
    private DateTime creationTime;

    /**
     * The expiry datetime of the password.
     */
    @JsonProperty(value = "expiry")
    private DateTime expiry;

    /**
     * The password name "password1" or "password2". Possible values include:
     * 'password1', 'password2'.
     */
    @JsonProperty(value = "name")
    private TokenPasswordName name;

    /**
     * The password value.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Get the creation datetime of the password.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creation datetime of the password.
     *
     * @param creationTime the creationTime value to set
     * @return the TokenPassword object itself.
     */
    public TokenPassword withCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the expiry datetime of the password.
     *
     * @return the expiry value
     */
    public DateTime expiry() {
        return this.expiry;
    }

    /**
     * Set the expiry datetime of the password.
     *
     * @param expiry the expiry value to set
     * @return the TokenPassword object itself.
     */
    public TokenPassword withExpiry(DateTime expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * Get the password name "password1" or "password2". Possible values include: 'password1', 'password2'.
     *
     * @return the name value
     */
    public TokenPasswordName name() {
        return this.name;
    }

    /**
     * Set the password name "password1" or "password2". Possible values include: 'password1', 'password2'.
     *
     * @param name the name value to set
     * @return the TokenPassword object itself.
     */
    public TokenPassword withName(TokenPasswordName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the password value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

}
