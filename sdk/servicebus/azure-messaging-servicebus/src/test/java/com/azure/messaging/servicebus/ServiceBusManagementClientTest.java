// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.IterableStream;
import com.azure.messaging.servicebus.models.QueueProperties;
import com.azure.messaging.servicebus.models.QueueRuntimeInfo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Unit tests for {@link ServiceBusManagementClient}.
 */
class ServiceBusManagementClientTest {
    @Mock
    private ServiceBusManagementAsyncClient asyncClient;
    @Mock
    private Response<QueueProperties> queueDescriptionResponse;
    @Mock
    private Response<QueueRuntimeInfo> queueRuntimeInfoResponse;
    @Mock
    private Response<Void> voidResponse;
    @Mock
    private PagedFlux<QueueProperties> queuePagedFlux;
    @Mock
    private PagedResponse<QueueProperties> pagedResponse;
    @Mock
    private PagedResponse<QueueProperties> continuationPagedResponse;

    private final Context context = new Context("foo", "bar").addData("baz", "boo");
    private final String queueName = "some-queue";
    private ServiceBusManagementClient client;

    @BeforeEach
    void beforeEach() {
        MockitoAnnotations.initMocks(this);
        client = new ServiceBusManagementClient(asyncClient);
    }

    @AfterEach
    void afterEach() {
        Mockito.framework().clearInlineMocks();
    }

    @Test
    void createQueue() {
        // Arrange
        final QueueProperties description = new QueueProperties(queueName)
            .setMaxDeliveryCount(10)
            .setAutoDeleteOnIdle(Duration.ofSeconds(10));
        final QueueProperties result = new QueueProperties("queue-name-2")
            .setMaxDeliveryCount(4)
            .setAutoDeleteOnIdle(Duration.ofSeconds(30));

        when(asyncClient.createQueue(description)).thenReturn(Mono.just(result));

        // Act
        final QueueProperties actual = client.createQueue(description);

        // Assert
        assertEquals(result, actual);
    }

    @Test
    void createQueueWithResponse() {
        // Arrange
        final QueueProperties description = mock(QueueProperties.class);
        final QueueProperties result = mock(QueueProperties.class);

        when(queueDescriptionResponse.getValue()).thenReturn(result);
        when(asyncClient.createQueueWithResponse(description, context)).thenReturn(Mono.just(queueDescriptionResponse));

        // Act
        final Response<QueueProperties> actual = client.createQueueWithResponse(description, context);

        // Assert
        assertEquals(queueDescriptionResponse, actual);
        assertEquals(result, actual.getValue());
    }

    @Test
    void deleteQueue() {
        // Arrange
        when(asyncClient.deleteQueue(queueName)).thenReturn(Mono.empty());

        // Act
        client.deleteQueue(queueName);

        // Assert
        verify(asyncClient).deleteQueue(queueName);
    }

    @Test
    void deleteQueueWithResponse() {
        // Arrange
        when(asyncClient.deleteQueueWithResponse(queueName, context)).thenReturn(Mono.just(voidResponse));

        // Act
        final Response<Void> actual = client.deleteQueueWithResponse(queueName, context);

        // Assert
        assertEquals(voidResponse, actual);
    }

    @Test
    void getQueue() {
        // Arrange
        final QueueProperties result = mock(QueueProperties.class);

        when(asyncClient.getQueue(queueName)).thenReturn(Mono.just(result));

        // Act
        final QueueProperties actual = client.getQueue(queueName);

        // Assert
        assertEquals(result, actual);
    }

    @Test
    void getQueueWithResponse() {
        // Arrange
        final QueueProperties result = mock(QueueProperties.class);

        when(queueDescriptionResponse.getValue()).thenReturn(result);
        when(asyncClient.<QueueProperties>getQueueWithResponse(eq(queueName), eq(context), any()))
            .thenReturn(Mono.just(queueDescriptionResponse));

        // Act
        final Response<QueueProperties> actual = client.getQueueWithResponse(queueName, context);

        // Assert
        assertEquals(result, actual.getValue());
    }

    @Test
    void getQueueRuntimeInfo() {
        // Arrange
        final QueueRuntimeInfo result = mock(QueueRuntimeInfo.class);

        when(asyncClient.getQueueRuntimeInfo(queueName)).thenReturn(Mono.just(result));

        // Act
        final QueueRuntimeInfo actual = client.getQueueRuntimeInfo(queueName);

        // Assert
        assertEquals(result, actual);
    }

    @Test
    void getQueueRuntimeInfoWithResponse() {
        // Arrange
        final QueueRuntimeInfo result = mock(QueueRuntimeInfo.class);

        when(queueRuntimeInfoResponse.getValue()).thenReturn(result);
        when(asyncClient.<QueueRuntimeInfo>getQueueWithResponse(eq(queueName), eq(context), any()))
            .thenReturn(Mono.just(queueRuntimeInfoResponse));

        // Act
        final Response<QueueRuntimeInfo> actual = client.getQueueRuntimeInfoWithResponse(queueName, context);

        // Assert
        assertEquals(result, actual.getValue());
    }

    @Test
    void listQueues() {
        // Arrange
        final List<QueueProperties> queues = Arrays.asList(mock(QueueProperties.class), mock(QueueProperties.class));
        when(pagedResponse.getElements()).thenReturn(new IterableStream<>(queues));
        when(pagedResponse.getValue()).thenReturn(queues);
        when(pagedResponse.getStatusCode()).thenReturn(200);
        when(pagedResponse.getHeaders()).thenReturn(new HttpHeaders());
        when(pagedResponse.getContinuationToken()).thenReturn("");

        final PagedFlux<QueueProperties> pagedFlux = new PagedFlux<>(() -> Mono.just(pagedResponse));
        when(asyncClient.listQueues()).thenReturn(pagedFlux);

        // Act
        final PagedIterable<QueueProperties> queueDescriptions = client.listQueues();

        // Assert
        final long size = queueDescriptions.stream().count();
        assertEquals(queues.size(), size);
    }

    @Test
    void listQueuesWithContext() {
        // Arrange
        final String continuationToken = "foo";
        final String lastToken = "last";
        final List<QueueProperties> firstPage = Arrays.asList(mock(QueueProperties.class),
            mock(QueueProperties.class));
        final List<QueueProperties> secondPage = Arrays.asList(mock(QueueProperties.class),
            mock(QueueProperties.class), mock(QueueProperties.class));

        when(pagedResponse.getElements()).thenReturn(new IterableStream<>(firstPage));
        when(pagedResponse.getValue()).thenReturn(firstPage);
        when(pagedResponse.getStatusCode()).thenReturn(200);
        when(pagedResponse.getHeaders()).thenReturn(new HttpHeaders());
        when(pagedResponse.getContinuationToken()).thenReturn(continuationToken);

        when(continuationPagedResponse.getElements()).thenReturn(new IterableStream<>(secondPage));
        when(continuationPagedResponse.getValue()).thenReturn(firstPage);
        when(continuationPagedResponse.getStatusCode()).thenReturn(200);
        when(continuationPagedResponse.getHeaders()).thenReturn(new HttpHeaders());
        when(continuationPagedResponse.getContinuationToken()).thenReturn(lastToken);

        when(asyncClient.listQueuesFirstPage(context)).thenReturn(Mono.just(pagedResponse));
        when(asyncClient.listQueuesNextPage(continuationToken, context))
            .thenReturn(Mono.just(continuationPagedResponse));
        when(asyncClient.listQueuesNextPage(lastToken, context))
            .thenReturn(Mono.empty());

        // Act
        final PagedIterable<QueueProperties> queueDescriptions = client.listQueues(context);

        // Assert
        final long size = queueDescriptions.stream().count();
        final long expectedSize = firstPage.size() + secondPage.size();

        assertEquals(expectedSize, size);
    }

    @Test
    void updateQueue() {
        // Arrange
        final QueueProperties description = new QueueProperties(queueName)
            .setMaxDeliveryCount(10)
            .setAutoDeleteOnIdle(Duration.ofSeconds(10));
        final QueueProperties result = new QueueProperties("queue-name-2")
            .setMaxDeliveryCount(4)
            .setAutoDeleteOnIdle(Duration.ofSeconds(30));

        when(asyncClient.updateQueue(description)).thenReturn(Mono.just(result));

        // Act
        final QueueProperties actual = client.updateQueue(description);

        // Assert
        assertEquals(result, actual);
    }

    @Test
    void updateQueueWithResponse() {
        // Arrange
        final QueueProperties description = mock(QueueProperties.class);
        final QueueProperties result = mock(QueueProperties.class);

        when(queueDescriptionResponse.getValue()).thenReturn(result);
        when(asyncClient.updateQueueWithResponse(description, context)).thenReturn(Mono.just(queueDescriptionResponse));

        // Act
        final Response<QueueProperties> actual = client.updateQueueWithResponse(description, context);

        // Assert
        assertEquals(queueDescriptionResponse, actual);
        assertEquals(result, actual.getValue());
    }
}
