// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.share

import com.azure.core.http.ProxyOptions
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder
import com.azure.core.test.InterceptorManager
import com.azure.core.test.TestMode
import com.azure.core.test.TestRunVerifier
import com.azure.core.test.utils.TestResourceNamer
import com.azure.core.util.Configuration
import com.azure.core.util.logging.ClientLogger
import com.azure.storage.file.share.models.ListSharesOptions
import spock.lang.Specification

import java.time.Duration
import java.time.OffsetDateTime

class APISpec extends Specification {
    // Field common used for all APIs.
    static ClientLogger logger = new ClientLogger(APISpec.class)
    static def AZURE_TEST_MODE = "AZURE_TEST_MODE"
    def tmpFolder = getClass().getClassLoader().getResource("tmptestfiles")
    def testFolder = getClass().getClassLoader().getResource("testfiles")
    InterceptorManager interceptorManager
    TestResourceNamer resourceNamer

    // Primary Clients used for API tests
    ShareServiceClient primaryFileServiceClient
    ShareServiceAsyncClient primaryFileServiceAsyncClient


    // Test name for test method name.
    String methodName

    static TestMode testMode = getTestMode()
    String connectionString
    TestRunVerifier testRunVerifier

    // If debugging is enabled, recordings cannot run as there can only be one proxy at a time.
    static boolean enableDebugging = false

    /**
     * Setup the File service clients commonly used for the API tests.
     */
    def setup() {
        String testName = reformat(specificationContext.currentIteration.getName())
        String className = specificationContext.getCurrentSpec().getName()
        methodName = className + testName
        logger.info("Test Mode: {}, Name: {}", testMode, methodName)

        testRunVerifier = new TestRunVerifier(specificationContext.getCurrentFeature().getFeatureMethod().getReflection())
        testRunVerifier.verifyTestCanRun(testMode)

        this.interceptorManager = new InterceptorManager(methodName, testMode, testRunVerifier.doNotRecordTest())
        this.resourceNamer = new TestResourceNamer(methodName, testMode, testRunVerifier.doNotRecordTest(), interceptorManager.getRecordedData())

        connectionString = (testMode == TestMode.PLAYBACK)
            ? "DefaultEndpointsProtocol=https;AccountName=teststorage;AccountKey=atestaccountkey;EndpointSuffix=core.windows.net"
            : Configuration.getGlobalConfiguration().get("AZURE_STORAGE_FILE_CONNECTION_STRING")
    }

    /**
     * Clean up the test shares, directories and files for the account.
     */
    def cleanup() {
        if (testRunVerifier.wasTestRan()) {
            interceptorManager.close()
            if (getTestMode() != TestMode.PLAYBACK) {
                ShareServiceClient cleanupFileServiceClient = new ShareServiceClientBuilder()
                    .connectionString(connectionString)
                    .buildClient()
                cleanupFileServiceClient.listShares(new ListSharesOptions().setPrefix(methodName.toLowerCase()),
                    Duration.ofSeconds(30), null).each {
                    cleanupFileServiceClient.deleteShare(it.getName())
                }
            }
        }
    }

    /**
     * Test mode is initialized whenever test is executed. Helper method which is used to determine what to do under
     * certain test mode.
     * @return The TestMode:
     * <ul>
     *     <li>Record</li>
     *     <li>Playback: (default if no test mode setup)</li>
     * </ul>
     */
    static def getTestMode() {
        def azureTestMode = Configuration.getGlobalConfiguration().get(AZURE_TEST_MODE)

        if (azureTestMode != null) {
            try {
                return TestMode.valueOf(azureTestMode.toUpperCase(Locale.US))
            } catch (IllegalArgumentException ignored) {
                logger.error("Could not parse '{}' into TestEnum. Using 'Playback' mode.", azureTestMode)
                return TestMode.PLAYBACK
            }
        }

        logger.info("Environment variable '{}' has not been set yet. Using 'Playback' mode.", AZURE_TEST_MODE)
        return TestMode.PLAYBACK
    }

    def fileServiceBuilderHelper() {
        def builder = new ShareServiceClientBuilder()
            .connectionString(connectionString)
            .httpClient(getHttpClient())

        if (testMode == TestMode.RECORD && !testRunVerifier.doNotRecordTest()) {
            builder.addPolicy(interceptorManager.getRecordPolicy())
        }

        return builder
    }

    def shareBuilderHelper(final String shareName) {
        def builder = new ShareClientBuilder()
            .connectionString(connectionString)
            .shareName(shareName)
            .httpClient(getHttpClient())

        if (testMode == TestMode.RECORD && !testRunVerifier.doNotRecordTest()) {
            builder.addPolicy(interceptorManager.getRecordPolicy())
        }

        return builder
    }

    def directoryBuilderHelper(final String shareName, final String directoryPath) {
        def builder = new ShareFileClientBuilder()
            .connectionString(connectionString)
            .shareName(shareName)
            .resourcePath(directoryPath)
            .httpClient(getHttpClient())

        if (testMode == TestMode.RECORD && !testRunVerifier.doNotRecordTest()) {
            builder.addPolicy(interceptorManager.getRecordPolicy())
        }

        return builder
    }

    def fileBuilderHelper(final String shareName, final String filePath) {
        def builder = new ShareFileClientBuilder()
            .connectionString(connectionString)
            .shareName(shareName)
            .resourcePath(filePath)
            .httpClient(getHttpClient())

        if (testMode == TestMode.RECORD && !testRunVerifier.doNotRecordTest()) {
            builder.addPolicy(interceptorManager.getRecordPolicy())
        }

        return builder
    }

    private static def reformat(String text) {
        def fullName = text.split(" ").collect { it.capitalize() }.join("")
        def matcher = (fullName =~ /(.*)(\[)(.*)(\])/)

        if (!matcher.find()) {
            return fullName
        }
        return matcher[0][1] + matcher[0][3]
    }

    def getHttpClient() {
        if (testMode == TestMode.PLAYBACK && !testRunVerifier.doNotRecordTest()) {
            return interceptorManager.getPlaybackClient()
        }

        def httpClientBuilder = new NettyAsyncHttpClientBuilder()
        if (enableDebugging) {
            httpClientBuilder.proxy(new ProxyOptions(ProxyOptions.Type.HTTP, new InetSocketAddress("localhost", 8888)))
        }

        return (testMode == TestMode.RECORD && !testRunVerifier.doNotRecordTest())
            ? httpClientBuilder.wiretap(true).build()
            : httpClientBuilder.build()
    }

    OffsetDateTime getUTCNow() {
        return resourceNamer.now()
    }

    InputStream getInputStream(byte[] data) {
        return new ByteArrayInputStream(data)
    }
}
