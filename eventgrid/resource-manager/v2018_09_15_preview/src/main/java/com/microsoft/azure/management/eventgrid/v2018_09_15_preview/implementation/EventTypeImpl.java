/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_09_15_preview.implementation;

import com.microsoft.azure.management.eventgrid.v2018_09_15_preview.EventType;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;

class EventTypeImpl extends WrapperImpl<EventTypeInner> implements EventType {
    private final EventGridManager manager;

    EventTypeImpl(EventTypeInner inner,  EventGridManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public EventGridManager manager() {
        return this.manager;
    }



    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String schemaUrl() {
        return this.inner().schemaUrl();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
