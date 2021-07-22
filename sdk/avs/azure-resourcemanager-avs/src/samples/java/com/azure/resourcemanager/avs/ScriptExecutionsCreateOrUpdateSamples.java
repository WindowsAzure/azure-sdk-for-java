// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.resourcemanager.avs.models.ScriptSecureStringExecutionParameter;
import com.azure.resourcemanager.avs.models.ScriptStringExecutionParameter;
import java.util.Arrays;

/** Samples for ScriptExecutions CreateOrUpdate. */
public final class ScriptExecutionsCreateOrUpdateSamples {
    /**
     * Sample code: ScriptExecutions_CreateOrUpdate.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void scriptExecutionsCreateOrUpdate(com.azure.resourcemanager.avs.AvsManager avsManager) {
        avsManager
            .scriptExecutions()
            .define("addSsoServer")
            .withExistingPrivateCloud("group1", "cloud1")
            .withScriptCmdletId(
                "/subscriptions/{subscription-id}/resourceGroups/group1/providers/Microsoft.AVS/privateClouds/cloud1/scriptPackages/AVS.PowerCommands@1.0.0/scriptCmdlets/New-SsoExternalIdentitySource")
            .withParameters(
                Arrays
                    .asList(
                        new ScriptStringExecutionParameter()
                            .withName("DomainName")
                            .withValue("placeholderDomain.local"),
                        new ScriptStringExecutionParameter()
                            .withName("BaseUserDN")
                            .withValue("DC=placeholder, DC=placeholder")))
            .withHiddenParameters(
                Arrays
                    .asList(
                        new ScriptSecureStringExecutionParameter()
                            .withName("Password")
                            .withSecureValue("PlaceholderPassword")))
            .withTimeout("P0Y0M0DT0H60M60S")
            .withRetention("P0Y0M60DT0H60M60S")
            .create();
    }
}
