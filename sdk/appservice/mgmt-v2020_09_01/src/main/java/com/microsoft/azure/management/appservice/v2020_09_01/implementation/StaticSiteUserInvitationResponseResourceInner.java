/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2020_09_01.ProxyOnlyResource;

/**
 * Static sites user roles invitation link resource.
 */
@JsonFlatten
public class StaticSiteUserInvitationResponseResourceInner extends ProxyOnlyResource {
    /**
     * The expiration time of the invitation.
     */
    @JsonProperty(value = "properties.expiresOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime expiresOn;

    /**
     * The url for the invitation link.
     */
    @JsonProperty(value = "properties.invitationUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String invitationUrl;

    /**
     * Get the expiration time of the invitation.
     *
     * @return the expiresOn value
     */
    public DateTime expiresOn() {
        return this.expiresOn;
    }

    /**
     * Get the url for the invitation link.
     *
     * @return the invitationUrl value
     */
    public String invitationUrl() {
        return this.invitationUrl;
    }

}
