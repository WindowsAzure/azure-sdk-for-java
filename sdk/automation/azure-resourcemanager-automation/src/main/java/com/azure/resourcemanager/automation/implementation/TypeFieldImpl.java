// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.resourcemanager.automation.fluent.models.TypeFieldInner;
import com.azure.resourcemanager.automation.models.TypeField;

public final class TypeFieldImpl implements TypeField {
    private TypeFieldInner innerObject;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    TypeFieldImpl(TypeFieldInner innerObject, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public TypeFieldInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }
}
