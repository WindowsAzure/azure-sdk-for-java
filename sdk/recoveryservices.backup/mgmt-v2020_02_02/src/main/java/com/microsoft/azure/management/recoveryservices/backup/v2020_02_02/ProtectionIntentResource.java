/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.ProtectionIntentResourceInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.RecoveryServicesManager;
import java.util.Map;

/**
 * Type representing ProtectionIntentResource.
 */
public interface ProtectionIntentResource extends HasInner<ProtectionIntentResourceInner>, HasManager<RecoveryServicesManager> {
    /**
     * @return the eTag value.
     */
    String eTag();

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
    ProtectionIntentInner properties();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

}
