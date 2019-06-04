/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configuration of an App Service app.
 */
public class SiteConfig {
    /**
     * Number of workers.
     */
    @JsonProperty(value = "numberOfWorkers")
    private Integer numberOfWorkers;

    /**
     * Default documents.
     */
    @JsonProperty(value = "defaultDocuments")
    private List<String> defaultDocuments;

    /**
     * .NET Framework version.
     */
    @JsonProperty(value = "netFrameworkVersion")
    private String netFrameworkVersion;

    /**
     * Version of PHP.
     */
    @JsonProperty(value = "phpVersion")
    private String phpVersion;

    /**
     * Version of Python.
     */
    @JsonProperty(value = "pythonVersion")
    private String pythonVersion;

    /**
     * Version of Node.js.
     */
    @JsonProperty(value = "nodeVersion")
    private String nodeVersion;

    /**
     * Linux App Framework and version.
     */
    @JsonProperty(value = "linuxFxVersion")
    private String linuxFxVersion;

    /**
     * &lt;code&gt;true&lt;/code&gt; if request tracing is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "requestTracingEnabled")
    private Boolean requestTracingEnabled;

    /**
     * Request tracing expiration time.
     */
    @JsonProperty(value = "requestTracingExpirationTime")
    private DateTime requestTracingExpirationTime;

    /**
     * &lt;code&gt;true&lt;/code&gt; if remote debugging is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "remoteDebuggingEnabled")
    private Boolean remoteDebuggingEnabled;

    /**
     * Remote debugging version.
     */
    @JsonProperty(value = "remoteDebuggingVersion")
    private String remoteDebuggingVersion;

    /**
     * &lt;code&gt;true&lt;/code&gt; if HTTP logging is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "httpLoggingEnabled")
    private Boolean httpLoggingEnabled;

    /**
     * HTTP logs directory size limit.
     */
    @JsonProperty(value = "logsDirectorySizeLimit")
    private Integer logsDirectorySizeLimit;

    /**
     * &lt;code&gt;true&lt;/code&gt; if detailed error logging is enabled;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "detailedErrorLoggingEnabled")
    private Boolean detailedErrorLoggingEnabled;

    /**
     * Publishing user name.
     */
    @JsonProperty(value = "publishingUsername")
    private String publishingUsername;

    /**
     * Application settings.
     */
    @JsonProperty(value = "appSettings")
    private List<NameValuePair> appSettings;

    /**
     * Connection strings.
     */
    @JsonProperty(value = "connectionStrings")
    private List<ConnStringInfo> connectionStrings;

    /**
     * Site MachineKey.
     */
    @JsonProperty(value = "machineKey", access = JsonProperty.Access.WRITE_ONLY)
    private SiteMachineKey machineKey;

    /**
     * Handler mappings.
     */
    @JsonProperty(value = "handlerMappings")
    private List<HandlerMapping> handlerMappings;

    /**
     * Document root.
     */
    @JsonProperty(value = "documentRoot")
    private String documentRoot;

    /**
     * SCM type. Possible values include: 'None', 'Dropbox', 'Tfs', 'LocalGit',
     * 'GitHub', 'CodePlexGit', 'CodePlexHg', 'BitbucketGit', 'BitbucketHg',
     * 'ExternalGit', 'ExternalHg', 'OneDrive', 'VSO'.
     */
    @JsonProperty(value = "scmType")
    private ScmType scmType;

    /**
     * &lt;code&gt;true&lt;/code&gt; to use 32-bit worker process; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "use32BitWorkerProcess")
    private Boolean use32BitWorkerProcess;

    /**
     * &lt;code&gt;true&lt;/code&gt; if WebSocket is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "webSocketsEnabled")
    private Boolean webSocketsEnabled;

    /**
     * &lt;code&gt;true&lt;/code&gt; if Always On is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "alwaysOn")
    private Boolean alwaysOn;

    /**
     * Java version.
     */
    @JsonProperty(value = "javaVersion")
    private String javaVersion;

    /**
     * Java container.
     */
    @JsonProperty(value = "javaContainer")
    private String javaContainer;

    /**
     * Java container version.
     */
    @JsonProperty(value = "javaContainerVersion")
    private String javaContainerVersion;

    /**
     * App command line to launch.
     */
    @JsonProperty(value = "appCommandLine")
    private String appCommandLine;

    /**
     * Managed pipeline mode. Possible values include: 'Integrated', 'Classic'.
     */
    @JsonProperty(value = "managedPipelineMode")
    private ManagedPipelineMode managedPipelineMode;

    /**
     * Virtual applications.
     */
    @JsonProperty(value = "virtualApplications")
    private List<VirtualApplication> virtualApplications;

    /**
     * Site load balancing. Possible values include: 'WeightedRoundRobin',
     * 'LeastRequests', 'LeastResponseTime', 'WeightedTotalTraffic',
     * 'RequestHash'.
     */
    @JsonProperty(value = "loadBalancing")
    private SiteLoadBalancing loadBalancing;

    /**
     * This is work around for polymorphic types.
     */
    @JsonProperty(value = "experiments")
    private Experiments experiments;

    /**
     * Site limits.
     */
    @JsonProperty(value = "limits")
    private SiteLimits limits;

    /**
     * &lt;code&gt;true&lt;/code&gt; if Auto Heal is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "autoHealEnabled")
    private Boolean autoHealEnabled;

    /**
     * Auto Heal rules.
     */
    @JsonProperty(value = "autoHealRules")
    private AutoHealRules autoHealRules;

    /**
     * Tracing options.
     */
    @JsonProperty(value = "tracingOptions")
    private String tracingOptions;

    /**
     * Virtual Network name.
     */
    @JsonProperty(value = "vnetName")
    private String vnetName;

    /**
     * Cross-Origin Resource Sharing (CORS) settings.
     */
    @JsonProperty(value = "cors")
    private CorsSettings cors;

    /**
     * Push endpoint settings.
     */
    @JsonProperty(value = "push")
    private PushSettings push;

    /**
     * Information about the formal API definition for the app.
     */
    @JsonProperty(value = "apiDefinition")
    private ApiDefinitionInfo apiDefinition;

    /**
     * Auto-swap slot name.
     */
    @JsonProperty(value = "autoSwapSlotName")
    private String autoSwapSlotName;

    /**
     * &lt;code&gt;true&lt;/code&gt; to enable local MySQL; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "localMySqlEnabled")
    private Boolean localMySqlEnabled;

    /**
     * IP security restrictions.
     */
    @JsonProperty(value = "ipSecurityRestrictions")
    private List<IpSecurityRestriction> ipSecurityRestrictions;

    /**
     * Http20Enabled: configures a web site to allow clients to connect over
     * http2.0.
     */
    @JsonProperty(value = "http20Enabled")
    private Boolean http20Enabled;

    /**
     * MinTlsVersion: configures the minimum version of TLS required for SSL
     * requests. Possible values include: '1.0', '1.1', '1.2'.
     */
    @JsonProperty(value = "minTlsVersion")
    private SupportedTlsVersions minTlsVersion;

    /**
     * Get number of workers.
     *
     * @return the numberOfWorkers value
     */
    public Integer numberOfWorkers() {
        return this.numberOfWorkers;
    }

    /**
     * Set number of workers.
     *
     * @param numberOfWorkers the numberOfWorkers value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
        return this;
    }

    /**
     * Get default documents.
     *
     * @return the defaultDocuments value
     */
    public List<String> defaultDocuments() {
        return this.defaultDocuments;
    }

    /**
     * Set default documents.
     *
     * @param defaultDocuments the defaultDocuments value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withDefaultDocuments(List<String> defaultDocuments) {
        this.defaultDocuments = defaultDocuments;
        return this;
    }

    /**
     * Get .NET Framework version.
     *
     * @return the netFrameworkVersion value
     */
    public String netFrameworkVersion() {
        return this.netFrameworkVersion;
    }

    /**
     * Set .NET Framework version.
     *
     * @param netFrameworkVersion the netFrameworkVersion value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withNetFrameworkVersion(String netFrameworkVersion) {
        this.netFrameworkVersion = netFrameworkVersion;
        return this;
    }

    /**
     * Get version of PHP.
     *
     * @return the phpVersion value
     */
    public String phpVersion() {
        return this.phpVersion;
    }

    /**
     * Set version of PHP.
     *
     * @param phpVersion the phpVersion value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withPhpVersion(String phpVersion) {
        this.phpVersion = phpVersion;
        return this;
    }

    /**
     * Get version of Python.
     *
     * @return the pythonVersion value
     */
    public String pythonVersion() {
        return this.pythonVersion;
    }

    /**
     * Set version of Python.
     *
     * @param pythonVersion the pythonVersion value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withPythonVersion(String pythonVersion) {
        this.pythonVersion = pythonVersion;
        return this;
    }

    /**
     * Get version of Node.js.
     *
     * @return the nodeVersion value
     */
    public String nodeVersion() {
        return this.nodeVersion;
    }

    /**
     * Set version of Node.js.
     *
     * @param nodeVersion the nodeVersion value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withNodeVersion(String nodeVersion) {
        this.nodeVersion = nodeVersion;
        return this;
    }

    /**
     * Get linux App Framework and version.
     *
     * @return the linuxFxVersion value
     */
    public String linuxFxVersion() {
        return this.linuxFxVersion;
    }

    /**
     * Set linux App Framework and version.
     *
     * @param linuxFxVersion the linuxFxVersion value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withLinuxFxVersion(String linuxFxVersion) {
        this.linuxFxVersion = linuxFxVersion;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if request tracing is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the requestTracingEnabled value
     */
    public Boolean requestTracingEnabled() {
        return this.requestTracingEnabled;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if request tracing is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param requestTracingEnabled the requestTracingEnabled value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withRequestTracingEnabled(Boolean requestTracingEnabled) {
        this.requestTracingEnabled = requestTracingEnabled;
        return this;
    }

    /**
     * Get request tracing expiration time.
     *
     * @return the requestTracingExpirationTime value
     */
    public DateTime requestTracingExpirationTime() {
        return this.requestTracingExpirationTime;
    }

    /**
     * Set request tracing expiration time.
     *
     * @param requestTracingExpirationTime the requestTracingExpirationTime value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withRequestTracingExpirationTime(DateTime requestTracingExpirationTime) {
        this.requestTracingExpirationTime = requestTracingExpirationTime;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if remote debugging is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the remoteDebuggingEnabled value
     */
    public Boolean remoteDebuggingEnabled() {
        return this.remoteDebuggingEnabled;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if remote debugging is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param remoteDebuggingEnabled the remoteDebuggingEnabled value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withRemoteDebuggingEnabled(Boolean remoteDebuggingEnabled) {
        this.remoteDebuggingEnabled = remoteDebuggingEnabled;
        return this;
    }

    /**
     * Get remote debugging version.
     *
     * @return the remoteDebuggingVersion value
     */
    public String remoteDebuggingVersion() {
        return this.remoteDebuggingVersion;
    }

    /**
     * Set remote debugging version.
     *
     * @param remoteDebuggingVersion the remoteDebuggingVersion value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withRemoteDebuggingVersion(String remoteDebuggingVersion) {
        this.remoteDebuggingVersion = remoteDebuggingVersion;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if HTTP logging is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the httpLoggingEnabled value
     */
    public Boolean httpLoggingEnabled() {
        return this.httpLoggingEnabled;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if HTTP logging is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param httpLoggingEnabled the httpLoggingEnabled value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withHttpLoggingEnabled(Boolean httpLoggingEnabled) {
        this.httpLoggingEnabled = httpLoggingEnabled;
        return this;
    }

    /**
     * Get hTTP logs directory size limit.
     *
     * @return the logsDirectorySizeLimit value
     */
    public Integer logsDirectorySizeLimit() {
        return this.logsDirectorySizeLimit;
    }

    /**
     * Set hTTP logs directory size limit.
     *
     * @param logsDirectorySizeLimit the logsDirectorySizeLimit value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withLogsDirectorySizeLimit(Integer logsDirectorySizeLimit) {
        this.logsDirectorySizeLimit = logsDirectorySizeLimit;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if detailed error logging is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the detailedErrorLoggingEnabled value
     */
    public Boolean detailedErrorLoggingEnabled() {
        return this.detailedErrorLoggingEnabled;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if detailed error logging is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param detailedErrorLoggingEnabled the detailedErrorLoggingEnabled value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withDetailedErrorLoggingEnabled(Boolean detailedErrorLoggingEnabled) {
        this.detailedErrorLoggingEnabled = detailedErrorLoggingEnabled;
        return this;
    }

    /**
     * Get publishing user name.
     *
     * @return the publishingUsername value
     */
    public String publishingUsername() {
        return this.publishingUsername;
    }

    /**
     * Set publishing user name.
     *
     * @param publishingUsername the publishingUsername value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withPublishingUsername(String publishingUsername) {
        this.publishingUsername = publishingUsername;
        return this;
    }

    /**
     * Get application settings.
     *
     * @return the appSettings value
     */
    public List<NameValuePair> appSettings() {
        return this.appSettings;
    }

    /**
     * Set application settings.
     *
     * @param appSettings the appSettings value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withAppSettings(List<NameValuePair> appSettings) {
        this.appSettings = appSettings;
        return this;
    }

    /**
     * Get connection strings.
     *
     * @return the connectionStrings value
     */
    public List<ConnStringInfo> connectionStrings() {
        return this.connectionStrings;
    }

    /**
     * Set connection strings.
     *
     * @param connectionStrings the connectionStrings value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withConnectionStrings(List<ConnStringInfo> connectionStrings) {
        this.connectionStrings = connectionStrings;
        return this;
    }

    /**
     * Get site MachineKey.
     *
     * @return the machineKey value
     */
    public SiteMachineKey machineKey() {
        return this.machineKey;
    }

    /**
     * Get handler mappings.
     *
     * @return the handlerMappings value
     */
    public List<HandlerMapping> handlerMappings() {
        return this.handlerMappings;
    }

    /**
     * Set handler mappings.
     *
     * @param handlerMappings the handlerMappings value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withHandlerMappings(List<HandlerMapping> handlerMappings) {
        this.handlerMappings = handlerMappings;
        return this;
    }

    /**
     * Get document root.
     *
     * @return the documentRoot value
     */
    public String documentRoot() {
        return this.documentRoot;
    }

    /**
     * Set document root.
     *
     * @param documentRoot the documentRoot value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withDocumentRoot(String documentRoot) {
        this.documentRoot = documentRoot;
        return this;
    }

    /**
     * Get sCM type. Possible values include: 'None', 'Dropbox', 'Tfs', 'LocalGit', 'GitHub', 'CodePlexGit', 'CodePlexHg', 'BitbucketGit', 'BitbucketHg', 'ExternalGit', 'ExternalHg', 'OneDrive', 'VSO'.
     *
     * @return the scmType value
     */
    public ScmType scmType() {
        return this.scmType;
    }

    /**
     * Set sCM type. Possible values include: 'None', 'Dropbox', 'Tfs', 'LocalGit', 'GitHub', 'CodePlexGit', 'CodePlexHg', 'BitbucketGit', 'BitbucketHg', 'ExternalGit', 'ExternalHg', 'OneDrive', 'VSO'.
     *
     * @param scmType the scmType value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withScmType(ScmType scmType) {
        this.scmType = scmType;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; to use 32-bit worker process; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the use32BitWorkerProcess value
     */
    public Boolean use32BitWorkerProcess() {
        return this.use32BitWorkerProcess;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; to use 32-bit worker process; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param use32BitWorkerProcess the use32BitWorkerProcess value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withUse32BitWorkerProcess(Boolean use32BitWorkerProcess) {
        this.use32BitWorkerProcess = use32BitWorkerProcess;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if WebSocket is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the webSocketsEnabled value
     */
    public Boolean webSocketsEnabled() {
        return this.webSocketsEnabled;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if WebSocket is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param webSocketsEnabled the webSocketsEnabled value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withWebSocketsEnabled(Boolean webSocketsEnabled) {
        this.webSocketsEnabled = webSocketsEnabled;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if Always On is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the alwaysOn value
     */
    public Boolean alwaysOn() {
        return this.alwaysOn;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if Always On is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param alwaysOn the alwaysOn value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withAlwaysOn(Boolean alwaysOn) {
        this.alwaysOn = alwaysOn;
        return this;
    }

    /**
     * Get java version.
     *
     * @return the javaVersion value
     */
    public String javaVersion() {
        return this.javaVersion;
    }

    /**
     * Set java version.
     *
     * @param javaVersion the javaVersion value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
        return this;
    }

    /**
     * Get java container.
     *
     * @return the javaContainer value
     */
    public String javaContainer() {
        return this.javaContainer;
    }

    /**
     * Set java container.
     *
     * @param javaContainer the javaContainer value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withJavaContainer(String javaContainer) {
        this.javaContainer = javaContainer;
        return this;
    }

    /**
     * Get java container version.
     *
     * @return the javaContainerVersion value
     */
    public String javaContainerVersion() {
        return this.javaContainerVersion;
    }

    /**
     * Set java container version.
     *
     * @param javaContainerVersion the javaContainerVersion value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withJavaContainerVersion(String javaContainerVersion) {
        this.javaContainerVersion = javaContainerVersion;
        return this;
    }

    /**
     * Get app command line to launch.
     *
     * @return the appCommandLine value
     */
    public String appCommandLine() {
        return this.appCommandLine;
    }

    /**
     * Set app command line to launch.
     *
     * @param appCommandLine the appCommandLine value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withAppCommandLine(String appCommandLine) {
        this.appCommandLine = appCommandLine;
        return this;
    }

    /**
     * Get managed pipeline mode. Possible values include: 'Integrated', 'Classic'.
     *
     * @return the managedPipelineMode value
     */
    public ManagedPipelineMode managedPipelineMode() {
        return this.managedPipelineMode;
    }

    /**
     * Set managed pipeline mode. Possible values include: 'Integrated', 'Classic'.
     *
     * @param managedPipelineMode the managedPipelineMode value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withManagedPipelineMode(ManagedPipelineMode managedPipelineMode) {
        this.managedPipelineMode = managedPipelineMode;
        return this;
    }

    /**
     * Get virtual applications.
     *
     * @return the virtualApplications value
     */
    public List<VirtualApplication> virtualApplications() {
        return this.virtualApplications;
    }

    /**
     * Set virtual applications.
     *
     * @param virtualApplications the virtualApplications value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withVirtualApplications(List<VirtualApplication> virtualApplications) {
        this.virtualApplications = virtualApplications;
        return this;
    }

    /**
     * Get site load balancing. Possible values include: 'WeightedRoundRobin', 'LeastRequests', 'LeastResponseTime', 'WeightedTotalTraffic', 'RequestHash'.
     *
     * @return the loadBalancing value
     */
    public SiteLoadBalancing loadBalancing() {
        return this.loadBalancing;
    }

    /**
     * Set site load balancing. Possible values include: 'WeightedRoundRobin', 'LeastRequests', 'LeastResponseTime', 'WeightedTotalTraffic', 'RequestHash'.
     *
     * @param loadBalancing the loadBalancing value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withLoadBalancing(SiteLoadBalancing loadBalancing) {
        this.loadBalancing = loadBalancing;
        return this;
    }

    /**
     * Get this is work around for polymorphic types.
     *
     * @return the experiments value
     */
    public Experiments experiments() {
        return this.experiments;
    }

    /**
     * Set this is work around for polymorphic types.
     *
     * @param experiments the experiments value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withExperiments(Experiments experiments) {
        this.experiments = experiments;
        return this;
    }

    /**
     * Get site limits.
     *
     * @return the limits value
     */
    public SiteLimits limits() {
        return this.limits;
    }

    /**
     * Set site limits.
     *
     * @param limits the limits value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withLimits(SiteLimits limits) {
        this.limits = limits;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; if Auto Heal is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the autoHealEnabled value
     */
    public Boolean autoHealEnabled() {
        return this.autoHealEnabled;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; if Auto Heal is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param autoHealEnabled the autoHealEnabled value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withAutoHealEnabled(Boolean autoHealEnabled) {
        this.autoHealEnabled = autoHealEnabled;
        return this;
    }

    /**
     * Get auto Heal rules.
     *
     * @return the autoHealRules value
     */
    public AutoHealRules autoHealRules() {
        return this.autoHealRules;
    }

    /**
     * Set auto Heal rules.
     *
     * @param autoHealRules the autoHealRules value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withAutoHealRules(AutoHealRules autoHealRules) {
        this.autoHealRules = autoHealRules;
        return this;
    }

    /**
     * Get tracing options.
     *
     * @return the tracingOptions value
     */
    public String tracingOptions() {
        return this.tracingOptions;
    }

    /**
     * Set tracing options.
     *
     * @param tracingOptions the tracingOptions value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withTracingOptions(String tracingOptions) {
        this.tracingOptions = tracingOptions;
        return this;
    }

    /**
     * Get virtual Network name.
     *
     * @return the vnetName value
     */
    public String vnetName() {
        return this.vnetName;
    }

    /**
     * Set virtual Network name.
     *
     * @param vnetName the vnetName value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withVnetName(String vnetName) {
        this.vnetName = vnetName;
        return this;
    }

    /**
     * Get cross-Origin Resource Sharing (CORS) settings.
     *
     * @return the cors value
     */
    public CorsSettings cors() {
        return this.cors;
    }

    /**
     * Set cross-Origin Resource Sharing (CORS) settings.
     *
     * @param cors the cors value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withCors(CorsSettings cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Get push endpoint settings.
     *
     * @return the push value
     */
    public PushSettings push() {
        return this.push;
    }

    /**
     * Set push endpoint settings.
     *
     * @param push the push value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withPush(PushSettings push) {
        this.push = push;
        return this;
    }

    /**
     * Get information about the formal API definition for the app.
     *
     * @return the apiDefinition value
     */
    public ApiDefinitionInfo apiDefinition() {
        return this.apiDefinition;
    }

    /**
     * Set information about the formal API definition for the app.
     *
     * @param apiDefinition the apiDefinition value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withApiDefinition(ApiDefinitionInfo apiDefinition) {
        this.apiDefinition = apiDefinition;
        return this;
    }

    /**
     * Get auto-swap slot name.
     *
     * @return the autoSwapSlotName value
     */
    public String autoSwapSlotName() {
        return this.autoSwapSlotName;
    }

    /**
     * Set auto-swap slot name.
     *
     * @param autoSwapSlotName the autoSwapSlotName value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withAutoSwapSlotName(String autoSwapSlotName) {
        this.autoSwapSlotName = autoSwapSlotName;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; to enable local MySQL; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the localMySqlEnabled value
     */
    public Boolean localMySqlEnabled() {
        return this.localMySqlEnabled;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; to enable local MySQL; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param localMySqlEnabled the localMySqlEnabled value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withLocalMySqlEnabled(Boolean localMySqlEnabled) {
        this.localMySqlEnabled = localMySqlEnabled;
        return this;
    }

    /**
     * Get iP security restrictions.
     *
     * @return the ipSecurityRestrictions value
     */
    public List<IpSecurityRestriction> ipSecurityRestrictions() {
        return this.ipSecurityRestrictions;
    }

    /**
     * Set iP security restrictions.
     *
     * @param ipSecurityRestrictions the ipSecurityRestrictions value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withIpSecurityRestrictions(List<IpSecurityRestriction> ipSecurityRestrictions) {
        this.ipSecurityRestrictions = ipSecurityRestrictions;
        return this;
    }

    /**
     * Get http20Enabled: configures a web site to allow clients to connect over http2.0.
     *
     * @return the http20Enabled value
     */
    public Boolean http20Enabled() {
        return this.http20Enabled;
    }

    /**
     * Set http20Enabled: configures a web site to allow clients to connect over http2.0.
     *
     * @param http20Enabled the http20Enabled value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withHttp20Enabled(Boolean http20Enabled) {
        this.http20Enabled = http20Enabled;
        return this;
    }

    /**
     * Get minTlsVersion: configures the minimum version of TLS required for SSL requests. Possible values include: '1.0', '1.1', '1.2'.
     *
     * @return the minTlsVersion value
     */
    public SupportedTlsVersions minTlsVersion() {
        return this.minTlsVersion;
    }

    /**
     * Set minTlsVersion: configures the minimum version of TLS required for SSL requests. Possible values include: '1.0', '1.1', '1.2'.
     *
     * @param minTlsVersion the minTlsVersion value to set
     * @return the SiteConfig object itself.
     */
    public SiteConfig withMinTlsVersion(SupportedTlsVersions minTlsVersion) {
        this.minTlsVersion = minTlsVersion;
        return this;
    }

}
