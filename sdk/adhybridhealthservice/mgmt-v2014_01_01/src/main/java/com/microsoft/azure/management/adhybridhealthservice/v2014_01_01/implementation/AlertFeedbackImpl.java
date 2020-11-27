/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation;

import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.AlertFeedback;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.DateTime;

class AlertFeedbackImpl extends WrapperImpl<AlertFeedbackInner> implements AlertFeedback {
    private final ADHybridHealthServiceManager manager;
    AlertFeedbackImpl(AlertFeedbackInner inner, ADHybridHealthServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ADHybridHealthServiceManager manager() {
        return this.manager;
    }

    @Override
    public String comment() {
        return this.inner().comment();
    }

    @Override
    public Boolean consentedToShare() {
        return this.inner().consentedToShare();
    }

    @Override
    public DateTime createdDate() {
        return this.inner().createdDate();
    }

    @Override
    public String feedback() {
        return this.inner().feedback();
    }

    @Override
    public String level() {
        return this.inner().level();
    }

    @Override
    public String serviceMemberId() {
        return this.inner().serviceMemberId();
    }

    @Override
    public String shortName() {
        return this.inner().shortName();
    }

    @Override
    public String state() {
        return this.inner().state();
    }

}
