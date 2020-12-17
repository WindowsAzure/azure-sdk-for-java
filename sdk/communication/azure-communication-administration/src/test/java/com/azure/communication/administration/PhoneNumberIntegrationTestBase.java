// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.communication.administration;

import java.util.StringJoiner;
import java.util.regex.Pattern;

import com.azure.core.http.HttpClient;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;

public class PhoneNumberIntegrationTestBase extends TestBase {
    private static final String ENV_ACCESS_KEY = Configuration.getGlobalConfiguration()
            .get("COMMUNICATION_SERVICE_ACCESS_KEY", "QWNjZXNzS2V5");
    private static final String ENV_ENDPOINT = Configuration.getGlobalConfiguration()
            .get("COMMUNICATION_SERVICE_ENDPOINT", "https://REDACTED.communication.azure.com");
    private static final String CONNECTION_STRING = Configuration.getGlobalConfiguration().get(
            "COMMUNICATION_LIVETEST_CONNECTION_STRING",
            "endpoint=https://REDACTED.communication.azure.com/;accesskey=QWNjZXNzS2V5");

    protected static final String PHONE_NUMBER = Configuration.getGlobalConfiguration()
            .get("COMMUNICATION_PHONE_NUMBER", "+11234567891");
    protected static final String COUNTRY_CODE = Configuration.getGlobalConfiguration().get("COUNTRY_CODE", "US");
    protected static final String AREA_CODE = Configuration.getGlobalConfiguration().get("AREA_CODE", "619");
    protected static final String LOCALE = Configuration.getGlobalConfiguration().get("LOCALE", "en-us");
    protected static final String LOCATION_OPTION_STATE = Configuration.getGlobalConfiguration()
            .get("LOCATION_OPTION_STATE", "CA");
    protected static final String LOCATION_OPTION_CITY = Configuration.getGlobalConfiguration()
            .get("LOCATION_OPTION_CITY", "NOAM-US-CA-SD");
    protected static final String RESERVATION_OPTIONS_DESCRIPTION = Configuration.getGlobalConfiguration()
            .get("RESERVATION_OPTIONS_DESCRIPTION", "testReservation20200014");
    protected static final String RESERVATION_OPTIONS_NAME = Configuration.getGlobalConfiguration()
            .get("RESERVATION_OPTIONS_NAME", "testReservation20200014");

    private static final StringJoiner JSON_PROPERTIES_TO_REDACT = new StringJoiner("\":\"|\"", "\"", "\":\"")
            .add("phonePlanGroupId").add("phonePlanId");

    private static final Pattern JSON_PROPERTY_VALUE_REDACTION_PATTERN = Pattern.compile(
            String.format("(?:%s)(.*?)(?:\",|\"})", JSON_PROPERTIES_TO_REDACT.toString()), Pattern.CASE_INSENSITIVE);

    protected PhoneNumberClientBuilder getClientBuilder(HttpClient httpClient) {
        if (getTestMode() == TestMode.PLAYBACK) {
            httpClient = interceptorManager.getPlaybackClient();
        }

        PhoneNumberClientBuilder builder = new PhoneNumberClientBuilder();
        builder.httpClient(httpClient).endpoint(ENV_ENDPOINT).accessKey(ENV_ACCESS_KEY);

        if (getTestMode() == TestMode.RECORD) {
            interceptorManager.addTextReplacementRule(String.valueOf(JSON_PROPERTY_VALUE_REDACTION_PATTERN), "REDACTED");
            builder.addPolicy(interceptorManager.getRecordPolicy());
        }

        return builder;
    }

    protected PhoneNumberClientBuilder getClientBuilderWithConnectionString(HttpClient httpClient) {

        if (getTestMode() == TestMode.PLAYBACK) {
            httpClient = interceptorManager.getPlaybackClient();
        }

        PhoneNumberClientBuilder builder = new PhoneNumberClientBuilder();
        builder.httpClient(httpClient).connectionString(CONNECTION_STRING);

        if (getTestMode() == TestMode.RECORD) {
            interceptorManager.addTextReplacementRule(String.valueOf(JSON_PROPERTY_VALUE_REDACTION_PATTERN), "REDACTED");
            builder.addPolicy(interceptorManager.getRecordPolicy());
        }

        return builder;
    }

}
