// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.resourcemanager.notificationhubs.fluent.models.PnsCredentialsResourceInner;
import java.util.Map;

/** An immutable client-side representation of PnsCredentialsResource. */
public interface PnsCredentialsResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the apnsCredential property: The ApnsCredential of the created NotificationHub.
     *
     * @return the apnsCredential value.
     */
    ApnsCredential apnsCredential();

    /**
     * Gets the wnsCredential property: The WnsCredential of the created NotificationHub.
     *
     * @return the wnsCredential value.
     */
    WnsCredential wnsCredential();

    /**
     * Gets the gcmCredential property: The GcmCredential of the created NotificationHub.
     *
     * @return the gcmCredential value.
     */
    GcmCredential gcmCredential();

    /**
     * Gets the mpnsCredential property: The MpnsCredential of the created NotificationHub.
     *
     * @return the mpnsCredential value.
     */
    MpnsCredential mpnsCredential();

    /**
     * Gets the admCredential property: The AdmCredential of the created NotificationHub.
     *
     * @return the admCredential value.
     */
    AdmCredential admCredential();

    /**
     * Gets the baiduCredential property: The BaiduCredential of the created NotificationHub.
     *
     * @return the baiduCredential value.
     */
    BaiduCredential baiduCredential();

    /**
     * Gets the sku property: The sku of the created namespace.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the inner com.azure.resourcemanager.notificationhubs.fluent.models.PnsCredentialsResourceInner object.
     *
     * @return the inner object.
     */
    PnsCredentialsResourceInner innerModel();
}
