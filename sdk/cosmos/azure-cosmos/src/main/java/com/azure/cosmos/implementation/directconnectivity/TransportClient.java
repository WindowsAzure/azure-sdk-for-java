// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.directconnectivity;

import com.azure.cosmos.implementation.RxDocumentServiceRequest;
import com.azure.cosmos.implementation.throughputBudget.ThroughputBudgetControlStore;
import reactor.core.publisher.Mono;

// We suppress the "try" warning here because the close() method's signature
// allows it to throw InterruptedException which is strongly advised against
// by AutoCloseable (see: http://docs.oracle.com/javase/7/docs/api/java/lang/AutoCloseable.html#close()).
// close() will never throw an InterruptedException but the exception remains in the
// signature for backwards compatibility purposes.
@SuppressWarnings("try")
public abstract class TransportClient implements AutoCloseable {
    private ThroughputBudgetControlStore throughputBudgetControlStore;

    public void enableThroughputBudgetControl(ThroughputBudgetControlStore throughputBudgetControlStore) {
        this.throughputBudgetControlStore = throughputBudgetControlStore;
    }

    // Uses requests's ResourceOperation to determine the operation
    public Mono<StoreResponse> invokeResourceOperationAsync(Uri physicalAddress, RxDocumentServiceRequest request) {
        if (this.throughputBudgetControlStore != null) {
            return this.throughputBudgetControlStore.processRequest(request, this.invokeStoreAsync(physicalAddress, request));
        }

        return this.invokeStoreAsync(physicalAddress, request);
    }

    abstract Mono<StoreResponse> invokeStoreAsync(
        Uri physicalAddress,
        RxDocumentServiceRequest request);
}
