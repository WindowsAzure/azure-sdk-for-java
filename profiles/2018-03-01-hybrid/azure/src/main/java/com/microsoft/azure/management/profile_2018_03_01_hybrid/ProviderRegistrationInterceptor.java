package com.microsoft.azure.management.profile_2018_03_01_hybrid; /**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.CloudError;
import com.microsoft.azure.arm.utils.SdkContext;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.resources.v2018_02_01.Provider;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * An interceptor for automatic provider registration in Azure.
 */
final class ProviderRegistrationInterceptor implements Interceptor {
    private final AzureTokenCredentials credentials;

    /**
     * Initialize a provider registration interceptor with a credential that's authorized
     * to register the provider.
     * @param credentials the credential for provider registration
     */
    public ProviderRegistrationInterceptor(AzureTokenCredentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Response response = chain.proceed(chain.request());
        if (!response.isSuccessful()) {
            String content = errorBody(response.body());
            AzureJacksonAdapter jacksonAdapter = new AzureJacksonAdapter();
            CloudError cloudError = jacksonAdapter.deserialize(content, CloudError.class);
            if (cloudError != null && "MissingSubscriptionRegistration".equals(cloudError.code())) {
                Pattern pattern = Pattern.compile("/subscriptions/([\\w-]+)/", Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(chain.request().url().toString());
                matcher.find();
                RestClient restClient = new RestClient.Builder()
                        .withBaseUrl("https://" + chain.request().url().host())
                        .withCredentials(credentials)
                        .withSerializerAdapter(jacksonAdapter)
                        .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
                        .build();
                com.microsoft.azure.management.resources.v2018_02_01.implementation.ResourcesManager resourceManager =  com.microsoft.azure.management.resources.v2018_02_01.implementation.ResourcesManager.authenticate(restClient, matcher.group(1));
                pattern = Pattern.compile(".*'(.*)'");
                matcher = pattern.matcher(cloudError.message());
                matcher.find();
                Provider provider = registerProvider(matcher.group(1), resourceManager);
                while (provider.registrationState().equalsIgnoreCase("Unregistered")
                        || provider.registrationState().equalsIgnoreCase("Registering")) {
                    SdkContext.sleep(5 * 1000);
                    provider = resourceManager.providers().getAsync(provider.namespace()).toBlocking().last();
                }
                // Retry
                response = chain.proceed(chain.request());
            }
        }
        return response;
    }

    private String errorBody(ResponseBody responseBody) throws IOException {
        if (responseBody == null) {
            return null;
        }
        BufferedSource source = responseBody.source();
        source.request(Long.MAX_VALUE); // Buffer the entire body.
        Buffer buffer = source.buffer();
        return buffer.clone().readUtf8();
    }

    private Provider registerProvider(String namespace, com.microsoft.azure.management.resources.v2018_02_01.implementation.ResourcesManager resourceManager) {
        return resourceManager.providers().registerAsync(namespace).toBlocking().last();
    }
}
