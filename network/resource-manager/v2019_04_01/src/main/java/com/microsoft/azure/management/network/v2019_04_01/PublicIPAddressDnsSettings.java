/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains FQDN of the DNS record associated with the public IP address.
 */
public class PublicIPAddressDnsSettings {
    /**
     * Gets or sets the Domain name label.The concatenation of the domain name
     * label and the regionalized DNS zone make up the fully qualified domain
     * name associated with the public IP address. If a domain name label is
     * specified, an A DNS record is created for the public IP in the Microsoft
     * Azure DNS system.
     */
    @JsonProperty(value = "domainNameLabel")
    private String domainNameLabel;

    /**
     * Gets the FQDN, Fully qualified domain name of the A DNS record
     * associated with the public IP. This is the concatenation of the
     * domainNameLabel and the regionalized DNS zone.
     */
    @JsonProperty(value = "fqdn")
    private String fqdn;

    /**
     * Gets or Sets the Reverse FQDN. A user-visible, fully qualified domain
     * name that resolves to this public IP address. If the reverseFqdn is
     * specified, then a PTR DNS record is created pointing from the IP address
     * in the in-addr.arpa domain to the reverse FQDN.
     */
    @JsonProperty(value = "reverseFqdn")
    private String reverseFqdn;

    /**
     * Get gets or sets the Domain name label.The concatenation of the domain name label and the regionalized DNS zone make up the fully qualified domain name associated with the public IP address. If a domain name label is specified, an A DNS record is created for the public IP in the Microsoft Azure DNS system.
     *
     * @return the domainNameLabel value
     */
    public String domainNameLabel() {
        return this.domainNameLabel;
    }

    /**
     * Set gets or sets the Domain name label.The concatenation of the domain name label and the regionalized DNS zone make up the fully qualified domain name associated with the public IP address. If a domain name label is specified, an A DNS record is created for the public IP in the Microsoft Azure DNS system.
     *
     * @param domainNameLabel the domainNameLabel value to set
     * @return the PublicIPAddressDnsSettings object itself.
     */
    public PublicIPAddressDnsSettings withDomainNameLabel(String domainNameLabel) {
        this.domainNameLabel = domainNameLabel;
        return this;
    }

    /**
     * Get gets the FQDN, Fully qualified domain name of the A DNS record associated with the public IP. This is the concatenation of the domainNameLabel and the regionalized DNS zone.
     *
     * @return the fqdn value
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set gets the FQDN, Fully qualified domain name of the A DNS record associated with the public IP. This is the concatenation of the domainNameLabel and the regionalized DNS zone.
     *
     * @param fqdn the fqdn value to set
     * @return the PublicIPAddressDnsSettings object itself.
     */
    public PublicIPAddressDnsSettings withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get gets or Sets the Reverse FQDN. A user-visible, fully qualified domain name that resolves to this public IP address. If the reverseFqdn is specified, then a PTR DNS record is created pointing from the IP address in the in-addr.arpa domain to the reverse FQDN.
     *
     * @return the reverseFqdn value
     */
    public String reverseFqdn() {
        return this.reverseFqdn;
    }

    /**
     * Set gets or Sets the Reverse FQDN. A user-visible, fully qualified domain name that resolves to this public IP address. If the reverseFqdn is specified, then a PTR DNS record is created pointing from the IP address in the in-addr.arpa domain to the reverse FQDN.
     *
     * @param reverseFqdn the reverseFqdn value to set
     * @return the PublicIPAddressDnsSettings object itself.
     */
    public PublicIPAddressDnsSettings withReverseFqdn(String reverseFqdn) {
        this.reverseFqdn = reverseFqdn;
        return this;
    }

}
