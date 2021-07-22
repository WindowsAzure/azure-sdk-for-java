// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response object of the current cell in the input matrix. */
@Immutable
public final class RouteMatrixResultResponse {
    /*
     * Summary object for route section.
     */
    @JsonProperty(value = "routeSummary", access = JsonProperty.Access.WRITE_ONLY)
    private RouteResultLegSummary routeSummary;

    /**
     * Get the routeSummary property: Summary object for route section.
     *
     * @return the routeSummary value.
     */
    public RouteResultLegSummary getRouteSummary() {
        return this.routeSummary;
    }
}
