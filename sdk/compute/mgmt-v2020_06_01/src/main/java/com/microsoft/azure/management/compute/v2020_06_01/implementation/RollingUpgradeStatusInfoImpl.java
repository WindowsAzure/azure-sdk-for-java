/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01.implementation;

import com.microsoft.azure.management.compute.v2020_06_01.RollingUpgradeStatusInfo;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2020_06_01.ApiError;
import com.microsoft.azure.management.compute.v2020_06_01.RollingUpgradePolicy;
import com.microsoft.azure.management.compute.v2020_06_01.RollingUpgradeProgressInfo;
import com.microsoft.azure.management.compute.v2020_06_01.RollingUpgradeRunningStatus;
import java.util.Map;

class RollingUpgradeStatusInfoImpl extends WrapperImpl<RollingUpgradeStatusInfoInner> implements RollingUpgradeStatusInfo {
    private final ComputeManager manager;
    RollingUpgradeStatusInfoImpl(RollingUpgradeStatusInfoInner inner, ComputeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public ApiError error() {
        return this.inner().error();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public RollingUpgradePolicy policy() {
        return this.inner().policy();
    }

    @Override
    public RollingUpgradeProgressInfo progress() {
        return this.inner().progress();
    }

    @Override
    public RollingUpgradeRunningStatus runningStatus() {
        return this.inner().runningStatus();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
