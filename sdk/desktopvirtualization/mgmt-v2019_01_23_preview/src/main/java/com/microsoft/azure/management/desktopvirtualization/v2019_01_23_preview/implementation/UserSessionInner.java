/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.implementation;

import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.ApplicationType;
import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.SessionState;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Represents a UserSession definition.
 */
@JsonFlatten
public class UserSessionInner extends ProxyResource {
    /**
     * The user principal name.
     */
    @JsonProperty(value = "properties.userPrincipalName")
    private String userPrincipalName;

    /**
     * Application type of application. Possible values include: 'RemoteApp',
     * 'Desktop'.
     */
    @JsonProperty(value = "properties.applicationType")
    private ApplicationType applicationType;

    /**
     * State of user session. Possible values include: 'Unknown', 'Active',
     * 'Disconnected', 'Pending', 'LogOff', 'UserProfileDiskMounted'.
     */
    @JsonProperty(value = "properties.sessionState")
    private SessionState sessionState;

    /**
     * The active directory user name.
     */
    @JsonProperty(value = "properties.activeDirectoryUserName")
    private String activeDirectoryUserName;

    /**
     * The timestamp of the user session create.
     */
    @JsonProperty(value = "properties.createTime")
    private DateTime createTime;

    /**
     * Get the user principal name.
     *
     * @return the userPrincipalName value
     */
    public String userPrincipalName() {
        return this.userPrincipalName;
    }

    /**
     * Set the user principal name.
     *
     * @param userPrincipalName the userPrincipalName value to set
     * @return the UserSessionInner object itself.
     */
    public UserSessionInner withUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }

    /**
     * Get application type of application. Possible values include: 'RemoteApp', 'Desktop'.
     *
     * @return the applicationType value
     */
    public ApplicationType applicationType() {
        return this.applicationType;
    }

    /**
     * Set application type of application. Possible values include: 'RemoteApp', 'Desktop'.
     *
     * @param applicationType the applicationType value to set
     * @return the UserSessionInner object itself.
     */
    public UserSessionInner withApplicationType(ApplicationType applicationType) {
        this.applicationType = applicationType;
        return this;
    }

    /**
     * Get state of user session. Possible values include: 'Unknown', 'Active', 'Disconnected', 'Pending', 'LogOff', 'UserProfileDiskMounted'.
     *
     * @return the sessionState value
     */
    public SessionState sessionState() {
        return this.sessionState;
    }

    /**
     * Set state of user session. Possible values include: 'Unknown', 'Active', 'Disconnected', 'Pending', 'LogOff', 'UserProfileDiskMounted'.
     *
     * @param sessionState the sessionState value to set
     * @return the UserSessionInner object itself.
     */
    public UserSessionInner withSessionState(SessionState sessionState) {
        this.sessionState = sessionState;
        return this;
    }

    /**
     * Get the active directory user name.
     *
     * @return the activeDirectoryUserName value
     */
    public String activeDirectoryUserName() {
        return this.activeDirectoryUserName;
    }

    /**
     * Set the active directory user name.
     *
     * @param activeDirectoryUserName the activeDirectoryUserName value to set
     * @return the UserSessionInner object itself.
     */
    public UserSessionInner withActiveDirectoryUserName(String activeDirectoryUserName) {
        this.activeDirectoryUserName = activeDirectoryUserName;
        return this;
    }

    /**
     * Get the timestamp of the user session create.
     *
     * @return the createTime value
     */
    public DateTime createTime() {
        return this.createTime;
    }

    /**
     * Set the timestamp of the user session create.
     *
     * @param createTime the createTime value to set
     * @return the UserSessionInner object itself.
     */
    public UserSessionInner withCreateTime(DateTime createTime) {
        this.createTime = createTime;
        return this;
    }

}
