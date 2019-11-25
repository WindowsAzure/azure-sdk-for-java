// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.data.appconfiguration;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.FixedDelay;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.test.http.NoOpHttpClient;
import com.azure.data.appconfiguration.implementation.CustomHeadersPolicy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.UUID;
import java.util.function.Supplier;

public class CustomizedHeadersTest {

    private static final String REQUEST_ID_HEADER = "x-ms-client-request-id";
    private static final String CORRELATION_ID_HEADER = "x-ms-correlation-request-id";
    private static final String CORRELATION_CONTEXT_HEADER = "correlation-context";

    private final HttpResponse mockResponse = new HttpResponse(null) {
        @Override
        public int getStatusCode() {
            return 500;
        }
        @Override
        public String getHeaderValue(String name) {
            return null;
        }
        @Override
        public HttpHeaders getHeaders() {
            return new HttpHeaders();
        }
        @Override
        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.empty();
        }
        @Override
        public Flux<ByteBuffer> getBody() {
            return Flux.empty();
        }
        @Override
        public Mono<String> getBodyAsString() {
            return Mono.empty();
        }
        @Override
        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.empty();
        }
    };


    @Test
    public void newRequestIdForEachCall() throws Exception {

        String customRequestIdHeaderName = "x-ms-client-custom-request-id";
        String clientProvidedRequestId = UUID.randomUUID().toString();

        Supplier<HttpHeaders> requestIdSupplier = () ->
            new HttpHeaders().put(customRequestIdHeaderName, clientProvidedRequestId);

        HttpPipeline pipeline = new HttpPipelineBuilder()
            .httpClient(new NoOpHttpClient() {
                String firstRequestId = null;
                @Override
                public Mono<HttpResponse> send(HttpRequest request) {
                    if (firstRequestId != null) {
                        String newRequestId = request.getHeaders().getValue(REQUEST_ID_HEADER);
                        Assertions.assertNotNull(newRequestId);
                        Assertions.assertNotEquals(newRequestId, firstRequestId);
                    }
                    firstRequestId = request.getHeaders().getValue(REQUEST_ID_HEADER);
                    if (firstRequestId == null) {
                        Assertions.fail();
                    }
                    return Mono.just(mockResponse);
                }
            })
            .policies(new CustomHeadersPolicy(requestIdSupplier))
            .build();
        pipeline.send(new HttpRequest(HttpMethod.GET, new URL("http://localhost/"))).block();
        pipeline.send(new HttpRequest(HttpMethod.GET, new URL("http://localhost/"))).block();
    }


    @Test
    public void clientProvidedRequestIdForRetry() throws Exception {

        String customRequestIdHeaderName = "x-ms-client-custom-request-id";
        String clientProvidedRequestId = UUID.randomUUID().toString();

        Supplier<HttpHeaders> requestIdSupplier = () ->
            new HttpHeaders().put(customRequestIdHeaderName, clientProvidedRequestId);
        final HttpPipeline pipeline = new HttpPipelineBuilder()
            .httpClient(new NoOpHttpClient() {
                String firstRequestId = null;

                @Override
                public Mono<HttpResponse> send(HttpRequest request) {
                    if (firstRequestId != null) {
                        String newRequestId = request.getHeaders().getValue(customRequestIdHeaderName);
                        Assertions.assertNotNull(newRequestId);
                        Assertions.assertEquals(newRequestId, firstRequestId);
                        Assertions.assertEquals(newRequestId, clientProvidedRequestId);
                    }
                    firstRequestId = request.getHeaders().getValue(customRequestIdHeaderName);
                    if (firstRequestId == null) {
                        Assertions.fail();
                    }
                    return Mono.just(mockResponse);
                }
            })
            .policies(new CustomHeadersPolicy(requestIdSupplier),
                new RetryPolicy(new FixedDelay(1, Duration.of(0, ChronoUnit.SECONDS))))
            .build();

        pipeline.send(new HttpRequest(HttpMethod.GET, new URL("http://localhost/"))).block();
    }
}
