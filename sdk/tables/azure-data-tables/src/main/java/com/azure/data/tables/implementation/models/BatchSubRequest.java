package com.azure.data.tables.implementation.models;

import com.azure.core.http.HttpRequest;
import com.azure.data.tables.models.BatchOperation;

public final class BatchSubRequest {
    private final BatchOperation operation;
    private final HttpRequest httpRequest;

    public BatchSubRequest(BatchOperation operation, HttpRequest httpRequest) {
        this.operation = operation;
        this.httpRequest = httpRequest;
    }

    public BatchOperation getOperation() {
        return operation;
    }

    public HttpRequest getHttpRequest() {
        return httpRequest;
    }
}
