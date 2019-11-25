/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01.implementation;

import com.microsoft.azure.management.mysql.v2017_12_01.PerformanceTierProperties;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.mysql.v2017_12_01.PerformanceTierServiceLevelObjectives;

class PerformanceTierPropertiesImpl extends WrapperImpl<PerformanceTierPropertiesInner> implements PerformanceTierProperties {
    private final MySQLManager manager;

    PerformanceTierPropertiesImpl(PerformanceTierPropertiesInner inner,  MySQLManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MySQLManager manager() {
        return this.manager;
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<PerformanceTierServiceLevelObjectives> serviceLevelObjectives() {
        return this.inner().serviceLevelObjectives();
    }

}
