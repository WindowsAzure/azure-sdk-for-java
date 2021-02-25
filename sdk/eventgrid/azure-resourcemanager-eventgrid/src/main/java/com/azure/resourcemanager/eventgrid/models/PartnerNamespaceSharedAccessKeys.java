// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.resourcemanager.eventgrid.fluent.models.PartnerNamespaceSharedAccessKeysInner;

/** An immutable client-side representation of PartnerNamespaceSharedAccessKeys. */
public interface PartnerNamespaceSharedAccessKeys {
    /**
     * Gets the key1 property: Shared access key1 for the partner namespace.
     *
     * @return the key1 value.
     */
    String key1();

    /**
     * Gets the key2 property: Shared access key2 for the partner namespace.
     *
     * @return the key2 value.
     */
    String key2();

    /**
     * Gets the inner com.azure.resourcemanager.eventgrid.fluent.models.PartnerNamespaceSharedAccessKeysInner object.
     *
     * @return the inner object.
     */
    PartnerNamespaceSharedAccessKeysInner innerModel();
}
