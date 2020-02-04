// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation.changefeed.implementation;

import com.azure.cosmos.AccessCondition;
import com.azure.cosmos.AccessConditionType;
import com.azure.cosmos.BridgeInternal;
import com.azure.cosmos.CosmosClientException;
import com.azure.cosmos.CosmosItemProperties;
import com.azure.cosmos.CosmosItemRequestOptions;
import com.azure.cosmos.PartitionKey;
import com.azure.cosmos.implementation.Constants;
import com.azure.cosmos.CosmosAsyncContainer;
import com.azure.cosmos.implementation.changefeed.ChangeFeedContextClient;
import com.azure.cosmos.implementation.changefeed.LeaseStore;
import com.azure.cosmos.implementation.changefeed.RequestOptionsFactory;
import com.azure.cosmos.implementation.changefeed.ServiceItemLease;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import java.time.Duration;

/**
 * Implementation for LeaseStore.
 */
class DocumentServiceLeaseStore implements LeaseStore {
    private final Logger logger = LoggerFactory.getLogger(BootstrapperImpl.class);
    private ChangeFeedContextClient client;
    private String containerNamePrefix;
    private CosmosAsyncContainer leaseCollectionLink;
    private RequestOptionsFactory requestOptionsFactory;
    private volatile String lockETag;

    //  TODO: rename to LeaseStoreImpl
    public DocumentServiceLeaseStore(
            ChangeFeedContextClient client,
            String containerNamePrefix,
            CosmosAsyncContainer leaseCollectionLink,
            RequestOptionsFactory requestOptionsFactory) {

        this.client = client;
        this.containerNamePrefix = containerNamePrefix;
        this.leaseCollectionLink = leaseCollectionLink;
        this.requestOptionsFactory = requestOptionsFactory;
    }

    @Override
    public Mono<Boolean> isInitialized() {
        String markerDocId = this.getStoreMarkerName();

        CosmosItemProperties doc = new CosmosItemProperties();
        doc.setId(markerDocId);

        CosmosItemRequestOptions requestOptions = this.requestOptionsFactory.createRequestOptions(
            ServiceItemLease.fromDocument(doc));

        return this.client.readItem(markerDocId, new PartitionKey(markerDocId), requestOptions, CosmosItemProperties.class)
            .flatMap(documentResourceResponse -> Mono.just(documentResourceResponse.getProperties() != null))
            .onErrorResume(throwable -> {
                if (throwable instanceof CosmosClientException) {
                    CosmosClientException e = (CosmosClientException) throwable;
                    if (e.getStatusCode() == ChangeFeedHelper.HTTP_STATUS_CODE_NOT_FOUND) {
                        logger.info("Lease synchronization document not found");
                        return Mono.just(false);
                    }
                }
                logger.error("Unexpected exception thrown", throwable);
                return Mono.error(throwable);
            });
    }

    @Override
    public Mono<Boolean> markInitialized() {
        String markerDocId = this.getStoreMarkerName();
        CosmosItemProperties containerDocument = new CosmosItemProperties();
        containerDocument.setId(markerDocId);

        return this.client.createItem(this.leaseCollectionLink, containerDocument, new CosmosItemRequestOptions(), false)
            .map( item -> true)
            .onErrorResume(throwable -> {
                if (throwable instanceof CosmosClientException) {
                    CosmosClientException e = (CosmosClientException) throwable;
                    if (e.getStatusCode() == ChangeFeedHelper.HTTP_STATUS_CODE_CONFLICT) {
                        logger.info("Lease synchronization document was created by a different instance");
                        return Mono.just(true);
                    }
                }
                logger.error("Unexpected exception thrown", throwable);
                return Mono.just(false);
            });
    }

    @Override
    public Mono<Boolean> acquireInitializationLock(Duration lockExpirationTime) {
        String lockId = this.getStoreLockName();
        CosmosItemProperties containerDocument = new CosmosItemProperties();
        containerDocument.setId(lockId);
        BridgeInternal.setProperty(containerDocument, Constants.Properties.TTL, Long.valueOf(lockExpirationTime.getSeconds()).intValue());

        return this.client.createItem(this.leaseCollectionLink, containerDocument, new CosmosItemRequestOptions(), false)
            .map(documentResourceResponse -> {
                if (documentResourceResponse.getProperties() != null) {
                    this.lockETag = documentResourceResponse.getProperties().getETag();
                    return true;
                } else {
                    return false;
                }
            })
            .onErrorResume(throwable -> {
                if (throwable instanceof CosmosClientException) {
                    CosmosClientException e = (CosmosClientException) throwable;
                    if (e.getStatusCode() == ChangeFeedHelper.HTTP_STATUS_CODE_CONFLICT) {
                        logger.info("Lease synchronization document was acquired by a different instance");
                        return Mono.just(false);
                    }
                }
                logger.error("Unexpected exception thrown", throwable);
                return Mono.error(throwable);
            });
    }

    @Override
    public Mono<Boolean> releaseInitializationLock() {
        String lockId = this.getStoreLockName();
        CosmosItemProperties doc = new CosmosItemProperties();
        doc.setId(lockId);

        CosmosItemRequestOptions requestOptions = this.requestOptionsFactory.createRequestOptions(
            ServiceItemLease.fromDocument(doc));

        if (requestOptions == null) {
            requestOptions = new CosmosItemRequestOptions();
        }

        AccessCondition accessCondition = new AccessCondition();
        accessCondition.setType(AccessConditionType.IF_MATCH);
        accessCondition.setCondition(this.lockETag);
        requestOptions.setAccessCondition(accessCondition);

        return this.client.deleteItem(lockId, new PartitionKey(lockId), requestOptions)
            .map(documentResourceResponse -> {
                if (documentResourceResponse.getProperties() != null) {
                    this.lockETag = null;
                    return true;
                } else {
                    return false;
                }
            })
            .onErrorResume(throwable -> {
                if (throwable instanceof CosmosClientException) {
                    CosmosClientException e = (CosmosClientException) throwable;
                    if (e.getStatusCode() == ChangeFeedHelper.HTTP_STATUS_CODE_CONFLICT) {
                        logger.info("Lease synchronization document was acquired by a different instance");
                        return Mono.just(false);
                    }
                }

                logger.error("Unexpected exception thrown", throwable);
                return Mono.error(throwable);
            });
    }

    private String getStoreMarkerName()
    {
        return this.containerNamePrefix + ".info";
    }

    private String getStoreLockName()
    {
        return this.containerNamePrefix + ".lock";
    }

}
