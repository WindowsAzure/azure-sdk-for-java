/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies Windows operating system settings on the virtual machine.
 */
public class WindowsConfiguration {
    /**
     * Indicates whether virtual machine agent should be provisioned on the
     * virtual machine. &lt;br&gt;&lt;br&gt; When this property is not
     * specified in the request body, default behavior is to set it to true.
     * This will ensure that VM Agent is installed on the VM so that extensions
     * can be added to the VM later.
     */
    @JsonProperty(value = "provisionVMAgent")
    private Boolean provisionVMAgent;

    /**
     * Indicates whether Automatic Updates is enabled for the Windows virtual
     * machine. Default value is true. &lt;br&gt;&lt;br&gt; For virtual machine
     * scale sets, this property can be updated and updates will take effect on
     * OS reprovisioning.
     */
    @JsonProperty(value = "enableAutomaticUpdates")
    private Boolean enableAutomaticUpdates;

    /**
     * Specifies the time zone of the virtual machine. e.g. "Pacific Standard
     * Time". &lt;br&gt;&lt;br&gt; Possible values can be
     * [TimeZoneInfo.Id](https://docs.microsoft.com/en-us/dotnet/api/system.timezoneinfo.id?#System_TimeZoneInfo_Id)
     * value from time zones returned by
     * [TimeZoneInfo.GetSystemTimeZones](https://docs.microsoft.com/en-us/dotnet/api/system.timezoneinfo.getsystemtimezones).
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /**
     * Specifies additional base-64 encoded XML formatted information that can
     * be included in the Unattend.xml file, which is used by Windows Setup.
     */
    @JsonProperty(value = "additionalUnattendContent")
    private List<AdditionalUnattendContent> additionalUnattendContent;

    /**
     * Specifies settings related to in-guest patching (KBs).
     */
    @JsonProperty(value = "patchSettings")
    private PatchSettings patchSettings;

    /**
     * Specifies the Windows Remote Management listeners. This enables remote
     * Windows PowerShell.
     */
    @JsonProperty(value = "winRM")
    private WinRMConfiguration winRM;

    /**
     * Get indicates whether virtual machine agent should be provisioned on the virtual machine. &lt;br&gt;&lt;br&gt; When this property is not specified in the request body, default behavior is to set it to true.  This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
     *
     * @return the provisionVMAgent value
     */
    public Boolean provisionVMAgent() {
        return this.provisionVMAgent;
    }

    /**
     * Set indicates whether virtual machine agent should be provisioned on the virtual machine. &lt;br&gt;&lt;br&gt; When this property is not specified in the request body, default behavior is to set it to true.  This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
     *
     * @param provisionVMAgent the provisionVMAgent value to set
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withProvisionVMAgent(Boolean provisionVMAgent) {
        this.provisionVMAgent = provisionVMAgent;
        return this;
    }

    /**
     * Get indicates whether Automatic Updates is enabled for the Windows virtual machine. Default value is true. &lt;br&gt;&lt;br&gt; For virtual machine scale sets, this property can be updated and updates will take effect on OS reprovisioning.
     *
     * @return the enableAutomaticUpdates value
     */
    public Boolean enableAutomaticUpdates() {
        return this.enableAutomaticUpdates;
    }

    /**
     * Set indicates whether Automatic Updates is enabled for the Windows virtual machine. Default value is true. &lt;br&gt;&lt;br&gt; For virtual machine scale sets, this property can be updated and updates will take effect on OS reprovisioning.
     *
     * @param enableAutomaticUpdates the enableAutomaticUpdates value to set
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withEnableAutomaticUpdates(Boolean enableAutomaticUpdates) {
        this.enableAutomaticUpdates = enableAutomaticUpdates;
        return this;
    }

    /**
     * Get specifies the time zone of the virtual machine. e.g. "Pacific Standard Time". &lt;br&gt;&lt;br&gt; Possible values can be [TimeZoneInfo.Id](https://docs.microsoft.com/en-us/dotnet/api/system.timezoneinfo.id?#System_TimeZoneInfo_Id) value from time zones returned by [TimeZoneInfo.GetSystemTimeZones](https://docs.microsoft.com/en-us/dotnet/api/system.timezoneinfo.getsystemtimezones).
     *
     * @return the timeZone value
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set specifies the time zone of the virtual machine. e.g. "Pacific Standard Time". &lt;br&gt;&lt;br&gt; Possible values can be [TimeZoneInfo.Id](https://docs.microsoft.com/en-us/dotnet/api/system.timezoneinfo.id?#System_TimeZoneInfo_Id) value from time zones returned by [TimeZoneInfo.GetSystemTimeZones](https://docs.microsoft.com/en-us/dotnet/api/system.timezoneinfo.getsystemtimezones).
     *
     * @param timeZone the timeZone value to set
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get specifies additional base-64 encoded XML formatted information that can be included in the Unattend.xml file, which is used by Windows Setup.
     *
     * @return the additionalUnattendContent value
     */
    public List<AdditionalUnattendContent> additionalUnattendContent() {
        return this.additionalUnattendContent;
    }

    /**
     * Set specifies additional base-64 encoded XML formatted information that can be included in the Unattend.xml file, which is used by Windows Setup.
     *
     * @param additionalUnattendContent the additionalUnattendContent value to set
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withAdditionalUnattendContent(List<AdditionalUnattendContent> additionalUnattendContent) {
        this.additionalUnattendContent = additionalUnattendContent;
        return this;
    }

    /**
     * Get specifies settings related to in-guest patching (KBs).
     *
     * @return the patchSettings value
     */
    public PatchSettings patchSettings() {
        return this.patchSettings;
    }

    /**
     * Set specifies settings related to in-guest patching (KBs).
     *
     * @param patchSettings the patchSettings value to set
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withPatchSettings(PatchSettings patchSettings) {
        this.patchSettings = patchSettings;
        return this;
    }

    /**
     * Get specifies the Windows Remote Management listeners. This enables remote Windows PowerShell.
     *
     * @return the winRM value
     */
    public WinRMConfiguration winRM() {
        return this.winRM;
    }

    /**
     * Set specifies the Windows Remote Management listeners. This enables remote Windows PowerShell.
     *
     * @param winRM the winRM value to set
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withWinRM(WinRMConfiguration winRM) {
        this.winRM = winRM;
        return this;
    }

}
