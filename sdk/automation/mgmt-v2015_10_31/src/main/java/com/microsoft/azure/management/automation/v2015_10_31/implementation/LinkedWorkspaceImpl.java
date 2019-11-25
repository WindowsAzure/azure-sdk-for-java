/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.management.automation.v2015_10_31.LinkedWorkspace;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class LinkedWorkspaceImpl extends WrapperImpl<LinkedWorkspaceInner> implements LinkedWorkspace {
    private final AutomationManager manager;
    LinkedWorkspaceImpl(LinkedWorkspaceInner inner, AutomationManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AutomationManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

}
