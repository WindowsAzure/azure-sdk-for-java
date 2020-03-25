/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_12_01.PortalSettingValidationKeyContract;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class PortalSettingValidationKeyContractImpl extends WrapperImpl<PortalSettingValidationKeyContractInner> implements PortalSettingValidationKeyContract {
    private final ApiManagementManager manager;
    PortalSettingValidationKeyContractImpl(PortalSettingValidationKeyContractInner inner, ApiManagementManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public String validationKey() {
        return this.inner().validationKey();
    }

}
