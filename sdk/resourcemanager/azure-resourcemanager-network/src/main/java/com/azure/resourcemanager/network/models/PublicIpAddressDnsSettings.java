// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains FQDN of the DNS record associated with the public IP address. */
@Fluent
public final class PublicIpAddressDnsSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PublicIpAddressDnsSettings.class);

    /*
     * The domain name label. The concatenation of the domain name label and
     * the regionalized DNS zone make up the fully qualified domain name
     * associated with the public IP address. If a domain name label is
     * specified, an A DNS record is created for the public IP in the Microsoft
     * Azure DNS system.
     */
    @JsonProperty(value = "domainNameLabel")
    private String domainNameLabel;

    /*
     * The Fully Qualified Domain Name of the A DNS record associated with the
     * public IP. This is the concatenation of the domainNameLabel and the
     * regionalized DNS zone.
     */
    @JsonProperty(value = "fqdn")
    private String fqdn;

    /*
     * The reverse FQDN. A user-visible, fully qualified domain name that
     * resolves to this public IP address. If the reverseFqdn is specified,
     * then a PTR DNS record is created pointing from the IP address in the
     * in-addr.arpa domain to the reverse FQDN.
     */
    @JsonProperty(value = "reverseFqdn")
    private String reverseFqdn;

    /**
     * Get the domainNameLabel property: The domain name label. The concatenation of the domain name label and the
     * regionalized DNS zone make up the fully qualified domain name associated with the public IP address. If a domain
     * name label is specified, an A DNS record is created for the public IP in the Microsoft Azure DNS system.
     *
     * @return the domainNameLabel value.
     */
    public String domainNameLabel() {
        return this.domainNameLabel;
    }

    /**
     * Set the domainNameLabel property: The domain name label. The concatenation of the domain name label and the
     * regionalized DNS zone make up the fully qualified domain name associated with the public IP address. If a domain
     * name label is specified, an A DNS record is created for the public IP in the Microsoft Azure DNS system.
     *
     * @param domainNameLabel the domainNameLabel value to set.
     * @return the PublicIpAddressDnsSettings object itself.
     */
    public PublicIpAddressDnsSettings withDomainNameLabel(String domainNameLabel) {
        this.domainNameLabel = domainNameLabel;
        return this;
    }

    /**
     * Get the fqdn property: The Fully Qualified Domain Name of the A DNS record associated with the public IP. This is
     * the concatenation of the domainNameLabel and the regionalized DNS zone.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set the fqdn property: The Fully Qualified Domain Name of the A DNS record associated with the public IP. This is
     * the concatenation of the domainNameLabel and the regionalized DNS zone.
     *
     * @param fqdn the fqdn value to set.
     * @return the PublicIpAddressDnsSettings object itself.
     */
    public PublicIpAddressDnsSettings withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the reverseFqdn property: The reverse FQDN. A user-visible, fully qualified domain name that resolves to this
     * public IP address. If the reverseFqdn is specified, then a PTR DNS record is created pointing from the IP address
     * in the in-addr.arpa domain to the reverse FQDN.
     *
     * @return the reverseFqdn value.
     */
    public String reverseFqdn() {
        return this.reverseFqdn;
    }

    /**
     * Set the reverseFqdn property: The reverse FQDN. A user-visible, fully qualified domain name that resolves to this
     * public IP address. If the reverseFqdn is specified, then a PTR DNS record is created pointing from the IP address
     * in the in-addr.arpa domain to the reverse FQDN.
     *
     * @param reverseFqdn the reverseFqdn value to set.
     * @return the PublicIpAddressDnsSettings object itself.
     */
    public PublicIpAddressDnsSettings withReverseFqdn(String reverseFqdn) {
        this.reverseFqdn = reverseFqdn;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
