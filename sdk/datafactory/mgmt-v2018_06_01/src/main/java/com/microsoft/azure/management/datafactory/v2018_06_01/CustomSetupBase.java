/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The base definition of the custom setup.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = CustomSetupBase.class)
@JsonTypeName("CustomSetupBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ComponentSetup", value = ComponentSetup.class),
    @JsonSubTypes.Type(name = "EnvironmentVariableSetup", value = EnvironmentVariableSetup.class),
    @JsonSubTypes.Type(name = "CmdkeySetup", value = CmdkeySetup.class)
})
public class CustomSetupBase {
}
