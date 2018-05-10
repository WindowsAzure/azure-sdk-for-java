/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_03.implementation;

import java.util.List;
import com.microsoft.azure.management.monitor.v2018_03.AutoscaleProfile;
import com.microsoft.azure.management.monitor.v2018_03.AutoscaleNotification;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * The autoscale setting resource.
 */
@JsonFlatten
public class AutoscaleSettingResourceInner extends Resource {
    /**
     * the collection of automatic scaling profiles that specify different
     * scaling parameters for different time periods. A maximum of 20 profiles
     * can be specified.
     */
    @JsonProperty(value = "properties.profiles", required = true)
    private List<AutoscaleProfile> profiles;

    /**
     * the collection of notifications.
     */
    @JsonProperty(value = "properties.notifications")
    private List<AutoscaleNotification> notifications;

    /**
     * the enabled flag. Specifies whether automatic scaling is enabled for the
     * resource. The default value is 'true'.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * the name of the autoscale setting.
     */
    @JsonProperty(value = "properties.name")
    private String autoscaleSettingResourceName;

    /**
     * the resource identifier of the resource that the autoscale setting
     * should be added to.
     */
    @JsonProperty(value = "properties.targetResourceUri")
    private String targetResourceUri;

    /**
     * Get the profiles value.
     *
     * @return the profiles value
     */
    public List<AutoscaleProfile> profiles() {
        return this.profiles;
    }

    /**
     * Set the profiles value.
     *
     * @param profiles the profiles value to set
     * @return the AutoscaleSettingResourceInner object itself.
     */
    public AutoscaleSettingResourceInner withProfiles(List<AutoscaleProfile> profiles) {
        this.profiles = profiles;
        return this;
    }

    /**
     * Get the notifications value.
     *
     * @return the notifications value
     */
    public List<AutoscaleNotification> notifications() {
        return this.notifications;
    }

    /**
     * Set the notifications value.
     *
     * @param notifications the notifications value to set
     * @return the AutoscaleSettingResourceInner object itself.
     */
    public AutoscaleSettingResourceInner withNotifications(List<AutoscaleNotification> notifications) {
        this.notifications = notifications;
        return this;
    }

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the AutoscaleSettingResourceInner object itself.
     */
    public AutoscaleSettingResourceInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the autoscaleSettingResourceName value.
     *
     * @return the autoscaleSettingResourceName value
     */
    public String autoscaleSettingResourceName() {
        return this.autoscaleSettingResourceName;
    }

    /**
     * Set the autoscaleSettingResourceName value.
     *
     * @param autoscaleSettingResourceName the autoscaleSettingResourceName value to set
     * @return the AutoscaleSettingResourceInner object itself.
     */
    public AutoscaleSettingResourceInner withAutoscaleSettingResourceName(String autoscaleSettingResourceName) {
        this.autoscaleSettingResourceName = autoscaleSettingResourceName;
        return this;
    }

    /**
     * Get the targetResourceUri value.
     *
     * @return the targetResourceUri value
     */
    public String targetResourceUri() {
        return this.targetResourceUri;
    }

    /**
     * Set the targetResourceUri value.
     *
     * @param targetResourceUri the targetResourceUri value to set
     * @return the AutoscaleSettingResourceInner object itself.
     */
    public AutoscaleSettingResourceInner withTargetResourceUri(String targetResourceUri) {
        this.targetResourceUri = targetResourceUri;
        return this;
    }

}
