/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Issue update Parameters.
 */
@JsonFlatten
public class IssueUpdateContract {
    /**
     * Date and time when the issue was created.
     */
    @JsonProperty(value = "properties.createdDate")
    private DateTime createdDate;

    /**
     * Status of the issue. Possible values include: 'proposed', 'open',
     * 'removed', 'resolved', 'closed'.
     */
    @JsonProperty(value = "properties.state")
    private State state;

    /**
     * A resource identifier for the API the issue was created for.
     */
    @JsonProperty(value = "properties.apiId")
    private String apiId;

    /**
     * The issue title.
     */
    @JsonProperty(value = "properties.title")
    private String title;

    /**
     * Text describing the issue.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * A resource identifier for the user created the issue.
     */
    @JsonProperty(value = "properties.userId")
    private String userId;

    /**
     * Get date and time when the issue was created.
     *
     * @return the createdDate value
     */
    public DateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Set date and time when the issue was created.
     *
     * @param createdDate the createdDate value to set
     * @return the IssueUpdateContract object itself.
     */
    public IssueUpdateContract withCreatedDate(DateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get status of the issue. Possible values include: 'proposed', 'open', 'removed', 'resolved', 'closed'.
     *
     * @return the state value
     */
    public State state() {
        return this.state;
    }

    /**
     * Set status of the issue. Possible values include: 'proposed', 'open', 'removed', 'resolved', 'closed'.
     *
     * @param state the state value to set
     * @return the IssueUpdateContract object itself.
     */
    public IssueUpdateContract withState(State state) {
        this.state = state;
        return this;
    }

    /**
     * Get a resource identifier for the API the issue was created for.
     *
     * @return the apiId value
     */
    public String apiId() {
        return this.apiId;
    }

    /**
     * Set a resource identifier for the API the issue was created for.
     *
     * @param apiId the apiId value to set
     * @return the IssueUpdateContract object itself.
     */
    public IssueUpdateContract withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * Get the issue title.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the issue title.
     *
     * @param title the title value to set
     * @return the IssueUpdateContract object itself.
     */
    public IssueUpdateContract withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get text describing the issue.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set text describing the issue.
     *
     * @param description the description value to set
     * @return the IssueUpdateContract object itself.
     */
    public IssueUpdateContract withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get a resource identifier for the user created the issue.
     *
     * @return the userId value
     */
    public String userId() {
        return this.userId;
    }

    /**
     * Set a resource identifier for the user created the issue.
     *
     * @param userId the userId value to set
     * @return the IssueUpdateContract object itself.
     */
    public IssueUpdateContract withUserId(String userId) {
        this.userId = userId;
        return this;
    }

}
