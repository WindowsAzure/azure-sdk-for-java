// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.implementation;

import com.azure.resourcemanager.kusto.fluent.models.DataConnectionInner;
import com.azure.resourcemanager.kusto.fluent.models.DataConnectionValidationInner;
import com.azure.resourcemanager.kusto.models.DataConnection;
import com.azure.resourcemanager.kusto.models.DataConnectionValidation;

public final class DataConnectionValidationImpl implements DataConnectionValidation {
    private DataConnectionValidationInner innerObject;

    private final com.azure.resourcemanager.kusto.KustoManager serviceManager;

    DataConnectionValidationImpl(
        DataConnectionValidationInner innerObject, com.azure.resourcemanager.kusto.KustoManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String dataConnectionName() {
        return this.innerModel().dataConnectionName();
    }

    public DataConnection properties() {
        DataConnectionInner inner = this.innerModel().properties();
        if (inner != null) {
            return new DataConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DataConnectionValidationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.kusto.KustoManager manager() {
        return this.serviceManager;
    }
}
