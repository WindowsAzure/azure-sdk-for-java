/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.graphrbac.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Active Directory group information.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("Group")
public class ADGroupInner extends DirectoryObjectInner {
    /**
     * The display name of the group.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Whether the group is mail-enabled. Must be false. This is because only
     * pure security groups can be created using the Graph API.
     */
    @JsonProperty(value = "mailEnabled")
    private Boolean mailEnabled;

    /**
     * The mail alias for the group.
     */
    @JsonProperty(value = "mailNickname")
    private String mailNickname;

    /**
     * Whether the group is security-enable.
     */
    @JsonProperty(value = "securityEnabled")
    private Boolean securityEnabled;

    /**
     * The primary email address of the group.
     */
    @JsonProperty(value = "mail")
    private String mail;

    /**
     * Get the display name of the group.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the group.
     *
     * @param displayName the displayName value to set
     * @return the ADGroupInner object itself.
     */
    public ADGroupInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get whether the group is mail-enabled. Must be false. This is because only pure security groups can be created using the Graph API.
     *
     * @return the mailEnabled value
     */
    public Boolean mailEnabled() {
        return this.mailEnabled;
    }

    /**
     * Set whether the group is mail-enabled. Must be false. This is because only pure security groups can be created using the Graph API.
     *
     * @param mailEnabled the mailEnabled value to set
     * @return the ADGroupInner object itself.
     */
    public ADGroupInner withMailEnabled(Boolean mailEnabled) {
        this.mailEnabled = mailEnabled;
        return this;
    }

    /**
     * Get the mail alias for the group.
     *
     * @return the mailNickname value
     */
    public String mailNickname() {
        return this.mailNickname;
    }

    /**
     * Set the mail alias for the group.
     *
     * @param mailNickname the mailNickname value to set
     * @return the ADGroupInner object itself.
     */
    public ADGroupInner withMailNickname(String mailNickname) {
        this.mailNickname = mailNickname;
        return this;
    }

    /**
     * Get whether the group is security-enable.
     *
     * @return the securityEnabled value
     */
    public Boolean securityEnabled() {
        return this.securityEnabled;
    }

    /**
     * Set whether the group is security-enable.
     *
     * @param securityEnabled the securityEnabled value to set
     * @return the ADGroupInner object itself.
     */
    public ADGroupInner withSecurityEnabled(Boolean securityEnabled) {
        this.securityEnabled = securityEnabled;
        return this;
    }

    /**
     * Get the primary email address of the group.
     *
     * @return the mail value
     */
    public String mail() {
        return this.mail;
    }

    /**
     * Set the primary email address of the group.
     *
     * @param mail the mail value to set
     * @return the ADGroupInner object itself.
     */
    public ADGroupInner withMail(String mail) {
        this.mail = mail;
        return this;
    }

}
