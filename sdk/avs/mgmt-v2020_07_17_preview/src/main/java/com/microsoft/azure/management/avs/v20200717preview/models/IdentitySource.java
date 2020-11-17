/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_07_17_preview.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * vCenter Single Sign On Identity Source.
 */
public class IdentitySource {
    /**
     * The name of the identity source.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The domain's NetBIOS name.
     */
    @JsonProperty(value = "alias")
    private String alias;

    /**
     * The domain's dns name.
     */
    @JsonProperty(value = "domain")
    private String domain;

    /**
     * The base distinguished name for users.
     */
    @JsonProperty(value = "baseUserDN")
    private String baseUserDN;

    /**
     * The base distinguished name for groups.
     */
    @JsonProperty(value = "baseGroupDN")
    private String baseGroupDN;

    /**
     * Primary server URL.
     */
    @JsonProperty(value = "primaryServer")
    private String primaryServer;

    /**
     * Secondary server URL.
     */
    @JsonProperty(value = "secondaryServer")
    private String secondaryServer;

    /**
     * Protect LDAP communication using SSL certificate (LDAPS). Possible
     * values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "ssl")
    private SslEnum ssl;

    /**
     * The ID of an Active Directory user with a minimum of read-only access to
     * Base DN for users and group.
     */
    @JsonProperty(value = "username")
    private String username;

    /**
     * The password of the Active Directory user with a minimum of read-only
     * access to Base DN for users and groups.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get the name of the identity source.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the identity source.
     *
     * @param name the name value to set
     * @return the IdentitySource object itself.
     */
    public IdentitySource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the domain's NetBIOS name.
     *
     * @return the alias value
     */
    public String alias() {
        return this.alias;
    }

    /**
     * Set the domain's NetBIOS name.
     *
     * @param alias the alias value to set
     * @return the IdentitySource object itself.
     */
    public IdentitySource withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * Get the domain's dns name.
     *
     * @return the domain value
     */
    public String domain() {
        return this.domain;
    }

    /**
     * Set the domain's dns name.
     *
     * @param domain the domain value to set
     * @return the IdentitySource object itself.
     */
    public IdentitySource withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get the base distinguished name for users.
     *
     * @return the baseUserDN value
     */
    public String baseUserDN() {
        return this.baseUserDN;
    }

    /**
     * Set the base distinguished name for users.
     *
     * @param baseUserDN the baseUserDN value to set
     * @return the IdentitySource object itself.
     */
    public IdentitySource withBaseUserDN(String baseUserDN) {
        this.baseUserDN = baseUserDN;
        return this;
    }

    /**
     * Get the base distinguished name for groups.
     *
     * @return the baseGroupDN value
     */
    public String baseGroupDN() {
        return this.baseGroupDN;
    }

    /**
     * Set the base distinguished name for groups.
     *
     * @param baseGroupDN the baseGroupDN value to set
     * @return the IdentitySource object itself.
     */
    public IdentitySource withBaseGroupDN(String baseGroupDN) {
        this.baseGroupDN = baseGroupDN;
        return this;
    }

    /**
     * Get primary server URL.
     *
     * @return the primaryServer value
     */
    public String primaryServer() {
        return this.primaryServer;
    }

    /**
     * Set primary server URL.
     *
     * @param primaryServer the primaryServer value to set
     * @return the IdentitySource object itself.
     */
    public IdentitySource withPrimaryServer(String primaryServer) {
        this.primaryServer = primaryServer;
        return this;
    }

    /**
     * Get secondary server URL.
     *
     * @return the secondaryServer value
     */
    public String secondaryServer() {
        return this.secondaryServer;
    }

    /**
     * Set secondary server URL.
     *
     * @param secondaryServer the secondaryServer value to set
     * @return the IdentitySource object itself.
     */
    public IdentitySource withSecondaryServer(String secondaryServer) {
        this.secondaryServer = secondaryServer;
        return this;
    }

    /**
     * Get protect LDAP communication using SSL certificate (LDAPS). Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the ssl value
     */
    public SslEnum ssl() {
        return this.ssl;
    }

    /**
     * Set protect LDAP communication using SSL certificate (LDAPS). Possible values include: 'Enabled', 'Disabled'.
     *
     * @param ssl the ssl value to set
     * @return the IdentitySource object itself.
     */
    public IdentitySource withSsl(SslEnum ssl) {
        this.ssl = ssl;
        return this;
    }

    /**
     * Get the ID of an Active Directory user with a minimum of read-only access to Base DN for users and group.
     *
     * @return the username value
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the ID of an Active Directory user with a minimum of read-only access to Base DN for users and group.
     *
     * @param username the username value to set
     * @return the IdentitySource object itself.
     */
    public IdentitySource withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password of the Active Directory user with a minimum of read-only access to Base DN for users and groups.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password of the Active Directory user with a minimum of read-only access to Base DN for users and groups.
     *
     * @param password the password value to set
     * @return the IdentitySource object itself.
     */
    public IdentitySource withPassword(String password) {
        this.password = password;
        return this;
    }

}
