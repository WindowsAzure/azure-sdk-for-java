// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.MonitorManager;
import com.azure.resourcemanager.monitor.generated.fluent.MetricBaselinesClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.BaselineResponseInner;
import com.azure.resourcemanager.monitor.generated.fluent.models.CalculateBaselineResponseInner;
import com.azure.resourcemanager.monitor.generated.models.BaselineResponse;
import com.azure.resourcemanager.monitor.generated.models.CalculateBaselineResponse;
import com.azure.resourcemanager.monitor.generated.models.MetricBaselines;
import com.azure.resourcemanager.monitor.generated.models.ResultType;
import com.azure.resourcemanager.monitor.generated.models.TimeSeriesInformation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.Duration;

public final class MetricBaselinesImpl implements MetricBaselines {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricBaselinesImpl.class);

    private final MetricBaselinesClient innerClient;

    private final MonitorManager serviceManager;

    public MetricBaselinesImpl(MetricBaselinesClient innerClient, MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public BaselineResponse get(String resourceUri, String metricName) {
        BaselineResponseInner inner = this.serviceClient().get(resourceUri, metricName);
        if (inner != null) {
            return new BaselineResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BaselineResponse> getWithResponse(
        String resourceUri,
        String metricName,
        String timespan,
        Duration interval,
        String aggregation,
        String sensitivities,
        ResultType resultType,
        Context context) {
        Response<BaselineResponseInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceUri, metricName, timespan, interval, aggregation, sensitivities, resultType, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BaselineResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CalculateBaselineResponse calculateBaseline(
        String resourceUri, TimeSeriesInformation timeSeriesInformation) {
        CalculateBaselineResponseInner inner =
            this.serviceClient().calculateBaseline(resourceUri, timeSeriesInformation);
        if (inner != null) {
            return new CalculateBaselineResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CalculateBaselineResponse> calculateBaselineWithResponse(
        String resourceUri, TimeSeriesInformation timeSeriesInformation, Context context) {
        Response<CalculateBaselineResponseInner> inner =
            this.serviceClient().calculateBaselineWithResponse(resourceUri, timeSeriesInformation, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CalculateBaselineResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private MetricBaselinesClient serviceClient() {
        return this.innerClient;
    }

    private MonitorManager manager() {
        return this.serviceManager;
    }
}
