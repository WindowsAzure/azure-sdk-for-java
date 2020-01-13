// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation;

import com.azure.cosmos.ConnectionPolicy;
import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosClientException;
import com.azure.cosmos.PartitionKey;
import com.azure.cosmos.implementation.directconnectivity.StoreResponse;
import com.azure.cosmos.rx.TestSuiteBase;
import io.reactivex.subscribers.TestSubscriber;
import org.assertj.core.api.Assertions;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.reflect.Field;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class RetryContextOnDiagnosticTest extends TestSuiteBase {
    private final static String exceptionText = "TestException";
    private final static String responseText = "TestResponse";
    private final static String itemSelfLink = "dbs/TestDB/colls/TestColl/docs/TestDoc";
    private final static String containerSelfLink = "dbs/TestDB/colls/TestColl";

    private IRetryPolicy retryPolicy;
    private Callable<Mono<StoreResponse>> callbackMethod;
    private Function<Quadruple<Boolean, Boolean, Duration, Integer>, Mono<StoreResponse>> parameterizedCallbackMethod;
    private Function<Quadruple<Boolean, Boolean, Duration, Integer>, Mono<StoreResponse>> inBackoffAlternateCallbackMethod;
    private RxDocumentServiceRequest serviceRequest;

    @BeforeClass(groups = "unit")
    public void RetryContextTest() {
        callbackMethod = Mockito.mock(Callable.class);
        parameterizedCallbackMethod = Mockito.mock(Function.class);
        inBackoffAlternateCallbackMethod = Mockito.mock(Function.class);
    }

    @Test(groups = {"simple"})
    public void backoffRetryUtilityExecuteRetryTest() throws Exception {
        serviceRequest = RxDocumentServiceRequest.create(OperationType.Read, ResourceType.Document);
        retryPolicy = new TestRetryPolicy();
        CosmosClientException exception = new CosmosClientException(410, exceptionText);
        Mockito.when(callbackMethod.call()).thenThrow(exception, exception, exception, exception, exception)
            .thenReturn(Mono.just(new StoreResponse(200, new ArrayList<>(), responseText)));
        Mono<StoreResponse> monoResponse = BackoffRetryUtility.executeRetry(callbackMethod, retryPolicy);
        StoreResponse response = validateSuccess(monoResponse);

        Assertions.assertThat(response.getResponseBody()).isEqualTo(responseText);
        Assertions.assertThat(retryPolicy.getRetryCount()).isEqualTo(5);
        Assertions.assertThat(retryPolicy.getStatusAndSubStatusCodes().size()).isEqualTo(retryPolicy.getRetryCount());
    }

    @Test(groups = {"simple"})
    public void backoffRetryUtilityExecuteRetryWithFailureTest() throws Exception {
        serviceRequest = RxDocumentServiceRequest.create(OperationType.Read, ResourceType.Document);
        retryPolicy = new TestRetryPolicy();
        CosmosClientException exception = new CosmosClientException(410, exceptionText);
        Mockito.when(callbackMethod.call()).thenThrow(exception);
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.schedule(() -> {
            ((TestRetryPolicy) retryPolicy).noRetry = true;
        }, 10, TimeUnit.SECONDS);
        Mono<StoreResponse> monoResponse = BackoffRetryUtility.executeRetry(callbackMethod, retryPolicy);
        validateFailure(monoResponse);

        Assertions.assertThat(retryPolicy.getRetryCount()).isGreaterThanOrEqualTo(5);
        Assertions.assertThat(retryPolicy.getStatusAndSubStatusCodes().size()).isEqualTo(retryPolicy.getRetryCount() + 1);
    }

    @Test(groups = {"simple"})
    public void backoffRetryUtilityExecuteAsyncTest() {
        serviceRequest = RxDocumentServiceRequest.create(OperationType.Read, ResourceType.Document);
        retryPolicy = new TestRetryPolicy();
        CosmosClientException exception = new CosmosClientException(410, exceptionText);
        Mono<CosmosClientException> exceptionMono = Mono.error(exception);
        Mockito.when(parameterizedCallbackMethod.apply(Matchers.any(Quadruple.class))).thenReturn(exceptionMono, exceptionMono, exceptionMono, exceptionMono, exceptionMono)
            .thenReturn(Mono.just(new StoreResponse(200, new ArrayList<>(), responseText)));
        Mono<StoreResponse> monoResponse = BackoffRetryUtility.executeAsync(parameterizedCallbackMethod, retryPolicy, inBackoffAlternateCallbackMethod, Duration.ofSeconds(5), serviceRequest);
        StoreResponse response = validateSuccess(monoResponse);

        Assertions.assertThat(serviceRequest.requestContext.retryContext.retryCount).isEqualTo(5);
        Assertions.assertThat(response.getResponseBody()).isEqualTo(responseText);
        Assertions.assertThat(retryPolicy.getRetryCount()).isEqualTo(5);
        Assertions.assertThat(retryPolicy.getStatusAndSubStatusCodes().size()).isEqualTo(retryPolicy.getRetryCount());
    }

    @Test(groups = {"simple"})
    public void backoffRetryUtilityExecuteAsyncWithFailureTest() {
        serviceRequest = RxDocumentServiceRequest.create(OperationType.Read, ResourceType.Document);
        retryPolicy = new TestRetryPolicy();
        CosmosClientException exception = new CosmosClientException(410, exceptionText);
        Mono<CosmosClientException> exceptionMono = Mono.error(exception);
        Mockito.when(parameterizedCallbackMethod.apply(Matchers.any(Quadruple.class))).thenReturn(exceptionMono);
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.schedule(() -> {
            ((TestRetryPolicy) retryPolicy).noRetry = true;
        }, 10, TimeUnit.SECONDS);
        Mono<StoreResponse> monoResponse = BackoffRetryUtility.executeAsync(parameterizedCallbackMethod, retryPolicy, inBackoffAlternateCallbackMethod, Duration.ofSeconds(5), serviceRequest);
        validateFailure(monoResponse);

        Assertions.assertThat(serviceRequest.requestContext.retryContext.retryCount).isGreaterThanOrEqualTo(5);
        Assertions.assertThat(retryPolicy.getRetryCount()).isGreaterThanOrEqualTo(5);
        Assertions.assertThat(retryPolicy.getStatusAndSubStatusCodes().size()).isEqualTo(retryPolicy.getRetryCount() + 1);
    }

    @Test(groups = {"simple"})
    public void retryContextMockTestOnCRUDOperation() throws NoSuchFieldException, IllegalAccessException {
        AsyncDocumentClient.Builder builder = new AsyncDocumentClient.Builder();
        builder.withServiceEndpoint(TestConfigurations.HOST)
               .withMasterKeyOrResourceToken(TestConfigurations.MASTER_KEY)
               .withConnectionPolicy(ConnectionPolicy.getDefaultPolicy())
               .withConsistencyLevel(ConsistencyLevel.SESSION);
        AsyncDocumentClient client = builder.build();
        RxDocumentClientImpl rxDocumentClient = (RxDocumentClientImpl)client;
        RxStoreModel mockStoreModel = Mockito.mock(RxStoreModel.class);
        RxDocumentServiceResponse mockRxDocumentServiceResponse = Mockito.mock(RxDocumentServiceResponse.class);

        Field storeModelField = RxDocumentClientImpl.class.getDeclaredField("storeModel");
        storeModelField.setAccessible(true);
        storeModelField.set(rxDocumentClient, mockStoreModel);

        IRetryPolicyFactory mockRetryFactory = Mockito.mock(IRetryPolicyFactory.class);
        Field resetSessionTokenRetryPolicyField = RxDocumentClientImpl.class.getDeclaredField("resetSessionTokenRetryPolicy");
        resetSessionTokenRetryPolicyField.setAccessible(true);
        resetSessionTokenRetryPolicyField.set(rxDocumentClient, mockRetryFactory);

        TestRetryPolicy retryPolicy = Mockito.mock(TestRetryPolicy.class);
        Mockito.when(retryPolicy.getRetryCount()).thenReturn(1);

        Mockito.when(mockRetryFactory.getRequestPolicy()).thenReturn(retryPolicy);
        Mockito.when(mockStoreModel.processMessage(Matchers.any(RxDocumentServiceRequest.class))).thenReturn(Flux.just(mockRxDocumentServiceResponse));
        Mockito.when(mockRxDocumentServiceResponse.getResource(Document.class)).thenReturn(new Document());
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setPartitionKey(new PartitionKey("TestPk"));
        Flux<ResourceResponse<Document>>  responseFlux = rxDocumentClient.createDocument(containerSelfLink, new Document(), requestOptions, false);
        validateServiceResponseSuccess(responseFlux);

        Mockito.verify(retryPolicy, Mockito.times(2)).getRetryCount();
        Mockito.verify(retryPolicy, Mockito.times(1)).getRetryLatency();
        Mockito.verify(retryPolicy, Mockito.times(1)).getStatusAndSubStatusCodes();

        retryPolicy = Mockito.mock(TestRetryPolicy.class);
        Mockito.when(retryPolicy.getRetryCount()).thenReturn(1);
        Mockito.when(mockRetryFactory.getRequestPolicy()).thenReturn(retryPolicy);
        responseFlux = rxDocumentClient.readDocument(itemSelfLink,requestOptions);
        validateServiceResponseSuccess(responseFlux);

        Mockito.verify(retryPolicy, Mockito.times(2)).getRetryCount();
        Mockito.verify(retryPolicy, Mockito.times(1)).getRetryLatency();
        Mockito.verify(retryPolicy, Mockito.times(1)).getStatusAndSubStatusCodes();

        retryPolicy = Mockito.mock(TestRetryPolicy.class);
        Mockito.when(retryPolicy.getRetryCount()).thenReturn(1);
        Mockito.when(mockRetryFactory.getRequestPolicy()).thenReturn(retryPolicy);
        responseFlux = rxDocumentClient.deleteDocument(itemSelfLink,requestOptions);
        validateServiceResponseSuccess(responseFlux);

        Mockito.verify(retryPolicy, Mockito.times(2)).getRetryCount();
        Mockito.verify(retryPolicy, Mockito.times(1)).getRetryLatency();
        Mockito.verify(retryPolicy, Mockito.times(1)).getStatusAndSubStatusCodes();

        retryPolicy = Mockito.mock(TestRetryPolicy.class);
        Mockito.when(retryPolicy.getRetryCount()).thenReturn(1);
        Mockito.when(mockRetryFactory.getRequestPolicy()).thenReturn(retryPolicy);
        responseFlux = rxDocumentClient.replaceDocument(itemSelfLink, new Document(),requestOptions);
        validateServiceResponseSuccess(responseFlux);

        Mockito.verify(retryPolicy, Mockito.times(2)).getRetryCount();
        Mockito.verify(retryPolicy, Mockito.times(1)).getRetryLatency();
        Mockito.verify(retryPolicy, Mockito.times(1)).getStatusAndSubStatusCodes();

        retryPolicy = Mockito.mock(TestRetryPolicy.class);
        Mockito.when(retryPolicy.getRetryCount()).thenReturn(1);
        Mockito.when(mockRetryFactory.getRequestPolicy()).thenReturn(retryPolicy);
        responseFlux = rxDocumentClient.upsertDocument(itemSelfLink, new Document(),requestOptions, false);
        validateServiceResponseSuccess(responseFlux);

        Mockito.verify(retryPolicy, Mockito.times(2)).getRetryCount();
        Mockito.verify(retryPolicy, Mockito.times(1)).getRetryLatency();
        Mockito.verify(retryPolicy, Mockito.times(1)).getStatusAndSubStatusCodes();

        client.close();
    }

    private StoreResponse validateSuccess(Mono<StoreResponse> storeResponse) {
        TestSubscriber<StoreResponse> testSubscriber = new TestSubscriber<>();
        storeResponse.subscribe(testSubscriber);
        testSubscriber.awaitTerminalEvent(60000, TimeUnit.MILLISECONDS);
        testSubscriber.assertNoErrors();
        testSubscriber.assertComplete();
        testSubscriber.assertValueCount(1);
        return testSubscriber.values().get(0);
    }

    private void validateFailure(Mono<StoreResponse> storeResponse) {
        TestSubscriber<StoreResponse> testSubscriber = new TestSubscriber<>();
        storeResponse.subscribe(testSubscriber);
        testSubscriber.awaitTerminalEvent(60000, TimeUnit.MILLISECONDS);
        testSubscriber.assertNotComplete();
        testSubscriber.assertTerminated();
    }

    private void validateServiceResponseSuccess(Flux<ResourceResponse<Document>> documentServiceResponseMono) {
        TestSubscriber<ResourceResponse<Document>> testSubscriber = new TestSubscriber<>();
        documentServiceResponseMono.subscribe(testSubscriber);
        testSubscriber.awaitTerminalEvent(60000, TimeUnit.MILLISECONDS);
        testSubscriber.assertNoErrors();
        testSubscriber.assertComplete();
        testSubscriber.assertValueCount(1);
    }

    private class TestRetryPolicy extends DocumentClientRetryPolicy {
        boolean noRetry;

        @Override
        public Mono<ShouldRetryResult> shouldRetry(Exception e) {
            if (noRetry) {
                return Mono.just(ShouldRetryResult.noRetry());
            }
            return Mono.just(IRetryPolicy.ShouldRetryResult.retryAfter(Duration.ofSeconds(2)));
        }

        @Override
        public void onBeforeSendRequest(RxDocumentServiceRequest request) {
            //no implementation needed for mock test
        }
    }
}
