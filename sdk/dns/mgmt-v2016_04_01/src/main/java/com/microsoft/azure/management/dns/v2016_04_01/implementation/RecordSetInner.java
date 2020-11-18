/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.dns.v2016_04_01.implementation;

import java.util.Map;
import java.util.List;
import com.microsoft.azure.management.dns.v2016_04_01.ARecord;
import com.microsoft.azure.management.dns.v2016_04_01.AaaaRecord;
import com.microsoft.azure.management.dns.v2016_04_01.MxRecord;
import com.microsoft.azure.management.dns.v2016_04_01.NsRecord;
import com.microsoft.azure.management.dns.v2016_04_01.PtrRecord;
import com.microsoft.azure.management.dns.v2016_04_01.SrvRecord;
import com.microsoft.azure.management.dns.v2016_04_01.TxtRecord;
import com.microsoft.azure.management.dns.v2016_04_01.CnameRecord;
import com.microsoft.azure.management.dns.v2016_04_01.SoaRecord;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes a DNS record set (a collection of DNS records with the same name
 * and type).
 */
@JsonFlatten
public class RecordSetInner {
    /**
     * The ID of the record set.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The name of the record set.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The type of the record set.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The etag of the record set.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * The metadata attached to the record set.
     */
    @JsonProperty(value = "properties.metadata")
    private Map<String, String> metadata;

    /**
     * The TTL (time-to-live) of the records in the record set.
     */
    @JsonProperty(value = "properties.TTL")
    private Long tTL;

    /**
     * Fully qualified domain name of the record set.
     */
    @JsonProperty(value = "properties.fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /**
     * The list of A records in the record set.
     */
    @JsonProperty(value = "properties.ARecords")
    private List<ARecord> aRecords;

    /**
     * The list of AAAA records in the record set.
     */
    @JsonProperty(value = "properties.AAAARecords")
    private List<AaaaRecord> aaaaRecords;

    /**
     * The list of MX records in the record set.
     */
    @JsonProperty(value = "properties.MXRecords")
    private List<MxRecord> mxRecords;

    /**
     * The list of NS records in the record set.
     */
    @JsonProperty(value = "properties.NSRecords")
    private List<NsRecord> nsRecords;

    /**
     * The list of PTR records in the record set.
     */
    @JsonProperty(value = "properties.PTRRecords")
    private List<PtrRecord> ptrRecords;

    /**
     * The list of SRV records in the record set.
     */
    @JsonProperty(value = "properties.SRVRecords")
    private List<SrvRecord> srvRecords;

    /**
     * The list of TXT records in the record set.
     */
    @JsonProperty(value = "properties.TXTRecords")
    private List<TxtRecord> txtRecords;

    /**
     * The CNAME record in the  record set.
     */
    @JsonProperty(value = "properties.CNAMERecord")
    private CnameRecord cnameRecord;

    /**
     * The SOA record in the record set.
     */
    @JsonProperty(value = "properties.SOARecord")
    private SoaRecord soaRecord;

    /**
     * Get the ID of the record set.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID of the record set.
     *
     * @param id the id value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name of the record set.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the record set.
     *
     * @param name the name value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type of the record set.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the record set.
     *
     * @param type the type value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the etag of the record set.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag of the record set.
     *
     * @param etag the etag value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the metadata attached to the record set.
     *
     * @return the metadata value
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata attached to the record set.
     *
     * @param metadata the metadata value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the TTL (time-to-live) of the records in the record set.
     *
     * @return the tTL value
     */
    public Long tTL() {
        return this.tTL;
    }

    /**
     * Set the TTL (time-to-live) of the records in the record set.
     *
     * @param tTL the tTL value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withTTL(Long tTL) {
        this.tTL = tTL;
        return this;
    }

    /**
     * Get fully qualified domain name of the record set.
     *
     * @return the fqdn value
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Get the list of A records in the record set.
     *
     * @return the aRecords value
     */
    public List<ARecord> aRecords() {
        return this.aRecords;
    }

    /**
     * Set the list of A records in the record set.
     *
     * @param aRecords the aRecords value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withARecords(List<ARecord> aRecords) {
        this.aRecords = aRecords;
        return this;
    }

    /**
     * Get the list of AAAA records in the record set.
     *
     * @return the aaaaRecords value
     */
    public List<AaaaRecord> aaaaRecords() {
        return this.aaaaRecords;
    }

    /**
     * Set the list of AAAA records in the record set.
     *
     * @param aaaaRecords the aaaaRecords value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withAaaaRecords(List<AaaaRecord> aaaaRecords) {
        this.aaaaRecords = aaaaRecords;
        return this;
    }

    /**
     * Get the list of MX records in the record set.
     *
     * @return the mxRecords value
     */
    public List<MxRecord> mxRecords() {
        return this.mxRecords;
    }

    /**
     * Set the list of MX records in the record set.
     *
     * @param mxRecords the mxRecords value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withMxRecords(List<MxRecord> mxRecords) {
        this.mxRecords = mxRecords;
        return this;
    }

    /**
     * Get the list of NS records in the record set.
     *
     * @return the nsRecords value
     */
    public List<NsRecord> nsRecords() {
        return this.nsRecords;
    }

    /**
     * Set the list of NS records in the record set.
     *
     * @param nsRecords the nsRecords value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withNsRecords(List<NsRecord> nsRecords) {
        this.nsRecords = nsRecords;
        return this;
    }

    /**
     * Get the list of PTR records in the record set.
     *
     * @return the ptrRecords value
     */
    public List<PtrRecord> ptrRecords() {
        return this.ptrRecords;
    }

    /**
     * Set the list of PTR records in the record set.
     *
     * @param ptrRecords the ptrRecords value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withPtrRecords(List<PtrRecord> ptrRecords) {
        this.ptrRecords = ptrRecords;
        return this;
    }

    /**
     * Get the list of SRV records in the record set.
     *
     * @return the srvRecords value
     */
    public List<SrvRecord> srvRecords() {
        return this.srvRecords;
    }

    /**
     * Set the list of SRV records in the record set.
     *
     * @param srvRecords the srvRecords value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withSrvRecords(List<SrvRecord> srvRecords) {
        this.srvRecords = srvRecords;
        return this;
    }

    /**
     * Get the list of TXT records in the record set.
     *
     * @return the txtRecords value
     */
    public List<TxtRecord> txtRecords() {
        return this.txtRecords;
    }

    /**
     * Set the list of TXT records in the record set.
     *
     * @param txtRecords the txtRecords value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withTxtRecords(List<TxtRecord> txtRecords) {
        this.txtRecords = txtRecords;
        return this;
    }

    /**
     * Get the CNAME record in the  record set.
     *
     * @return the cnameRecord value
     */
    public CnameRecord cnameRecord() {
        return this.cnameRecord;
    }

    /**
     * Set the CNAME record in the  record set.
     *
     * @param cnameRecord the cnameRecord value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withCnameRecord(CnameRecord cnameRecord) {
        this.cnameRecord = cnameRecord;
        return this;
    }

    /**
     * Get the SOA record in the record set.
     *
     * @return the soaRecord value
     */
    public SoaRecord soaRecord() {
        return this.soaRecord;
    }

    /**
     * Set the SOA record in the record set.
     *
     * @param soaRecord the soaRecord value to set
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withSoaRecord(SoaRecord soaRecord) {
        this.soaRecord = soaRecord;
        return this;
    }

}
