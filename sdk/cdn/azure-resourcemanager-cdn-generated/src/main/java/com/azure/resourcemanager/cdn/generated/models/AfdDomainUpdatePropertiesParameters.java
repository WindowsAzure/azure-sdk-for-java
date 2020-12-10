// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JSON object that contains the properties of the domain to create. */
@Fluent
public class AfdDomainUpdatePropertiesParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AfdDomainUpdatePropertiesParameters.class);

    /*
     * The configuration specifying how to enable HTTPS for the domain - using
     * AzureFrontDoor managed certificate or user's own certificate. If not
     * specified, enabling ssl uses AzureFrontDoor managed certificate by
     * default.
     */
    @JsonProperty(value = "tlsSettings")
    private AfdDomainHttpsParameters tlsSettings;

    /*
     * Resource reference to the Azure DNS zone
     */
    @JsonProperty(value = "azureDnsZone")
    private ResourceReference azureDnsZone;

    /**
     * Get the tlsSettings property: The configuration specifying how to enable HTTPS for the domain - using
     * AzureFrontDoor managed certificate or user's own certificate. If not specified, enabling ssl uses AzureFrontDoor
     * managed certificate by default.
     *
     * @return the tlsSettings value.
     */
    public AfdDomainHttpsParameters tlsSettings() {
        return this.tlsSettings;
    }

    /**
     * Set the tlsSettings property: The configuration specifying how to enable HTTPS for the domain - using
     * AzureFrontDoor managed certificate or user's own certificate. If not specified, enabling ssl uses AzureFrontDoor
     * managed certificate by default.
     *
     * @param tlsSettings the tlsSettings value to set.
     * @return the AfdDomainUpdatePropertiesParameters object itself.
     */
    public AfdDomainUpdatePropertiesParameters withTlsSettings(AfdDomainHttpsParameters tlsSettings) {
        this.tlsSettings = tlsSettings;
        return this;
    }

    /**
     * Get the azureDnsZone property: Resource reference to the Azure DNS zone.
     *
     * @return the azureDnsZone value.
     */
    public ResourceReference azureDnsZone() {
        return this.azureDnsZone;
    }

    /**
     * Set the azureDnsZone property: Resource reference to the Azure DNS zone.
     *
     * @param azureDnsZone the azureDnsZone value to set.
     * @return the AfdDomainUpdatePropertiesParameters object itself.
     */
    public AfdDomainUpdatePropertiesParameters withAzureDnsZone(ResourceReference azureDnsZone) {
        this.azureDnsZone = azureDnsZone;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tlsSettings() != null) {
            tlsSettings().validate();
        }
        if (azureDnsZone() != null) {
            azureDnsZone().validate();
        }
    }
}
