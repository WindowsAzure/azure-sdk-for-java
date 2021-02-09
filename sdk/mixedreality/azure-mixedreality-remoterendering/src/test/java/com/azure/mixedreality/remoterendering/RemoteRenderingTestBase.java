// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.mixedreality.remoterendering;

import com.azure.core.credential.AccessToken;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.azure.mixedreality.authentication.MixedRealityStsClientBuilder;
import reactor.core.publisher.Mono;

import java.net.URL;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RemoteRenderingTestBase extends TestBase {
    private final String accountId = Configuration.getGlobalConfiguration().get("MIXEDREALITY_ARR_ACCOUNT_ID");
    private final String accountDomain = Configuration.getGlobalConfiguration().get("MIXEDREALITY_ARR_ACCOUNT_DOMAIN");
    private final String accountKey = Configuration.getGlobalConfiguration().get("MIXEDREALITY_ARR_ACCOUNT_KEY");
    private final String storageAccountName = Configuration.getGlobalConfiguration().get("MIXEDREALITY_ARR_STORAGE_ACCOUNT_NAME");
    private final String storageAccountKey = Configuration.getGlobalConfiguration().get("MIXEDREALITY_ARR_STORAGE_ACCOUNT_KEY");
    private final String blobContainerName = Configuration.getGlobalConfiguration().get("MIXEDREALITY_ARR_BLOB_CONTAINER_NAME");
    private final String blobContainerSasToken = Configuration.getGlobalConfiguration().get("MIXEDREALITY_ARR_SAS_TOKEN");
    private final String serviceEndpoint = Configuration.getGlobalConfiguration().get("MIXEDREALITY_ARR_SERVICE_ENDPOINT");

    // NOT REAL ACCOUNT DETAILS
    private final String playbackAccountId = "d879da79-415d-45f0-b641-1cfec1386ddf";
    private final String playbackAccountDomain = "mixedreality.azure.com";
    private final String playbackAccountKey = "Sanitized";
    private final String playbackStorageAccountName = "sdkTest";
    private final String playbackStorageAccountKey = "Sanitized";
    private final String playbackBlobContainerName = "test";
    private final String playbackBlobContainerSasToken = "Sanitized";
    private final String playbackServiceEndpoint = "http://localhost:8080";

    HttpPipeline getHttpPipeline(HttpClient httpClient) {
        final List<HttpPipelinePolicy> policies = new ArrayList<>();

        String scope = getServiceEndpoint().replaceFirst("/$", "") + "/.default";

        if (!interceptorManager.isPlaybackMode())
        {
            var stsClient = new MixedRealityStsClientBuilder()
                .accountId(getAccountId())
                .accountDomain(getAccountDomain())
                .credential(getAccountKey())
                .buildAsyncClient();
            policies.add(new BearerTokenAuthenticationPolicy(r -> stsClient.getToken(), scope));
        }

        if (getTestMode() == TestMode.RECORD) {
            policies.add(interceptorManager.getRecordPolicy());
        }

        HttpPipeline pipeline = new HttpPipelineBuilder()
            .policies(policies.toArray(new HttpPipelinePolicy[0]))
            .httpClient(httpClient == null ? interceptorManager.getPlaybackClient() : httpClient)
            .build();

        return pipeline;
    }

    String getAccountDomain() {
        return interceptorManager.isPlaybackMode()
            ? this.playbackAccountDomain
            : this.accountDomain;
    }

    String getAccountId() {
        String accountIdValue = interceptorManager.isPlaybackMode()
            ? this.playbackAccountId
            : this.accountId;

        return accountIdValue;
    }

    AzureKeyCredential getAccountKey() {
        String accountKeyValue = interceptorManager.isPlaybackMode()
            ? this.playbackAccountKey
            : this.accountKey;

        return new AzureKeyCredential(accountKeyValue);
    }

    String getStorageUrl() {
        String storageAccount = interceptorManager.isPlaybackMode()
            ? this.playbackStorageAccountName
            : this.storageAccountName;

        String blobContainer = interceptorManager.isPlaybackMode()
            ? this.playbackBlobContainerName
            : this.blobContainerName;

        return "https://" + storageAccount + ".blob.core.windows.net/" + blobContainerName;
    }

    String getBlobContainerSasToken() {
        String sasToken = interceptorManager.isPlaybackMode()
            ? this.playbackBlobContainerSasToken
            : this.blobContainerSasToken;

        return sasToken;
    }

    String getServiceEndpoint() {
        String serviceEndpoint = interceptorManager.isPlaybackMode()
            ? this.playbackServiceEndpoint
            : this.serviceEndpoint;

        return serviceEndpoint;
    }

    String getRandomId(String playback) {
        if (!interceptorManager.isPlaybackMode())
        {
            return UUID.randomUUID().toString();
        }
        else
        {
            return playback;
        }
    }

}
