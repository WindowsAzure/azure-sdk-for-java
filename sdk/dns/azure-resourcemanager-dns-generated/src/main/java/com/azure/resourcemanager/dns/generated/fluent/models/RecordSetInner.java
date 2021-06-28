// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dns.generated.models.ARecord;
import com.azure.resourcemanager.dns.generated.models.AaaaRecord;
import com.azure.resourcemanager.dns.generated.models.CaaRecord;
import com.azure.resourcemanager.dns.generated.models.CnameRecord;
import com.azure.resourcemanager.dns.generated.models.MxRecord;
import com.azure.resourcemanager.dns.generated.models.NsRecord;
import com.azure.resourcemanager.dns.generated.models.PtrRecord;
import com.azure.resourcemanager.dns.generated.models.SoaRecord;
import com.azure.resourcemanager.dns.generated.models.SrvRecord;
import com.azure.resourcemanager.dns.generated.models.TxtRecord;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Describes a DNS record set (a collection of DNS records with the same name and type). */
@JsonFlatten
@Fluent
public class RecordSetInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecordSetInner.class);

    /*
     * The etag of the record set.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * The metadata attached to the record set.
     */
    @JsonProperty(value = "properties.metadata")
    private Map<String, String> metadata;

    /*
     * The TTL (time-to-live) of the records in the record set.
     */
    @JsonProperty(value = "properties.TTL")
    private Long ttl;

    /*
     * Fully qualified domain name of the record set.
     */
    @JsonProperty(value = "properties.fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /*
     * provisioning State of the record set.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * A reference to an azure resource from where the dns resource value is
     * taken.
     */
    @JsonProperty(value = "properties.targetResource")
    private SubResource targetResource;

    /*
     * The list of A records in the record set.
     */
    @JsonProperty(value = "properties.ARecords")
    private List<ARecord> aRecords;

    /*
     * The list of AAAA records in the record set.
     */
    @JsonProperty(value = "properties.AAAARecords")
    private List<AaaaRecord> aaaaRecords;

    /*
     * The list of MX records in the record set.
     */
    @JsonProperty(value = "properties.MXRecords")
    private List<MxRecord> mxRecords;

    /*
     * The list of NS records in the record set.
     */
    @JsonProperty(value = "properties.NSRecords")
    private List<NsRecord> nsRecords;

    /*
     * The list of PTR records in the record set.
     */
    @JsonProperty(value = "properties.PTRRecords")
    private List<PtrRecord> ptrRecords;

    /*
     * The list of SRV records in the record set.
     */
    @JsonProperty(value = "properties.SRVRecords")
    private List<SrvRecord> srvRecords;

    /*
     * The list of TXT records in the record set.
     */
    @JsonProperty(value = "properties.TXTRecords")
    private List<TxtRecord> txtRecords;

    /*
     * The CNAME record in the  record set.
     */
    @JsonProperty(value = "properties.CNAMERecord")
    private CnameRecord cnameRecord;

    /*
     * The SOA record in the record set.
     */
    @JsonProperty(value = "properties.SOARecord")
    private SoaRecord soaRecord;

    /*
     * The list of CAA records in the record set.
     */
    @JsonProperty(value = "properties.caaRecords")
    private List<CaaRecord> caaRecords;

    /**
     * Get the etag property: The etag of the record set.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The etag of the record set.
     *
     * @param etag the etag value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the metadata property: The metadata attached to the record set.
     *
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata attached to the record set.
     *
     * @param metadata the metadata value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the ttl property: The TTL (time-to-live) of the records in the record set.
     *
     * @return the ttl value.
     */
    public Long ttl() {
        return this.ttl;
    }

    /**
     * Set the ttl property: The TTL (time-to-live) of the records in the record set.
     *
     * @param ttl the ttl value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * Get the fqdn property: Fully qualified domain name of the record set.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Get the provisioningState property: provisioning State of the record set.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the targetResource property: A reference to an azure resource from where the dns resource value is taken.
     *
     * @return the targetResource value.
     */
    public SubResource targetResource() {
        return this.targetResource;
    }

    /**
     * Set the targetResource property: A reference to an azure resource from where the dns resource value is taken.
     *
     * @param targetResource the targetResource value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withTargetResource(SubResource targetResource) {
        this.targetResource = targetResource;
        return this;
    }

    /**
     * Get the aRecords property: The list of A records in the record set.
     *
     * @return the aRecords value.
     */
    public List<ARecord> aRecords() {
        return this.aRecords;
    }

    /**
     * Set the aRecords property: The list of A records in the record set.
     *
     * @param aRecords the aRecords value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withARecords(List<ARecord> aRecords) {
        this.aRecords = aRecords;
        return this;
    }

    /**
     * Get the aaaaRecords property: The list of AAAA records in the record set.
     *
     * @return the aaaaRecords value.
     */
    public List<AaaaRecord> aaaaRecords() {
        return this.aaaaRecords;
    }

    /**
     * Set the aaaaRecords property: The list of AAAA records in the record set.
     *
     * @param aaaaRecords the aaaaRecords value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withAaaaRecords(List<AaaaRecord> aaaaRecords) {
        this.aaaaRecords = aaaaRecords;
        return this;
    }

    /**
     * Get the mxRecords property: The list of MX records in the record set.
     *
     * @return the mxRecords value.
     */
    public List<MxRecord> mxRecords() {
        return this.mxRecords;
    }

    /**
     * Set the mxRecords property: The list of MX records in the record set.
     *
     * @param mxRecords the mxRecords value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withMxRecords(List<MxRecord> mxRecords) {
        this.mxRecords = mxRecords;
        return this;
    }

    /**
     * Get the nsRecords property: The list of NS records in the record set.
     *
     * @return the nsRecords value.
     */
    public List<NsRecord> nsRecords() {
        return this.nsRecords;
    }

    /**
     * Set the nsRecords property: The list of NS records in the record set.
     *
     * @param nsRecords the nsRecords value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withNsRecords(List<NsRecord> nsRecords) {
        this.nsRecords = nsRecords;
        return this;
    }

    /**
     * Get the ptrRecords property: The list of PTR records in the record set.
     *
     * @return the ptrRecords value.
     */
    public List<PtrRecord> ptrRecords() {
        return this.ptrRecords;
    }

    /**
     * Set the ptrRecords property: The list of PTR records in the record set.
     *
     * @param ptrRecords the ptrRecords value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withPtrRecords(List<PtrRecord> ptrRecords) {
        this.ptrRecords = ptrRecords;
        return this;
    }

    /**
     * Get the srvRecords property: The list of SRV records in the record set.
     *
     * @return the srvRecords value.
     */
    public List<SrvRecord> srvRecords() {
        return this.srvRecords;
    }

    /**
     * Set the srvRecords property: The list of SRV records in the record set.
     *
     * @param srvRecords the srvRecords value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withSrvRecords(List<SrvRecord> srvRecords) {
        this.srvRecords = srvRecords;
        return this;
    }

    /**
     * Get the txtRecords property: The list of TXT records in the record set.
     *
     * @return the txtRecords value.
     */
    public List<TxtRecord> txtRecords() {
        return this.txtRecords;
    }

    /**
     * Set the txtRecords property: The list of TXT records in the record set.
     *
     * @param txtRecords the txtRecords value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withTxtRecords(List<TxtRecord> txtRecords) {
        this.txtRecords = txtRecords;
        return this;
    }

    /**
     * Get the cnameRecord property: The CNAME record in the record set.
     *
     * @return the cnameRecord value.
     */
    public CnameRecord cnameRecord() {
        return this.cnameRecord;
    }

    /**
     * Set the cnameRecord property: The CNAME record in the record set.
     *
     * @param cnameRecord the cnameRecord value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withCnameRecord(CnameRecord cnameRecord) {
        this.cnameRecord = cnameRecord;
        return this;
    }

    /**
     * Get the soaRecord property: The SOA record in the record set.
     *
     * @return the soaRecord value.
     */
    public SoaRecord soaRecord() {
        return this.soaRecord;
    }

    /**
     * Set the soaRecord property: The SOA record in the record set.
     *
     * @param soaRecord the soaRecord value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withSoaRecord(SoaRecord soaRecord) {
        this.soaRecord = soaRecord;
        return this;
    }

    /**
     * Get the caaRecords property: The list of CAA records in the record set.
     *
     * @return the caaRecords value.
     */
    public List<CaaRecord> caaRecords() {
        return this.caaRecords;
    }

    /**
     * Set the caaRecords property: The list of CAA records in the record set.
     *
     * @param caaRecords the caaRecords value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withCaaRecords(List<CaaRecord> caaRecords) {
        this.caaRecords = caaRecords;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (aRecords() != null) {
            aRecords().forEach(e -> e.validate());
        }
        if (aaaaRecords() != null) {
            aaaaRecords().forEach(e -> e.validate());
        }
        if (mxRecords() != null) {
            mxRecords().forEach(e -> e.validate());
        }
        if (nsRecords() != null) {
            nsRecords().forEach(e -> e.validate());
        }
        if (ptrRecords() != null) {
            ptrRecords().forEach(e -> e.validate());
        }
        if (srvRecords() != null) {
            srvRecords().forEach(e -> e.validate());
        }
        if (txtRecords() != null) {
            txtRecords().forEach(e -> e.validate());
        }
        if (cnameRecord() != null) {
            cnameRecord().validate();
        }
        if (soaRecord() != null) {
            soaRecord().validate();
        }
        if (caaRecords() != null) {
            caaRecords().forEach(e -> e.validate());
        }
    }
}
