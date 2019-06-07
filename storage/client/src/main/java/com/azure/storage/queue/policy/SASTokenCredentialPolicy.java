// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.storage.queue.policy;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.implementation.util.ImplUtils;
import com.azure.storage.queue.credentials.SASTokenCredential;
import reactor.core.publisher.Mono;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Policy that adds the SAS token to the request URL's query.
 */
public final class SASTokenCredentialPolicy implements HttpPipelinePolicy {
    private final SASTokenCredential credential;

    /**
     * Creates a SAS token credential policy that appends the SAS token to the request URL's query.
     * @param credential SAS token credential
     */
    public SASTokenCredentialPolicy(SASTokenCredential credential) {
        this.credential = credential;
    }

    @Override
    public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
        URL requestURL = context.httpRequest().url();
        boolean urlHasQueryParams = !ImplUtils.isNullOrEmpty(requestURL.getQuery());

        try {
            String delimiter = (urlHasQueryParams) ? "&" : "?";
            String newURL = requestURL.toString() + delimiter + credential.sasToken();
            context.httpRequest().withUrl(new URL(newURL));
        } catch (MalformedURLException ex) {
            throw new IllegalStateException(ex);
        }

        return next.process();
    }
}
