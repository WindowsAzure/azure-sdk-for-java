// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class containing DNS settings in a Traffic Manager profile. */
@Fluent
public final class DnsConfig {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DnsConfig.class);

    /*
     * The relative DNS name provided by this Traffic Manager profile. This
     * value is combined with the DNS domain name used by Azure Traffic Manager
     * to form the fully-qualified domain name (FQDN) of the profile.
     */
    @JsonProperty(value = "relativeName")
    private String relativeName;

    /*
     * The fully-qualified domain name (FQDN) of the Traffic Manager profile.
     * This is formed from the concatenation of the RelativeName with the DNS
     * domain used by Azure Traffic Manager.
     */
    @JsonProperty(value = "fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /*
     * The DNS Time-To-Live (TTL), in seconds. This informs the local DNS
     * resolvers and DNS clients how long to cache DNS responses provided by
     * this Traffic Manager profile.
     */
    @JsonProperty(value = "ttl")
    private Long ttl;

    /**
     * Get the relativeName property: The relative DNS name provided by this Traffic Manager profile. This value is
     * combined with the DNS domain name used by Azure Traffic Manager to form the fully-qualified domain name (FQDN) of
     * the profile.
     *
     * @return the relativeName value.
     */
    public String relativeName() {
        return this.relativeName;
    }

    /**
     * Set the relativeName property: The relative DNS name provided by this Traffic Manager profile. This value is
     * combined with the DNS domain name used by Azure Traffic Manager to form the fully-qualified domain name (FQDN) of
     * the profile.
     *
     * @param relativeName the relativeName value to set.
     * @return the DnsConfig object itself.
     */
    public DnsConfig withRelativeName(String relativeName) {
        this.relativeName = relativeName;
        return this;
    }

    /**
     * Get the fqdn property: The fully-qualified domain name (FQDN) of the Traffic Manager profile. This is formed from
     * the concatenation of the RelativeName with the DNS domain used by Azure Traffic Manager.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Get the ttl property: The DNS Time-To-Live (TTL), in seconds. This informs the local DNS resolvers and DNS
     * clients how long to cache DNS responses provided by this Traffic Manager profile.
     *
     * @return the ttl value.
     */
    public Long ttl() {
        return this.ttl;
    }

    /**
     * Set the ttl property: The DNS Time-To-Live (TTL), in seconds. This informs the local DNS resolvers and DNS
     * clients how long to cache DNS responses provided by this Traffic Manager profile.
     *
     * @param ttl the ttl value to set.
     * @return the DnsConfig object itself.
     */
    public DnsConfig withTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
