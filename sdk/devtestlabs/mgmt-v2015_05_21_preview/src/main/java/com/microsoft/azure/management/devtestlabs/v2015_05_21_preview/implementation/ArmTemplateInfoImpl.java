/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.implementation;

import com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.ArmTemplateInfo;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class ArmTemplateInfoImpl extends WrapperImpl<ArmTemplateInfoInner> implements ArmTemplateInfo {
    private final DevTestLabsManager manager;
    ArmTemplateInfoImpl(ArmTemplateInfoInner inner, DevTestLabsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DevTestLabsManager manager() {
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
