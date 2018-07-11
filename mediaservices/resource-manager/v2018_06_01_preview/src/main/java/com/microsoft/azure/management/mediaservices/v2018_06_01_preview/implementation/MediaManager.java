/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.Operations;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.Mediaservices;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.Locations;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.Assets;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.ContentKeyPolicies;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.Transforms;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.Jobs;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.StreamingPolicies;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.StreamingLocators;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.LiveEvents;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.LiveOutputs;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.StreamingEndpoints;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Media resource management.
 */
public final class MediaManager extends ManagerCore<MediaManager, AzureMediaServicesImpl> {
    private Operations operations;
    private Mediaservices mediaservices;
    private Locations locations;
    private Assets assets;
    private ContentKeyPolicies contentKeyPolicies;
    private Transforms transforms;
    private Jobs jobs;
    private StreamingPolicies streamingPolicies;
    private StreamingLocators streamingLocators;
    private LiveEvents liveEvents;
    private LiveOutputs liveOutputs;
    private StreamingEndpoints streamingEndpoints;
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
     * @return Entry point to manage Mediaservices.
     */
    public Mediaservices mediaservices() {
        if (this.mediaservices == null) {
            this.mediaservices = new MediaservicesImpl(this);
        }
        return this.mediaservices;
    }

    /**
     * @return Entry point to manage Locations.
     */
    public Locations locations() {
        if (this.locations == null) {
            this.locations = new LocationsImpl(this);
        }
        return this.locations;
    }

    /**
     * @return Entry point to manage Assets.
     */
    public Assets assets() {
        if (this.assets == null) {
            this.assets = new AssetsImpl(this);
        }
        return this.assets;
    }

    /**
     * @return Entry point to manage ContentKeyPolicies.
     */
    public ContentKeyPolicies contentKeyPolicies() {
        if (this.contentKeyPolicies == null) {
            this.contentKeyPolicies = new ContentKeyPoliciesImpl(this);
        }
        return this.contentKeyPolicies;
    }

    /**
     * @return Entry point to manage Transforms.
     */
    public Transforms transforms() {
        if (this.transforms == null) {
            this.transforms = new TransformsImpl(this);
        }
        return this.transforms;
    }

    /**
     * @return Entry point to manage Jobs.
     */
    public Jobs jobs() {
        if (this.jobs == null) {
            this.jobs = new JobsImpl(this);
        }
        return this.jobs;
    }

    /**
     * @return Entry point to manage StreamingPolicies.
     */
    public StreamingPolicies streamingPolicies() {
        if (this.streamingPolicies == null) {
            this.streamingPolicies = new StreamingPoliciesImpl(this);
        }
        return this.streamingPolicies;
    }

    /**
     * @return Entry point to manage StreamingLocators.
     */
    public StreamingLocators streamingLocators() {
        if (this.streamingLocators == null) {
            this.streamingLocators = new StreamingLocatorsImpl(this);
        }
        return this.streamingLocators;
    }

    /**
     * @return Entry point to manage LiveEvents.
     */
    public LiveEvents liveEvents() {
        if (this.liveEvents == null) {
            this.liveEvents = new LiveEventsImpl(this);
        }
        return this.liveEvents;
    }

    /**
     * @return Entry point to manage LiveOutputs.
     */
    public LiveOutputs liveOutputs() {
        if (this.liveOutputs == null) {
            this.liveOutputs = new LiveOutputsImpl(this);
        }
        return this.liveOutputs;
    }

    /**
     * @return Entry point to manage StreamingEndpoints.
     */
    public StreamingEndpoints streamingEndpoints() {
        if (this.streamingEndpoints == null) {
            this.streamingEndpoints = new StreamingEndpointsImpl(this);
        }
        return this.streamingEndpoints;
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
            new AzureMediaServicesImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
