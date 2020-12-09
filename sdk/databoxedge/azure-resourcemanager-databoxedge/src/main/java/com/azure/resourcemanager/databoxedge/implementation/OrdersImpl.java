// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.DataBoxEdgeManager;
import com.azure.resourcemanager.databoxedge.fluent.OrdersClient;
import com.azure.resourcemanager.databoxedge.fluent.models.OrderInner;
import com.azure.resourcemanager.databoxedge.models.Order;
import com.azure.resourcemanager.databoxedge.models.Orders;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OrdersImpl implements Orders {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OrdersImpl.class);

    private final OrdersClient innerClient;

    private final DataBoxEdgeManager serviceManager;

    public OrdersImpl(OrdersClient innerClient, DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Order> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        PagedIterable<OrderInner> inner = this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName);
        return inner.mapPage(inner1 -> new OrderImpl(inner1, this.manager()));
    }

    public PagedIterable<Order> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName, Context context) {
        PagedIterable<OrderInner> inner =
            this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName, context);
        return inner.mapPage(inner1 -> new OrderImpl(inner1, this.manager()));
    }

    public Order get(String deviceName, String resourceGroupName) {
        OrderInner inner = this.serviceClient().get(deviceName, resourceGroupName);
        if (inner != null) {
            return new OrderImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Order> getWithResponse(String deviceName, String resourceGroupName, Context context) {
        Response<OrderInner> inner = this.serviceClient().getWithResponse(deviceName, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OrderImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Order createOrUpdate(String deviceName, String resourceGroupName, OrderInner order) {
        OrderInner inner = this.serviceClient().createOrUpdate(deviceName, resourceGroupName, order);
        if (inner != null) {
            return new OrderImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Order createOrUpdate(String deviceName, String resourceGroupName, OrderInner order, Context context) {
        OrderInner inner = this.serviceClient().createOrUpdate(deviceName, resourceGroupName, order, context);
        if (inner != null) {
            return new OrderImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String deviceName, String resourceGroupName) {
        this.serviceClient().delete(deviceName, resourceGroupName);
    }

    public void delete(String deviceName, String resourceGroupName, Context context) {
        this.serviceClient().delete(deviceName, resourceGroupName, context);
    }

    private OrdersClient serviceClient() {
        return this.innerClient;
    }

    private DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
