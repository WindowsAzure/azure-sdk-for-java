// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file


import com.azure.storage.file.models.CorsRule
import com.azure.storage.file.models.FileServiceProperties
import com.azure.storage.file.models.Metrics
import com.azure.storage.file.models.RetentionPolicy
import com.azure.storage.file.models.ShareItem
import com.azure.storage.file.models.StorageErrorCode
import com.azure.storage.file.models.StorageException

import java.nio.file.Files
import java.nio.file.Paths

class FileTestHelper {
    static <T extends Throwable> boolean assertExceptionStatusCodeAndMessage(T throwable, int expectedStatusCode, StorageErrorCode errMessage) {
        return assertExceptionStatusCode(throwable, expectedStatusCode) && assertExceptionErrorMessage(throwable, errMessage)
    }

    static boolean assertExceptionStatusCode(Throwable throwable, int expectedStatusCode) {
        return throwable instanceof StorageException &&
            ((StorageException) throwable).statusCode() == expectedStatusCode
    }

    static boolean assertExceptionErrorMessage(Throwable throwable, StorageErrorCode errMessage) {
        return throwable instanceof StorageException &&
            ((StorageException) throwable).errorCode() == errMessage
    }

    static boolean assertMetricsAreEqual(Metrics expected, Metrics actual) {
        if (expected == null) {
            return actual == null
        } else {
            return Objects.equals(expected.enabled(), actual.enabled()) &&
                Objects.equals(expected.includeAPIs(), actual.includeAPIs()) &&
                Objects.equals(expected.version(), actual.version()) &&
                assertRetentionPoliciesAreEqual(expected.retentionPolicy(), actual.retentionPolicy())
        }
    }

    static boolean assertRetentionPoliciesAreEqual(RetentionPolicy expected, RetentionPolicy actual) {
        if (expected == null) {
            return actual == null
        } else {
            return Objects.equals(expected.days(), actual.days()) &&
                Objects.equals(expected.enabled(), actual.enabled())
        }
    }

    static boolean assertCorsAreEqual(List<CorsRule> expected, List<CorsRule> actual) {
        if (expected == null) {
            return actual == null
        } else {
            if (expected.size() != actual.size()) {
                return false
            }
            for (int i = 0; i < expected.size(); i++) {
                if (!assertCorRulesAreEqual(expected.get(i), actual.get(i))) {
                    return false
                }
            }
            return true
        }
    }

    static boolean assertCorRulesAreEqual(CorsRule expected, CorsRule actual) {
        if (expected == null) {
            return actual == null
        } else {
            return Objects.equals(expected.allowedHeaders(), actual.allowedHeaders()) &&
                Objects.equals(expected.allowedMethods(), actual.allowedMethods()) &&
                Objects.equals(expected.allowedOrigins(), actual.allowedOrigins()) &&
                Objects.equals(expected.maxAgeInSeconds(), actual.maxAgeInSeconds())
        }
    }

    static boolean assertSharesAreEqual(ShareItem expected, ShareItem actual, boolean includeMetadata, boolean includeSnapshot) {
        if (expected == null) {
            return actual == null
        } else {
            if (!Objects.equals(expected.name(), actual.name())) {
                return false
            }

            if (includeMetadata && !Objects.equals(expected.metadata(), actual.metadata())) {
                return false
            }
            if (includeSnapshot && !Objects.equals(expected.snapshot(), actual.snapshot())) {
                return false
            }

            if (expected.properties() == null) {
                return actual.properties() == null
            } else {
                return Objects.equals(expected.properties().quota(), actual.properties().quota())
            }
        }
    }

    static boolean assertFileServicePropertiesAreEqual(FileServiceProperties expected, FileServiceProperties actual) {
        if (expected == null) {
            return actual == null
        } else {
            return assertMetricsAreEqual(expected.hourMetrics(), actual.hourMetrics()) &&
                assertMetricsAreEqual(expected.minuteMetrics(), actual.minuteMetrics()) &&
                assertCorsAreEqual(expected.cors(), actual.cors())
        }
    }

    static String createRandomFileWithLength(int size, String folder, String fileName) {
        def path = Paths.get(folder)
        if (!Files.exists(path)) {
            Files.createDirectory(path)
        }
        def randomFile = new File(folder + "/" + fileName)
        RandomAccessFile raf = new RandomAccessFile(randomFile, "rw")
        raf.setLength(size)
        raf.close()
        return randomFile.getPath()
    }

    static void deleteFolderIfExists(String folder) {
        // Clean up all temporary generated files
        def dir = new File(folder)
        if (dir.isDirectory()) {
            File[] children = dir.listFiles()
            for (int i = 0; i < children.length; i++) {
                Files.delete(children[i].toPath())
            }
        }
    }
}
