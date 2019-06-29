// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * An Access policy.
 */
@JacksonXmlRootElement(localName = "AccessPolicy")
public final class AccessPolicy {
    /*
     * The date-time the policy is active.
     */
    @JsonProperty(value = "Start")
    private OffsetDateTime start;

    /*
     * The date-time the policy expires.
     */
    @JsonProperty(value = "Expiry")
    private OffsetDateTime expiry;

    /*
     * The permissions for the ACL policy.
     */
    @JsonProperty(value = "Permission")
    private String permission;

    /**
     * Get the start property: The date-time the policy is active.
     *
     * @return the start value.
     */
    public OffsetDateTime start() {
        return this.start;
    }

    /**
     * Set the start property: The date-time the policy is active.
     *
     * @param start the start value to set.
     * @return the AccessPolicy object itself.
     */
    public AccessPolicy start(OffsetDateTime start) {
        this.start = start;
        return this;
    }

    /**
     * Get the expiry property: The date-time the policy expires.
     *
     * @return the expiry value.
     */
    public OffsetDateTime expiry() {
        return this.expiry;
    }

    /**
     * Set the expiry property: The date-time the policy expires.
     *
     * @param expiry the expiry value to set.
     * @return the AccessPolicy object itself.
     */
    public AccessPolicy expiry(OffsetDateTime expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * Get the permission property: The permissions for the ACL policy.
     *
     * @return the permission value.
     */
    public String permission() {
        return this.permission;
    }

    /**
     * Set the permission property: The permissions for the ACL policy.
     *
     * @param permission the permission value to set.
     * @return the AccessPolicy object itself.
     */
    public AccessPolicy permission(String permission) {
        this.permission = permission;
        return this;
    }
}
