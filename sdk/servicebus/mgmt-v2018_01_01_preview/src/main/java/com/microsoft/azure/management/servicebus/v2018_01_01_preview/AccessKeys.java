/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.implementation.ServiceBusManager;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.implementation.AccessKeysInner;

/**
 * Type representing AccessKeys.
 */
public interface AccessKeys extends HasInner<AccessKeysInner>, HasManager<ServiceBusManager> {
    /**
     * @return the aliasPrimaryConnectionString value.
     */
    String aliasPrimaryConnectionString();

    /**
     * @return the aliasSecondaryConnectionString value.
     */
    String aliasSecondaryConnectionString();

    /**
     * @return the keyName value.
     */
    String keyName();

    /**
     * @return the primaryConnectionString value.
     */
    String primaryConnectionString();

    /**
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * @return the secondaryConnectionString value.
     */
    String secondaryConnectionString();

    /**
     * @return the secondaryKey value.
     */
    String secondaryKey();

}
