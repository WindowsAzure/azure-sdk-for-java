/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2016_03_01.implementation;

import java.util.List;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.SharedAccessAuthorizationRuleProperties;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.ApnsCredential;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.WnsCredential;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.GcmCredential;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.MpnsCredential;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.AdmCredential;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.BaiduCredential;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Description of a NotificationHub Resource.
 */
@JsonFlatten
public class NotificationHubResourceInner extends Resource {
    /**
     * The NotificationHub name.
     */
    @JsonProperty(value = "properties.name")
    private String notificationHubResourceName;

    /**
     * The RegistrationTtl of the created NotificationHub.
     */
    @JsonProperty(value = "properties.registrationTtl")
    private String registrationTtl;

    /**
     * The AuthorizationRules of the created NotificationHub.
     */
    @JsonProperty(value = "properties.authorizationRules")
    private List<SharedAccessAuthorizationRuleProperties> authorizationRules;

    /**
     * The ApnsCredential of the created NotificationHub.
     */
    @JsonProperty(value = "properties.apnsCredential")
    private ApnsCredential apnsCredential;

    /**
     * The WnsCredential of the created NotificationHub.
     */
    @JsonProperty(value = "properties.wnsCredential")
    private WnsCredential wnsCredential;

    /**
     * The GcmCredential of the created NotificationHub.
     */
    @JsonProperty(value = "properties.gcmCredential")
    private GcmCredential gcmCredential;

    /**
     * The MpnsCredential of the created NotificationHub.
     */
    @JsonProperty(value = "properties.mpnsCredential")
    private MpnsCredential mpnsCredential;

    /**
     * The AdmCredential of the created NotificationHub.
     */
    @JsonProperty(value = "properties.admCredential")
    private AdmCredential admCredential;

    /**
     * The BaiduCredential of the created NotificationHub.
     */
    @JsonProperty(value = "properties.baiduCredential")
    private BaiduCredential baiduCredential;

    /**
     * The sku of the created namespace.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Get the NotificationHub name.
     *
     * @return the notificationHubResourceName value
     */
    public String notificationHubResourceName() {
        return this.notificationHubResourceName;
    }

    /**
     * Set the NotificationHub name.
     *
     * @param notificationHubResourceName the notificationHubResourceName value to set
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withNotificationHubResourceName(String notificationHubResourceName) {
        this.notificationHubResourceName = notificationHubResourceName;
        return this;
    }

    /**
     * Get the RegistrationTtl of the created NotificationHub.
     *
     * @return the registrationTtl value
     */
    public String registrationTtl() {
        return this.registrationTtl;
    }

    /**
     * Set the RegistrationTtl of the created NotificationHub.
     *
     * @param registrationTtl the registrationTtl value to set
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withRegistrationTtl(String registrationTtl) {
        this.registrationTtl = registrationTtl;
        return this;
    }

    /**
     * Get the AuthorizationRules of the created NotificationHub.
     *
     * @return the authorizationRules value
     */
    public List<SharedAccessAuthorizationRuleProperties> authorizationRules() {
        return this.authorizationRules;
    }

    /**
     * Set the AuthorizationRules of the created NotificationHub.
     *
     * @param authorizationRules the authorizationRules value to set
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withAuthorizationRules(List<SharedAccessAuthorizationRuleProperties> authorizationRules) {
        this.authorizationRules = authorizationRules;
        return this;
    }

    /**
     * Get the ApnsCredential of the created NotificationHub.
     *
     * @return the apnsCredential value
     */
    public ApnsCredential apnsCredential() {
        return this.apnsCredential;
    }

    /**
     * Set the ApnsCredential of the created NotificationHub.
     *
     * @param apnsCredential the apnsCredential value to set
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withApnsCredential(ApnsCredential apnsCredential) {
        this.apnsCredential = apnsCredential;
        return this;
    }

    /**
     * Get the WnsCredential of the created NotificationHub.
     *
     * @return the wnsCredential value
     */
    public WnsCredential wnsCredential() {
        return this.wnsCredential;
    }

    /**
     * Set the WnsCredential of the created NotificationHub.
     *
     * @param wnsCredential the wnsCredential value to set
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withWnsCredential(WnsCredential wnsCredential) {
        this.wnsCredential = wnsCredential;
        return this;
    }

    /**
     * Get the GcmCredential of the created NotificationHub.
     *
     * @return the gcmCredential value
     */
    public GcmCredential gcmCredential() {
        return this.gcmCredential;
    }

    /**
     * Set the GcmCredential of the created NotificationHub.
     *
     * @param gcmCredential the gcmCredential value to set
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withGcmCredential(GcmCredential gcmCredential) {
        this.gcmCredential = gcmCredential;
        return this;
    }

    /**
     * Get the MpnsCredential of the created NotificationHub.
     *
     * @return the mpnsCredential value
     */
    public MpnsCredential mpnsCredential() {
        return this.mpnsCredential;
    }

    /**
     * Set the MpnsCredential of the created NotificationHub.
     *
     * @param mpnsCredential the mpnsCredential value to set
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withMpnsCredential(MpnsCredential mpnsCredential) {
        this.mpnsCredential = mpnsCredential;
        return this;
    }

    /**
     * Get the AdmCredential of the created NotificationHub.
     *
     * @return the admCredential value
     */
    public AdmCredential admCredential() {
        return this.admCredential;
    }

    /**
     * Set the AdmCredential of the created NotificationHub.
     *
     * @param admCredential the admCredential value to set
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withAdmCredential(AdmCredential admCredential) {
        this.admCredential = admCredential;
        return this;
    }

    /**
     * Get the BaiduCredential of the created NotificationHub.
     *
     * @return the baiduCredential value
     */
    public BaiduCredential baiduCredential() {
        return this.baiduCredential;
    }

    /**
     * Set the BaiduCredential of the created NotificationHub.
     *
     * @param baiduCredential the baiduCredential value to set
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withBaiduCredential(BaiduCredential baiduCredential) {
        this.baiduCredential = baiduCredential;
        return this;
    }

    /**
     * Get the sku of the created namespace.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku of the created namespace.
     *
     * @param sku the sku value to set
     * @return the NotificationHubResourceInner object itself.
     */
    public NotificationHubResourceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

}
