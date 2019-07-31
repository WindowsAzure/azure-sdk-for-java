/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity source for an Office365 service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Office365Source")
public class Office365Source extends CopySource {
    /**
     * The groups containing all the users. Type: array of strings (or
     * Expression with resultType array of strings).
     */
    @JsonProperty(value = "allowedGroups")
    private Object allowedGroups;

    /**
     * The user scope uri. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "userScopeFilterUri")
    private Object userScopeFilterUri;

    /**
     * The Column to apply the &lt;paramref name="StartTime"/&gt; and
     * &lt;paramref name="EndTime"/&gt;. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "dateFilterColumn")
    private Object dateFilterColumn;

    /**
     * Start time of the requested range for this dataset. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "startTime")
    private Object startTime;

    /**
     * End time of the requested range for this dataset. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "endTime")
    private Object endTime;

    /**
     * Get the groups containing all the users. Type: array of strings (or Expression with resultType array of strings).
     *
     * @return the allowedGroups value
     */
    public Object allowedGroups() {
        return this.allowedGroups;
    }

    /**
     * Set the groups containing all the users. Type: array of strings (or Expression with resultType array of strings).
     *
     * @param allowedGroups the allowedGroups value to set
     * @return the Office365Source object itself.
     */
    public Office365Source withAllowedGroups(Object allowedGroups) {
        this.allowedGroups = allowedGroups;
        return this;
    }

    /**
     * Get the user scope uri. Type: string (or Expression with resultType string).
     *
     * @return the userScopeFilterUri value
     */
    public Object userScopeFilterUri() {
        return this.userScopeFilterUri;
    }

    /**
     * Set the user scope uri. Type: string (or Expression with resultType string).
     *
     * @param userScopeFilterUri the userScopeFilterUri value to set
     * @return the Office365Source object itself.
     */
    public Office365Source withUserScopeFilterUri(Object userScopeFilterUri) {
        this.userScopeFilterUri = userScopeFilterUri;
        return this;
    }

    /**
     * Get the Column to apply the &lt;paramref name="StartTime"/&gt; and &lt;paramref name="EndTime"/&gt;. Type: string (or Expression with resultType string).
     *
     * @return the dateFilterColumn value
     */
    public Object dateFilterColumn() {
        return this.dateFilterColumn;
    }

    /**
     * Set the Column to apply the &lt;paramref name="StartTime"/&gt; and &lt;paramref name="EndTime"/&gt;. Type: string (or Expression with resultType string).
     *
     * @param dateFilterColumn the dateFilterColumn value to set
     * @return the Office365Source object itself.
     */
    public Office365Source withDateFilterColumn(Object dateFilterColumn) {
        this.dateFilterColumn = dateFilterColumn;
        return this;
    }

    /**
     * Get start time of the requested range for this dataset. Type: string (or Expression with resultType string).
     *
     * @return the startTime value
     */
    public Object startTime() {
        return this.startTime;
    }

    /**
     * Set start time of the requested range for this dataset. Type: string (or Expression with resultType string).
     *
     * @param startTime the startTime value to set
     * @return the Office365Source object itself.
     */
    public Office365Source withStartTime(Object startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get end time of the requested range for this dataset. Type: string (or Expression with resultType string).
     *
     * @return the endTime value
     */
    public Object endTime() {
        return this.endTime;
    }

    /**
     * Set end time of the requested range for this dataset. Type: string (or Expression with resultType string).
     *
     * @param endTime the endTime value to set
     * @return the Office365Source object itself.
     */
    public Office365Source withEndTime(Object endTime) {
        this.endTime = endTime;
        return this;
    }

}
