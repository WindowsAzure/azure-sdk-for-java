// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.resourcemanager.security.fluent.models.SecuritySolutionInner;
import com.azure.resourcemanager.security.models.ProvisioningState;
import com.azure.resourcemanager.security.models.SecurityFamily;
import com.azure.resourcemanager.security.models.SecuritySolution;

public final class SecuritySolutionImpl implements SecuritySolution {
    private SecuritySolutionInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    SecuritySolutionImpl(
        SecuritySolutionInner innerObject, com.azure.resourcemanager.security.SecurityManager serviceManager) {
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

    public SecurityFamily securityFamily() {
        return this.innerModel().securityFamily();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String template() {
        return this.innerModel().template();
    }

    public String protectionStatus() {
        return this.innerModel().protectionStatus();
    }

    public String location() {
        return this.innerModel().location();
    }

    public SecuritySolutionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
