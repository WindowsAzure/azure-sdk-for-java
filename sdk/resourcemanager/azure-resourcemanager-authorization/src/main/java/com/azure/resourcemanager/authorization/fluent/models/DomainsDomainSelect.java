// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DomainsDomainSelect. */
public final class DomainsDomainSelect extends ExpandableStringEnum<DomainsDomainSelect> {
    /** Static value id for DomainsDomainSelect. */
    public static final DomainsDomainSelect ID = fromString("id");

    /** Static value authenticationType for DomainsDomainSelect. */
    public static final DomainsDomainSelect AUTHENTICATION_TYPE = fromString("authenticationType");

    /** Static value availabilityStatus for DomainsDomainSelect. */
    public static final DomainsDomainSelect AVAILABILITY_STATUS = fromString("availabilityStatus");

    /** Static value isAdminManaged for DomainsDomainSelect. */
    public static final DomainsDomainSelect IS_ADMIN_MANAGED = fromString("isAdminManaged");

    /** Static value isDefault for DomainsDomainSelect. */
    public static final DomainsDomainSelect IS_DEFAULT = fromString("isDefault");

    /** Static value isInitial for DomainsDomainSelect. */
    public static final DomainsDomainSelect IS_INITIAL = fromString("isInitial");

    /** Static value isRoot for DomainsDomainSelect. */
    public static final DomainsDomainSelect IS_ROOT = fromString("isRoot");

    /** Static value isVerified for DomainsDomainSelect. */
    public static final DomainsDomainSelect IS_VERIFIED = fromString("isVerified");

    /** Static value manufacturer for DomainsDomainSelect. */
    public static final DomainsDomainSelect MANUFACTURER = fromString("manufacturer");

    /** Static value model for DomainsDomainSelect. */
    public static final DomainsDomainSelect MODEL = fromString("model");

    /** Static value passwordNotificationWindowInDays for DomainsDomainSelect. */
    public static final DomainsDomainSelect PASSWORD_NOTIFICATION_WINDOW_IN_DAYS =
        fromString("passwordNotificationWindowInDays");

    /** Static value passwordValidityPeriodInDays for DomainsDomainSelect. */
    public static final DomainsDomainSelect PASSWORD_VALIDITY_PERIOD_IN_DAYS =
        fromString("passwordValidityPeriodInDays");

    /** Static value state for DomainsDomainSelect. */
    public static final DomainsDomainSelect STATE = fromString("state");

    /** Static value supportedServices for DomainsDomainSelect. */
    public static final DomainsDomainSelect SUPPORTED_SERVICES = fromString("supportedServices");

    /** Static value domainNameReferences for DomainsDomainSelect. */
    public static final DomainsDomainSelect DOMAIN_NAME_REFERENCES = fromString("domainNameReferences");

    /** Static value serviceConfigurationRecords for DomainsDomainSelect. */
    public static final DomainsDomainSelect SERVICE_CONFIGURATION_RECORDS = fromString("serviceConfigurationRecords");

    /** Static value verificationDnsRecords for DomainsDomainSelect. */
    public static final DomainsDomainSelect VERIFICATION_DNS_RECORDS = fromString("verificationDnsRecords");

    /**
     * Creates or finds a DomainsDomainSelect from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DomainsDomainSelect.
     */
    @JsonCreator
    public static DomainsDomainSelect fromString(String name) {
        return fromString(name, DomainsDomainSelect.class);
    }

    /** @return known DomainsDomainSelect values. */
    public static Collection<DomainsDomainSelect> values() {
        return values(DomainsDomainSelect.class);
    }
}
