// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.data.appconfiguration;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.TimeoutPolicy;
import com.azure.core.util.Configuration;
import com.azure.data.appconfiguration.implementation.ClientConstants;
import com.azure.data.appconfiguration.implementation.ConfigurationClientCredentials;
import com.azure.data.appconfiguration.models.ConfigurationSetting;
import com.azure.identity.DefaultAzureCredentialBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConfigurationClientBuilderTest {
    private static final String AZURE_APPCONFIG_CONNECTION_STRING = "AZURE_APPCONFIG_CONNECTION_STRING";
    private static final String DEFAULT_DOMAIN_NAME = ".azconfig.io";
    private static final String NAMESPACE_NAME = "dummyNamespaceName";

    private static final String ENDPOINT = getURI(ClientConstants.ENDPOINT_FORMAT, NAMESPACE_NAME, DEFAULT_DOMAIN_NAME).toString();

    @Test
    public void missingEndpoint() {
        assertThrows(NullPointerException.class, () -> {
            final ConfigurationClientBuilder builder = new ConfigurationClientBuilder();
            builder.buildAsyncClient();
        });
    }

    @Test
    public void malformedURLExceptionForEndpoint() {
        assertThrows(IllegalArgumentException.class, () -> {
            final ConfigurationClientBuilder builder = new ConfigurationClientBuilder();
            builder.endpoint("htp://" + NAMESPACE_NAME + DEFAULT_DOMAIN_NAME).buildAsyncClient();
        });
    }

    @Test
    public void nullConnectionString() {
        assertThrows(NullPointerException.class, () -> {
            final ConfigurationClientBuilder builder = new ConfigurationClientBuilder();
            builder.connectionString(null).buildAsyncClient();
        });
    }

    @Test
    public void emptyConnectionString() {
        assertThrows(IllegalArgumentException.class, () -> {
            final ConfigurationClientBuilder builder = new ConfigurationClientBuilder();
            builder.connectionString("").buildAsyncClient();
        });
    }

    @Test
    public void missingSecretKey() {
        assertThrows(IllegalArgumentException.class, () -> {
            final ConfigurationClientBuilder builder = new ConfigurationClientBuilder();
            builder.connectionString("endpoint=" + ENDPOINT + ";Id=aaa;Secret=").buildAsyncClient();
        });
    }

    @Test
    public void missingId() {
        assertThrows(IllegalArgumentException.class, () -> {
            final ConfigurationClientBuilder builder = new ConfigurationClientBuilder();
            builder.connectionString("endpoint=" + ENDPOINT + ";Id=;Secret=aaa").buildAsyncClient();
        });
    }

    @Test
    public void invalidConnectionStringSegmentCount() {
        assertThrows(IllegalArgumentException.class, () -> {
            final ConfigurationClientBuilder builder = new ConfigurationClientBuilder();
            builder.connectionString("endpoint=" + ENDPOINT + ";Id=aaa").buildAsyncClient();
        });
    }

    @Test
    public void nullAADCredential() {
        assertThrows(NullPointerException.class, () -> {
            final ConfigurationClientBuilder builder = new ConfigurationClientBuilder();
            builder.endpoint(ENDPOINT).credential(null).buildAsyncClient();
        });
    }

    @Test
    public void validAADCredential() throws NoSuchAlgorithmException, InvalidKeyException {
        final String key = "newKey";
        final String value = "newValue";

        final String connectionString = Configuration.getGlobalConfiguration().get(AZURE_APPCONFIG_CONNECTION_STRING);
        final ConfigurationClient client = new ConfigurationClientBuilder()
            .endpoint(new ConfigurationClientCredentials(connectionString).getBaseUri())
            .credential(new DefaultAzureCredentialBuilder().build())
            .retryPolicy(new RetryPolicy())
            .configuration(Configuration.getGlobalConfiguration())
            .buildClient();

        ConfigurationSetting addedSetting = client.setConfigurationSetting(key, null, value);
        Assertions.assertEquals(addedSetting.getKey(), key);
        Assertions.assertEquals(addedSetting.getValue(), value);
    }

    @Test
    public void timeoutPolicyWithAADCredential() throws NoSuchAlgorithmException, InvalidKeyException {
        final String key = "newKey";
        final String value = "newValue";

        final String connectionString = Configuration.getGlobalConfiguration().get(AZURE_APPCONFIG_CONNECTION_STRING);
        final ConfigurationClient client = new ConfigurationClientBuilder()
            .endpoint(new ConfigurationClientCredentials(connectionString).getBaseUri())
            .credential(new DefaultAzureCredentialBuilder().build())
            .addPolicy(new TimeoutPolicy(Duration.ofMillis(1)))
            .buildClient();

        assertThrows(RuntimeException.class, () -> client.setConfigurationSetting(key, null, value));
    }

    @Test
    public void nullServiceVersionWithAADCredential() throws NoSuchAlgorithmException, InvalidKeyException {
        final String key = "newKey";
        final String value = "newValue";

        final String connectionString = Configuration.getGlobalConfiguration().get(AZURE_APPCONFIG_CONNECTION_STRING);
        final ConfigurationClient client = new ConfigurationClientBuilder()
            .endpoint(new ConfigurationClientCredentials(connectionString).getBaseUri())
            .credential(new DefaultAzureCredentialBuilder().build())
            .serviceVersion(null)
            .buildClient();

        ConfigurationSetting addedSetting = client.setConfigurationSetting(key, null, value);
        Assertions.assertEquals(addedSetting.getKey(), key);
        Assertions.assertEquals(addedSetting.getValue(), value);
    }

    @Test
    public void defaultPipelineWithAADCredential() throws NoSuchAlgorithmException, InvalidKeyException {
        final String key = "newKey";
        final String value = "newValue";

        final String connectionString = Configuration.getGlobalConfiguration().get(AZURE_APPCONFIG_CONNECTION_STRING);
        final ConfigurationClientBuilder clientBuilder = new ConfigurationClientBuilder()
            .endpoint(new ConfigurationClientCredentials(connectionString).getBaseUri())
            .credential(new DefaultAzureCredentialBuilder().build())
            .pipeline(new HttpPipelineBuilder().build());

        assertThrows(HttpResponseException.class,
            () -> clientBuilder.buildClient().setConfigurationSetting(key, null, value));

        clientBuilder.pipeline(null);

        ConfigurationSetting addedSetting = clientBuilder.buildClient().setConfigurationSetting(key, null, value);
        Assertions.assertEquals(addedSetting.getKey(), key);
        Assertions.assertEquals(addedSetting.getValue(), value);
    }

    private static URI getURI(String endpointFormat, String namespace, String domainName) {
        try {
            return new URI(String.format(Locale.US, endpointFormat, namespace, domainName));
        } catch (URISyntaxException exception) {
            throw new IllegalArgumentException(String.format(Locale.US,
                "Invalid namespace name: %s", namespace), exception);
        }
    }
}
