/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.netapp.v2020_05_01.implementation.NetAppManager;
import com.microsoft.azure.management.netapp.v2020_05_01.implementation.ReplicationStatusInner;

/**
 * Type representing ReplicationStatus.
 */
public interface ReplicationStatus extends HasInner<ReplicationStatusInner>, HasManager<NetAppManager> {
    /**
     * @return the errorMessage value.
     */
    String errorMessage();

    /**
     * @return the healthy value.
     */
    Boolean healthy();

    /**
     * @return the mirrorState value.
     */
    MirrorState mirrorState();

    /**
     * @return the relationshipStatus value.
     */
    RelationshipStatus relationshipStatus();

    /**
     * @return the totalProgress value.
     */
    String totalProgress();

}
