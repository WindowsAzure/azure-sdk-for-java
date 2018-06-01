/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.AppServiceManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.SiteConfigResourceInner;
import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.PushSettingsInner;
import org.joda.time.DateTime;

/**
 * Type representing SiteConfigResource.
 */
public interface SiteConfigResource extends HasInner<SiteConfigResourceInner>, HasManager<AppServiceManager> {
    /**
     * @return the alwaysOn value.
     */
    Boolean alwaysOn();

    /**
     * @return the apiDefinition value.
     */
    ApiDefinitionInfo apiDefinition();

    /**
     * @return the appCommandLine value.
     */
    String appCommandLine();

    /**
     * @return the appSettings value.
     */
    List<NameValuePair> appSettings();

    /**
     * @return the autoHealEnabled value.
     */
    Boolean autoHealEnabled();

    /**
     * @return the autoHealRules value.
     */
    AutoHealRules autoHealRules();

    /**
     * @return the autoSwapSlotName value.
     */
    String autoSwapSlotName();

    /**
     * @return the connectionStrings value.
     */
    List<ConnStringInfo> connectionStrings();

    /**
     * @return the cors value.
     */
    CorsSettings cors();

    /**
     * @return the defaultDocuments value.
     */
    List<String> defaultDocuments();

    /**
     * @return the detailedErrorLoggingEnabled value.
     */
    Boolean detailedErrorLoggingEnabled();

    /**
     * @return the documentRoot value.
     */
    String documentRoot();

    /**
     * @return the experiments value.
     */
    Experiments experiments();

    /**
     * @return the ftpsState value.
     */
    FtpsState ftpsState();

    /**
     * @return the handlerMappings value.
     */
    List<HandlerMapping> handlerMappings();

    /**
     * @return the http20Enabled value.
     */
    Boolean http20Enabled();

    /**
     * @return the httpLoggingEnabled value.
     */
    Boolean httpLoggingEnabled();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the ipSecurityRestrictions value.
     */
    List<IpSecurityRestriction> ipSecurityRestrictions();

    /**
     * @return the javaContainer value.
     */
    String javaContainer();

    /**
     * @return the javaContainerVersion value.
     */
    String javaContainerVersion();

    /**
     * @return the javaVersion value.
     */
    String javaVersion();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the limits value.
     */
    SiteLimits limits();

    /**
     * @return the linuxFxVersion value.
     */
    String linuxFxVersion();

    /**
     * @return the loadBalancing value.
     */
    SiteLoadBalancing loadBalancing();

    /**
     * @return the localMySqlEnabled value.
     */
    Boolean localMySqlEnabled();

    /**
     * @return the logsDirectorySizeLimit value.
     */
    Integer logsDirectorySizeLimit();

    /**
     * @return the machineKey value.
     */
    SiteMachineKey machineKey();

    /**
     * @return the managedPipelineMode value.
     */
    ManagedPipelineMode managedPipelineMode();

    /**
     * @return the managedServiceIdentityId value.
     */
    Integer managedServiceIdentityId();

    /**
     * @return the minTlsVersion value.
     */
    SupportedTlsVersions minTlsVersion();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the netFrameworkVersion value.
     */
    String netFrameworkVersion();

    /**
     * @return the nodeVersion value.
     */
    String nodeVersion();

    /**
     * @return the numberOfWorkers value.
     */
    Integer numberOfWorkers();

    /**
     * @return the phpVersion value.
     */
    String phpVersion();

    /**
     * @return the publishingUsername value.
     */
    String publishingUsername();

    /**
     * @return the push value.
     */
    PushSettingsInner push();

    /**
     * @return the pythonVersion value.
     */
    String pythonVersion();

    /**
     * @return the remoteDebuggingEnabled value.
     */
    Boolean remoteDebuggingEnabled();

    /**
     * @return the remoteDebuggingVersion value.
     */
    String remoteDebuggingVersion();

    /**
     * @return the requestTracingEnabled value.
     */
    Boolean requestTracingEnabled();

    /**
     * @return the requestTracingExpirationTime value.
     */
    DateTime requestTracingExpirationTime();

    /**
     * @return the scmType value.
     */
    ScmType scmType();

    /**
     * @return the tracingOptions value.
     */
    String tracingOptions();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the use32BitWorkerProcess value.
     */
    Boolean use32BitWorkerProcess();

    /**
     * @return the virtualApplications value.
     */
    List<VirtualApplication> virtualApplications();

    /**
     * @return the vnetName value.
     */
    String vnetName();

    /**
     * @return the webSocketsEnabled value.
     */
    Boolean webSocketsEnabled();

    /**
     * @return the xenonFxVersion value.
     */
    String xenonFxVersion();

    /**
     * @return the xManagedServiceIdentityId value.
     */
    Integer xManagedServiceIdentityId();

}
