// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver;

import java.util.ArrayList;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;

import com.azure.communication.callingserver.CallingServerClientBuilderUnitTests.NoOpHttpClient;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;

import reactor.core.publisher.Mono;

public class MockHttpClient extends NoOpHttpClient {
    private ArrayList<SimpleEntry<String, Integer>> responses = new ArrayList<SimpleEntry<String, Integer>>();
    private ArrayList<HttpRequest> requests  = new ArrayList<HttpRequest>();

    public MockHttpClient(ArrayList<SimpleEntry<String, Integer>> responses) {
        this.responses = responses;
    }

    public List<HttpRequest> getRequests() {
        return requests;
    }

    @Override
    public Mono<HttpResponse> send(HttpRequest request) {
        requests.add(request);

        if (responses.size() > 0) {
            SimpleEntry<String, Integer> entry = responses.get(0);
            responses.remove(entry);

            return Mono.just(CallingServerResponseMocker.generateMockResponse(entry.getKey(), request, entry.getValue()));
        }

        return Mono.just(CallingServerResponseMocker.generateMockResponse("", request, 500));
    }    
}
