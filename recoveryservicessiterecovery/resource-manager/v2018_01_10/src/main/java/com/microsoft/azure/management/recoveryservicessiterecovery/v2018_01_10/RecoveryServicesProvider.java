/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10.implementation.RecoveryServicesProviderInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10.implementation.RecoveryServicesManager;

/**
 * Type representing RecoveryServicesProvider.
 */
public interface RecoveryServicesProvider extends HasInner<RecoveryServicesProviderInner>, Indexable, Refreshable<RecoveryServicesProvider>, HasManager<RecoveryServicesManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    RecoveryServicesProviderProperties properties();

    /**
     * @return the type value.
     */
    String type();

}
