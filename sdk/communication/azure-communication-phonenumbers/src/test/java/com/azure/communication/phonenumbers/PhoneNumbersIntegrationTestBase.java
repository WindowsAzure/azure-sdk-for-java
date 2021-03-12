// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.communication.phonenumbers;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.azure.communication.common.implementation.CommunicationConnectionString;
import com.azure.core.credential.AccessToken;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
//import com.azure.identity.DefaultAzureCredentialBuilder;
//import com.azure.identity.EnvironmentCredentialBuilder;
import com.azure.identity.ClientSecretCredentialBuilder;
//import com.azure.identity.EnvironmentCredential;

import reactor.core.publisher.Mono;

public class PhoneNumbersIntegrationTestBase extends TestBase {
    private static final String ENV_ACCESS_KEY =
        Configuration.getGlobalConfiguration().get("COMMUNICATION_SERVICE_ACCESS_KEY", "QWNjZXNzS2V5");
    private static final String ENV_ENDPOINT =
        Configuration.getGlobalConfiguration().get("COMMUNICATION_SERVICE_ENDPOINT", "https://REDACTED.communication.azure.com");
    private static final String CONNECTION_STRING = Configuration.getGlobalConfiguration()
        .get("COMMUNICATION_LIVETEST_CONNECTION_STRING", "endpoint=https://REDACTED.communication.azure.com/;accesskey=QWNjZXNzS2V5");
    protected static final String COUNTRY_CODE =
        Configuration.getGlobalConfiguration().get("COUNTRY_CODE", "US");
    protected static final String AREA_CODE =
        Configuration.getGlobalConfiguration().get("AREA_CODE", "833");

    protected static final String PHONE_NUMBER =
        Configuration.getGlobalConfiguration().get("COMMUNICATION_PHONE_NUMBER", "+11234567891");

    private static final StringJoiner JSON_PROPERTIES_TO_REDACT =
        new StringJoiner("\":\"|\"", "\"", "\":\"")
            .add("id")
            .add("phoneNumber");

    private static final Pattern JSON_PROPERTY_VALUE_REDACTION_PATTERN =
        Pattern.compile(String.format("(?:%s)(.*?)(?:\",|\"})", JSON_PROPERTIES_TO_REDACT.toString()), Pattern.CASE_INSENSITIVE);

    protected PhoneNumbersClientBuilder getClientBuilder(HttpClient httpClient) {
        if (getTestMode() == TestMode.PLAYBACK) {
            httpClient = interceptorManager.getPlaybackClient();
        }

        PhoneNumbersClientBuilder builder = new PhoneNumbersClientBuilder();
        builder
            .httpClient(httpClient)
            .endpoint(ENV_ENDPOINT)
            .credential(new AzureKeyCredential(ENV_ACCESS_KEY));

        if (getTestMode() == TestMode.RECORD) {
            List<Function<String, String>> redactors = new ArrayList<>();
            redactors.add(data -> redact(data, JSON_PROPERTY_VALUE_REDACTION_PATTERN.matcher(data), "REDACTED"));
            builder.addPolicy(interceptorManager.getRecordPolicy(redactors));
        }

        return builder;
    }

    protected PhoneNumbersClientBuilder getClientBuilderWithConnectionString(HttpClient httpClient) {
        if (getTestMode() == TestMode.PLAYBACK) {
            httpClient = interceptorManager.getPlaybackClient();
        }

        PhoneNumbersClientBuilder builder = new PhoneNumbersClientBuilder();
        builder
            .httpClient(httpClient)
            .connectionString(CONNECTION_STRING);

        if (getTestMode() == TestMode.RECORD) {
            List<Function<String, String>> redactors = new ArrayList<>();
            redactors.add(data -> redact(data, JSON_PROPERTY_VALUE_REDACTION_PATTERN.matcher(data), "REDACTED"));
            builder.addPolicy(interceptorManager.getRecordPolicy(redactors));
        }

        return builder;
    }

    protected PhoneNumbersClientBuilder getClientBuilderUsingManagedIdentity(HttpClient httpClient) {
        PhoneNumbersClientBuilder builder = new PhoneNumbersClientBuilder();
        builder
            .endpoint(new CommunicationConnectionString(CONNECTION_STRING).getEndpoint())
            .httpClient(httpClient == null ? interceptorManager.getPlaybackClient() : httpClient);

        if (getTestMode() == TestMode.PLAYBACK) {
            builder.credential(new FakeCredentials());
        } else {
            builder.credential(new ClientSecretCredentialBuilder().tenantId("3b78b39a-ac6c-465a-a010-5a3f47148ff0").clientId("19ea75db-1ade-473a-9f60-c3fb905f1f56").clientSecret("wxJC4-t.~G2Xb6gnTrXU9~t~F41hrBl42l").authorityHost("https://login.windows-ppe.net").build());

            //builder.credential(new DefaultAzureCredentialBuilder().build());
        }

        if (getTestMode() == TestMode.RECORD) {
            List<Function<String, String>> redactors = new ArrayList<>();
            redactors.add(data -> redact(data, JSON_PROPERTY_VALUE_REDACTION_PATTERN.matcher(data), "REDACTED"));
            builder.addPolicy(interceptorManager.getRecordPolicy(redactors));
        }

        return builder;
    }

    protected PhoneNumbersClientBuilder addLoggingPolicy(PhoneNumbersClientBuilder builder, String testName) {
        return builder.addPolicy((context, next) -> logHeaders(testName, next));
    }

    private Mono<HttpResponse> logHeaders(String testName, HttpPipelineNextPolicy next) {
        return next.process()
            .flatMap(httpResponse -> {
                final HttpResponse bufferedResponse = httpResponse.buffer();

                // Should sanitize printed reponse url
                System.out.println("MS-CV header for " + testName + " request "
                    + bufferedResponse.getRequest().getUrl() + ": " + bufferedResponse.getHeaderValue("MS-CV"));
                return Mono.just(bufferedResponse);
            });
    }

    static class FakeCredentials implements TokenCredential {
        @Override
        public Mono<AccessToken> getToken(TokenRequestContext tokenRequestContext) {
            return Mono.just(new AccessToken("someFakeToken", OffsetDateTime.MAX));
        }
    }

    private String redact(String content, Matcher matcher, String replacement) {
        while (matcher.find()) {
            String captureGroup = matcher.group(1);
            if (!CoreUtils.isNullOrEmpty(captureGroup)) {
                content = content.replace(matcher.group(1), replacement);
            }
        }

        return content;
    }
}
