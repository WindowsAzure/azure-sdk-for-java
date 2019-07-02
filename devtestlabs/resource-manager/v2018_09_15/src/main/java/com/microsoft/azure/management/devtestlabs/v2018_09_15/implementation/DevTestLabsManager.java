/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ProviderOperations;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Labs;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Operations;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.GlobalSchedules;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ArtifactSources;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ArmTemplates;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Artifacts;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Costs;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.CustomImages;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Formulas;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.GalleryImages;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.NotificationChannels;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.PolicySets;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Policies;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Schedules;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ServiceRunners;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Users;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Disks;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Environments;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Secrets;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ServiceFabrics;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ServiceFabricSchedules;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.VirtualMachines;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.VirtualMachineSchedules;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.VirtualNetworks;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure DevTestLabs resource management.
 */
public final class DevTestLabsManager extends ManagerCore<DevTestLabsManager, DevTestLabsClientImpl> {
    private ProviderOperations providerOperations;
    private Labs labs;
    private Operations operations;
    private GlobalSchedules globalSchedules;
    private ArtifactSources artifactSources;
    private ArmTemplates armTemplates;
    private Artifacts artifacts;
    private Costs costs;
    private CustomImages customImages;
    private Formulas formulas;
    private GalleryImages galleryImages;
    private NotificationChannels notificationChannels;
    private PolicySets policySets;
    private Policies policies;
    private Schedules schedules;
    private ServiceRunners serviceRunners;
    private Users users;
    private Disks disks;
    private Environments environments;
    private Secrets secrets;
    private ServiceFabrics serviceFabrics;
    private ServiceFabricSchedules serviceFabricSchedules;
    private VirtualMachines virtualMachines;
    private VirtualMachineSchedules virtualMachineSchedules;
    private VirtualNetworks virtualNetworks;
    /**
    * Get a Configurable instance that can be used to create DevTestLabsManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new DevTestLabsManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of DevTestLabsManager that exposes DevTestLabs resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the DevTestLabsManager
    */
    public static DevTestLabsManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new DevTestLabsManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of DevTestLabsManager that exposes DevTestLabs resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the DevTestLabsManager
    */
    public static DevTestLabsManager authenticate(RestClient restClient, String subscriptionId) {
        return new DevTestLabsManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of DevTestLabsManager that exposes DevTestLabs management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing DevTestLabs management API entry points that work across subscriptions
        */
        DevTestLabsManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage ProviderOperations.
     */
    public ProviderOperations providerOperations() {
        if (this.providerOperations == null) {
            this.providerOperations = new ProviderOperationsImpl(this);
        }
        return this.providerOperations;
    }

    /**
     * @return Entry point to manage Labs.
     */
    public Labs labs() {
        if (this.labs == null) {
            this.labs = new LabsImpl(this);
        }
        return this.labs;
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
     * @return Entry point to manage GlobalSchedules.
     */
    public GlobalSchedules globalSchedules() {
        if (this.globalSchedules == null) {
            this.globalSchedules = new GlobalSchedulesImpl(this);
        }
        return this.globalSchedules;
    }

    /**
     * @return Entry point to manage ArtifactSources.
     */
    public ArtifactSources artifactSources() {
        if (this.artifactSources == null) {
            this.artifactSources = new ArtifactSourcesImpl(this);
        }
        return this.artifactSources;
    }

    /**
     * @return Entry point to manage ArmTemplates.
     */
    public ArmTemplates armTemplates() {
        if (this.armTemplates == null) {
            this.armTemplates = new ArmTemplatesImpl(this);
        }
        return this.armTemplates;
    }

    /**
     * @return Entry point to manage Artifacts.
     */
    public Artifacts artifacts() {
        if (this.artifacts == null) {
            this.artifacts = new ArtifactsImpl(this);
        }
        return this.artifacts;
    }

    /**
     * @return Entry point to manage Costs.
     */
    public Costs costs() {
        if (this.costs == null) {
            this.costs = new CostsImpl(this);
        }
        return this.costs;
    }

    /**
     * @return Entry point to manage CustomImages.
     */
    public CustomImages customImages() {
        if (this.customImages == null) {
            this.customImages = new CustomImagesImpl(this);
        }
        return this.customImages;
    }

    /**
     * @return Entry point to manage Formulas.
     */
    public Formulas formulas() {
        if (this.formulas == null) {
            this.formulas = new FormulasImpl(this);
        }
        return this.formulas;
    }

    /**
     * @return Entry point to manage GalleryImages.
     */
    public GalleryImages galleryImages() {
        if (this.galleryImages == null) {
            this.galleryImages = new GalleryImagesImpl(this);
        }
        return this.galleryImages;
    }

    /**
     * @return Entry point to manage NotificationChannels.
     */
    public NotificationChannels notificationChannels() {
        if (this.notificationChannels == null) {
            this.notificationChannels = new NotificationChannelsImpl(this);
        }
        return this.notificationChannels;
    }

    /**
     * @return Entry point to manage PolicySets.
     */
    public PolicySets policySets() {
        if (this.policySets == null) {
            this.policySets = new PolicySetsImpl(this);
        }
        return this.policySets;
    }

    /**
     * @return Entry point to manage Policies.
     */
    public Policies policies() {
        if (this.policies == null) {
            this.policies = new PoliciesImpl(this);
        }
        return this.policies;
    }

    /**
     * @return Entry point to manage Schedules.
     */
    public Schedules schedules() {
        if (this.schedules == null) {
            this.schedules = new SchedulesImpl(this);
        }
        return this.schedules;
    }

    /**
     * @return Entry point to manage ServiceRunners.
     */
    public ServiceRunners serviceRunners() {
        if (this.serviceRunners == null) {
            this.serviceRunners = new ServiceRunnersImpl(this);
        }
        return this.serviceRunners;
    }

    /**
     * @return Entry point to manage Users.
     */
    public Users users() {
        if (this.users == null) {
            this.users = new UsersImpl(this);
        }
        return this.users;
    }

    /**
     * @return Entry point to manage Disks.
     */
    public Disks disks() {
        if (this.disks == null) {
            this.disks = new DisksImpl(this);
        }
        return this.disks;
    }

    /**
     * @return Entry point to manage Environments.
     */
    public Environments environments() {
        if (this.environments == null) {
            this.environments = new EnvironmentsImpl(this);
        }
        return this.environments;
    }

    /**
     * @return Entry point to manage Secrets.
     */
    public Secrets secrets() {
        if (this.secrets == null) {
            this.secrets = new SecretsImpl(this);
        }
        return this.secrets;
    }

    /**
     * @return Entry point to manage ServiceFabrics.
     */
    public ServiceFabrics serviceFabrics() {
        if (this.serviceFabrics == null) {
            this.serviceFabrics = new ServiceFabricsImpl(this);
        }
        return this.serviceFabrics;
    }

    /**
     * @return Entry point to manage ServiceFabricSchedules.
     */
    public ServiceFabricSchedules serviceFabricSchedules() {
        if (this.serviceFabricSchedules == null) {
            this.serviceFabricSchedules = new ServiceFabricSchedulesImpl(this);
        }
        return this.serviceFabricSchedules;
    }

    /**
     * @return Entry point to manage VirtualMachines.
     */
    public VirtualMachines virtualMachines() {
        if (this.virtualMachines == null) {
            this.virtualMachines = new VirtualMachinesImpl(this);
        }
        return this.virtualMachines;
    }

    /**
     * @return Entry point to manage VirtualMachineSchedules.
     */
    public VirtualMachineSchedules virtualMachineSchedules() {
        if (this.virtualMachineSchedules == null) {
            this.virtualMachineSchedules = new VirtualMachineSchedulesImpl(this);
        }
        return this.virtualMachineSchedules;
    }

    /**
     * @return Entry point to manage VirtualNetworks.
     */
    public VirtualNetworks virtualNetworks() {
        if (this.virtualNetworks == null) {
            this.virtualNetworks = new VirtualNetworksImpl(this);
        }
        return this.virtualNetworks;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public DevTestLabsManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return DevTestLabsManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private DevTestLabsManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new DevTestLabsClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
