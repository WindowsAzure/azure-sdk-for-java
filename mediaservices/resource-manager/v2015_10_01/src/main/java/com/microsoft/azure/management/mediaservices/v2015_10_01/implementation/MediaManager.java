/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2015_10_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.mediaservices.v2015_10_01.Operations;
import com.microsoft.azure.management.mediaservices.v2015_10_01.MediaServices;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Media resource management.
 */
public final class MediaManager extends ManagerCore<MediaManager, MediaServicesManagementClientImpl> {
    private Operations operations;
    private MediaServices mediaServices;
    /**
    * Get a Configurable instance that can be used to create MediaManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new MediaManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of MediaManager that exposes Media resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the MediaManager
    */
    public static MediaManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new MediaManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of MediaManager that exposes Media resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the MediaManager
    */
    public static MediaManager authenticate(RestClient restClient, String subscriptionId) {
        return new MediaManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of MediaManager that exposes Media management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Media management API entry points that work across subscriptions
        */
        MediaManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage MediaServices.
     */
    public MediaServices mediaServices() {
        if (this.mediaServices == null) {
            this.mediaServices = new MediaServicesImpl(this);
        }
        return this.mediaServices;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public MediaManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return MediaManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private MediaManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new MediaServicesManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
