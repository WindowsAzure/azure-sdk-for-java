// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.keys.cryptography;

import com.azure.core.http.HttpClient;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.provider.Arguments;

import static com.azure.core.test.TestBase.AZURE_TEST_SERVICE_VERSIONS_VALUE_ALL;
import static com.azure.core.test.TestBase.AZURE_TEST_SERVICE_VERSIONS_VALUE_ROLLING;
import static com.azure.core.test.TestBase.getArgumentsFromServiceVersion;


public class TestHelper {
    public static final String DISPLAY_NAME_WITH_ARGUMENTS = "{displayName} with [{arguments}]";
    private static final String AZURE_KEYVAULT_TEST_CRYPTOGRAPHY_SERVICE_VERSIONS =
        "AZURE_KEYVAULT_TEST_CRYPTOGRAPHY_SERVICE_VERSIONS";
    private static final String SERVICE_VERSION_FROM_ENV =
        Configuration.getGlobalConfiguration().get(AZURE_KEYVAULT_TEST_CRYPTOGRAPHY_SERVICE_VERSIONS);

    /**
     * Returns a stream of arguments that includes all combinations of eligible {@link HttpClient HttpClients} and
     * service versions that should be tested.
     *
     * @return A stream of HttpClient and service version combinations to test.
     */
    static Stream<Arguments> getTestParameters() {
        // when this issues is closed, the newer version of junit will have better support for
        // cartesian product of arguments - https://github.com/junit-team/junit5/issues/1427
        CryptographyServiceVersion[] filteredKeyServiceVersion =
            Arrays.stream(CryptographyServiceVersion.values()).filter(TestHelper::shouldServiceVersionBeTested)
                .toArray(CryptographyServiceVersion[]::new);
        boolean rollingServiceVersion = SERVICE_VERSION_FROM_ENV != null && SERVICE_VERSION_FROM_ENV
            .equalsIgnoreCase(AZURE_TEST_SERVICE_VERSIONS_VALUE_ROLLING);
        return getArgumentsFromServiceVersion(Arrays.asList(filteredKeyServiceVersion), rollingServiceVersion);
    }

    /**
     * Returns whether the given service version match the rules of test framework.
     *
     * <ul>
     * <li>Using latest service version as default if no environment variable is set.</li>
     * <li>If it's set to ALL, all Service versions in {@link CryptographyServiceVersion} will be tested.</li>
     * <li>Otherwise, Service version string should match env variable.</li>
     * </ul>
     *
     * Environment values currently supported are: "ALL", "${version}".
     * Use comma to separate http clients want to test.
     * e.g. {@code set AZURE_TEST_SERVICE_VERSIONS = V1_0, V2_0}
     *
     * @param serviceVersion ServiceVersion needs to check
     * @return Boolean indicates whether filters out the service version or not.
     */
    private static boolean shouldServiceVersionBeTested(CryptographyServiceVersion serviceVersion) {
        if (CoreUtils.isNullOrEmpty(SERVICE_VERSION_FROM_ENV)) {
            return CryptographyServiceVersion.getLatest().equals(serviceVersion);
        }
        if (AZURE_TEST_SERVICE_VERSIONS_VALUE_ALL.equalsIgnoreCase(SERVICE_VERSION_FROM_ENV)
            || AZURE_TEST_SERVICE_VERSIONS_VALUE_ROLLING.equalsIgnoreCase(SERVICE_VERSION_FROM_ENV)) {
            return true;
        }
        String[] configuredServiceVersionList = SERVICE_VERSION_FROM_ENV.split(",");
        return Arrays.stream(configuredServiceVersionList).anyMatch(configuredServiceVersion ->
            serviceVersion.getVersion().equals(configuredServiceVersion.trim()));
    }
}
