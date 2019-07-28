/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.batch.v2017_05_01.implementation.BatchManager;
import com.microsoft.azure.management.batch.v2017_05_01.implementation.BatchLocationQuotaInner;

/**
 * Type representing BatchLocationQuota.
 */
public interface BatchLocationQuota extends HasInner<BatchLocationQuotaInner>, HasManager<BatchManager> {
    /**
     * @return the accountQuota value.
     */
    Integer accountQuota();

}
