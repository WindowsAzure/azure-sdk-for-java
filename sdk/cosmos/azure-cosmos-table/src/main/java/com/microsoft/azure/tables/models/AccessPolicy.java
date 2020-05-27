package com.microsoft.azure.tables.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The AccessPolicy model. */
@Fluent
public final class AccessPolicy {
    /*
     * The start datetime from which the policy is active.
     */
    @JsonProperty(value = "Start", required = true)
    private OffsetDateTime start;

    /*
     * The datetime that the policy expires.
     */
    @JsonProperty(value = "Expiry", required = true)
    private OffsetDateTime expiry;

    /*
     * The permissions for the acl policy.
     */
    @JsonProperty(value = "Permission", required = true)
    private String permission;

    /**
     * Get the start property: The start datetime from which the policy is active.
     *
     * @return the start value.
     */
    public OffsetDateTime getStart() {
        return this.start;
    }

    /**
     * Set the start property: The start datetime from which the policy is active.
     *
     * @param start the start value to set.
     * @return the AccessPolicy object itself.
     */
    public AccessPolicy setStart(OffsetDateTime start) {
        this.start = start;
        return this;
    }

    /**
     * Get the expiry property: The datetime that the policy expires.
     *
     * @return the expiry value.
     */
    public OffsetDateTime getExpiry() {
        return this.expiry;
    }

    /**
     * Set the expiry property: The datetime that the policy expires.
     *
     * @param expiry the expiry value to set.
     * @return the AccessPolicy object itself.
     */
    public AccessPolicy setExpiry(OffsetDateTime expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * Get the permission property: The permissions for the acl policy.
     *
     * @return the permission value.
     */
    public String getPermission() {
        return this.permission;
    }

    /**
     * Set the permission property: The permissions for the acl policy.
     *
     * @param permission the permission value to set.
     * @return the AccessPolicy object itself.
     */
    public AccessPolicy setPermission(String permission) {
        this.permission = permission;
        return this;
    }
}
