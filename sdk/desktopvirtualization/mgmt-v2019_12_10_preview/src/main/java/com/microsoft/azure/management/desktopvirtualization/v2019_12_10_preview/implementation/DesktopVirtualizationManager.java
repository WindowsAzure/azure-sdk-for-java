/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.Operations;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.Workspaces;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.ApplicationGroupAssignments;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.ApplicationGroups;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.StartMenuItems;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.Applications;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.Desktops;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.HostPools;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.UserSessions;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.SessionHosts;
import com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview.ActiveApplications;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure DesktopVirtualization resource management.
 */
public final class DesktopVirtualizationManager extends ManagerCore<DesktopVirtualizationManager, DesktopVirtualizationAPIClientImpl> {
    private Operations operations;
    private Workspaces workspaces;
    private ApplicationGroupAssignments applicationGroupAssignments;
    private ApplicationGroups applicationGroups;
    private StartMenuItems startMenuItems;
    private Applications applications;
    private Desktops desktops;
    private HostPools hostPools;
    private UserSessions userSessions;
    private SessionHosts sessionHosts;
    private ActiveApplications activeApplications;
    /**
    * Get a Configurable instance that can be used to create DesktopVirtualizationManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new DesktopVirtualizationManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of DesktopVirtualizationManager that exposes DesktopVirtualization resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the DesktopVirtualizationManager
    */
    public static DesktopVirtualizationManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new DesktopVirtualizationManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of DesktopVirtualizationManager that exposes DesktopVirtualization resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the DesktopVirtualizationManager
    */
    public static DesktopVirtualizationManager authenticate(RestClient restClient, String subscriptionId) {
        return new DesktopVirtualizationManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of DesktopVirtualizationManager that exposes DesktopVirtualization management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing DesktopVirtualization management API entry points that work across subscriptions
        */
        DesktopVirtualizationManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
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
     * @return Entry point to manage Workspaces.
     */
    public Workspaces workspaces() {
        if (this.workspaces == null) {
            this.workspaces = new WorkspacesImpl(this);
        }
        return this.workspaces;
    }

    /**
     * @return Entry point to manage ApplicationGroupAssignments.
     */
    public ApplicationGroupAssignments applicationGroupAssignments() {
        if (this.applicationGroupAssignments == null) {
            this.applicationGroupAssignments = new ApplicationGroupAssignmentsImpl(this);
        }
        return this.applicationGroupAssignments;
    }

    /**
     * @return Entry point to manage ApplicationGroups.
     */
    public ApplicationGroups applicationGroups() {
        if (this.applicationGroups == null) {
            this.applicationGroups = new ApplicationGroupsImpl(this);
        }
        return this.applicationGroups;
    }

    /**
     * @return Entry point to manage StartMenuItems.
     */
    public StartMenuItems startMenuItems() {
        if (this.startMenuItems == null) {
            this.startMenuItems = new StartMenuItemsImpl(this);
        }
        return this.startMenuItems;
    }

    /**
     * @return Entry point to manage Applications.
     */
    public Applications applications() {
        if (this.applications == null) {
            this.applications = new ApplicationsImpl(this);
        }
        return this.applications;
    }

    /**
     * @return Entry point to manage Desktops.
     */
    public Desktops desktops() {
        if (this.desktops == null) {
            this.desktops = new DesktopsImpl(this);
        }
        return this.desktops;
    }

    /**
     * @return Entry point to manage HostPools.
     */
    public HostPools hostPools() {
        if (this.hostPools == null) {
            this.hostPools = new HostPoolsImpl(this);
        }
        return this.hostPools;
    }

    /**
     * @return Entry point to manage UserSessions.
     */
    public UserSessions userSessions() {
        if (this.userSessions == null) {
            this.userSessions = new UserSessionsImpl(this);
        }
        return this.userSessions;
    }

    /**
     * @return Entry point to manage SessionHosts.
     */
    public SessionHosts sessionHosts() {
        if (this.sessionHosts == null) {
            this.sessionHosts = new SessionHostsImpl(this);
        }
        return this.sessionHosts;
    }

    /**
     * @return Entry point to manage ActiveApplications.
     */
    public ActiveApplications activeApplications() {
        if (this.activeApplications == null) {
            this.activeApplications = new ActiveApplicationsImpl(this);
        }
        return this.activeApplications;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public DesktopVirtualizationManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return DesktopVirtualizationManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private DesktopVirtualizationManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new DesktopVirtualizationAPIClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
