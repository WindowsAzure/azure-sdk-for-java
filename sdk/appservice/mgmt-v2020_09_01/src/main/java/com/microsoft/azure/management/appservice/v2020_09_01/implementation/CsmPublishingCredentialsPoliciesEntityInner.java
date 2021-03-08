/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2020_09_01.ProxyOnlyResource;

/**
 * Publishing Credentials Policies parameters.
 */
@JsonFlatten
public class CsmPublishingCredentialsPoliciesEntityInner extends ProxyOnlyResource {
    /**
     * &lt;code&gt;true&lt;/code&gt; to allow access to a publishing method;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "properties.allow", required = true)
    private boolean allow;

    /**
     * Get &lt;code&gt;true&lt;/code&gt; to allow access to a publishing method; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the allow value
     */
    public boolean allow() {
        return this.allow;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; to allow access to a publishing method; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param allow the allow value to set
     * @return the CsmPublishingCredentialsPoliciesEntityInner object itself.
     */
    public CsmPublishingCredentialsPoliciesEntityInner withAllow(boolean allow) {
        this.allow = allow;
        return this;
    }

}
