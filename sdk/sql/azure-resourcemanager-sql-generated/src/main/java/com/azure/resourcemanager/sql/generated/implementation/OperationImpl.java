// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.OperationInner;
import com.azure.resourcemanager.sql.generated.models.Operation;
import com.azure.resourcemanager.sql.generated.models.OperationDisplay;
import com.azure.resourcemanager.sql.generated.models.OperationOrigin;
import java.util.Collections;
import java.util.Map;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final SqlManager serviceManager;

    public OperationImpl(OperationInner innerObject, SqlManager serviceManager) {
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

    private SqlManager manager() {
        return this.serviceManager;
    }
}
