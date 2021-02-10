// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Static Site Custom Domain Overview ARM resource. */
@JsonFlatten
@Immutable
public class StaticSiteCustomDomainOverviewArmResourceInner extends ProxyOnlyResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(StaticSiteCustomDomainOverviewArmResourceInner.class);

    /*
     * The domain name for the static site custom domain.
     */
    @JsonProperty(value = "properties.domainName", access = JsonProperty.Access.WRITE_ONLY)
    private String domainName;

    /*
     * The date and time on which the custom domain was created for the static
     * site.
     */
    @JsonProperty(value = "properties.createdOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdOn;

    /**
     * Get the domainName property: The domain name for the static site custom domain.
     *
     * @return the domainName value.
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Get the createdOn property: The date and time on which the custom domain was created for the static site.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime createdOn() {
        return this.createdOn;
    }

    /** {@inheritDoc} */
    @Override
    public StaticSiteCustomDomainOverviewArmResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
