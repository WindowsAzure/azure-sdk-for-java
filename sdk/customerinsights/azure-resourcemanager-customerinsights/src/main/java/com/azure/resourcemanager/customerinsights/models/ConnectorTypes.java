// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ConnectorTypes. */
public final class ConnectorTypes extends ExpandableStringEnum<ConnectorTypes> {
    /** Static value None for ConnectorTypes. */
    public static final ConnectorTypes NONE = fromString("None");

    /** Static value CRM for ConnectorTypes. */
    public static final ConnectorTypes CRM = fromString("CRM");

    /** Static value AzureBlob for ConnectorTypes. */
    public static final ConnectorTypes AZURE_BLOB = fromString("AzureBlob");

    /** Static value Salesforce for ConnectorTypes. */
    public static final ConnectorTypes SALESFORCE = fromString("Salesforce");

    /** Static value ExchangeOnline for ConnectorTypes. */
    public static final ConnectorTypes EXCHANGE_ONLINE = fromString("ExchangeOnline");

    /** Static value Outbound for ConnectorTypes. */
    public static final ConnectorTypes OUTBOUND = fromString("Outbound");

    /**
     * Creates or finds a ConnectorTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConnectorTypes.
     */
    @JsonCreator
    public static ConnectorTypes fromString(String name) {
        return fromString(name, ConnectorTypes.class);
    }

    /** @return known ConnectorTypes values. */
    public static Collection<ConnectorTypes> values() {
        return values(ConnectorTypes.class);
    }
}
