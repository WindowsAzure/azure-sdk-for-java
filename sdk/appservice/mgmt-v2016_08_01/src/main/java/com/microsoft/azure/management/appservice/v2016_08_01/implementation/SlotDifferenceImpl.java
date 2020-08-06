/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import com.microsoft.azure.management.appservice.v2016_08_01.SlotDifference;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class SlotDifferenceImpl extends WrapperImpl<SlotDifferenceInner> implements SlotDifference {
    private final WebManager manager;
    SlotDifferenceImpl(SlotDifferenceInner inner, WebManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public WebManager manager() {
        return this.manager;
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String diffRule() {
        return this.inner().diffRule();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String settingName() {
        return this.inner().settingName();
    }

    @Override
    public String settingType() {
        return this.inner().settingType();
    }

    @Override
    public String slotDifferenceType() {
        return this.inner().slotDifferenceType();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String valueInCurrentSlot() {
        return this.inner().valueInCurrentSlot();
    }

    @Override
    public String valueInTargetSlot() {
        return this.inner().valueInTargetSlot();
    }

}
