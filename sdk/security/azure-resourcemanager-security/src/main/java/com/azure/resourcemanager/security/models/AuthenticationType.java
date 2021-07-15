// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AuthenticationType. */
public final class AuthenticationType extends ExpandableStringEnum<AuthenticationType> {
    /** Static value awsCreds for AuthenticationType. */
    public static final AuthenticationType AWS_CREDS = fromString("awsCreds");

    /** Static value awsAssumeRole for AuthenticationType. */
    public static final AuthenticationType AWS_ASSUME_ROLE = fromString("awsAssumeRole");

    /** Static value gcpCredentials for AuthenticationType. */
    public static final AuthenticationType GCP_CREDENTIALS = fromString("gcpCredentials");

    /**
     * Creates or finds a AuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AuthenticationType.
     */
    @JsonCreator
    public static AuthenticationType fromString(String name) {
        return fromString(name, AuthenticationType.class);
    }

    /** @return known AuthenticationType values. */
    public static Collection<AuthenticationType> values() {
        return values(AuthenticationType.class);
    }
}
