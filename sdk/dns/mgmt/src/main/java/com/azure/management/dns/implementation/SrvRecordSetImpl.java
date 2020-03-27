/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.azure.management.dns.implementation;

import com.azure.management.dns.models.RecordSetInner;
import com.azure.management.dns.RecordType;
import com.azure.management.dns.SrvRecord;
import com.azure.management.dns.SrvRecordSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Implementation of SrvRecordSet.
 */
class SrvRecordSetImpl
        extends DnsRecordSetImpl
        implements SrvRecordSet {
    SrvRecordSetImpl(final String name, final DnsZoneImpl parent, final RecordSetInner innerModel) {
        super(name, RecordType.SRV.toString(), parent, innerModel);
    }

    static SrvRecordSetImpl newRecordSet(final String name, final DnsZoneImpl parent) {
        return new SrvRecordSetImpl(name, parent,
                new RecordSetInner()
                        .withSrvRecords(new ArrayList<>()));
    }

    @Override
    public List<SrvRecord> records() {
        if (this.inner().srvRecords() != null) {
            return Collections.unmodifiableList(this.inner().srvRecords());
        }
        return Collections.unmodifiableList(new ArrayList<>());
    }

    @Override
    protected RecordSetInner prepareForUpdate(RecordSetInner resource) {
        if (this.inner().srvRecords() != null && this.inner().srvRecords().size() > 0) {
            if (resource.srvRecords() == null) {
                resource.withSrvRecords(new ArrayList<>());
            }

            resource.srvRecords().addAll(this.inner().srvRecords());
            this.inner().srvRecords().clear();
        }

        if (this.recordSetRemoveInfo.srvRecords().size() > 0) {
            if (resource.srvRecords() != null) {
                for (SrvRecord recordToRemove : this.recordSetRemoveInfo.srvRecords()) {
                    for (SrvRecord record : resource.srvRecords()) {
                        if (record.target().equalsIgnoreCase(recordToRemove.target())
                                && (record.port().intValue() == recordToRemove.port().intValue())
                                && (record.weight().intValue() == recordToRemove.weight().intValue())
                                && (record.priority().intValue() == recordToRemove.priority().intValue())) {
                            resource.srvRecords().remove(record);
                            break;
                        }
                    }
                }
            }
            this.recordSetRemoveInfo.srvRecords().clear();
        }
        return resource;
    }
}
