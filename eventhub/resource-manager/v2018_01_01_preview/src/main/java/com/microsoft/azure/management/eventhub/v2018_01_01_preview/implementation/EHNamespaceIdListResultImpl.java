/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2018_01_01_preview.implementation;

import com.microsoft.azure.management.eventhub.v2018_01_01_preview.EHNamespaceIdListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.eventhub.v2018_01_01_preview.EHNamespaceIdContainer;

class EHNamespaceIdListResultImpl extends WrapperImpl<EHNamespaceIdListResultInner> implements EHNamespaceIdListResult {
    private final EventHubManager manager;
    EHNamespaceIdListResultImpl(EHNamespaceIdListResultInner inner, EventHubManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public EventHubManager manager() {
        return this.manager;
    }

    @Override
    public List<EHNamespaceIdContainer> value() {
        return this.inner().value();
    }

}
