/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.SiteInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.AppServiceManager;
import java.util.List;
import org.joda.time.DateTime;
import java.util.UUID;
import java.util.Map;

/**
 * Type representing Slots.
 */
public interface Slots extends HasInner<SiteInner>, Indexable, Refreshable<Slots>, Updatable<Slots.Update>, HasManager<AppServiceManager> {
    /**
     * @return the availabilityState value.
     */
    SiteAvailabilityState availabilityState();

    /**
     * @return the clientAffinityEnabled value.
     */
    Boolean clientAffinityEnabled();

    /**
     * @return the clientCertEnabled value.
     */
    Boolean clientCertEnabled();

    /**
     * @return the clientCertExclusionPaths value.
     */
    String clientCertExclusionPaths();

    /**
     * @return the cloningInfo value.
     */
    CloningInfo cloningInfo();

    /**
     * @return the containerSize value.
     */
    Integer containerSize();

    /**
     * @return the dailyMemoryTimeQuota value.
     */
    Integer dailyMemoryTimeQuota();

    /**
     * @return the defaultHostName value.
     */
    String defaultHostName();

    /**
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * @return the enabledHostNames value.
     */
    List<String> enabledHostNames();

    /**
     * @return the hostingEnvironmentProfile value.
     */
    HostingEnvironmentProfile hostingEnvironmentProfile();

    /**
     * @return the hostNames value.
     */
    List<String> hostNames();

    /**
     * @return the hostNamesDisabled value.
     */
    Boolean hostNamesDisabled();

    /**
     * @return the hostNameSslStates value.
     */
    List<HostNameSslState> hostNameSslStates();

    /**
     * @return the httpsOnly value.
     */
    Boolean httpsOnly();

    /**
     * @return the hyperV value.
     */
    Boolean hyperV();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * @return the inProgressOperationId value.
     */
    UUID inProgressOperationId();

    /**
     * @return the isDefaultContainer value.
     */
    Boolean isDefaultContainer();

    /**
     * @return the isXenon value.
     */
    Boolean isXenon();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the lastModifiedTimeUtc value.
     */
    DateTime lastModifiedTimeUtc();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the maxNumberOfWorkers value.
     */
    Integer maxNumberOfWorkers();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the outboundIpAddresses value.
     */
    String outboundIpAddresses();

    /**
     * @return the possibleOutboundIpAddresses value.
     */
    String possibleOutboundIpAddresses();

    /**
     * @return the redundancyMode value.
     */
    RedundancyMode redundancyMode();

    /**
     * @return the repositorySiteName value.
     */
    String repositorySiteName();

    /**
     * @return the reserved value.
     */
    Boolean reserved();

    /**
     * @return the resourceGroup value.
     */
    String resourceGroup();

    /**
     * @return the scmSiteAlsoStopped value.
     */
    Boolean scmSiteAlsoStopped();

    /**
     * @return the serverFarmId value.
     */
    String serverFarmId();

    /**
     * @return the siteConfig value.
     */
    SiteConfig siteConfig();

    /**
     * @return the slotSwapStatus value.
     */
    SlotSwapStatus slotSwapStatus();

    /**
     * @return the state value.
     */
    String state();

    /**
     * @return the suspendedTill value.
     */
    DateTime suspendedTill();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the targetSwapSlot value.
     */
    String targetSwapSlot();

    /**
     * @return the trafficManagerHostNames value.
     */
    List<String> trafficManagerHostNames();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the usageState value.
     */
    UsageState usageState();

    /**
     * The entirety of the Slots definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithSite, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Slots definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Slots definition.
         */
        interface Blank extends WithSite {
        }

        /**
         * The stage of the slots definition allowing to specify Site.
         */
        interface WithSite {
           /**
            * Specifies resourceGroupName, name.
            * @param resourceGroupName Name of the resource group to which the resource belongs
            * @param name Unique name of the app to create or update. To create or update a deployment slot, use the {slot} parameter
            * @return the next definition stage
            */
            WithLocation withExistingSite(String resourceGroupName, String name);
        }

        /**
         * The stage of the slots definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location Resource Location
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the slots definition allowing to specify ClientAffinityEnabled.
         */
        interface WithClientAffinityEnabled {
            /**
             * Specifies clientAffinityEnabled.
             * @param clientAffinityEnabled &lt;code&gt;true&lt;/code&gt; to enable client affinity; &lt;code&gt;false&lt;/code&gt; to stop sending session affinity cookies, which route client requests in the same session to the same instance. Default is &lt;code&gt;true&lt;/code&gt;
             * @return the next definition stage
             */
            WithCreate withClientAffinityEnabled(Boolean clientAffinityEnabled);
        }

        /**
         * The stage of the slots definition allowing to specify ClientCertEnabled.
         */
        interface WithClientCertEnabled {
            /**
             * Specifies clientCertEnabled.
             * @param clientCertEnabled &lt;code&gt;true&lt;/code&gt; to enable client certificate authentication (TLS mutual authentication); otherwise, &lt;code&gt;false&lt;/code&gt;. Default is &lt;code&gt;false&lt;/code&gt;
             * @return the next definition stage
             */
            WithCreate withClientCertEnabled(Boolean clientCertEnabled);
        }

        /**
         * The stage of the slots definition allowing to specify ClientCertExclusionPaths.
         */
        interface WithClientCertExclusionPaths {
            /**
             * Specifies clientCertExclusionPaths.
             * @param clientCertExclusionPaths client certificate authentication comma-separated exclusion paths
             * @return the next definition stage
             */
            WithCreate withClientCertExclusionPaths(String clientCertExclusionPaths);
        }

        /**
         * The stage of the slots definition allowing to specify CloningInfo.
         */
        interface WithCloningInfo {
            /**
             * Specifies cloningInfo.
             * @param cloningInfo If specified during app creation, the app is cloned from a source app
             * @return the next definition stage
             */
            WithCreate withCloningInfo(CloningInfo cloningInfo);
        }

        /**
         * The stage of the slots definition allowing to specify ContainerSize.
         */
        interface WithContainerSize {
            /**
             * Specifies containerSize.
             * @param containerSize Size of the function container
             * @return the next definition stage
             */
            WithCreate withContainerSize(Integer containerSize);
        }

        /**
         * The stage of the slots definition allowing to specify DailyMemoryTimeQuota.
         */
        interface WithDailyMemoryTimeQuota {
            /**
             * Specifies dailyMemoryTimeQuota.
             * @param dailyMemoryTimeQuota Maximum allowed daily memory-time quota (applicable on dynamic apps only)
             * @return the next definition stage
             */
            WithCreate withDailyMemoryTimeQuota(Integer dailyMemoryTimeQuota);
        }

        /**
         * The stage of the slots definition allowing to specify Enabled.
         */
        interface WithEnabled {
            /**
             * Specifies enabled.
             * @param enabled &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables the app (takes the app offline)
             * @return the next definition stage
             */
            WithCreate withEnabled(Boolean enabled);
        }

        /**
         * The stage of the slots definition allowing to specify HostingEnvironmentProfile.
         */
        interface WithHostingEnvironmentProfile {
            /**
             * Specifies hostingEnvironmentProfile.
             * @param hostingEnvironmentProfile App Service Environment to use for the app
             * @return the next definition stage
             */
            WithCreate withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile);
        }

        /**
         * The stage of the slots definition allowing to specify HostNamesDisabled.
         */
        interface WithHostNamesDisabled {
            /**
             * Specifies hostNamesDisabled.
             * @param hostNamesDisabled &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the app; otherwise, &lt;code&gt;false&lt;/code&gt;.
  If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API management process
             * @return the next definition stage
             */
            WithCreate withHostNamesDisabled(Boolean hostNamesDisabled);
        }

        /**
         * The stage of the slots definition allowing to specify HostNameSslStates.
         */
        interface WithHostNameSslStates {
            /**
             * Specifies hostNameSslStates.
             * @param hostNameSslStates Hostname SSL states are used to manage the SSL bindings for app's hostnames
             * @return the next definition stage
             */
            WithCreate withHostNameSslStates(List<HostNameSslState> hostNameSslStates);
        }

        /**
         * The stage of the slots definition allowing to specify HttpsOnly.
         */
        interface WithHttpsOnly {
            /**
             * Specifies httpsOnly.
             * @param httpsOnly HttpsOnly: configures a web site to accept only https requests. Issues redirect for
 http requests
             * @return the next definition stage
             */
            WithCreate withHttpsOnly(Boolean httpsOnly);
        }

        /**
         * The stage of the slots definition allowing to specify HyperV.
         */
        interface WithHyperV {
            /**
             * Specifies hyperV.
             * @param hyperV Hyper-V sandbox
             * @return the next definition stage
             */
            WithCreate withHyperV(Boolean hyperV);
        }

        /**
         * The stage of the slots definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity the identity parameter value
             * @return the next definition stage
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the slots definition allowing to specify IsXenon.
         */
        interface WithIsXenon {
            /**
             * Specifies isXenon.
             * @param isXenon Obsolete: Hyper-V sandbox
             * @return the next definition stage
             */
            WithCreate withIsXenon(Boolean isXenon);
        }

        /**
         * The stage of the slots definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next definition stage
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the slots definition allowing to specify RedundancyMode.
         */
        interface WithRedundancyMode {
            /**
             * Specifies redundancyMode.
             * @param redundancyMode Site redundancy mode. Possible values include: 'None', 'Manual', 'Failover', 'ActiveActive', 'GeoRedundant'
             * @return the next definition stage
             */
            WithCreate withRedundancyMode(RedundancyMode redundancyMode);
        }

        /**
         * The stage of the slots definition allowing to specify Reserved.
         */
        interface WithReserved {
            /**
             * Specifies reserved.
             * @param reserved &lt;code&gt;true&lt;/code&gt; if reserved; otherwise, &lt;code&gt;false&lt;/code&gt;
             * @return the next definition stage
             */
            WithCreate withReserved(Boolean reserved);
        }

        /**
         * The stage of the slots definition allowing to specify ScmSiteAlsoStopped.
         */
        interface WithScmSiteAlsoStopped {
            /**
             * Specifies scmSiteAlsoStopped.
             * @param scmSiteAlsoStopped &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is &lt;code&gt;false&lt;/code&gt;
             * @return the next definition stage
             */
            WithCreate withScmSiteAlsoStopped(Boolean scmSiteAlsoStopped);
        }

        /**
         * The stage of the slots definition allowing to specify ServerFarmId.
         */
        interface WithServerFarmId {
            /**
             * Specifies serverFarmId.
             * @param serverFarmId Resource ID of the associated App Service plan, formatted as: "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}"
             * @return the next definition stage
             */
            WithCreate withServerFarmId(String serverFarmId);
        }

        /**
         * The stage of the slots definition allowing to specify SiteConfig.
         */
        interface WithSiteConfig {
            /**
             * Specifies siteConfig.
             * @param siteConfig Configuration of the app
             * @return the next definition stage
             */
            WithCreate withSiteConfig(SiteConfig siteConfig);
        }

        /**
         * The stage of the slots definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Slots>, DefinitionStages.WithClientAffinityEnabled, DefinitionStages.WithClientCertEnabled, DefinitionStages.WithClientCertExclusionPaths, DefinitionStages.WithCloningInfo, DefinitionStages.WithContainerSize, DefinitionStages.WithDailyMemoryTimeQuota, DefinitionStages.WithEnabled, DefinitionStages.WithHostingEnvironmentProfile, DefinitionStages.WithHostNamesDisabled, DefinitionStages.WithHostNameSslStates, DefinitionStages.WithHttpsOnly, DefinitionStages.WithHyperV, DefinitionStages.WithIdentity, DefinitionStages.WithIsXenon, DefinitionStages.WithKind, DefinitionStages.WithRedundancyMode, DefinitionStages.WithReserved, DefinitionStages.WithScmSiteAlsoStopped, DefinitionStages.WithServerFarmId, DefinitionStages.WithSiteConfig, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a Slots update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Slots>, UpdateStages.WithClientAffinityEnabled, UpdateStages.WithClientCertEnabled, UpdateStages.WithClientCertExclusionPaths, UpdateStages.WithCloningInfo, UpdateStages.WithContainerSize, UpdateStages.WithDailyMemoryTimeQuota, UpdateStages.WithEnabled, UpdateStages.WithHostingEnvironmentProfile, UpdateStages.WithHostNamesDisabled, UpdateStages.WithHostNameSslStates, UpdateStages.WithHttpsOnly, UpdateStages.WithHyperV, UpdateStages.WithIdentity, UpdateStages.WithIsXenon, UpdateStages.WithKind, UpdateStages.WithRedundancyMode, UpdateStages.WithReserved, UpdateStages.WithScmSiteAlsoStopped, UpdateStages.WithServerFarmId, UpdateStages.WithSiteConfig {
    }

    /**
     * Grouping of Slots update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the slots update allowing to specify ClientAffinityEnabled.
         */
        interface WithClientAffinityEnabled {
            /**
             * Specifies clientAffinityEnabled.
             * @param clientAffinityEnabled &lt;code&gt;true&lt;/code&gt; to enable client affinity; &lt;code&gt;false&lt;/code&gt; to stop sending session affinity cookies, which route client requests in the same session to the same instance. Default is &lt;code&gt;true&lt;/code&gt;
             * @return the next update stage
             */
            Update withClientAffinityEnabled(Boolean clientAffinityEnabled);
        }

        /**
         * The stage of the slots update allowing to specify ClientCertEnabled.
         */
        interface WithClientCertEnabled {
            /**
             * Specifies clientCertEnabled.
             * @param clientCertEnabled &lt;code&gt;true&lt;/code&gt; to enable client certificate authentication (TLS mutual authentication); otherwise, &lt;code&gt;false&lt;/code&gt;. Default is &lt;code&gt;false&lt;/code&gt;
             * @return the next update stage
             */
            Update withClientCertEnabled(Boolean clientCertEnabled);
        }

        /**
         * The stage of the slots update allowing to specify ClientCertExclusionPaths.
         */
        interface WithClientCertExclusionPaths {
            /**
             * Specifies clientCertExclusionPaths.
             * @param clientCertExclusionPaths client certificate authentication comma-separated exclusion paths
             * @return the next update stage
             */
            Update withClientCertExclusionPaths(String clientCertExclusionPaths);
        }

        /**
         * The stage of the slots update allowing to specify CloningInfo.
         */
        interface WithCloningInfo {
            /**
             * Specifies cloningInfo.
             * @param cloningInfo If specified during app creation, the app is cloned from a source app
             * @return the next update stage
             */
            Update withCloningInfo(CloningInfo cloningInfo);
        }

        /**
         * The stage of the slots update allowing to specify ContainerSize.
         */
        interface WithContainerSize {
            /**
             * Specifies containerSize.
             * @param containerSize Size of the function container
             * @return the next update stage
             */
            Update withContainerSize(Integer containerSize);
        }

        /**
         * The stage of the slots update allowing to specify DailyMemoryTimeQuota.
         */
        interface WithDailyMemoryTimeQuota {
            /**
             * Specifies dailyMemoryTimeQuota.
             * @param dailyMemoryTimeQuota Maximum allowed daily memory-time quota (applicable on dynamic apps only)
             * @return the next update stage
             */
            Update withDailyMemoryTimeQuota(Integer dailyMemoryTimeQuota);
        }

        /**
         * The stage of the slots update allowing to specify Enabled.
         */
        interface WithEnabled {
            /**
             * Specifies enabled.
             * @param enabled &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables the app (takes the app offline)
             * @return the next update stage
             */
            Update withEnabled(Boolean enabled);
        }

        /**
         * The stage of the slots update allowing to specify HostingEnvironmentProfile.
         */
        interface WithHostingEnvironmentProfile {
            /**
             * Specifies hostingEnvironmentProfile.
             * @param hostingEnvironmentProfile App Service Environment to use for the app
             * @return the next update stage
             */
            Update withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile);
        }

        /**
         * The stage of the slots update allowing to specify HostNamesDisabled.
         */
        interface WithHostNamesDisabled {
            /**
             * Specifies hostNamesDisabled.
             * @param hostNamesDisabled &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the app; otherwise, &lt;code&gt;false&lt;/code&gt;.
  If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API management process
             * @return the next update stage
             */
            Update withHostNamesDisabled(Boolean hostNamesDisabled);
        }

        /**
         * The stage of the slots update allowing to specify HostNameSslStates.
         */
        interface WithHostNameSslStates {
            /**
             * Specifies hostNameSslStates.
             * @param hostNameSslStates Hostname SSL states are used to manage the SSL bindings for app's hostnames
             * @return the next update stage
             */
            Update withHostNameSslStates(List<HostNameSslState> hostNameSslStates);
        }

        /**
         * The stage of the slots update allowing to specify HttpsOnly.
         */
        interface WithHttpsOnly {
            /**
             * Specifies httpsOnly.
             * @param httpsOnly HttpsOnly: configures a web site to accept only https requests. Issues redirect for
 http requests
             * @return the next update stage
             */
            Update withHttpsOnly(Boolean httpsOnly);
        }

        /**
         * The stage of the slots update allowing to specify HyperV.
         */
        interface WithHyperV {
            /**
             * Specifies hyperV.
             * @param hyperV Hyper-V sandbox
             * @return the next update stage
             */
            Update withHyperV(Boolean hyperV);
        }

        /**
         * The stage of the slots update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity the identity parameter value
             * @return the next update stage
             */
            Update withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the slots update allowing to specify IsXenon.
         */
        interface WithIsXenon {
            /**
             * Specifies isXenon.
             * @param isXenon Obsolete: Hyper-V sandbox
             * @return the next update stage
             */
            Update withIsXenon(Boolean isXenon);
        }

        /**
         * The stage of the slots update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next update stage
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the slots update allowing to specify RedundancyMode.
         */
        interface WithRedundancyMode {
            /**
             * Specifies redundancyMode.
             * @param redundancyMode Site redundancy mode. Possible values include: 'None', 'Manual', 'Failover', 'ActiveActive', 'GeoRedundant'
             * @return the next update stage
             */
            Update withRedundancyMode(RedundancyMode redundancyMode);
        }

        /**
         * The stage of the slots update allowing to specify Reserved.
         */
        interface WithReserved {
            /**
             * Specifies reserved.
             * @param reserved &lt;code&gt;true&lt;/code&gt; if reserved; otherwise, &lt;code&gt;false&lt;/code&gt;
             * @return the next update stage
             */
            Update withReserved(Boolean reserved);
        }

        /**
         * The stage of the slots update allowing to specify ScmSiteAlsoStopped.
         */
        interface WithScmSiteAlsoStopped {
            /**
             * Specifies scmSiteAlsoStopped.
             * @param scmSiteAlsoStopped &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is &lt;code&gt;false&lt;/code&gt;
             * @return the next update stage
             */
            Update withScmSiteAlsoStopped(Boolean scmSiteAlsoStopped);
        }

        /**
         * The stage of the slots update allowing to specify ServerFarmId.
         */
        interface WithServerFarmId {
            /**
             * Specifies serverFarmId.
             * @param serverFarmId Resource ID of the associated App Service plan, formatted as: "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}"
             * @return the next update stage
             */
            Update withServerFarmId(String serverFarmId);
        }

        /**
         * The stage of the slots update allowing to specify SiteConfig.
         */
        interface WithSiteConfig {
            /**
             * Specifies siteConfig.
             * @param siteConfig Configuration of the app
             * @return the next update stage
             */
            Update withSiteConfig(SiteConfig siteConfig);
        }

    }
}
