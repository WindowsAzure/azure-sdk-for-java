/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object that hold sync object details.
 */
public class AssociatedObject {
    /**
     * The display name of the object.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The distinguished name of the object.
     */
    @JsonProperty(value = "distinguishedName")
    private String distinguishedName;

    /**
     * The last dirSync time.
     */
    @JsonProperty(value = "lastDirSyncTime")
    private DateTime lastDirSyncTime;

    /**
     * The email of the object.
     */
    @JsonProperty(value = "mail")
    private String mail;

    /**
     * The object guid.
     */
    @JsonProperty(value = "objectGuid")
    private String objectGuid;

    /**
     * The object type.
     */
    @JsonProperty(value = "objectType")
    private String objectType;

    /**
     * The On-premises UPN.
     */
    @JsonProperty(value = "onpremisesUserPrincipalName")
    private String onpremisesUserPrincipalName;

    /**
     * The proxy addresses.
     */
    @JsonProperty(value = "proxyAddresses")
    private String proxyAddresses;

    /**
     * The source anchor.
     */
    @JsonProperty(value = "sourceAnchor")
    private String sourceAnchor;

    /**
     * The source of authority.
     */
    @JsonProperty(value = "sourceOfAuthority")
    private String sourceOfAuthority;

    /**
     * The time of the error.
     */
    @JsonProperty(value = "timeOccurred")
    private DateTime timeOccurred;

    /**
     * The UPN.
     */
    @JsonProperty(value = "userPrincipalName")
    private String userPrincipalName;

    /**
     * Get the display name of the object.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the object.
     *
     * @param displayName the displayName value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the distinguished name of the object.
     *
     * @return the distinguishedName value
     */
    public String distinguishedName() {
        return this.distinguishedName;
    }

    /**
     * Set the distinguished name of the object.
     *
     * @param distinguishedName the distinguishedName value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withDistinguishedName(String distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    /**
     * Get the last dirSync time.
     *
     * @return the lastDirSyncTime value
     */
    public DateTime lastDirSyncTime() {
        return this.lastDirSyncTime;
    }

    /**
     * Set the last dirSync time.
     *
     * @param lastDirSyncTime the lastDirSyncTime value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withLastDirSyncTime(DateTime lastDirSyncTime) {
        this.lastDirSyncTime = lastDirSyncTime;
        return this;
    }

    /**
     * Get the email of the object.
     *
     * @return the mail value
     */
    public String mail() {
        return this.mail;
    }

    /**
     * Set the email of the object.
     *
     * @param mail the mail value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withMail(String mail) {
        this.mail = mail;
        return this;
    }

    /**
     * Get the object guid.
     *
     * @return the objectGuid value
     */
    public String objectGuid() {
        return this.objectGuid;
    }

    /**
     * Set the object guid.
     *
     * @param objectGuid the objectGuid value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withObjectGuid(String objectGuid) {
        this.objectGuid = objectGuid;
        return this;
    }

    /**
     * Get the object type.
     *
     * @return the objectType value
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * Set the object type.
     *
     * @param objectType the objectType value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get the On-premises UPN.
     *
     * @return the onpremisesUserPrincipalName value
     */
    public String onpremisesUserPrincipalName() {
        return this.onpremisesUserPrincipalName;
    }

    /**
     * Set the On-premises UPN.
     *
     * @param onpremisesUserPrincipalName the onpremisesUserPrincipalName value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withOnpremisesUserPrincipalName(String onpremisesUserPrincipalName) {
        this.onpremisesUserPrincipalName = onpremisesUserPrincipalName;
        return this;
    }

    /**
     * Get the proxy addresses.
     *
     * @return the proxyAddresses value
     */
    public String proxyAddresses() {
        return this.proxyAddresses;
    }

    /**
     * Set the proxy addresses.
     *
     * @param proxyAddresses the proxyAddresses value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withProxyAddresses(String proxyAddresses) {
        this.proxyAddresses = proxyAddresses;
        return this;
    }

    /**
     * Get the source anchor.
     *
     * @return the sourceAnchor value
     */
    public String sourceAnchor() {
        return this.sourceAnchor;
    }

    /**
     * Set the source anchor.
     *
     * @param sourceAnchor the sourceAnchor value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withSourceAnchor(String sourceAnchor) {
        this.sourceAnchor = sourceAnchor;
        return this;
    }

    /**
     * Get the source of authority.
     *
     * @return the sourceOfAuthority value
     */
    public String sourceOfAuthority() {
        return this.sourceOfAuthority;
    }

    /**
     * Set the source of authority.
     *
     * @param sourceOfAuthority the sourceOfAuthority value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withSourceOfAuthority(String sourceOfAuthority) {
        this.sourceOfAuthority = sourceOfAuthority;
        return this;
    }

    /**
     * Get the time of the error.
     *
     * @return the timeOccurred value
     */
    public DateTime timeOccurred() {
        return this.timeOccurred;
    }

    /**
     * Set the time of the error.
     *
     * @param timeOccurred the timeOccurred value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withTimeOccurred(DateTime timeOccurred) {
        this.timeOccurred = timeOccurred;
        return this;
    }

    /**
     * Get the UPN.
     *
     * @return the userPrincipalName value
     */
    public String userPrincipalName() {
        return this.userPrincipalName;
    }

    /**
     * Set the UPN.
     *
     * @param userPrincipalName the userPrincipalName value to set
     * @return the AssociatedObject object itself.
     */
    public AssociatedObject withUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }

}
