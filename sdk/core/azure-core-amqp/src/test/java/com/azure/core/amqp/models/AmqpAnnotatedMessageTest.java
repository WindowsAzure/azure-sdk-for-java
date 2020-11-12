// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.models;

import com.azure.core.util.logging.ClientLogger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;

/**
 * Test class for  {@link AmqpAnnotatedMessage}
 */
public class AmqpAnnotatedMessageTest {

    private static final byte[] CONTENTS_BYTES = "Some-contents".getBytes(StandardCharsets.UTF_8);
    private final ClientLogger logger = new ClientLogger(AmqpAnnotatedMessageTest.class);

    /**
     * Verifies we correctly set values via copy constructor for {@link AmqpAnnotatedMessage} and create new
     * instances of the properties.
     */
    @Test
    public void copyConstructorTest() {
        // Arrange
        final int expectedBinaryDataSize = 1;

        final AmqpMessageBody amqpMessageBody = AmqpMessageBody.fromData(CONTENTS_BYTES);
        final AmqpAnnotatedMessage expected = new AmqpAnnotatedMessage(amqpMessageBody);
        final Map<String, Object> expectedMessageAnnotations = expected.getMessageAnnotations();
        expectedMessageAnnotations.put("ma-1", "ma-value1");

        final Map<String, Object> expectedDeliveryAnnotations = expected.getDeliveryAnnotations();
        expectedDeliveryAnnotations.put("da-1", "da-value1");

        final Map<String, Object> expectedApplicationProperties = expected.getApplicationProperties();
        expectedApplicationProperties.put("ap-1", "ap-value1");

        final Map<String, Object> expectedFooter = expected.getFooter();
        expectedFooter.put("foo-1", "foo-value1");

        final AmqpMessageProperties expectedMessageProperties = expected.getProperties();
        expectedMessageProperties.setGroupSequence(2L);
        expectedMessageProperties.setContentEncoding("content-enc");
        expectedMessageProperties.setReplyToGroupId("a");
        expectedMessageProperties.setReplyTo(new AmqpAddress("b"));
        expectedMessageProperties.setCorrelationId(new AmqpMessageId("c"));
        expectedMessageProperties.setSubject("d");
        expectedMessageProperties.setMessageId(new AmqpMessageId("id"));

        final AmqpMessageHeader expectedMessageHeader = expected.getHeader();
        expectedMessageHeader.setDeliveryCount(5L);
        expectedMessageHeader.setTimeToLive(Duration.ofSeconds(20));
        expectedMessageHeader.setPriority(Short.valueOf("4"));

        final AmqpAnnotatedMessage actual = new AmqpAnnotatedMessage(expected);

        // Act
        // Now update the values after we have created AmqpAnnotatedMessage using copy constructor.
        expectedDeliveryAnnotations.remove("da-1");
        expectedApplicationProperties.put("ap-2", "ap-value2");
        expectedFooter.remove("foo-1");
        expected.getHeader().setDeliveryCount(Long.valueOf(100));

        // Assert
        // Ensure the memory references are not same.
        assertNotSame(expected.getProperties(), actual.getProperties());
        assertNotSame(expected.getApplicationProperties(), actual.getApplicationProperties());
        assertNotSame(expected.getDeliveryAnnotations(), actual.getDeliveryAnnotations());
        assertNotSame(expected.getFooter(), actual.getFooter());
        assertNotSame(expected.getHeader(), actual.getHeader());
        assertNotSame(expected.getMessageAnnotations(), actual.getMessageAnnotations());
        assertNotSame(expected.getProperties().getUserId(), actual.getProperties().getUserId());
        assertNotSame(expected.getHeader().getDeliveryCount(), actual.getHeader().getDeliveryCount());

        assertEquals(1, actual.getDeliveryAnnotations().size());
        assertEquals(1, actual.getApplicationProperties().size());
        assertEquals(1, actual.getFooter().size());

        assertEquals(expectedMessageProperties.getGroupSequence(), actual.getProperties().getGroupSequence());
        assertEquals(expectedMessageProperties.getContentEncoding(), actual.getProperties().getContentEncoding());
        assertEquals(expectedMessageProperties.getReplyToGroupId(), actual.getProperties().getReplyToGroupId());
        assertEquals(expectedMessageProperties.getReplyTo(), actual.getProperties().getReplyTo());
        assertEquals(expectedMessageProperties.getCorrelationId(), actual.getProperties().getCorrelationId());
        assertEquals(expectedMessageProperties.getSubject(), actual.getProperties().getSubject());
        assertEquals(expectedMessageProperties.getMessageId(), actual.getProperties().getMessageId());

        assertEquals(expectedMessageHeader.getTimeToLive(), actual.getHeader().getTimeToLive());
        assertEquals(expectedMessageHeader.getPriority(), actual.getHeader().getPriority());

        assertMessageBody(CONTENTS_BYTES, actual);
    }

    /**
     * Verifies we correctly set values via constructor for {@link AmqpAnnotatedMessage}.
     */
    @Test
    public void constructorValidValues() {
        // Arrange
        final AmqpMessageBody amqpMessageBody = AmqpMessageBody.fromData(CONTENTS_BYTES);

        // Act
        final AmqpAnnotatedMessage actual = new AmqpAnnotatedMessage(amqpMessageBody);

        // Assert
        assertMessageCreation(AmqpMessageBodyType.DATA, actual);
    }

    /**
     * Verifies we correctly set values via constructor for {@link AmqpAnnotatedMessage}.
     */
    @Test
    public void constructorAmqpValidValues() {
        // Arrange
        final AmqpMessageBody amqpMessageBody = AmqpMessageBody.fromData(CONTENTS_BYTES);
        final AmqpAnnotatedMessage expected = new AmqpAnnotatedMessage(amqpMessageBody);

        // Act
        final AmqpAnnotatedMessage actual = new AmqpAnnotatedMessage(expected);

        // Assert
        assertMessageCreation(AmqpMessageBodyType.DATA, actual);
    }

    /**
     * Verifies {@link AmqpAnnotatedMessage} constructor for null values.
     */
    @Test
    public void constructorNullValidValues() {
        // Arrange
        final AmqpMessageBody body = null;

        // Act & Assert
        Assertions.assertThrows(NullPointerException.class, () -> new AmqpAnnotatedMessage(body));
    }

    private void assertMessageCreation(AmqpMessageBodyType expectedType, AmqpAnnotatedMessage actual) {
        assertEquals(expectedType, actual.getBody().getBodyType());
        assertNotNull(actual.getProperties());
        assertNotNull(actual.getHeader());
        assertNotNull(actual.getFooter());
        assertNotNull(actual.getApplicationProperties());
        assertNotNull(actual.getDeliveryAnnotations());
        assertNotNull(actual.getMessageAnnotations());
        assertNotNull(actual.getApplicationProperties());

        // Validate Message Body
        assertNotNull(actual.getBody());
        assertMessageBody(CONTENTS_BYTES, actual);
    }

    private void assertMessageBody(byte[] expectedbody, AmqpAnnotatedMessage actual) {
        final AmqpMessageBodyType actualType = actual.getBody().getBodyType();
        switch (actualType) {
            case DATA:
                byte[] actualData = actual.getBody().getData().stream().findFirst().get();
                assertArrayEquals(expectedbody, actualData);
                break;
            case VALUE:
            case SEQUENCE:
                throw logger.logExceptionAsError(new UnsupportedOperationException("type not supported yet :" + actualType));
            default:
                throw logger.logExceptionAsError(new IllegalStateException("Invalid type :" + actualType));
        }
    }
}
