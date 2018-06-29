/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation.RecoveryServicesManager;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation.ClientDiscoveryValueForSingleApiInner;

/**
 * Type representing ClientDiscoveryValueForSingleApi.
 */
public interface ClientDiscoveryValueForSingleApi extends HasInner<ClientDiscoveryValueForSingleApiInner>, HasManager<RecoveryServicesManager> {
    /**
     * @return the display value.
     */
    ClientDiscoveryDisplay display();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the origin value.
     */
    String origin();

    /**
     * @return the properties value.
     */
    ClientDiscoveryForProperties properties();

}
