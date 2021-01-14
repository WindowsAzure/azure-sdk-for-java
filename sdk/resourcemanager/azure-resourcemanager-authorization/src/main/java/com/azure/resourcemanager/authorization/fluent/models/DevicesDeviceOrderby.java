// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DevicesDeviceOrderby. */
public final class DevicesDeviceOrderby extends ExpandableStringEnum<DevicesDeviceOrderby> {
    /** Static value id for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby ID = fromString("id");

    /** Static value id desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby ID_DESC = fromString("id desc");

    /** Static value deletedDateTime for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby DELETED_DATE_TIME = fromString("deletedDateTime");

    /** Static value deletedDateTime desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby DELETED_DATE_TIME_DESC = fromString("deletedDateTime desc");

    /** Static value accountEnabled for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby ACCOUNT_ENABLED = fromString("accountEnabled");

    /** Static value accountEnabled desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby ACCOUNT_ENABLED_DESC = fromString("accountEnabled desc");

    /** Static value alternativeSecurityIds for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby ALTERNATIVE_SECURITY_IDS = fromString("alternativeSecurityIds");

    /** Static value alternativeSecurityIds desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby ALTERNATIVE_SECURITY_IDS_DESC = fromString("alternativeSecurityIds desc");

    /** Static value approximateLastSignInDateTime for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby APPROXIMATE_LAST_SIGN_IN_DATE_TIME =
        fromString("approximateLastSignInDateTime");

    /** Static value approximateLastSignInDateTime desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby APPROXIMATE_LAST_SIGN_IN_DATE_TIME_DESC =
        fromString("approximateLastSignInDateTime desc");

    /** Static value complianceExpirationDateTime for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby COMPLIANCE_EXPIRATION_DATE_TIME =
        fromString("complianceExpirationDateTime");

    /** Static value complianceExpirationDateTime desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby COMPLIANCE_EXPIRATION_DATE_TIME_DESC =
        fromString("complianceExpirationDateTime desc");

    /** Static value deviceId for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby DEVICE_ID = fromString("deviceId");

    /** Static value deviceId desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby DEVICE_ID_DESC = fromString("deviceId desc");

    /** Static value deviceMetadata for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby DEVICE_METADATA = fromString("deviceMetadata");

    /** Static value deviceMetadata desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby DEVICE_METADATA_DESC = fromString("deviceMetadata desc");

    /** Static value deviceVersion for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby DEVICE_VERSION = fromString("deviceVersion");

    /** Static value deviceVersion desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby DEVICE_VERSION_DESC = fromString("deviceVersion desc");

    /** Static value displayName for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby DISPLAY_NAME = fromString("displayName");

    /** Static value displayName desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby DISPLAY_NAME_DESC = fromString("displayName desc");

    /** Static value isCompliant for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby IS_COMPLIANT = fromString("isCompliant");

    /** Static value isCompliant desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby IS_COMPLIANT_DESC = fromString("isCompliant desc");

    /** Static value isManaged for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby IS_MANAGED = fromString("isManaged");

    /** Static value isManaged desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby IS_MANAGED_DESC = fromString("isManaged desc");

    /** Static value mdmAppId for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby MDM_APP_ID = fromString("mdmAppId");

    /** Static value mdmAppId desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby MDM_APP_ID_DESC = fromString("mdmAppId desc");

    /** Static value onPremisesLastSyncDateTime for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby ON_PREMISES_LAST_SYNC_DATE_TIME = fromString("onPremisesLastSyncDateTime");

    /** Static value onPremisesLastSyncDateTime desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby ON_PREMISES_LAST_SYNC_DATE_TIME_DESC =
        fromString("onPremisesLastSyncDateTime desc");

    /** Static value onPremisesSyncEnabled for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby ON_PREMISES_SYNC_ENABLED = fromString("onPremisesSyncEnabled");

    /** Static value onPremisesSyncEnabled desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby ON_PREMISES_SYNC_ENABLED_DESC = fromString("onPremisesSyncEnabled desc");

    /** Static value operatingSystem for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby OPERATING_SYSTEM = fromString("operatingSystem");

    /** Static value operatingSystem desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby OPERATING_SYSTEM_DESC = fromString("operatingSystem desc");

    /** Static value operatingSystemVersion for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby OPERATING_SYSTEM_VERSION = fromString("operatingSystemVersion");

    /** Static value operatingSystemVersion desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby OPERATING_SYSTEM_VERSION_DESC = fromString("operatingSystemVersion desc");

    /** Static value physicalIds for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby PHYSICAL_IDS = fromString("physicalIds");

    /** Static value physicalIds desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby PHYSICAL_IDS_DESC = fromString("physicalIds desc");

    /** Static value profileType for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby PROFILE_TYPE = fromString("profileType");

    /** Static value profileType desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby PROFILE_TYPE_DESC = fromString("profileType desc");

    /** Static value systemLabels for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby SYSTEM_LABELS = fromString("systemLabels");

    /** Static value systemLabels desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby SYSTEM_LABELS_DESC = fromString("systemLabels desc");

    /** Static value trustType for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby TRUST_TYPE = fromString("trustType");

    /** Static value trustType desc for DevicesDeviceOrderby. */
    public static final DevicesDeviceOrderby TRUST_TYPE_DESC = fromString("trustType desc");

    /**
     * Creates or finds a DevicesDeviceOrderby from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DevicesDeviceOrderby.
     */
    @JsonCreator
    public static DevicesDeviceOrderby fromString(String name) {
        return fromString(name, DevicesDeviceOrderby.class);
    }

    /** @return known DevicesDeviceOrderby values. */
    public static Collection<DevicesDeviceOrderby> values() {
        return values(DevicesDeviceOrderby.class);
    }
}
