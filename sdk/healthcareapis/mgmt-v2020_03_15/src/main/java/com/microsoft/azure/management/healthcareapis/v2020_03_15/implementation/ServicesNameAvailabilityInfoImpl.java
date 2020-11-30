/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_15.implementation;

import com.microsoft.azure.management.healthcareapis.v2020_03_15.ServicesNameAvailabilityInfo;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.healthcareapis.v2020_03_15.ServiceNameUnavailabilityReason;

class ServicesNameAvailabilityInfoImpl extends WrapperImpl<ServicesNameAvailabilityInfoInner> implements ServicesNameAvailabilityInfo {
    private final HealthcareApisManager manager;
    ServicesNameAvailabilityInfoImpl(ServicesNameAvailabilityInfoInner inner, HealthcareApisManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public HealthcareApisManager manager() {
        return this.manager;
    }

    @Override
    public String message() {
        return this.inner().message();
    }

    @Override
    public Boolean nameAvailable() {
        return this.inner().nameAvailable();
    }

    @Override
    public ServiceNameUnavailabilityReason reason() {
        return this.inner().reason();
    }

}
