// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specifies Windows operating system settings on the virtual machine. */
@Fluent
public final class WindowsConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WindowsConfiguration.class);

    /*
     * Indicates whether virtual machine agent should be provisioned on the
     * virtual machine. <br><br> When this property is not specified in the
     * request body, default behavior is to set it to true.  This will ensure
     * that VM Agent is installed on the VM so that extensions can be added to
     * the VM later.
     */
    @JsonProperty(value = "provisionVMAgent")
    private Boolean provisionVMAgent;

    /*
     * Indicates whether Automatic Updates is enabled for the Windows virtual
     * machine. Default value is true. <br><br> For virtual machine scale sets,
     * this property can be updated and updates will take effect on OS
     * reprovisioning.
     */
    @JsonProperty(value = "enableAutomaticUpdates")
    private Boolean enableAutomaticUpdates;

    /*
     * Specifies the time zone of the virtual machine. e.g. "Pacific Standard
     * Time". <br><br> Possible values can be
     * [TimeZoneInfo.Id](https://docs.microsoft.com/en-us/dotnet/api/system.timezoneinfo.id?#System_TimeZoneInfo_Id)
     * value from time zones returned by
     * [TimeZoneInfo.GetSystemTimeZones](https://docs.microsoft.com/en-us/dotnet/api/system.timezoneinfo.getsystemtimezones).
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /*
     * Specifies additional base-64 encoded XML formatted information that can
     * be included in the Unattend.xml file, which is used by Windows Setup.
     */
    @JsonProperty(value = "additionalUnattendContent")
    private List<AdditionalUnattendContent> additionalUnattendContent;

    /*
     * Specifies the Windows Remote Management listeners. This enables remote
     * Windows PowerShell.
     */
    @JsonProperty(value = "winRM")
    private WinRMConfiguration winRM;

    /**
     * Get the provisionVMAgent property: Indicates whether virtual machine agent should be provisioned on the virtual
     * machine. &lt;br&gt;&lt;br&gt; When this property is not specified in the request body, default behavior is to set
     * it to true. This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM
     * later.
     *
     * @return the provisionVMAgent value.
     */
    public Boolean provisionVMAgent() {
        return this.provisionVMAgent;
    }

    /**
     * Set the provisionVMAgent property: Indicates whether virtual machine agent should be provisioned on the virtual
     * machine. &lt;br&gt;&lt;br&gt; When this property is not specified in the request body, default behavior is to set
     * it to true. This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM
     * later.
     *
     * @param provisionVMAgent the provisionVMAgent value to set.
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withProvisionVMAgent(Boolean provisionVMAgent) {
        this.provisionVMAgent = provisionVMAgent;
        return this;
    }

    /**
     * Get the enableAutomaticUpdates property: Indicates whether Automatic Updates is enabled for the Windows virtual
     * machine. Default value is true. &lt;br&gt;&lt;br&gt; For virtual machine scale sets, this property can be updated
     * and updates will take effect on OS reprovisioning.
     *
     * @return the enableAutomaticUpdates value.
     */
    public Boolean enableAutomaticUpdates() {
        return this.enableAutomaticUpdates;
    }

    /**
     * Set the enableAutomaticUpdates property: Indicates whether Automatic Updates is enabled for the Windows virtual
     * machine. Default value is true. &lt;br&gt;&lt;br&gt; For virtual machine scale sets, this property can be updated
     * and updates will take effect on OS reprovisioning.
     *
     * @param enableAutomaticUpdates the enableAutomaticUpdates value to set.
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withEnableAutomaticUpdates(Boolean enableAutomaticUpdates) {
        this.enableAutomaticUpdates = enableAutomaticUpdates;
        return this;
    }

    /**
     * Get the timeZone property: Specifies the time zone of the virtual machine. e.g. "Pacific Standard Time".
     * &lt;br&gt;&lt;br&gt; Possible values can be
     * [TimeZoneInfo.Id](https://docs.microsoft.com/en-us/dotnet/api/system.timezoneinfo.id?#System_TimeZoneInfo_Id)
     * value from time zones returned by
     * [TimeZoneInfo.GetSystemTimeZones](https://docs.microsoft.com/en-us/dotnet/api/system.timezoneinfo.getsystemtimezones).
     *
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: Specifies the time zone of the virtual machine. e.g. "Pacific Standard Time".
     * &lt;br&gt;&lt;br&gt; Possible values can be
     * [TimeZoneInfo.Id](https://docs.microsoft.com/en-us/dotnet/api/system.timezoneinfo.id?#System_TimeZoneInfo_Id)
     * value from time zones returned by
     * [TimeZoneInfo.GetSystemTimeZones](https://docs.microsoft.com/en-us/dotnet/api/system.timezoneinfo.getsystemtimezones).
     *
     * @param timeZone the timeZone value to set.
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the additionalUnattendContent property: Specifies additional base-64 encoded XML formatted information that
     * can be included in the Unattend.xml file, which is used by Windows Setup.
     *
     * @return the additionalUnattendContent value.
     */
    public List<AdditionalUnattendContent> additionalUnattendContent() {
        return this.additionalUnattendContent;
    }

    /**
     * Set the additionalUnattendContent property: Specifies additional base-64 encoded XML formatted information that
     * can be included in the Unattend.xml file, which is used by Windows Setup.
     *
     * @param additionalUnattendContent the additionalUnattendContent value to set.
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withAdditionalUnattendContent(
        List<AdditionalUnattendContent> additionalUnattendContent) {
        this.additionalUnattendContent = additionalUnattendContent;
        return this;
    }

    /**
     * Get the winRM property: Specifies the Windows Remote Management listeners. This enables remote Windows
     * PowerShell.
     *
     * @return the winRM value.
     */
    public WinRMConfiguration winRM() {
        return this.winRM;
    }

    /**
     * Set the winRM property: Specifies the Windows Remote Management listeners. This enables remote Windows
     * PowerShell.
     *
     * @param winRM the winRM value to set.
     * @return the WindowsConfiguration object itself.
     */
    public WindowsConfiguration withWinRM(WinRMConfiguration winRM) {
        this.winRM = winRM;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (additionalUnattendContent() != null) {
            additionalUnattendContent().forEach(e -> e.validate());
        }
        if (winRM() != null) {
            winRM().validate();
        }
    }
}
