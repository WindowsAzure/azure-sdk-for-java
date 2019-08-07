package com.azure.search.data.common;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpPipelinePolicy;
import org.apache.commons.lang3.StringUtils;
import reactor.core.publisher.Mono;

public class SearchPipelinePolicy implements HttpPipelinePolicy {

    private String apiKey;

    public SearchPipelinePolicy(String apiKey) {
        if (StringUtils.isBlank(apiKey)) {
            throw new IllegalArgumentException("Invalid apiKey");
        }
        this.apiKey = apiKey;
    }

    @Override
    public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
        context.httpRequest().header("api-key", this.apiKey);
        return next.process();
    }
}
