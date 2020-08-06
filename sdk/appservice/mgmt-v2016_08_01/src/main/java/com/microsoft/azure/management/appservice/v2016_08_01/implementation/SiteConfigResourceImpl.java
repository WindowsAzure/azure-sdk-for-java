/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import com.microsoft.azure.management.appservice.v2016_08_01.SiteConfigResource;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2016_08_01.ApiDefinitionInfo;
import java.util.List;
import com.microsoft.azure.management.appservice.v2016_08_01.NameValuePair;
import com.microsoft.azure.management.appservice.v2016_08_01.AutoHealRules;
import com.microsoft.azure.management.appservice.v2016_08_01.ConnStringInfo;
import com.microsoft.azure.management.appservice.v2016_08_01.CorsSettings;
import com.microsoft.azure.management.appservice.v2016_08_01.Experiments;
import com.microsoft.azure.management.appservice.v2016_08_01.HandlerMapping;
import com.microsoft.azure.management.appservice.v2016_08_01.IpSecurityRestriction;
import com.microsoft.azure.management.appservice.v2016_08_01.SiteLimits;
import com.microsoft.azure.management.appservice.v2016_08_01.SiteLoadBalancing;
import com.microsoft.azure.management.appservice.v2016_08_01.SiteMachineKey;
import com.microsoft.azure.management.appservice.v2016_08_01.ManagedPipelineMode;
import com.microsoft.azure.management.appservice.v2016_08_01.SupportedTlsVersions;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v2016_08_01.ScmType;
import com.microsoft.azure.management.appservice.v2016_08_01.VirtualApplication;

class SiteConfigResourceImpl extends WrapperImpl<SiteConfigResourceInner> implements SiteConfigResource {
    private final WebManager manager;
    SiteConfigResourceImpl(SiteConfigResourceInner inner, WebManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public WebManager manager() {
        return this.manager;
    }

    @Override
    public Boolean alwaysOn() {
        return this.inner().alwaysOn();
    }

    @Override
    public ApiDefinitionInfo apiDefinition() {
        return this.inner().apiDefinition();
    }

    @Override
    public String appCommandLine() {
        return this.inner().appCommandLine();
    }

    @Override
    public List<NameValuePair> appSettings() {
        return this.inner().appSettings();
    }

    @Override
    public Boolean autoHealEnabled() {
        return this.inner().autoHealEnabled();
    }

    @Override
    public AutoHealRules autoHealRules() {
        return this.inner().autoHealRules();
    }

    @Override
    public String autoSwapSlotName() {
        return this.inner().autoSwapSlotName();
    }

    @Override
    public List<ConnStringInfo> connectionStrings() {
        return this.inner().connectionStrings();
    }

    @Override
    public CorsSettings cors() {
        return this.inner().cors();
    }

    @Override
    public List<String> defaultDocuments() {
        return this.inner().defaultDocuments();
    }

    @Override
    public Boolean detailedErrorLoggingEnabled() {
        return this.inner().detailedErrorLoggingEnabled();
    }

    @Override
    public String documentRoot() {
        return this.inner().documentRoot();
    }

    @Override
    public Experiments experiments() {
        return this.inner().experiments();
    }

    @Override
    public List<HandlerMapping> handlerMappings() {
        return this.inner().handlerMappings();
    }

    @Override
    public Boolean http20Enabled() {
        return this.inner().http20Enabled();
    }

    @Override
    public Boolean httpLoggingEnabled() {
        return this.inner().httpLoggingEnabled();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<IpSecurityRestriction> ipSecurityRestrictions() {
        return this.inner().ipSecurityRestrictions();
    }

    @Override
    public String javaContainer() {
        return this.inner().javaContainer();
    }

    @Override
    public String javaContainerVersion() {
        return this.inner().javaContainerVersion();
    }

    @Override
    public String javaVersion() {
        return this.inner().javaVersion();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public SiteLimits limits() {
        return this.inner().limits();
    }

    @Override
    public String linuxFxVersion() {
        return this.inner().linuxFxVersion();
    }

    @Override
    public SiteLoadBalancing loadBalancing() {
        return this.inner().loadBalancing();
    }

    @Override
    public Boolean localMySqlEnabled() {
        return this.inner().localMySqlEnabled();
    }

    @Override
    public Integer logsDirectorySizeLimit() {
        return this.inner().logsDirectorySizeLimit();
    }

    @Override
    public SiteMachineKey machineKey() {
        return this.inner().machineKey();
    }

    @Override
    public ManagedPipelineMode managedPipelineMode() {
        return this.inner().managedPipelineMode();
    }

    @Override
    public SupportedTlsVersions minTlsVersion() {
        return this.inner().minTlsVersion();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String netFrameworkVersion() {
        return this.inner().netFrameworkVersion();
    }

    @Override
    public String nodeVersion() {
        return this.inner().nodeVersion();
    }

    @Override
    public Integer numberOfWorkers() {
        return this.inner().numberOfWorkers();
    }

    @Override
    public String phpVersion() {
        return this.inner().phpVersion();
    }

    @Override
    public String publishingUsername() {
        return this.inner().publishingUsername();
    }

    @Override
    public PushSettingsInner push() {
        return this.inner().push();
    }

    @Override
    public String pythonVersion() {
        return this.inner().pythonVersion();
    }

    @Override
    public Boolean remoteDebuggingEnabled() {
        return this.inner().remoteDebuggingEnabled();
    }

    @Override
    public String remoteDebuggingVersion() {
        return this.inner().remoteDebuggingVersion();
    }

    @Override
    public Boolean requestTracingEnabled() {
        return this.inner().requestTracingEnabled();
    }

    @Override
    public DateTime requestTracingExpirationTime() {
        return this.inner().requestTracingExpirationTime();
    }

    @Override
    public ScmType scmType() {
        return this.inner().scmType();
    }

    @Override
    public String tracingOptions() {
        return this.inner().tracingOptions();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public Boolean use32BitWorkerProcess() {
        return this.inner().use32BitWorkerProcess();
    }

    @Override
    public List<VirtualApplication> virtualApplications() {
        return this.inner().virtualApplications();
    }

    @Override
    public String vnetName() {
        return this.inner().vnetName();
    }

    @Override
    public Boolean webSocketsEnabled() {
        return this.inner().webSocketsEnabled();
    }

}
