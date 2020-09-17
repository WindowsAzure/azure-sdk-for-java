// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.models;

import com.azure.messaging.servicebus.TestUtils;
import com.azure.messaging.servicebus.implementation.EntityHelper;
import com.azure.messaging.servicebus.implementation.models.QueueDescription;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;

import static com.azure.messaging.servicebus.implementation.ServiceBusConstants.DEFAULT_DUPLICATE_DETECTION_DURATION;
import static com.azure.messaging.servicebus.implementation.ServiceBusConstants.DEFAULT_LOCK_DURATION;
import static com.azure.messaging.servicebus.implementation.ServiceBusConstants.DEFAULT_MAX_DELIVERY_COUNT;
import static com.azure.messaging.servicebus.implementation.ServiceBusConstants.DEFAULT_QUEUE_SIZE;
import static com.azure.messaging.servicebus.implementation.ServiceBusConstants.MAX_DURATION;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CreateQueueOptionsTest {
    /**
     * Creates an instance with the given defaults.
     */
    @Test
    void constructor() {
        // Act
        final CreateQueueOptions actual = new CreateQueueOptions();

        // Assert
        assertEquals(MAX_DURATION, actual.getAutoDeleteOnIdle());
        assertEquals(MAX_DURATION, actual.getDefaultMessageTimeToLive());
        assertEquals(DEFAULT_DUPLICATE_DETECTION_DURATION, actual.getDuplicateDetectionHistoryTimeWindow());
        assertTrue(actual.enableBatchedOperations());
        assertFalse(actual.enablePartitioning());
        assertEquals(DEFAULT_LOCK_DURATION, actual.getLockDuration());
        assertEquals(DEFAULT_MAX_DELIVERY_COUNT, actual.getMaxDeliveryCount());
        assertEquals(DEFAULT_QUEUE_SIZE, actual.getMaxSizeInMegabytes());
        assertFalse(actual.requiresDuplicateDetection());
        assertFalse(actual.requiresSession());
        assertFalse(actual.deadLetteringOnMessageExpiration());
        assertNull(actual.getUserMetadata());
        assertEquals(EntityStatus.ACTIVE, actual.getStatus());
    }

    @Test
    void constructorWithOptions() {
        // Arrange
        final AuthorizationRule rule1 = mock(AuthorizationRule.class);
        when(rule1.getKeyName()).thenReturn("name1");
        when(rule1.getClaimType()).thenReturn("claimType1");
        when(rule1.getClaimValue()).thenReturn("claimValue1");
        when(rule1.getPrimaryKey()).thenReturn("primaryKey1");
        when(rule1.getSecondaryKey()).thenReturn("secondaryKey1");
        when(rule1.getAccessRights()).thenReturn(Arrays.asList(AccessRights.LISTEN, AccessRights.MANAGE));

        final AuthorizationRule rule2 = mock(AuthorizationRule.class);
        when(rule2.getKeyName()).thenReturn("name2");
        when(rule2.getClaimType()).thenReturn("claimType2");
        when(rule2.getClaimValue()).thenReturn("claimValue2");
        when(rule2.getPrimaryKey()).thenReturn("primaryKey2");
        when(rule2.getSecondaryKey()).thenReturn("secondaryKey2");
        when(rule2.getAccessRights()).thenReturn(Collections.singletonList(AccessRights.SEND));

        final QueueProperties expected = EntityHelper.toModel(new QueueDescription())
            .setAutoDeleteOnIdle(Duration.ofSeconds(15))
            .setDefaultMessageTimeToLive(Duration.ofSeconds(50))
            .setDuplicateDetectionHistoryTimeWindow(Duration.ofSeconds(13))
            .setEnableBatchedOperations(false)
            .setEnablePartitioning(true)
            .setForwardTo("Forward-To-This-Queue")
            .setForwardDeadLetteredMessagesTo("Dead-Lettered-Forward-To")
            .setLockDuration(Duration.ofSeconds(120))
            .setMaxDeliveryCount(15)
            .setMaxSizeInMegabytes(2048)
            .setRequiresDuplicateDetection(true)
            .setRequiresSession(true)
            .setUserMetadata("Test-queue-Metadata")
            .setStatus(EntityStatus.DISABLED);

        expected.getAuthorizationRules().add(rule1);
        expected.getAuthorizationRules().add(rule2);

        final String queueName = "some-queue";

        EntityHelper.setQueueName(expected, queueName);

        // Act
        final CreateQueueOptions actual = new CreateQueueOptions(expected);

        // Assert
        assertEquals(expected.getAutoDeleteOnIdle(), actual.getAutoDeleteOnIdle());
        assertEquals(expected.getDefaultMessageTimeToLive(), actual.getDefaultMessageTimeToLive());
        assertFalse(actual.deadLetteringOnMessageExpiration());
        assertEquals(expected.getDuplicateDetectionHistoryTimeWindow(),
            actual.getDuplicateDetectionHistoryTimeWindow());
        assertEquals(expected.enableBatchedOperations(), actual.enableBatchedOperations());
        assertEquals(expected.enablePartitioning(), actual.enablePartitioning());
        assertEquals(expected.getForwardTo(), actual.getForwardTo());
        assertEquals(expected.getForwardDeadLetteredMessagesTo(), actual.getForwardDeadLetteredMessagesTo());
        assertEquals(expected.getLockDuration(), actual.getLockDuration());
        assertEquals(expected.getMaxDeliveryCount(), actual.getMaxDeliveryCount());
        assertEquals(expected.requiresDuplicateDetection(), actual.requiresDuplicateDetection());
        assertEquals(expected.requiresSession(), actual.requiresSession());
        assertEquals(expected.getUserMetadata(), actual.getUserMetadata());
        assertEquals(expected.getStatus(), actual.getStatus());

        TestUtils.assertAuthorizationRules(expected.getAuthorizationRules(), actual.getAuthorizationRules());
    }
}
