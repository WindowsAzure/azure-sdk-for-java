/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2020_08_01.InboundSecurityRuleOperations;

class InboundSecurityRuleOperationsImpl extends WrapperImpl<InboundSecurityRuleOperationsInner> implements InboundSecurityRuleOperations {
    private final NetworkManager manager;

    InboundSecurityRuleOperationsImpl(NetworkManager manager) {
        super(manager.inner().inboundSecurityRuleOperations());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public InboundSecurityRuleImpl define(String name) {
        return wrapModel(name);
    }

    private InboundSecurityRuleImpl wrapModel(InboundSecurityRuleInner inner) {
        return  new InboundSecurityRuleImpl(inner, manager());
    }

    private InboundSecurityRuleImpl wrapModel(String name) {
        return new InboundSecurityRuleImpl(name, this.manager());
    }

}
