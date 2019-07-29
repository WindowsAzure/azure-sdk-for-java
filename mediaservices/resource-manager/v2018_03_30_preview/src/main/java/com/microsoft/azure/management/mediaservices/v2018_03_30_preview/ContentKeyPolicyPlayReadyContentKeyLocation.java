/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for content key ID location. A derived class must be used to
 * represent the location.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = ContentKeyPolicyPlayReadyContentKeyLocation.class)
@JsonTypeName("ContentKeyPolicyPlayReadyContentKeyLocation")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader", value = ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier", value = ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifier.class)
})
public class ContentKeyPolicyPlayReadyContentKeyLocation {
}
