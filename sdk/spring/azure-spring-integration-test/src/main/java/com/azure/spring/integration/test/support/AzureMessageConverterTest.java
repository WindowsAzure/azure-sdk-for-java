// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.integration.test.support;

import com.azure.spring.integration.core.converter.AzureMessageConverter;
import com.azure.spring.integration.test.support.pojo.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class AzureMessageConverterTest<T> {
    protected String payload = "payload";
    protected String headerProperties = "headerProperties";
    private AzureMessageConverter<T> converter = null;
    private Class<T> targetClass;

    public static void main(String[] args) {

    }

    @BeforeAll
    public void setUp() {
        converter = getConverter();
        targetClass = getTargetClass();
    }

    @Test
    public void payloadAsString() {
        convertAndBack(payload, String.class);
    }

    @Test
    public void payloadAsByte() {
        convertAndBack(payload.getBytes(StandardCharsets.UTF_8), byte[].class);
    }

    @Test
    public void payloadAsTargetType() {
        convertAndBack(getInstance(), targetClass);
    }

    @Test
    public void payloadAsUserClass() {
        convertAndBack(new User(payload), User.class);
    }

    private <U> void convertAndBack(U payload, Class<U> payloadClass) {
        Message<U> message = MessageBuilder.withPayload(payload).setHeader(headerProperties, headerProperties).build();
        T azureMessage = converter.fromMessage(message, targetClass);
        Message<U> convertedMessage = converter.toMessage(azureMessage, payloadClass);
        assertNotNull(convertedMessage);
        assertMessagePayloadEquals(convertedMessage.getPayload(), payload);
        assertMessageHeadersEqual(azureMessage, convertedMessage);
    }

    private <U> void assertMessagePayloadEquals(U convertedPayload, U payload) {
        if (convertedPayload.getClass().equals(byte[].class)) {
            assertTrue(Arrays.equals((byte[]) convertedPayload, (byte[]) payload));
        } else {
            assertEquals(convertedPayload, payload);
        }
    }

    protected void assertMessageHeadersEqual(T azureMessage, Message<?> message) {
    }

    protected abstract T getInstance();

    protected abstract AzureMessageConverter<T> getConverter();

    protected abstract Class<T> getTargetClass();
}
