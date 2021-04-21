// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.resourcemanager.support.fluent.models.ProblemClassificationInner;
import com.azure.resourcemanager.support.models.ProblemClassification;

public final class ProblemClassificationImpl implements ProblemClassification {
    private ProblemClassificationInner innerObject;

    private final com.azure.resourcemanager.support.SupportManager serviceManager;

    ProblemClassificationImpl(
        ProblemClassificationInner innerObject, com.azure.resourcemanager.support.SupportManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public ProblemClassificationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.support.SupportManager manager() {
        return this.serviceManager;
    }
}
