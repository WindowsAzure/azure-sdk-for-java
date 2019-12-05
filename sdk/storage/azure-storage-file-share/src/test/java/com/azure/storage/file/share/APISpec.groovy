// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.share

import com.azure.core.http.HttpClient
import com.azure.core.http.ProxyOptions
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder
import com.azure.core.http.policy.HttpLogDetailLevel
import com.azure.core.http.policy.HttpLogOptions
import com.azure.core.http.policy.HttpPipelinePolicy
import com.azure.core.test.InterceptorManager
import com.azure.core.test.TestMode
import com.azure.core.test.utils.TestResourceNamer
import com.azure.core.util.Configuration
import com.azure.core.util.logging.ClientLogger
import com.azure.storage.common.StorageSharedKeyCredential
import com.azure.storage.file.share.models.ListSharesOptions
import spock.lang.Specification

import java.time.Duration
import java.time.OffsetDateTime

class APISpec extends Specification {
    // Field common used for all APIs.
    static ClientLogger logger = new ClientLogger(APISpec.class)

    Integer entityNo = 0 // Used to generate stable share names for recording tests requiring multiple shares.

    static def AZURE_TEST_MODE = "AZURE_TEST_MODE"
    URL testFolder = getClass().getClassLoader().getResource("testfiles")
    InterceptorManager interceptorManager
    TestResourceNamer testResourceName

    // Prefixes for paths and shares
    String sharePrefix = "jts" // java test share

    String pathPrefix = "javapath"

    public static final String defaultEndpointTemplate = "https://%s.file.core.windows.net/"

    static def PREMIUM_STORAGE = "PREMIUM_STORAGE_"
    static StorageSharedKeyCredential premiumCredential

    // Primary Clients used for API tests
    ShareServiceClient primaryFileServiceClient
    ShareServiceAsyncClient primaryFileServiceAsyncClient
    ShareServiceClient premiumFileServiceClient
    ShareServiceAsyncClient premiumFileServiceAsyncClient

    // Test name for test method name.
    String methodName

    static TestMode testMode = getTestMode()
    String connectionString

    // If debugging is enabled, recordings cannot run as there can only be one proxy at a time.
    static boolean enableDebugging = false

    /**
     * Setup the File service clients commonly used for the API tests.
     */
    def setup() {
        premiumCredential = getCredential(PREMIUM_STORAGE)
        String testName = reformat(specificationContext.currentIteration.getName())
        String className = specificationContext.getCurrentSpec().getName()
        methodName = className + testName
        logger.info("Test Mode: {}, Name: {}", testMode, methodName)
        interceptorManager = new InterceptorManager(methodName, testMode)
        testResourceName = new TestResourceNamer(methodName, testMode,
            interceptorManager.getRecordedData())
        if (getTestMode() == TestMode.RECORD) {
            connectionString = Configuration.getGlobalConfiguration().get("AZURE_STORAGE_FILE_CONNECTION_STRING")
        } else {
            connectionString = "DefaultEndpointsProtocol=https;AccountName=teststorage;" +
                "AccountKey=atestaccountkey;EndpointSuffix=core.windows.net"
        }
        premiumFileServiceClient = setClient(premiumCredential)
        premiumFileServiceAsyncClient = setAsyncClient(premiumCredential)
    }

    /**
     * Clean up the test shares, directories and files for the account.
     */
    def cleanup() {
        interceptorManager.close()
        if (getTestMode() == TestMode.RECORD) {
            ShareServiceClient cleanupFileServiceClient = new ShareServiceClientBuilder()
                .connectionString(connectionString)
                .buildClient()
            cleanupFileServiceClient.listShares(new ListSharesOptions().setPrefix(methodName.toLowerCase()),
                Duration.ofSeconds(30), null).each {
                cleanupFileServiceClient.deleteShare(it.getName())
            }
        }
    }

    private StorageSharedKeyCredential getCredential(String accountType) {
        String accountName
        String accountKey

        if (testMode == TestMode.RECORD) {
            accountName = Configuration.getGlobalConfiguration().get(accountType + "ACCOUNT_NAME")
            accountKey = Configuration.getGlobalConfiguration().get(accountType + "ACCOUNT_KEY")
        } else {
            accountName = "azstoragesdkaccount"
            accountKey = "astorageaccountkey"
        }

        if (accountName == null || accountKey == null) {
            logger.warning("Account name or key for the {} account was null. Test's requiring these credentials will fail.", accountType)
            return null
        }

        return new StorageSharedKeyCredential(accountName, accountKey)
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
            } catch (IllegalArgumentException e) {
                logger.error("Could not parse '{}' into TestEnum. Using 'Playback' mode.", azureTestMode)
                return TestMode.PLAYBACK
            }
        }

        logger.info("Environment variable '{}' has not been set yet. Using 'Playback' mode.", AZURE_TEST_MODE)
        return TestMode.PLAYBACK
    }

    static boolean liveMode() {
        return testMode == TestMode.RECORD
    }

    def generateShareName() {
        generateResourceName(sharePrefix, entityNo++)
    }

    def generatePathName() {
        generateResourceName(pathPrefix, entityNo++)
    }

    private String generateResourceName(String prefix, int entityNo) {
        return testResourceName.randomName(prefix + methodName + entityNo, 63)
    }

    ShareServiceAsyncClient setAsyncClient(StorageSharedKeyCredential credential) {
        try {
            return getServiceAsyncClient(credential)
        } catch (Exception ignore) {
            return null
        }
    }

    ShareServiceAsyncClient getServiceAsyncClient(StorageSharedKeyCredential credential) {
        // TODO : Remove this once its no longer preprod
        if (credential == premiumCredential) {
            return getServiceAsyncClient(credential, String.format("https://%s.file.preprod.core.windows.net/", credential.getAccountName()), null)
        }
        return getServiceAsyncClient(credential, String.format(defaultEndpointTemplate, credential.getAccountName()), null)
    }

    ShareServiceAsyncClient getServiceAsyncClient(StorageSharedKeyCredential credential, String endpoint,
                                        HttpPipelinePolicy... policies) {
        return getServiceClientBuilder(credential, endpoint, policies).buildAsyncClient()
    }

    ShareServiceClient setClient(StorageSharedKeyCredential credential) {
        try {
            return getServiceClient(credential)
        } catch (Exception ignore) {
            return null
        }
    }

    ShareServiceClient getServiceClient(StorageSharedKeyCredential credential) {
        // TODO : Remove this once its no longer preprod
        if (credential == premiumCredential) {
            return getServiceClient(credential, String.format("https://%s.file.preprod.core.windows.net/", credential.getAccountName()), null)
        }
        return getServiceClient(credential, String.format(defaultEndpointTemplate, credential.getAccountName()), null)
    }

    ShareServiceClient getServiceClient(StorageSharedKeyCredential credential, String endpoint,
                                       HttpPipelinePolicy... policies) {
        return getServiceClientBuilder(credential, endpoint, policies).buildClient()
    }

    ShareServiceClientBuilder getServiceClientBuilder(StorageSharedKeyCredential credential, String endpoint,
                                                     HttpPipelinePolicy... policies) {
        ShareServiceClientBuilder builder = new ShareServiceClientBuilder()
            .endpoint(endpoint)
            .httpClient(getHttpClient())
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))

        for (HttpPipelinePolicy policy : policies) {
            builder.addPolicy(policy)
        }

        if (testMode == TestMode.RECORD && liveMode()) {
            builder.addPolicy(interceptorManager.getRecordPolicy())
        }

        if (credential != null) {
            builder.credential(credential)
        }

        return builder
    }

    def fileServiceBuilderHelper(final InterceptorManager interceptorManager) {
        if (testMode == TestMode.RECORD) {
            return new ShareServiceClientBuilder()
                .connectionString(connectionString)
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .addPolicy(interceptorManager.getRecordPolicy())
                .httpClient(getHttpClient())
        } else {
            return new ShareServiceClientBuilder()
                .connectionString(connectionString)
                .httpClient(interceptorManager.getPlaybackClient())
        }
    }

    def shareBuilderHelper(final InterceptorManager interceptorManager, final String shareName) {
        if (testMode == TestMode.RECORD) {
            return new ShareClientBuilder()
                .connectionString(connectionString)
                .shareName(shareName)
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .addPolicy(interceptorManager.getRecordPolicy())
                .httpClient(getHttpClient())
        } else {
            return new ShareClientBuilder()
                .connectionString(connectionString)
                .shareName(shareName)
                .httpClient(interceptorManager.getPlaybackClient())
        }
    }

    def directoryBuilderHelper(final InterceptorManager interceptorManager, final String shareName, final String directoryPath) {
        if (testMode == TestMode.RECORD) {
            return new ShareFileClientBuilder()
                .connectionString(connectionString)
                .shareName(shareName)
                .resourcePath(directoryPath)
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .addPolicy(interceptorManager.getRecordPolicy())
                .httpClient(getHttpClient())
        } else {
            return new ShareFileClientBuilder()
                .connectionString(connectionString)
                .shareName(shareName)
                .resourcePath(directoryPath)
                .httpClient(interceptorManager.getPlaybackClient())
        }
    }

    def fileBuilderHelper(final InterceptorManager interceptorManager, final String shareName, final String filePath) {
        if (testMode == TestMode.RECORD) {
            return new ShareFileClientBuilder()
                .connectionString(connectionString)
                .shareName(shareName)
                .resourcePath(filePath)
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .addPolicy(interceptorManager.getRecordPolicy())
                .httpClient(getHttpClient())
        } else {
            return new ShareFileClientBuilder()
                .connectionString(connectionString)
                .shareName(shareName)
                .resourcePath(filePath)
                .httpClient(interceptorManager.getPlaybackClient())
        }
    }

    private def reformat(String text) {
        def fullName = text.split(" ").collect { it.capitalize() }.join("")
        def matcher = (fullName =~ /(.*)(\[)(.*)(\])/)

        if (!matcher.find()) {
            return fullName
        }
        return matcher[0][1] + matcher[0][3]
    }

    HttpClient getHttpClient() {

        NettyAsyncHttpClientBuilder builder = new NettyAsyncHttpClientBuilder()
        if (testMode == TestMode.RECORD) {
            builder.wiretap(true)

            if (Boolean.parseBoolean(Configuration.getGlobalConfiguration().get("AZURE_TEST_DEBUGGING"))) {
                builder.proxy(new ProxyOptions(ProxyOptions.Type.HTTP, new InetSocketAddress("localhost", 8888)))
            }

            return builder.build()
        } else {
            return interceptorManager.getPlaybackClient()
        }
    }

    OffsetDateTime getUTCNow() {
        return testResourceName.now()
    }

    InputStream getInputStream(byte[] data) {
        return new ByteArrayInputStream(data)
    }
}
