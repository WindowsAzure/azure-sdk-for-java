package com.azure.digitaltwins.core;

import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.identity.ClientSecretCredentialBuilder;

import java.util.Locale;

public class DigitalTwinsTestBase extends TestBase
{
    protected static final String TENANT_ID = Configuration.getGlobalConfiguration()
        .get("TENANT_ID", "tenantId");

    protected static final String CLIENT_SECRET = Configuration.getGlobalConfiguration()
        .get("CLIENT_SECRET", "clientSecret");

    protected static final String CLIENT_ID = Configuration.getGlobalConfiguration()
        .get("CLIENT_ID", "clientId");

    protected static final String DIGITALTWINS_URL = Configuration.getGlobalConfiguration()
        .get("DIGITALTWINS_URL", "https://playback.api.wus2.digitaltwins.azure.net");

    protected DigitalTwinsClientBuilder getDigitalTwinsClientBuilder() {
        DigitalTwinsClientBuilder builder = new DigitalTwinsClientBuilder()
            .endpoint(DIGITALTWINS_URL)
            .tokenCredential(new ClientSecretCredentialBuilder()
                .tenantId(TENANT_ID)
                .clientId(CLIENT_ID)
                .clientSecret(CLIENT_SECRET)
                .build());

        if (interceptorManager.isPlaybackMode()){
            builder.httpClient(interceptorManager.getPlaybackClient());
            return builder;
        }

        // TODO: investigate whether or not we need to add a retry policy.

        // If it is record mode, we add record mode policies to the builder.
        // There is no isRecordMode method on interceptorManger.
        if (!interceptorManager.isLiveMode()){
            builder.addPolicy(interceptorManager.getRecordPolicy());
        }

        return builder;
    }

    protected DigitalTwinsClientBuilder getDigitalTwinsClientBuilder(HttpPipelinePolicy... policies) {
        DigitalTwinsClientBuilder builder = new DigitalTwinsClientBuilder()
            .endpoint(DIGITALTWINS_URL)
            .tokenCredential(new ClientSecretCredentialBuilder()
                .tenantId(TENANT_ID)
                .clientId(CLIENT_ID)
                .clientSecret(CLIENT_SECRET)
                .build());

        if (interceptorManager.isPlaybackMode()){
            builder.httpClient(interceptorManager.getPlaybackClient());
            addPolicies(builder, policies);
            return builder;
        }

        addPolicies(builder, policies);

        // TODO: investigate whether or not we need to add a retry policy.

        // If it is record mode, we add record mode policies to the builder.
        // There is no isRecordMode method on interceptorManger.
        if (!interceptorManager.isLiveMode()) {
            builder.addPolicy(interceptorManager.getRecordPolicy());
        }

        return builder;
    }

    private static void addPolicies(DigitalTwinsClientBuilder builder, HttpPipelinePolicy... policies) {
        if (policies == null) {
            return;
        }

        for (HttpPipelinePolicy policy : policies) {
            builder.addPolicy(policy);
        }
    }
}
