package com.microsoft.azure.tables.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SignedIdentifier model. */
@Fluent
public final class SignedIdentifier {
    /*
     * A unique id.
     */
    @JsonProperty(value = "Id", required = true)
    private String id;

    /*
     * The access policy.
     */
    @JsonProperty(value = "AccessPolicy", required = true)
    private AccessPolicy accessPolicy;

    /**
     * Get the id property: A unique id.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: A unique id.
     *
     * @param id the id value to set.
     * @return the SignedIdentifier object itself.
     */
    public SignedIdentifier setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the accessPolicy property: The access policy.
     *
     * @return the accessPolicy value.
     */
    public AccessPolicy getAccessPolicy() {
        return this.accessPolicy;
    }

    /**
     * Set the accessPolicy property: The access policy.
     *
     * @param accessPolicy the accessPolicy value to set.
     * @return the SignedIdentifier object itself.
     */
    public SignedIdentifier setAccessPolicy(AccessPolicy accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }
}
