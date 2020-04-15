// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The StaticSiteUserInvitationRequestResource model. */
@JsonFlatten
@Fluent
public class StaticSiteUserInvitationRequestResource extends ProxyOnlyResource {
    /*
     * The domain name for the static site custom domain.
     */
    @JsonProperty(value = "properties.domain")
    private String domain;

    /*
     * The identity provider for the static site user.
     */
    @JsonProperty(value = "properties.provider")
    private String provider;

    /*
     * The user id for the static site user.
     */
    @JsonProperty(value = "properties.userDetails")
    private String userDetails;

    /*
     * The roles for the static site user, in free-form string format
     */
    @JsonProperty(value = "properties.roles")
    private String roles;

    /*
     * The number of hours the sas token stays valid
     */
    @JsonProperty(value = "properties.numHoursToExpiration")
    private Integer numHoursToExpiration;

    /**
     * Get the domain property: The domain name for the static site custom domain.
     *
     * @return the domain value.
     */
    public String domain() {
        return this.domain;
    }

    /**
     * Set the domain property: The domain name for the static site custom domain.
     *
     * @param domain the domain value to set.
     * @return the StaticSiteUserInvitationRequestResource object itself.
     */
    public StaticSiteUserInvitationRequestResource withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get the provider property: The identity provider for the static site user.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: The identity provider for the static site user.
     *
     * @param provider the provider value to set.
     * @return the StaticSiteUserInvitationRequestResource object itself.
     */
    public StaticSiteUserInvitationRequestResource withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the userDetails property: The user id for the static site user.
     *
     * @return the userDetails value.
     */
    public String userDetails() {
        return this.userDetails;
    }

    /**
     * Set the userDetails property: The user id for the static site user.
     *
     * @param userDetails the userDetails value to set.
     * @return the StaticSiteUserInvitationRequestResource object itself.
     */
    public StaticSiteUserInvitationRequestResource withUserDetails(String userDetails) {
        this.userDetails = userDetails;
        return this;
    }

    /**
     * Get the roles property: The roles for the static site user, in free-form string format.
     *
     * @return the roles value.
     */
    public String roles() {
        return this.roles;
    }

    /**
     * Set the roles property: The roles for the static site user, in free-form string format.
     *
     * @param roles the roles value to set.
     * @return the StaticSiteUserInvitationRequestResource object itself.
     */
    public StaticSiteUserInvitationRequestResource withRoles(String roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Get the numHoursToExpiration property: The number of hours the sas token stays valid.
     *
     * @return the numHoursToExpiration value.
     */
    public Integer numHoursToExpiration() {
        return this.numHoursToExpiration;
    }

    /**
     * Set the numHoursToExpiration property: The number of hours the sas token stays valid.
     *
     * @param numHoursToExpiration the numHoursToExpiration value to set.
     * @return the StaticSiteUserInvitationRequestResource object itself.
     */
    public StaticSiteUserInvitationRequestResource withNumHoursToExpiration(Integer numHoursToExpiration) {
        this.numHoursToExpiration = numHoursToExpiration;
        return this;
    }
}
