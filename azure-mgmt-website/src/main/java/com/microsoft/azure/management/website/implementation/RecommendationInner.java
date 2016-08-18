/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.website.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.website.NotificationLevel;
import com.microsoft.azure.management.website.Channels;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a recommendation result generated by the recommendation engine.
 */
public class RecommendationInner {
    /**
     * Timestamp when this instance was created.
     */
    private DateTime creationTime;

    /**
     * A GUID value that each recommendation object is associated with.
     */
    private String recommendationId;

    /**
     * Full ARM resource ID string that this recommendation object is
     * associated with.
     */
    private String resourceId;

    /**
     * Name of a resource type this recommendation applies, e.g. Subscription,
     * ServerFarm, WebApp.
     */
    private String resourceScope;

    /**
     * Unique name of the rule.
     */
    private String ruleName;

    /**
     * UI friendly name of the rule (may not be unique).
     */
    private String displayName;

    /**
     * Localized text of recommendation, good for UI.
     */
    private String message;

    /**
     * Level indicating how critical this recommendation can impact. Possible
     * values include: 'Critical', 'Warning', 'Information',
     * 'NonUrgentSuggestion'.
     */
    @JsonProperty(required = true)
    private NotificationLevel level;

    /**
     * List of channels that this recommendation can apply. Possible values
     * include: 'Notification', 'Api', 'Email', 'All'.
     */
    @JsonProperty(required = true)
    private Channels channels;

    /**
     * The list of category tags that this recommendation belongs to.
     */
    private List<String> tags;

    /**
     * Name of action recommended by this object.
     */
    private String actionName;

    /**
     * On/off flag indicating the rule is currently enabled or disabled.
     */
    private Integer enabled;

    /**
     * The beginning time of a range that the recommendation refers to.
     */
    private DateTime startTime;

    /**
     * The end time of a range that the recommendation refers to.
     */
    private DateTime endTime;

    /**
     * When to notify this recommendation next. Null means that this will
     * never be notified anymore.
     */
    private DateTime nextNotificationTime;

    /**
     * Date and time when this notification expires.
     */
    private DateTime notificationExpirationTime;

    /**
     * Last timestamp this instance was actually notified. Null means that
     * this recommendation hasn't been notified yet.
     */
    private DateTime notifiedTime;

    /**
     * A metric value measured by the rule.
     */
    private Double score;

    /**
     * Get the creationTime value.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime value.
     *
     * @param creationTime the creationTime value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the recommendationId value.
     *
     * @return the recommendationId value
     */
    public String recommendationId() {
        return this.recommendationId;
    }

    /**
     * Set the recommendationId value.
     *
     * @param recommendationId the recommendationId value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
        return this;
    }

    /**
     * Get the resourceId value.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId value.
     *
     * @param resourceId the resourceId value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the resourceScope value.
     *
     * @return the resourceScope value
     */
    public String resourceScope() {
        return this.resourceScope;
    }

    /**
     * Set the resourceScope value.
     *
     * @param resourceScope the resourceScope value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withResourceScope(String resourceScope) {
        this.resourceScope = resourceScope;
        return this;
    }

    /**
     * Get the ruleName value.
     *
     * @return the ruleName value
     */
    public String ruleName() {
        return this.ruleName;
    }

    /**
     * Set the ruleName value.
     *
     * @param ruleName the ruleName value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the level value.
     *
     * @return the level value
     */
    public NotificationLevel level() {
        return this.level;
    }

    /**
     * Set the level value.
     *
     * @param level the level value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withLevel(NotificationLevel level) {
        this.level = level;
        return this;
    }

    /**
     * Get the channels value.
     *
     * @return the channels value
     */
    public Channels channels() {
        return this.channels;
    }

    /**
     * Set the channels value.
     *
     * @param channels the channels value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withChannels(Channels channels) {
        this.channels = channels;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public List<String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the actionName value.
     *
     * @return the actionName value
     */
    public String actionName() {
        return this.actionName;
    }

    /**
     * Set the actionName value.
     *
     * @param actionName the actionName value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Integer enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withEnabled(Integer enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime value.
     *
     * @param endTime the endTime value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the nextNotificationTime value.
     *
     * @return the nextNotificationTime value
     */
    public DateTime nextNotificationTime() {
        return this.nextNotificationTime;
    }

    /**
     * Set the nextNotificationTime value.
     *
     * @param nextNotificationTime the nextNotificationTime value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withNextNotificationTime(DateTime nextNotificationTime) {
        this.nextNotificationTime = nextNotificationTime;
        return this;
    }

    /**
     * Get the notificationExpirationTime value.
     *
     * @return the notificationExpirationTime value
     */
    public DateTime notificationExpirationTime() {
        return this.notificationExpirationTime;
    }

    /**
     * Set the notificationExpirationTime value.
     *
     * @param notificationExpirationTime the notificationExpirationTime value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withNotificationExpirationTime(DateTime notificationExpirationTime) {
        this.notificationExpirationTime = notificationExpirationTime;
        return this;
    }

    /**
     * Get the notifiedTime value.
     *
     * @return the notifiedTime value
     */
    public DateTime notifiedTime() {
        return this.notifiedTime;
    }

    /**
     * Set the notifiedTime value.
     *
     * @param notifiedTime the notifiedTime value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withNotifiedTime(DateTime notifiedTime) {
        this.notifiedTime = notifiedTime;
        return this;
    }

    /**
     * Get the score value.
     *
     * @return the score value
     */
    public Double score() {
        return this.score;
    }

    /**
     * Set the score value.
     *
     * @param score the score value to set
     * @return the RecommendationInner object itself.
     */
    public RecommendationInner withScore(Double score) {
        this.score = score;
        return this;
    }

}
