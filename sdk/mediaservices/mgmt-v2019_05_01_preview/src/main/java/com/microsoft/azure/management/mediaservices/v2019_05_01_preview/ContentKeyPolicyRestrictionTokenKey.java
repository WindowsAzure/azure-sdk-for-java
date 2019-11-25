/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for Content Key Policy key for token validation. A derived class
 * must be used to create a token key.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("ContentKeyPolicyRestrictionTokenKey")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.ContentKeyPolicySymmetricTokenKey", value = ContentKeyPolicySymmetricTokenKey.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.ContentKeyPolicyRsaTokenKey", value = ContentKeyPolicyRsaTokenKey.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.ContentKeyPolicyX509CertificateTokenKey", value = ContentKeyPolicyX509CertificateTokenKey.class)
})
public class ContentKeyPolicyRestrictionTokenKey {
}
