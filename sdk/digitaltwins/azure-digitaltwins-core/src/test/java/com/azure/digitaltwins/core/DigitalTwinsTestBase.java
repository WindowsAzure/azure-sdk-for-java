package com.azure.digitaltwins.core;

import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.test.TestBase;
import com.azure.core.util.Configuration;
import com.azure.identity.ClientSecretCredentialBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.function.Function;

public class DigitalTwinsTestBase extends TestBase
{
    private static final String PLAYBACK_ENDPOINT = "https://playback.api.wus2.digitaltwins.azure.net";

    protected static final String TENANT_ID = Configuration.getGlobalConfiguration()
        .get("TENANT_ID", "tenantId");

    protected static final String CLIENT_SECRET = Configuration.getGlobalConfiguration()
        .get("CLIENT_SECRET", "clientSecret");

    protected static final String CLIENT_ID = Configuration.getGlobalConfiguration()
        .get("CLIENT_ID", "clientId");

    protected static final String DIGITALTWINS_URL = Configuration.getGlobalConfiguration()
        .get("DIGITALTWINS_URL", PLAYBACK_ENDPOINT);

    protected DigitalTwinsClientBuilder getDigitalTwinsClientBuilder(HttpClient httpClient, DigitalTwinsServiceVersion serviceVersion) {
        DigitalTwinsClientBuilder builder = new DigitalTwinsClientBuilder();

        builder.serviceVersion(serviceVersion);

        if (interceptorManager.isPlaybackMode()){
            builder.httpClient(interceptorManager.getPlaybackClient());
            // Use fake credentials for playback mode.
            builder.credential(new FakeCredentials());
            // Connect to a special host when running tests in playback mode.
            builder.endpoint(PLAYBACK_ENDPOINT);
            return builder;
        }

        // If it is record mode, we add record mode policies to the builder.
        // There is no isRecordMode method on interceptorManger.
        if (!interceptorManager.isLiveMode()){
            builder.addPolicy(interceptorManager.getRecordPolicy());
        }

        builder.httpClient(httpClient);
        builder.endpoint(DIGITALTWINS_URL);
        builder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));

        // Only get valid live token when running live tests.
        builder.credential(new ClientSecretCredentialBuilder()
            .tenantId(TENANT_ID)
            .clientId(CLIENT_ID)
            .clientSecret(CLIENT_SECRET)
            .build());

        return builder;
    }

    protected DigitalTwinsClientBuilder getDigitalTwinsClientBuilder(HttpClient httpClient, DigitalTwinsServiceVersion serviceVersion, HttpPipelinePolicy... policies) {
        DigitalTwinsClientBuilder builder = getDigitalTwinsClientBuilder(httpClient, serviceVersion);

        if (policies != null) {
            for (HttpPipelinePolicy policy : policies) {
                builder.addPolicy(policy);
            }
        }

        return builder;
    }

    protected DigitalTwinsClient getClient(HttpClient httpClient, DigitalTwinsServiceVersion serviceVersion) {
        return getDigitalTwinsClientBuilder(httpClient, serviceVersion)
            .buildClient();
    }

    protected DigitalTwinsAsyncClient getAsyncClient(HttpClient httpClient, DigitalTwinsServiceVersion serviceVersion) {
        return getDigitalTwinsClientBuilder(httpClient, serviceVersion)
            .buildAsyncClient();
    }

    /**
     * This function generates a random string of integers for use when creating models with a random version. It takes
     * a maxLength parameter that determines how long of a string of integers will be produced.
     *
     * For instance, if maxLength is 5, then the longest string of integers generated by this function may be "12345"
     */
    public Function<Integer, String> randomIntegerStringGenerator = (maxLength) -> {
        // This random string provided by azure.core is recorded, but it is also not guaranteed to be only integers
        // It usually generates a string like "154A52c29F42D" or similar. We need a string of random integers though
        // since our e2e tests need a random version number for our models. This function will convert the random
        // string of characters into a random string of integers.
        char[] randomCharactersString = testResourceNamer.randomName("", maxLength).toCharArray();
        StringBuilder randomIntegersString = new StringBuilder();

        // Convert the random string of characters into a random string of integers. A given random string of characters will always
        // be converted into the same random string of integers which is important since a recorded test and its replay
        // need to use the same random model version number so that the service calls match the session records.
        for (char c : randomCharactersString) {
            randomIntegersString.append(((int) c) % 10);
        }

        return randomIntegersString.toString();
    };

    // This should only be used when running tests in playback mode. Our client library requires that some token provider
    // is provided, but the actual value of the token is irrelevant when running playback tests.
    static class FakeCredentials implements TokenCredential
    {
        @Override
        public Mono<AccessToken> getToken(TokenRequestContext tokenRequestContext) {
            return Mono.just(new AccessToken("someFakeToken", OffsetDateTime.MAX));
        }
    }

    // Used for converting json strings into BasicDigitalTwins, BasicRelationships, etc.
    static <T> T deserializeJsonString(String rawJsonString, Class<T> clazz) throws JsonProcessingException {
        return new ObjectMapper().readValue(rawJsonString, clazz);
    }
}
