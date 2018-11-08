/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * ARM resource for a site.
 */
@JsonFlatten
public class SitePatchResource extends ProxyOnlyResource {
    /**
     * Current state of the app.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /**
     * Hostnames associated with the app.
     */
    @JsonProperty(value = "properties.hostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> hostNames;

    /**
     * Name of the repository site.
     */
    @JsonProperty(value = "properties.repositorySiteName", access = JsonProperty.Access.WRITE_ONLY)
    private String repositorySiteName;

    /**
     * State indicating whether the app has exceeded its quota usage.
     * Read-only. Possible values include: 'Normal', 'Exceeded'.
     */
    @JsonProperty(value = "properties.usageState", access = JsonProperty.Access.WRITE_ONLY)
    private UsageState usageState;

    /**
     * &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables the
     * app (takes the app offline).
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * Enabled hostnames for the app.Hostnames need to be assigned (see
     * HostNames) AND enabled. Otherwise,
     * the app is not served on those hostnames.
     */
    @JsonProperty(value = "properties.enabledHostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> enabledHostNames;

    /**
     * Management information availability state for the app. Possible values
     * include: 'Normal', 'Limited', 'DisasterRecoveryMode'.
     */
    @JsonProperty(value = "properties.availabilityState", access = JsonProperty.Access.WRITE_ONLY)
    private SiteAvailabilityState availabilityState;

    /**
     * Hostname SSL states are used to manage the SSL bindings for app's
     * hostnames.
     */
    @JsonProperty(value = "properties.hostNameSslStates")
    private List<HostNameSslState> hostNameSslStates;

    /**
     * Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     */
    @JsonProperty(value = "properties.serverFarmId")
    private String serverFarmId;

    /**
     * &lt;code&gt;true&lt;/code&gt; if reserved; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.reserved")
    private Boolean reserved;

    /**
     * Obsolete: Hyper-V sandbox.
     */
    @JsonProperty(value = "properties.isXenon")
    private Boolean isXenon;

    /**
     * Hyper-V sandbox.
     */
    @JsonProperty(value = "properties.hyperV")
    private Boolean hyperV;

    /**
     * Last time the app was modified, in UTC. Read-only.
     */
    @JsonProperty(value = "properties.lastModifiedTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedTimeUtc;

    /**
     * Configuration of the app.
     */
    @JsonProperty(value = "properties.siteConfig")
    private SiteConfig siteConfig;

    /**
     * Azure Traffic Manager hostnames associated with the app. Read-only.
     */
    @JsonProperty(value = "properties.trafficManagerHostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> trafficManagerHostNames;

    /**
     * &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is
     * stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.scmSiteAlsoStopped")
    private Boolean scmSiteAlsoStopped;

    /**
     * Specifies which deployment slot this app will swap into. Read-only.
     */
    @JsonProperty(value = "properties.targetSwapSlot", access = JsonProperty.Access.WRITE_ONLY)
    private String targetSwapSlot;

    /**
     * App Service Environment to use for the app.
     */
    @JsonProperty(value = "properties.hostingEnvironmentProfile")
    private HostingEnvironmentProfile hostingEnvironmentProfile;

    /**
     * &lt;code&gt;true&lt;/code&gt; to enable client affinity;
     * &lt;code&gt;false&lt;/code&gt; to stop sending session affinity cookies,
     * which route client requests in the same session to the same instance.
     * Default is &lt;code&gt;true&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.clientAffinityEnabled")
    private Boolean clientAffinityEnabled;

    /**
     * &lt;code&gt;true&lt;/code&gt; to enable client certificate
     * authentication (TLS mutual authentication); otherwise,
     * &lt;code&gt;false&lt;/code&gt;. Default is
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.clientCertEnabled")
    private Boolean clientCertEnabled;

    /**
     * &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the
     * app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API
     * management process.
     */
    @JsonProperty(value = "properties.hostNamesDisabled")
    private Boolean hostNamesDisabled;

    /**
     * List of IP addresses that the app uses for outbound connections (e.g.
     * database access). Includes VIPs from tenants that site can be hosted
     * with current settings. Read-only.
     */
    @JsonProperty(value = "properties.outboundIpAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private String outboundIpAddresses;

    /**
     * List of IP addresses that the app uses for outbound connections (e.g.
     * database access). Includes VIPs from all tenants. Read-only.
     */
    @JsonProperty(value = "properties.possibleOutboundIpAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private String possibleOutboundIpAddresses;

    /**
     * Size of the function container.
     */
    @JsonProperty(value = "properties.containerSize")
    private Integer containerSize;

    /**
     * Maximum allowed daily memory-time quota (applicable on dynamic apps
     * only).
     */
    @JsonProperty(value = "properties.dailyMemoryTimeQuota")
    private Integer dailyMemoryTimeQuota;

    /**
     * App suspended till in case memory-time quota is exceeded.
     */
    @JsonProperty(value = "properties.suspendedTill", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime suspendedTill;

    /**
     * Maximum number of workers.
     * This only applies to Functions container.
     */
    @JsonProperty(value = "properties.maxNumberOfWorkers", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxNumberOfWorkers;

    /**
     * If specified during app creation, the app is cloned from a source app.
     */
    @JsonProperty(value = "properties.cloningInfo")
    private CloningInfo cloningInfo;

    /**
     * Name of the resource group the app belongs to. Read-only.
     */
    @JsonProperty(value = "properties.resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /**
     * &lt;code&gt;true&lt;/code&gt; if the app is a default container;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.isDefaultContainer", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDefaultContainer;

    /**
     * Default hostname of the app. Read-only.
     */
    @JsonProperty(value = "properties.defaultHostName", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultHostName;

    /**
     * Status of the last deployment slot swap operation.
     */
    @JsonProperty(value = "properties.slotSwapStatus", access = JsonProperty.Access.WRITE_ONLY)
    private SlotSwapStatus slotSwapStatus;

    /**
     * HttpsOnly: configures a web site to accept only https requests. Issues
     * redirect for
     * http requests.
     */
    @JsonProperty(value = "properties.httpsOnly")
    private Boolean httpsOnly;

    /**
     * Get current state of the app.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Get hostnames associated with the app.
     *
     * @return the hostNames value
     */
    public List<String> hostNames() {
        return this.hostNames;
    }

    /**
     * Get name of the repository site.
     *
     * @return the repositorySiteName value
     */
    public String repositorySiteName() {
        return this.repositorySiteName;
    }

    /**
     * Get state indicating whether the app has exceeded its quota usage. Read-only. Possible values include: 'Normal', 'Exceeded'.
     *
     * @return the usageState value
     */
    public UsageState usageState() {
        return this.usageState;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables the app (takes the app offline).
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables the app (takes the app offline).
     *
     * @param enabled the enabled value to set
     * @return the SitePatchResource object itself.
     */
    public SitePatchResource withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled hostnames for the app.Hostnames need to be assigned (see HostNames) AND enabled. Otherwise,
     the app is not served on those hostnames.
     *
     * @return the enabledHostNames value
     */
    public List<String> enabledHostNames() {
        return this.enabledHostNames;
    }

    /**
     * Get management information availability state for the app. Possible values include: 'Normal', 'Limited', 'DisasterRecoveryMode'.
     *
     * @return the availabilityState value
     */
    public SiteAvailabilityState availabilityState() {
        return this.availabilityState;
    }

    /**
     * Get hostname SSL states are used to manage the SSL bindings for app's hostnames.
     *
     * @return the hostNameSslStates value
     */
    public List<HostNameSslState> hostNameSslStates() {
        return this.hostNameSslStates;
    }

    /**
     * Set hostname SSL states are used to manage the SSL bindings for app's hostnames.
     *
     * @param hostNameSslStates the hostNameSslStates value to set
     * @return the SitePatchResource object itself.
     */
    public SitePatchResource withHostNameSslStates(List<HostNameSslState> hostNameSslStates) {
        this.hostNameSslStates = hostNameSslStates;
        return this;
    }

    /**
     * Get resource ID of the associated App Service plan, formatted as: "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     *
     * @return the serverFarmId value
     */
    public String serverFarmId() {
        return this.serverFarmId;
    }

    /**
     * Set resource ID of the associated App Service plan, formatted as: "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     *
     * @param serverFarmId the serverFarmId value to set
     * @return the SitePatchResource object itself.
     */
    public SitePatchResource withServerFarmId(String serverFarmId) {
        this.serverFarmId = serverFarmId;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if reserved; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the reserved value
     */
    public Boolean reserved() {
        return this.reserved;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if reserved; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param reserved the reserved value to set
     * @return the SitePatchResource object itself.
     */
    public SitePatchResource withReserved(Boolean reserved) {
        this.reserved = reserved;
        return this;
    }

    /**
     * Get obsolete: Hyper-V sandbox.
     *
     * @return the isXenon value
     */
    public Boolean isXenon() {
        return this.isXenon;
    }

    /**
     * Set obsolete: Hyper-V sandbox.
     *
     * @param isXenon the isXenon value to set
     * @return the SitePatchResource object itself.
     */
    public SitePatchResource withIsXenon(Boolean isXenon) {
        this.isXenon = isXenon;
        return this;
    }

    /**
     * Get hyper-V sandbox.
     *
     * @return the hyperV value
     */
    public Boolean hyperV() {
        return this.hyperV;
    }

    /**
     * Set hyper-V sandbox.
     *
     * @param hyperV the hyperV value to set
     * @return the SitePatchResource object itself.
     */
    public SitePatchResource withHyperV(Boolean hyperV) {
        this.hyperV = hyperV;
        return this;
    }

    /**
     * Get last time the app was modified, in UTC. Read-only.
     *
     * @return the lastModifiedTimeUtc value
     */
    public DateTime lastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }

    /**
     * Get configuration of the app.
     *
     * @return the siteConfig value
     */
    public SiteConfig siteConfig() {
        return this.siteConfig;
    }

    /**
     * Set configuration of the app.
     *
     * @param siteConfig the siteConfig value to set
     * @return the SitePatchResource object itself.
     */
    public SitePatchResource withSiteConfig(SiteConfig siteConfig) {
        this.siteConfig = siteConfig;
        return this;
    }

    /**
     * Get azure Traffic Manager hostnames associated with the app. Read-only.
     *
     * @return the trafficManagerHostNames value
     */
    public List<String> trafficManagerHostNames() {
        return this.trafficManagerHostNames;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the scmSiteAlsoStopped value
     */
    public Boolean scmSiteAlsoStopped() {
        return this.scmSiteAlsoStopped;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is &lt;code&gt;false&lt;/code&gt;.
     *
     * @param scmSiteAlsoStopped the scmSiteAlsoStopped value to set
     * @return the SitePatchResource object itself.
     */
    public SitePatchResource withScmSiteAlsoStopped(Boolean scmSiteAlsoStopped) {
        this.scmSiteAlsoStopped = scmSiteAlsoStopped;
        return this;
    }

    /**
     * Get specifies which deployment slot this app will swap into. Read-only.
     *
     * @return the targetSwapSlot value
     */
    public String targetSwapSlot() {
        return this.targetSwapSlot;
    }

    /**
     * Get app Service Environment to use for the app.
     *
     * @return the hostingEnvironmentProfile value
     */
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }

    /**
     * Set app Service Environment to use for the app.
     *
     * @param hostingEnvironmentProfile the hostingEnvironmentProfile value to set
     * @return the SitePatchResource object itself.
     */
    public SitePatchResource withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        this.hostingEnvironmentProfile = hostingEnvironmentProfile;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; to enable client affinity; &lt;code&gt;false&lt;/code&gt; to stop sending session affinity cookies, which route client requests in the same session to the same instance. Default is &lt;code&gt;true&lt;/code&gt;.
     *
     * @return the clientAffinityEnabled value
     */
    public Boolean clientAffinityEnabled() {
        return this.clientAffinityEnabled;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; to enable client affinity; &lt;code&gt;false&lt;/code&gt; to stop sending session affinity cookies, which route client requests in the same session to the same instance. Default is &lt;code&gt;true&lt;/code&gt;.
     *
     * @param clientAffinityEnabled the clientAffinityEnabled value to set
     * @return the SitePatchResource object itself.
     */
    public SitePatchResource withClientAffinityEnabled(Boolean clientAffinityEnabled) {
        this.clientAffinityEnabled = clientAffinityEnabled;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; to enable client certificate authentication (TLS mutual authentication); otherwise, &lt;code&gt;false&lt;/code&gt;. Default is &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the clientCertEnabled value
     */
    public Boolean clientCertEnabled() {
        return this.clientCertEnabled;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; to enable client certificate authentication (TLS mutual authentication); otherwise, &lt;code&gt;false&lt;/code&gt;. Default is &lt;code&gt;false&lt;/code&gt;.
     *
     * @param clientCertEnabled the clientCertEnabled value to set
     * @return the SitePatchResource object itself.
     */
    public SitePatchResource withClientCertEnabled(Boolean clientCertEnabled) {
        this.clientCertEnabled = clientCertEnabled;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the app; otherwise, &lt;code&gt;false&lt;/code&gt;.
      If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API management process.
     *
     * @return the hostNamesDisabled value
     */
    public Boolean hostNamesDisabled() {
        return this.hostNamesDisabled;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the app; otherwise, &lt;code&gt;false&lt;/code&gt;.
      If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API management process.
     *
     * @param hostNamesDisabled the hostNamesDisabled value to set
     * @return the SitePatchResource object itself.
     */
    public SitePatchResource withHostNamesDisabled(Boolean hostNamesDisabled) {
        this.hostNamesDisabled = hostNamesDisabled;
        return this;
    }

    /**
     * Get list of IP addresses that the app uses for outbound connections (e.g. database access). Includes VIPs from tenants that site can be hosted with current settings. Read-only.
     *
     * @return the outboundIpAddresses value
     */
    public String outboundIpAddresses() {
        return this.outboundIpAddresses;
    }

    /**
     * Get list of IP addresses that the app uses for outbound connections (e.g. database access). Includes VIPs from all tenants. Read-only.
     *
     * @return the possibleOutboundIpAddresses value
     */
    public String possibleOutboundIpAddresses() {
        return this.possibleOutboundIpAddresses;
    }

    /**
     * Get size of the function container.
     *
     * @return the containerSize value
     */
    public Integer containerSize() {
        return this.containerSize;
    }

    /**
     * Set size of the function container.
     *
     * @param containerSize the containerSize value to set
     * @return the SitePatchResource object itself.
     */
    public SitePatchResource withContainerSize(Integer containerSize) {
        this.containerSize = containerSize;
        return this;
    }

    /**
     * Get maximum allowed daily memory-time quota (applicable on dynamic apps only).
     *
     * @return the dailyMemoryTimeQuota value
     */
    public Integer dailyMemoryTimeQuota() {
        return this.dailyMemoryTimeQuota;
    }

    /**
     * Set maximum allowed daily memory-time quota (applicable on dynamic apps only).
     *
     * @param dailyMemoryTimeQuota the dailyMemoryTimeQuota value to set
     * @return the SitePatchResource object itself.
     */
    public SitePatchResource withDailyMemoryTimeQuota(Integer dailyMemoryTimeQuota) {
        this.dailyMemoryTimeQuota = dailyMemoryTimeQuota;
        return this;
    }

    /**
     * Get app suspended till in case memory-time quota is exceeded.
     *
     * @return the suspendedTill value
     */
    public DateTime suspendedTill() {
        return this.suspendedTill;
    }

    /**
     * Get maximum number of workers.
     This only applies to Functions container.
     *
     * @return the maxNumberOfWorkers value
     */
    public Integer maxNumberOfWorkers() {
        return this.maxNumberOfWorkers;
    }

    /**
     * Get if specified during app creation, the app is cloned from a source app.
     *
     * @return the cloningInfo value
     */
    public CloningInfo cloningInfo() {
        return this.cloningInfo;
    }

    /**
     * Set if specified during app creation, the app is cloned from a source app.
     *
     * @param cloningInfo the cloningInfo value to set
     * @return the SitePatchResource object itself.
     */
    public SitePatchResource withCloningInfo(CloningInfo cloningInfo) {
        this.cloningInfo = cloningInfo;
        return this;
    }

    /**
     * Get name of the resource group the app belongs to. Read-only.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if the app is a default container; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isDefaultContainer value
     */
    public Boolean isDefaultContainer() {
        return this.isDefaultContainer;
    }

    /**
     * Get default hostname of the app. Read-only.
     *
     * @return the defaultHostName value
     */
    public String defaultHostName() {
        return this.defaultHostName;
    }

    /**
     * Get status of the last deployment slot swap operation.
     *
     * @return the slotSwapStatus value
     */
    public SlotSwapStatus slotSwapStatus() {
        return this.slotSwapStatus;
    }

    /**
     * Get httpsOnly: configures a web site to accept only https requests. Issues redirect for
     http requests.
     *
     * @return the httpsOnly value
     */
    public Boolean httpsOnly() {
        return this.httpsOnly;
    }

    /**
     * Set httpsOnly: configures a web site to accept only https requests. Issues redirect for
     http requests.
     *
     * @param httpsOnly the httpsOnly value to set
     * @return the SitePatchResource object itself.
     */
    public SitePatchResource withHttpsOnly(Boolean httpsOnly) {
        this.httpsOnly = httpsOnly;
        return this;
    }

}
