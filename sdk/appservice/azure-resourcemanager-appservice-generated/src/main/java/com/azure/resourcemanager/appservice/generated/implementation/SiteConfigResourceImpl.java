// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.PushSettingsInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.SiteConfigResourceInner;
import com.azure.resourcemanager.appservice.generated.models.ApiDefinitionInfo;
import com.azure.resourcemanager.appservice.generated.models.ApiManagementConfig;
import com.azure.resourcemanager.appservice.generated.models.AutoHealRules;
import com.azure.resourcemanager.appservice.generated.models.AzureStorageInfoValue;
import com.azure.resourcemanager.appservice.generated.models.ConnStringInfo;
import com.azure.resourcemanager.appservice.generated.models.CorsSettings;
import com.azure.resourcemanager.appservice.generated.models.Experiments;
import com.azure.resourcemanager.appservice.generated.models.FtpsState;
import com.azure.resourcemanager.appservice.generated.models.HandlerMapping;
import com.azure.resourcemanager.appservice.generated.models.IpSecurityRestriction;
import com.azure.resourcemanager.appservice.generated.models.ManagedPipelineMode;
import com.azure.resourcemanager.appservice.generated.models.NameValuePair;
import com.azure.resourcemanager.appservice.generated.models.PushSettings;
import com.azure.resourcemanager.appservice.generated.models.ScmType;
import com.azure.resourcemanager.appservice.generated.models.SiteConfigResource;
import com.azure.resourcemanager.appservice.generated.models.SiteLimits;
import com.azure.resourcemanager.appservice.generated.models.SiteLoadBalancing;
import com.azure.resourcemanager.appservice.generated.models.SiteMachineKey;
import com.azure.resourcemanager.appservice.generated.models.SupportedTlsVersions;
import com.azure.resourcemanager.appservice.generated.models.VirtualApplication;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class SiteConfigResourceImpl implements SiteConfigResource {
    private SiteConfigResourceInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    SiteConfigResourceImpl(
        SiteConfigResourceInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public Integer numberOfWorkers() {
        return this.innerModel().numberOfWorkers();
    }

    public List<String> defaultDocuments() {
        List<String> inner = this.innerModel().defaultDocuments();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String netFrameworkVersion() {
        return this.innerModel().netFrameworkVersion();
    }

    public String phpVersion() {
        return this.innerModel().phpVersion();
    }

    public String pythonVersion() {
        return this.innerModel().pythonVersion();
    }

    public String nodeVersion() {
        return this.innerModel().nodeVersion();
    }

    public String powerShellVersion() {
        return this.innerModel().powerShellVersion();
    }

    public String linuxFxVersion() {
        return this.innerModel().linuxFxVersion();
    }

    public String windowsFxVersion() {
        return this.innerModel().windowsFxVersion();
    }

    public Boolean requestTracingEnabled() {
        return this.innerModel().requestTracingEnabled();
    }

    public OffsetDateTime requestTracingExpirationTime() {
        return this.innerModel().requestTracingExpirationTime();
    }

    public Boolean remoteDebuggingEnabled() {
        return this.innerModel().remoteDebuggingEnabled();
    }

    public String remoteDebuggingVersion() {
        return this.innerModel().remoteDebuggingVersion();
    }

    public Boolean httpLoggingEnabled() {
        return this.innerModel().httpLoggingEnabled();
    }

    public Boolean acrUseManagedIdentityCreds() {
        return this.innerModel().acrUseManagedIdentityCreds();
    }

    public String acrUserManagedIdentityId() {
        return this.innerModel().acrUserManagedIdentityId();
    }

    public Integer logsDirectorySizeLimit() {
        return this.innerModel().logsDirectorySizeLimit();
    }

    public Boolean detailedErrorLoggingEnabled() {
        return this.innerModel().detailedErrorLoggingEnabled();
    }

    public String publishingUsername() {
        return this.innerModel().publishingUsername();
    }

    public List<NameValuePair> appSettings() {
        List<NameValuePair> inner = this.innerModel().appSettings();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ConnStringInfo> connectionStrings() {
        List<ConnStringInfo> inner = this.innerModel().connectionStrings();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SiteMachineKey machineKey() {
        return this.innerModel().machineKey();
    }

    public List<HandlerMapping> handlerMappings() {
        List<HandlerMapping> inner = this.innerModel().handlerMappings();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String documentRoot() {
        return this.innerModel().documentRoot();
    }

    public ScmType scmType() {
        return this.innerModel().scmType();
    }

    public Boolean use32BitWorkerProcess() {
        return this.innerModel().use32BitWorkerProcess();
    }

    public Boolean webSocketsEnabled() {
        return this.innerModel().webSocketsEnabled();
    }

    public Boolean alwaysOn() {
        return this.innerModel().alwaysOn();
    }

    public String javaVersion() {
        return this.innerModel().javaVersion();
    }

    public String javaContainer() {
        return this.innerModel().javaContainer();
    }

    public String javaContainerVersion() {
        return this.innerModel().javaContainerVersion();
    }

    public String appCommandLine() {
        return this.innerModel().appCommandLine();
    }

    public ManagedPipelineMode managedPipelineMode() {
        return this.innerModel().managedPipelineMode();
    }

    public List<VirtualApplication> virtualApplications() {
        List<VirtualApplication> inner = this.innerModel().virtualApplications();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SiteLoadBalancing loadBalancing() {
        return this.innerModel().loadBalancing();
    }

    public Experiments experiments() {
        return this.innerModel().experiments();
    }

    public SiteLimits limits() {
        return this.innerModel().limits();
    }

    public Boolean autoHealEnabled() {
        return this.innerModel().autoHealEnabled();
    }

    public AutoHealRules autoHealRules() {
        return this.innerModel().autoHealRules();
    }

    public String tracingOptions() {
        return this.innerModel().tracingOptions();
    }

    public String vnetName() {
        return this.innerModel().vnetName();
    }

    public Boolean vnetRouteAllEnabled() {
        return this.innerModel().vnetRouteAllEnabled();
    }

    public Integer vnetPrivatePortsCount() {
        return this.innerModel().vnetPrivatePortsCount();
    }

    public CorsSettings cors() {
        return this.innerModel().cors();
    }

    public PushSettings push() {
        PushSettingsInner inner = this.innerModel().push();
        if (inner != null) {
            return new PushSettingsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ApiDefinitionInfo apiDefinition() {
        return this.innerModel().apiDefinition();
    }

    public ApiManagementConfig apiManagementConfig() {
        return this.innerModel().apiManagementConfig();
    }

    public String autoSwapSlotName() {
        return this.innerModel().autoSwapSlotName();
    }

    public Boolean localMySqlEnabled() {
        return this.innerModel().localMySqlEnabled();
    }

    public Integer managedServiceIdentityId() {
        return this.innerModel().managedServiceIdentityId();
    }

    public Integer xManagedServiceIdentityId() {
        return this.innerModel().xManagedServiceIdentityId();
    }

    public String keyVaultReferenceIdentity() {
        return this.innerModel().keyVaultReferenceIdentity();
    }

    public List<IpSecurityRestriction> ipSecurityRestrictions() {
        List<IpSecurityRestriction> inner = this.innerModel().ipSecurityRestrictions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<IpSecurityRestriction> scmIpSecurityRestrictions() {
        List<IpSecurityRestriction> inner = this.innerModel().scmIpSecurityRestrictions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean scmIpSecurityRestrictionsUseMain() {
        return this.innerModel().scmIpSecurityRestrictionsUseMain();
    }

    public Boolean http20Enabled() {
        return this.innerModel().http20Enabled();
    }

    public SupportedTlsVersions minTlsVersion() {
        return this.innerModel().minTlsVersion();
    }

    public SupportedTlsVersions scmMinTlsVersion() {
        return this.innerModel().scmMinTlsVersion();
    }

    public FtpsState ftpsState() {
        return this.innerModel().ftpsState();
    }

    public Integer preWarmedInstanceCount() {
        return this.innerModel().preWarmedInstanceCount();
    }

    public Integer functionAppScaleLimit() {
        return this.innerModel().functionAppScaleLimit();
    }

    public String healthCheckPath() {
        return this.innerModel().healthCheckPath();
    }

    public Boolean functionsRuntimeScaleMonitoringEnabled() {
        return this.innerModel().functionsRuntimeScaleMonitoringEnabled();
    }

    public String websiteTimeZone() {
        return this.innerModel().websiteTimeZone();
    }

    public Integer minimumElasticInstanceCount() {
        return this.innerModel().minimumElasticInstanceCount();
    }

    public Map<String, AzureStorageInfoValue> azureStorageAccounts() {
        Map<String, AzureStorageInfoValue> inner = this.innerModel().azureStorageAccounts();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public SiteConfigResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
