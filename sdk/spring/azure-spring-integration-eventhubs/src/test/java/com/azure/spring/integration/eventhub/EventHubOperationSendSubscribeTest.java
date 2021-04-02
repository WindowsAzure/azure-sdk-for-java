// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.integration.eventhub;

import com.azure.messaging.eventhubs.models.EventContext;
import com.azure.messaging.eventhubs.models.PartitionContext;
import com.azure.spring.integration.core.AzureHeaders;
import com.azure.spring.integration.core.api.CheckpointConfig;
import com.azure.spring.integration.core.api.CheckpointMode;
import com.azure.spring.integration.core.api.StartPosition;
import com.azure.spring.integration.core.api.reactor.Checkpointer;
import com.azure.spring.integration.eventhub.api.EventHubOperation;
import com.azure.spring.integration.eventhub.support.EventHubTestOperation;
import com.azure.spring.integration.test.support.pojo.User;
import com.azure.spring.integration.test.support.reactor.SendSubscribeByGroupOperationTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.messaging.Message;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@MockitoSettings(strictness = Strictness.LENIENT)
@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EventHubOperationSendSubscribeTest extends SendSubscribeByGroupOperationTest<EventHubOperation> {

    @Mock
    EventContext eventContext;

    @Mock
    PartitionContext partitionContext;

    @BeforeEach
    @Override
    public void setUp() {
        when(this.eventContext.updateCheckpointAsync()).thenReturn(Mono.empty());
        when(this.eventContext.getPartitionContext()).thenReturn(this.partitionContext);
        when(this.partitionContext.getPartitionId()).thenReturn(this.partitionId);

        this.sendSubscribeOperation = new EventHubTestOperation(null, () -> eventContext);
    }

    @Override
    protected void verifyCheckpointSuccessCalled(int times) {
        verify(this.eventContext, times(times)).updateCheckpointAsync();
    }

    @Override
    protected void verifyCheckpointBatchSuccessCalled(int times) {
//        verify(this.eventContext, times(times)).updateCheckpoint();
    }

    @Override
    protected void verifyCheckpointFailureCalled(int times) {

    }

    @Test
    public void testSendReceiveWithBatchCheckpointMode() {
        sendSubscribeOperation
            .setCheckpointConfig(CheckpointConfig.builder().checkpointMode(CheckpointMode.BATCH).build());
        sendSubscribeOperation.setStartPosition(StartPosition.EARLIEST);
        messages.forEach(m -> sendSubscribeOperation.sendAsync(destination, m));
        sendSubscribeOperation.subscribe(destination, consumerGroup, this::batchCheckpointHandler, User.class);
        verifyCheckpointBatchSuccessCalled(1);
    }

    private void batchCheckpointHandler(Message<?> message) {
    }

    @Test
    public void testHasPartitionIdHeader() {
        sendSubscribeOperation.subscribe(destination, consumerGroup, this::partitionIdHandler, User.class);
        sendSubscribeOperation.sendAsync(destination, userMessage);
    }

    private void partitionIdHandler(Message<?> message) {
        assertTrue(message.getHeaders().containsKey(AzureHeaders.RAW_PARTITION_ID));
        String partitionId = message.getHeaders().get(AzureHeaders.RAW_PARTITION_ID, String.class);
        assertNotNull(partitionId);
        assertEquals(this.partitionId, partitionId);
    }

    @Override
    protected void verifyCheckpointFailure(Checkpointer checkpointer) {
    }
}
