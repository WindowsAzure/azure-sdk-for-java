// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Immutable;
import java.util.List;

/** Schema of the Data property of an EventGridEvent for a Microsoft.Maps.GeofenceEntered event. */
@Immutable
public final class MapsGeofenceEnteredEventData extends MapsGeofenceEventProperties {
    /** {@inheritDoc} */
    @Override
    public MapsGeofenceEnteredEventData setExpiredGeofenceGeometryId(List<String> expiredGeofenceGeometryId) {
        super.setExpiredGeofenceGeometryId(expiredGeofenceGeometryId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MapsGeofenceEnteredEventData setGeometries(List<MapsGeofenceGeometry> geometries) {
        super.setGeometries(geometries);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MapsGeofenceEnteredEventData setInvalidPeriodGeofenceGeometryId(
            List<String> invalidPeriodGeofenceGeometryId) {
        super.setInvalidPeriodGeofenceGeometryId(invalidPeriodGeofenceGeometryId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MapsGeofenceEnteredEventData setIsEventPublished(Boolean isEventPublished) {
        super.setIsEventPublished(isEventPublished);
        return this;
    }
}
