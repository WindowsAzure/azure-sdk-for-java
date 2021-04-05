// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.implementation.serializer;

import com.azure.core.annotation.HeaderCollection;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.MockHttpResponse;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import reactor.test.StepVerifier;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Tests {@link HttpResponseHeaderDecoder}.
 */
public class HttpResponseHeaderDecoderTests {
    @AfterEach
    public void clearMocks() {
        Mockito.framework().clearInlineMocks();
    }

    @Test
    public void nullHeaderTypeReturnsMonoEmpty() {
        HttpResponseDecodeData decodeData = mock(HttpResponseDecodeData.class);
        when(decodeData.getHeadersType()).thenReturn(null);

        StepVerifier.create(HttpResponseHeaderDecoder.decode(null, null, decodeData))
            .verifyComplete();
    }

    @Test
    public void ioExceptionIsMappedToHttpResponseException() throws IOException {
        HttpResponseDecodeData decodeData = mock(HttpResponseDecodeData.class);
        when(decodeData.getHeadersType()).thenReturn(MockHeaders.class);

        SerializerAdapter serializer = mock(SerializerAdapter.class);
        when(serializer.deserialize(any(), any())).thenThrow(IOException.class);

        HttpResponse response = new MockHttpResponse(null, 200);

        StepVerifier.create(HttpResponseHeaderDecoder.decode(response, serializer, decodeData))
            .verifyError(HttpResponseException.class);
    }

    @Test
    public void headersAreDeserializedToType() {
        HttpResponseDecodeData decodeData = mock(HttpResponseDecodeData.class);
        when(decodeData.getHeadersType()).thenReturn(MockHeaders.class);

        HttpResponse response = new MockHttpResponse(null, 200, new HttpHeaders().set("mock-a", "a"));

        StepVerifier.create(HttpResponseHeaderDecoder.decode(response, new JacksonAdapter(), decodeData))
            .assertNext(actual -> {
                assertTrue(actual instanceof MockHeaders);
                MockHeaders mockHeaders = (MockHeaders) actual;
                assertEquals(Collections.singletonMap("a", "a"), mockHeaders.getHeaderCollection());
            })
            .verifyComplete();
    }

    public static final class MockHeaders {
        @HeaderCollection("mock-")
        private Map<String, String> headerCollection;

        public Map<String, String> getHeaderCollection() {
            return headerCollection;
        }

        public void setHeaderCollection(Map<String, String> headerCollection) {
            this.headerCollection = headerCollection;
        }
    }
}
