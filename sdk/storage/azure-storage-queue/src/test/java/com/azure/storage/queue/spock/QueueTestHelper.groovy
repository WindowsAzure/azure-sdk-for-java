// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.spock

import com.azure.core.http.rest.Response
import com.azure.core.implementation.util.ImplUtils
import com.azure.core.util.configuration.ConfigurationManager
import com.azure.storage.queue.models.*

import java.time.Duration

import static org.junit.Assert.*

class QueueTestHelper {
    static void assertResponseStatusCode(Response<?> response, int expectedStatusCode) {
        assertEquals(expectedStatusCode, response.statusCode())
    }

    static void assertExceptionStatusCodeAndMessage(Throwable throwable, int expectedStatusCode, String errMessage) {
        assertExceptionStatusCode(throwable, expectedStatusCode)
        assertExceptionErrorMessage(throwable, errMessage)
    }

    static void assertExceptionStatusCode(Throwable throwable, int expectedStatusCode) {
        assertTrue(throwable instanceof StorageErrorException)
        StorageErrorException storageErrorException = (StorageErrorException) throwable
        assertEquals(expectedStatusCode, storageErrorException.response().statusCode())
    }

    static void assertExceptionErrorMessage(Throwable throwable, String errMessage) {
        assertTrue(throwable instanceof StorageErrorException)
        assertTrue(throwable.getMessage().contains(errMessage))
    }

    static void assertQueuesAreEqual(QueueItem expected, QueueItem actual) {
        if (expected == null) {
            assertNull(actual)
        } else {
            assertEquals(expected.name(), actual.name())

            if (expected.metadata() != null && !ImplUtils.isNullOrEmpty(actual.metadata())) {
                assertEquals(expected.metadata(), actual.metadata())
            }
        }
    }

    static void assertQueueServicePropertiesAreEqual(StorageServiceProperties expected, StorageServiceProperties actual) {
        if (expected == null) {
            assertNull(actual)
        } else {
            assertMetricsAreEqual(expected.hourMetrics(), actual.hourMetrics())
            assertMetricsAreEqual(expected.minuteMetrics(), actual.minuteMetrics())
            assertLoggingAreEqual(expected.logging(), actual.logging())
            assertCorsAreEqual(expected.cors(), actual.cors())
        }
    }

    static void assertMetricsAreEqual(Metrics expected, Metrics actual) {
        if (expected == null) {
            assertNull(actual)
        } else {
            assertEquals(expected.enabled(), actual.enabled())
            assertEquals(expected.includeAPIs(), actual.includeAPIs())
            assertEquals(expected.version(), actual.version())
            assertRetentionPoliciesAreEqual(expected.retentionPolicy(), actual.retentionPolicy())
        }
    }

    static void assertLoggingAreEqual(Logging expected, Logging actual) {
        if (expected == null) {
            assertNull(actual)
        } else {
            assertEquals(expected.read(), actual.read())
            assertEquals(expected.write(), actual.write())
            assertEquals(expected.delete(), actual.delete())
            assertEquals(expected.version(), actual.version())
            assertRetentionPoliciesAreEqual(expected.retentionPolicy(), actual.retentionPolicy())
        }
    }

    static void assertRetentionPoliciesAreEqual(RetentionPolicy expected, RetentionPolicy actual) {
        if (expected == null) {
            assertNull(actual)
        } else {
            assertEquals(expected.days(), actual.days())
            assertEquals(expected.enabled(), actual.enabled())
        }
    }

    static void assertCorsAreEqual(List<CorsRule> expected, List<CorsRule> actual) {
        if (expected == null) {
            assertTrue(ImplUtils.isNullOrEmpty(actual))
        } else {
            assertEquals(expected.size(), actual.size())
            for (int i = 0; i < expected.size(); i++) {
                assertCorRulesAreEqual(expected.get(i), actual.get(i))
            }
        }
    }

    static void assertCorRulesAreEqual(CorsRule expected, CorsRule actual) {
        if (expected == null) {
            assertNull(actual)
        } else {
            assertEquals(expected.allowedHeaders(), actual.allowedHeaders())
            assertEquals(expected.allowedMethods(), actual.allowedMethods())
            assertEquals(expected.allowedOrigins(), actual.allowedOrigins())
            assertEquals(expected.exposedHeaders(), actual.exposedHeaders())
            assertEquals(expected.maxAgeInSeconds(), actual.maxAgeInSeconds())
        }
    }

    static void sleepInRecordMode(Duration duration) {
        String azureTestMode = ConfigurationManager.getConfiguration().get("AZURE_TEST_MODE")
        if ("RECORD".equalsIgnoreCase(azureTestMode)) {
            sleep(duration)
        }
    }

    static void assertPermissionsAreEqual(SignedIdentifier expected, SignedIdentifier actual) {
        assertEquals(expected.id(), actual.id());
        assertEquals(expected.accessPolicy().permission(), actual.accessPolicy().permission());
        assertEquals(expected.accessPolicy().start(), actual.accessPolicy().start());
        assertEquals(expected.accessPolicy().expiry(), actual.accessPolicy().expiry());
    }

    private static void sleep(Duration duration) {
        try {
            Thread.sleep(duration.toMillis());
        } catch (InterruptedException ex) {
            // Ignore the error
        }
    }
}
