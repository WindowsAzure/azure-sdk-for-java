// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.throughputControl.controller.request;

import com.azure.cosmos.implementation.throughputControl.controller.IThroughputController;
import reactor.core.publisher.Mono;

/**
 * Represents a throughput request controller.
 */
public interface IThroughputRequestController extends IThroughputController {
    /**
     * Renew throughput usage cycle.
     *
     * Each request controller will maintain one to many request throttlers.
     * By calling this method, it will also renew the throughput usage cycles for the request throttlers.
     *
     * @param throughput
     * @return
     */
    void renewThroughputUsageCycle(double throughput);
}
