// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.search.documents.models.RequestOptions;
import com.azure.search.documents.models.SearchErrorException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.reactivestreams.Publisher;
import reactor.test.StepVerifier;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * This class contains helper methods for running Azure Search tests.
 */
public final class TestHelpers {
    private static final TestMode TEST_MODE = setupTestMode();

    private static final ObjectMapper OBJECT_MAPPER;

    static {
        OBJECT_MAPPER = new ObjectMapper();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        df.setTimeZone(TimeZone.getDefault());
        OBJECT_MAPPER.setDateFormat(df);
        OBJECT_MAPPER.registerModule(new JavaTimeModule());
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    /**
     * Checks if the passed {@link CharSequence} is {@code null}, empty, or only contains spaces.
     *
     * @param charSequence {@link CharSequence} to check for being blank.
     * @return {@code true} if the {@link CharSequence} is {@code null}, empty, or only contains spaces, otherwise
     * {@code false}.
     */
    public static boolean isBlank(CharSequence charSequence) {
        if (CoreUtils.isNullOrEmpty(charSequence)) {
            return true;
        }

        return charSequence.chars().allMatch(Character::isWhitespace);
    }

    /**
     * Gets the {@code "eTag"} value from the passed object.
     *
     * @param obj The object that will have its eTag value retrieved.
     * @return The eTag value if the object has an {@code "eTag"} field, otherwise {@code ""}.
     */
    public static String getETag(Object obj) {
        Class<?> clazz = obj.getClass();
        try {
            // Try using the getter method first.
            return (String) clazz.getMethod("getETag").invoke(obj);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException ex) {
            try {
                // Next attempt to get the value from the field directly.
                Field eTagField = clazz.getField("eTag");
                eTagField.setAccessible(true);
                return (String) eTagField.get(obj);
            } catch (IllegalAccessException | NoSuchFieldException ignored) {
                // Finally just return empty string since we couldn't access the method or field.
                return "";
            }
        }
    }

    /**
     * Assert whether two objects are equal.
     *
     * @param expected The expected object.
     * @param actual The actual object.
     */
    public static void assertObjectEquals(Object expected, Object actual) {
        JacksonAdapter jacksonAdapter = new JacksonAdapter();
        try {
            assertEquals(jacksonAdapter.serialize(expected, SerializerEncoding.JSON),
                jacksonAdapter.serialize(actual, SerializerEncoding.JSON));
        } catch (IOException ex) {
            fail("There is something wrong happen in serializer.");
        }
    }

    /**
     * Assert whether two objects are equal.
     *
     * @param expected The expected object.
     * @param actual The actual object.
     * @param ignoredDefaults Set to true if it needs to ignore default value of expected object.
     * @param ignoredFields Varargs of ignored fields.
     */
    public static void assertObjectEquals(Object expected, Object actual, boolean ignoredDefaults,
        String... ignoredFields) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode expectedNode = mapper.valueToTree(expected);
        ObjectNode actualNode = mapper.valueToTree(actual);
        assertOnMapIterator(expectedNode.fields(), actualNode, ignoredDefaults, ignoredFields);
    }

    private static void assertOnMapIterator(Iterator<Map.Entry<String, JsonNode>> expectedNode,
        ObjectNode actualNode, boolean ignoredDefaults, String[] ignoredFields) {
        Set<String> ignoredFieldSet = new HashSet<>(Arrays.asList(ignoredFields));
        while (expectedNode.hasNext()) {
            assertTrue(actualNode.fields().hasNext());
            Map.Entry<String, JsonNode> expectedField = expectedNode.next();
            String fieldName = expectedField.getKey();
            if (shouldSkipField(fieldName, expectedField.getValue(), ignoredDefaults, ignoredFieldSet)) {
                continue;
            }
            if (expectedField.getValue().isValueNode()) {
                assertEquals(expectedField.getValue(), actualNode.get(expectedField.getKey()));
            } else if (expectedField.getValue().isArray()) {
                Iterator<JsonNode> expectedArray = expectedField.getValue().elements();
                Iterator<JsonNode> actualArray = actualNode.get(expectedField.getKey()).elements();
                while (expectedArray.hasNext()) {
                    assertTrue(actualArray.hasNext());
                    Iterator<JsonNode> expectedElements = expectedArray.next().elements();
                    Iterator<JsonNode> actualElements = actualArray.next().elements();
                    while (expectedElements.hasNext()) {
                        assertTrue(actualElements.hasNext());
                        JsonNode a = expectedElements.next();
                        JsonNode b = actualElements.next();
                        if (ignoredFieldSet.contains(fieldName)) {
                            continue;
                        }
                        if (shouldSkipField(null, a, true, null)) {
                            continue;
                        }
                        assertEquals(a.asText(), b.asText());
                    }
                }
            } else {
                assertObjectEquals(expectedField.getValue(), actualNode.get(expectedField.getKey()), ignoredDefaults,
                    ignoredFields);
            }
        }
    }

    private static boolean shouldSkipField(String fieldName, JsonNode fieldValue,
        boolean ignoredDefaults, Set<String> ignoredFields) {
        if (ignoredFields != null && ignoredFields.contains(fieldName)) {
            return true;
        }

        if (ignoredDefaults) {
            if (fieldValue.isNull()) {
                return true;
            }
            if (fieldValue.isBoolean() && !fieldValue.asBoolean()) {
                return true;
            }
            return fieldValue.isNumber() && fieldValue.asDouble() == 0.0D;
        }
        return false;
    }

    public static void assertHttpResponseException(Runnable exceptionThrower, int statusCode, String expectedMessage) {
        try {
            exceptionThrower.run();
            fail();
        } catch (Throwable ex) {
            verifyHttpResponseError(ex, statusCode, expectedMessage);
        }
    }

    public static void assertHttpResponseExceptionAsync(Publisher<?> exceptionThrower) {
        StepVerifier.create(exceptionThrower)
            .verifyErrorSatisfies(error -> verifyHttpResponseError(error, HttpURLConnection.HTTP_BAD_REQUEST,
                "Invalid expression: Could not find a property named 'ThisFieldDoesNotExist' on type 'search.document'."));
    }

    private static void verifyHttpResponseError(Throwable ex, int statusCode, String expectedMessage) {

        assertEquals(SearchErrorException.class, ex.getClass());

        assertEquals(statusCode, ((HttpResponseException) ex).getResponse().getStatusCode());

        if (expectedMessage != null) {
            assertTrue(ex.getMessage().contains(expectedMessage));
        }
    }

    public static RequestOptions generateRequestOptions() {
        return new RequestOptions().setXMsClientRequestId(UUID.randomUUID());
    }

    public static void waitForIndexing() {
        // Wait 2 seconds to allow index request to finish.
        sleepIfRunningAgainstService(2000);
    }

    public static void sleepIfRunningAgainstService(long millis) {
        if (TEST_MODE == TestMode.PLAYBACK) {
            return;
        }

        try {
            Thread.sleep(millis);
        } catch (InterruptedException ex) {
            throw new IllegalStateException(ex);
        }
    }

    static TestMode setupTestMode() {
        try {
            return TestMode.valueOf(Configuration.getGlobalConfiguration().get("AZURE_TEST_MODE", "PLAYBACK"));
        } catch (RuntimeException ex) {
            return TestMode.PLAYBACK;
        }
    }

    public static <T> T convertToType(Object document, Class<T> cls) {
        return OBJECT_MAPPER.convertValue(document, cls);
    }
}
