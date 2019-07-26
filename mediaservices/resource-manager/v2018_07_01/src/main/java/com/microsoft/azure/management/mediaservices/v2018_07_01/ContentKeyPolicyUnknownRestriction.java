/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents a ContentKeyPolicyRestriction that is unavailable in the current
 * API version.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = ContentKeyPolicyUnknownRestriction.class)
@JsonTypeName("#Microsoft.Media.ContentKeyPolicyUnknownRestriction")
public class ContentKeyPolicyUnknownRestriction extends ContentKeyPolicyRestriction {
}
