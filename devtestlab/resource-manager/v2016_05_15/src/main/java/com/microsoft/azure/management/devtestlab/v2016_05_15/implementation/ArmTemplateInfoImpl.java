/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15.implementation;

import com.microsoft.azure.management.devtestlab.v2016_05_15.ArmTemplateInfo;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class ArmTemplateInfoImpl extends WrapperImpl<ArmTemplateInfoInner> implements ArmTemplateInfo {
    private final DevTestLabManager manager;
    ArmTemplateInfoImpl(ArmTemplateInfoInner inner, DevTestLabManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DevTestLabManager manager() {
        return this.manager;
    }

    @Override
    public Object parameters() {
        return this.inner().parameters();
    }

    @Override
    public Object template() {
        return this.inner().template();
    }

}
