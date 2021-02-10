/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.OperationDisplay;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.OperationProperties;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final HDInsightManager manager;
    OperationImpl(OperationInner inner, HDInsightManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public HDInsightManager manager() {
        return this.manager;
    }

    @Override
    public OperationDisplay display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public OperationProperties properties() {
        return this.inner().properties();
    }

}
