// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.implementation;

import com.azure.resourcemanager.sqlvirtualmachine.SqlVirtualMachineManager;
import com.azure.resourcemanager.sqlvirtualmachine.fluent.models.OperationInner;
import com.azure.resourcemanager.sqlvirtualmachine.models.Operation;
import com.azure.resourcemanager.sqlvirtualmachine.models.OperationDisplay;
import com.azure.resourcemanager.sqlvirtualmachine.models.OperationOrigin;
import java.util.Collections;
import java.util.Map;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final SqlVirtualMachineManager serviceManager;

    OperationImpl(OperationInner innerObject, SqlVirtualMachineManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public OperationOrigin origin() {
        return this.innerModel().origin();
    }

    public Map<String, Object> properties() {
        Map<String, Object> inner = this.innerModel().properties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private SqlVirtualMachineManager manager() {
        return this.serviceManager;
    }
}
