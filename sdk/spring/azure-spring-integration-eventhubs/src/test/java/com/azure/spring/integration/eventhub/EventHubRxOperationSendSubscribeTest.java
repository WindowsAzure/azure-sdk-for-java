// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.integration.eventhub;

import com.azure.messaging.eventhubs.models.EventContext;
import com.azure.messaging.eventhubs.models.PartitionContext;
import com.azure.spring.integration.core.api.CheckpointConfig;
import com.azure.spring.integration.core.api.CheckpointMode;
import com.azure.spring.integration.core.api.StartPosition;
import com.azure.spring.integration.eventhub.api.EventHubRxOperation;
import com.azure.spring.integration.eventhub.support.RxEventHubTestOperation;
import com.azure.spring.integration.test.support.pojo.User;
import com.azure.spring.integration.test.support.rx.RxSendSubscribeByGroupOperationTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import reactor.core.publisher.Mono;

import java.util.Arrays;

import static org.mockito.Mockito.*;

@MockitoSettings(strictness = Strictness.LENIENT)
@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EventHubRxOperationSendSubscribeTest extends RxSendSubscribeByGroupOperationTest<EventHubRxOperation> {

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

        this.sendSubscribeOperation = new RxEventHubTestOperation(null, () -> eventContext);
    }

    @Override
    protected void verifyCheckpointSuccessCalled(int times) {
        verify(this.eventContext, times(times)).updateCheckpointAsync();
    }

    @Override
    protected void verifyCheckpointBatchSuccessCalled(int times) {

    }

    @Test
    @SuppressWarnings("unchecked")
    public void testSendReceiveWithBatchCheckpointMode() {
        sendSubscribeOperation
            .setCheckpointConfig(CheckpointConfig.builder()
                .checkpointMode(CheckpointMode.BATCH).build());
        sendSubscribeOperation.setStartPosition(StartPosition.EARLIEST);
        Arrays.stream(messages).forEach(m -> sendSubscribeOperation.sendRx(destination, m));
        sendSubscribeOperation.subscribe(destination, consumerGroup, User.class).test()
            .assertValueCount(messages.length).assertNoErrors();
        verifyCheckpointBatchSuccessCalled(1);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testSendReceiveWithPartitionCountCheckpointMode() {
        sendSubscribeOperation
            .setCheckpointConfig(CheckpointConfig.builder()
                .checkpointMode(CheckpointMode.PARTITION_COUNT)
                .checkpointCount(1).build());
        sendSubscribeOperation.setStartPosition(StartPosition.EARLIEST);
        Arrays.stream(messages).forEach(m -> sendSubscribeOperation.sendRx(destination, m));
        sendSubscribeOperation.subscribe(destination, consumerGroup, User.class).test()
            .assertValueCount(messages.length).assertNoErrors();
        verifyCheckpointSuccessCalled(messages.length);
    }

    @Test
    public void testHasPartitionIdHeader() {
        sendSubscribeOperation.subscribe(destination, consumerGroup, User.class);
        sendSubscribeOperation.sendRx(destination, userMessage);
    }

}
