// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.core.test;

import com.azure.core.http.HttpClient;
import com.azure.core.implementation.http.HttpClientProviders;
import com.azure.core.test.utils.TestResourceNamer;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.io.UncheckedIOException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Base class for running live and playback tests using {@link InterceptorManager}.
 */
public abstract class TestBase implements BeforeEachCallback {
    // Environment variable name used to determine the TestMode.
    private static final String AZURE_TEST_MODE = "AZURE_TEST_MODE";
    private static final String AZURE_TEST_HTTP_CLIENTS = "AZURE_TEST_HTTP_CLIENTS";
    public static final String AZURE_TEST_HTTP_CLIENTS_VALUE_ALL = "ALL";
    public static final String AZURE_TEST_HTTP_CLIENTS_VALUE_NETTY = "NettyAsyncHttpClient";
    public static final String AZURE_TEST_SERVICE_VERSIONS_VALUE_ALL = "ALL";
    private static final String AZURE_TEST_OS_NAME = "OSName";
    private static final String AZURE_TEST_JDK_VERSION = "JavaVersion";
    private static Map<DayOfWeek, Integer> calendarMap;
    private static List<String> platformList;

    private static TestMode testMode;

    private final ClientLogger logger = new ClientLogger(TestBase.class);

    protected InterceptorManager interceptorManager;
    protected TestResourceNamer testResourceNamer;
    protected TestContextManager testContextManager;

    private ExtensionContext extensionContext;
    /**
     * Before tests are executed, determines the test mode by reading the {@link TestBase#AZURE_TEST_MODE} environment
     * variable. If it is not set, {@link TestMode#PLAYBACK}
     */
    @BeforeAll
    public static void setupClass() {
        testMode = initializeTestMode();
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) {
        this.extensionContext = extensionContext;
    }

    /**
     * Sets-up the {@link TestBase#testResourceNamer} and {@link TestBase#interceptorManager} before each test case is
     * run. Then calls its implementing class to perform any other set-up commands.
     *
     * @param testInfo {@link TestInfo} to retrieve test method name.
     */
    @BeforeEach
    public void setupTest(TestInfo testInfo) {
        this.testContextManager = new TestContextManager(testInfo.getTestMethod().get(), testMode);
        logger.info("Test Mode: {}, Name: {}", testMode, testContextManager.getTestName());

        try {
            interceptorManager = new InterceptorManager(testContextManager);
        } catch (UncheckedIOException e) {
            logger.error("Could not create interceptor for {}", testContextManager.getTestName(), e);
            Assertions.fail();
        }
        testResourceNamer = new TestResourceNamer(testContextManager, interceptorManager.getRecordedData());

        beforeTest();
    }

    /**
     * Disposes of {@link InterceptorManager} and its inheriting class' resources.
     * @param testInfo the injected testInfo
     */
    @AfterEach
    public void teardownTest(TestInfo testInfo) {
        if (testContextManager.didTestRun()) {
            afterTest();
            interceptorManager.close();
        }
    }

    /**
     * Gets the TestMode that has been initialized.
     *
     * @return The TestMode that has been initialized.
     */
    public TestMode getTestMode() {
        return testMode;
    }

    /**
     * Gets the name of the current test being run.
     *
     * @deprecated This method is deprecated as JUnit 5 provides a simpler mechanism to get the test method name through
     * {@link TestInfo}. Keeping this for backward compatability of other client libraries that still override this
     * method. This method can be deleted when all client libraries remove this method. See {@link
     * #setupTest(TestInfo)}.
     * @return The name of the current test.
     */
    @Deprecated
    protected String getTestName() {
        if (extensionContext != null) {
            return extensionContext.getTestMethod().map(Method::getName).orElse(null);
        }
        return null;
    }

    /**
     * Performs any set-up before each test case. Any initialization that occurs in TestBase occurs first before this.
     * Can be overridden in an inheriting class to add additional functionality during test set-up.
     */
    protected void beforeTest() {
    }

    /**
     * Dispose of any resources and clean-up after a test case runs. Can be overridden in an inheriting class to add
     * additional functionality during test teardown.
     */
    protected void afterTest() {
    }


    public static int getOffset() {
        LocalDate today = LocalDate.now();
        buildCalendarMap();
        buildPlatformList();
        return calendarMap.get(today.getDayOfWeek()) + getPlatFormOffset();
    }

    public static Integer getPlatFormOffset() {
        String currentOs = Configuration.getGlobalConfiguration().get(AZURE_TEST_OS_NAME);
        String currentJdk = Configuration.getGlobalConfiguration().get(AZURE_TEST_JDK_VERSION);
        System.out.println("--------------------------------");
        System.out.println(currentOs);
        System.out.println(currentJdk);
        System.out.println("--------------------------------");
        return platformList.stream().filter(platform ->
            currentOs.trim().toLowerCase(Locale.ROOT).contains(platform.split(",")[0].toLowerCase(Locale.ROOT))
            && currentJdk.trim().toLowerCase(Locale.ROOT).contains(platform.split(",")[1]
                .toLowerCase(Locale.ROOT))
        ).map(platformList::indexOf).findFirst().orElse(null);
    }

    /**
     * Returns a list of {@link HttpClient HttpClients} that should be tested.
     *
     * @return A list of {@link HttpClient HttpClients} to be tested.
     */
    public static List<HttpClient> getHttpClients() {
        if (testMode == TestMode.PLAYBACK) {
            // Call to @MethodSource method happens @BeforeEach call, so the interceptorManager is
            // not yet initialized. So, playbackClient will not be available until later.
            return null;
        }
        List<HttpClient> allHttpClients = HttpClientProviders.getAllHttpClients();
        int count = allHttpClients.size();
        List<HttpClient> filteredHttpClients = new ArrayList<>();
        int offset = getOffset();
        for (int i = 0; i < count; i++) {
            if (i % 6 == ((6 + getPlatFormOffset()) - offset) % count) {
                filteredHttpClients.add(allHttpClients.get(i));
            }
        }
        return filteredHttpClients;
    }

    private static void buildPlatformList() {
        platformList = new ArrayList<>();
        platformList.add("win,8");
        platformList.add("win,11");
        platformList.add("mac,8");
        platformList.add("mac,11");
        platformList.add("linux,8");
        platformList.add("linux,11");
    }

    private static void buildCalendarMap() {
        calendarMap = new HashMap<DayOfWeek, Integer>();
        calendarMap.put(DayOfWeek.MONDAY, 0);
        calendarMap.put(DayOfWeek.TUESDAY, 1);
        calendarMap.put(DayOfWeek.WEDNESDAY, 2);
        calendarMap.put(DayOfWeek.THURSDAY, 3);
        calendarMap.put(DayOfWeek.FRIDAY, 4);
        calendarMap.put(DayOfWeek.SATURDAY, 5);
        calendarMap.put(DayOfWeek.SUNDAY, 6);
    }

    /**
     * Returns whether the given http clients match the rules of test framework.
     *
     * <ul>
     * <li>Using Netty http client as default if no environment variable is set.</li>
     * <li>If it's set to ALL, all HttpClients in the classpath will be tested.</li>
     * <li>Otherwise, the name of the HttpClient class should match env variable.</li>
     * </ul>
     *
     * Environment values currently supported are: "ALL", "netty", "okhttp" which is case insensitive.
     * Use comma to separate http clients want to test.
     * e.g. {@code set AZURE_TEST_HTTP_CLIENTS = NettyAsyncHttpClient, OkHttpAsyncHttpClient}
     *
     * client Http client needs to check
     * @return Boolean indicates whether filters out the client or not.
     */
//    public static boolean shouldClientBeTested(HttpClient client) {
//        String configuredHttpClientToTest = Configuration.getGlobalConfiguration().get(AZURE_TEST_HTTP_CLIENTS);
//        if (CoreUtils.isNullOrEmpty(configuredHttpClientToTest)) {
//            return client.getClass().getSimpleName().equals(AZURE_TEST_HTTP_CLIENTS_VALUE_NETTY);
//        }
//        if (configuredHttpClientToTest.equalsIgnoreCase(AZURE_TEST_HTTP_CLIENTS_VALUE_ALL)) {
//            return true;
//        }
//        String[] configuredHttpClientList = configuredHttpClientToTest.split(",");
//        return Arrays.stream(configuredHttpClientList).anyMatch(configuredHttpClient ->
//            client.getClass().getSimpleName().toLowerCase(Locale.ROOT)
//                .contains(configuredHttpClient.trim().toLowerCase(Locale.ROOT)));
//    }

    private static TestMode initializeTestMode() {
        final ClientLogger logger = new ClientLogger(TestBase.class);
        final String azureTestMode = Configuration.getGlobalConfiguration().get(AZURE_TEST_MODE);

        if (azureTestMode != null) {
            try {
                return TestMode.valueOf(azureTestMode.toUpperCase(Locale.US));
            } catch (IllegalArgumentException e) {
                logger.error("Could not parse '{}' into TestEnum. Using 'Playback' mode.", azureTestMode);
                return TestMode.PLAYBACK;
            }
        }

        logger.info("Environment variable '{}' has not been set yet. Using 'Playback' mode.", AZURE_TEST_MODE);
        return TestMode.PLAYBACK;
    }

    /**
     * Sleeps the test for the given amount of milliseconds if {@link TestMode} isn't {@link TestMode#PLAYBACK}.
     *
     * @param millis Number of milliseconds to sleep the test.
     * @throws IllegalStateException If the sleep is interrupted.
     */
    protected void sleepIfRunningAgainstService(long millis) {
        if (testMode == TestMode.PLAYBACK) {
            return;
        }

        try {
            Thread.sleep(millis);
        } catch (InterruptedException ex) {
            throw logger.logExceptionAsWarning(new IllegalStateException(ex));
        }
    }
}
