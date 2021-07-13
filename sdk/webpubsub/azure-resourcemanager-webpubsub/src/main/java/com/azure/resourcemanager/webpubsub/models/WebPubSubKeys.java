// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.resourcemanager.webpubsub.fluent.models.WebPubSubKeysInner;

/** An immutable client-side representation of WebPubSubKeys. */
public interface WebPubSubKeys {
    /**
     * Gets the primaryKey property: The primary access key.
     *
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * Gets the secondaryKey property: The secondary access key.
     *
     * @return the secondaryKey value.
     */
    String secondaryKey();

    /**
     * Gets the primaryConnectionString property: Connection string constructed via the primaryKey.
     *
     * @return the primaryConnectionString value.
     */
    String primaryConnectionString();

    /**
     * Gets the secondaryConnectionString property: Connection string constructed via the secondaryKey.
     *
     * @return the secondaryConnectionString value.
     */
    String secondaryConnectionString();

    /**
     * Gets the inner com.azure.resourcemanager.webpubsub.fluent.models.WebPubSubKeysInner object.
     *
     * @return the inner object.
     */
    WebPubSubKeysInner innerModel();
}
