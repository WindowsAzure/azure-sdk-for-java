/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.JobInner;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.JobResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.RecoveryServicesManager;
import java.util.Map;

/**
 * Type representing VaultJobResourceModel.
 */
public interface VaultJobResourceModel extends HasInner<JobResourceInner>, Indexable, Refreshable<VaultJobResourceModel>, HasManager<RecoveryServicesManager> {
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
    JobInner properties();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

}
