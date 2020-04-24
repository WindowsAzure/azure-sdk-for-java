// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.resources.fluentcore.policy;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.management.CloudError;
import com.azure.core.management.serializer.AzureJacksonAdapter;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.management.resources.Provider;
import com.azure.management.resources.fluentcore.arm.ResourceUtils;
import com.azure.management.resources.fluentcore.utils.SdkContext;
import com.azure.management.resources.implementation.ResourceManager;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A Http Pipeline Policy for automatic provider registration in Azure.
 */
public class ProviderRegistrationPolicy implements HttpPipelinePolicy {
    private static final String MISSING_SUBSCRIPTION_REGISTRATION = "MissingSubscriptionRegistration";
    private final TokenCredential credential;

    /**
     * Initialize a provider registration policy with a credential that's authorized
     * to register the provider.
     * @param credential the credential for provider registration
     */
    public ProviderRegistrationPolicy(TokenCredential credential) {
        this.credential = credential;
    }

    private boolean isResponseSuccessful(HttpResponse response) {
        return response.getStatusCode() >= 200 && response.getStatusCode() < 300;
    }

    @Override
    public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
        final HttpRequest request = context.getHttpRequest();
        return next.process().flatMap(
            response -> {
                if (!isResponseSuccessful(response)) {
                    HttpResponse bufferedResponse = response.buffer();
                    return FluxUtil.collectBytesInByteBufferStream(bufferedResponse.getBody()).flatMap(
                        body -> {
                            String bodyStr = new String(body, StandardCharsets.UTF_8);

                            AzureJacksonAdapter jacksonAdapter = new AzureJacksonAdapter();
                            CloudError cloudError;
                            try {
                                cloudError = jacksonAdapter.deserialize(
                                    bodyStr, CloudError.class, SerializerEncoding.JSON);
                            } catch (IOException e) {
                                return Mono.just(bufferedResponse);
                            }

                            if (cloudError != null && MISSING_SUBSCRIPTION_REGISTRATION.equals(cloudError.getCode())) {
                                String subscriptionId = ResourceUtils.extractFromResourceId(
                                    request.getUrl().getPath(), "subscriptions");
                                // TODO: add proxy in rest client
                                ResourceManager resourceManager = ResourceManager.authenticate(credential)
                                        .withSubscription(subscriptionId);
                                Pattern providerPattern = Pattern.compile(".*'(.*)'");
                                Matcher providerMatcher = providerPattern.matcher(cloudError.getMessage());
                                providerMatcher.find();

                                // Retry after registration
                                return registerProviderUntilSuccess(providerMatcher.group(1), resourceManager)
                                        .flatMap(afterRegistered -> next.process());
                            }
                            return Mono.just(bufferedResponse);
                        }
                    );
                }
                return Mono.just(response);
            }
        );
    }

    private Mono<Void> registerProviderUntilSuccess(String namespace, ResourceManager resourceManager) {
        return resourceManager.providers().registerAsync(namespace)
            .flatMap(
                provider -> {
                    if (isProviderRegistered(provider)) {
                        return Mono.empty();
                    }
                    return resourceManager.providers().getByNameAsync(namespace)
                            .flatMap(providerGet -> checkProviderRegistered(providerGet))
                            .retry(60, ProviderUnregisteredException.class::isInstance);
                }
            );
    }

    private Mono<Void> checkProviderRegistered(Provider provider) throws ProviderUnregisteredException {
        if (isProviderRegistered(provider)) {
            return Mono.empty();
        }
        SdkContext.sleep(5 * 1000);
        return Mono.error(new ProviderUnregisteredException());
    }

    private boolean isProviderRegistered(Provider provider) {
        return provider.registrationState().equalsIgnoreCase("Registered");
    }

    private class ProviderUnregisteredException extends RuntimeException {
    }
}
