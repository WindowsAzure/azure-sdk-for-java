/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The json object containing security policy parameters.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SecurityPolicyParameters.class)
@JsonTypeName("SecurityPolicyParameters")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "WebApplicationFirewall", value = SecurityPolicyWebApplicationFirewallParameters.class)
})
public class SecurityPolicyParameters {
}
