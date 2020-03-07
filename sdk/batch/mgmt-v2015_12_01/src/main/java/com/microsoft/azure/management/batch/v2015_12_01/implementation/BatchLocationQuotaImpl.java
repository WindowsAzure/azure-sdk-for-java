/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2015_12_01.implementation;

import com.microsoft.azure.management.batch.v2015_12_01.BatchLocationQuota;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class BatchLocationQuotaImpl extends WrapperImpl<BatchLocationQuotaInner> implements BatchLocationQuota {
    private final BatchManager manager;
    BatchLocationQuotaImpl(BatchLocationQuotaInner inner, BatchManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BatchManager manager() {
        return this.manager;
    }

    @Override
    public Integer accountQuota() {
        return this.inner().accountQuota();
    }

}
