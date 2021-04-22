// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DataSourceCredentialType. */
public final class DataSourceCredentialType extends ExpandableStringEnum<DataSourceCredentialType> {
    /** Static value AzureSQLConnectionString for DataSourceCredentialType. */
    public static final DataSourceCredentialType AZURE_SQLCONNECTION_STRING = fromString("AzureSQLConnectionString");

    /** Static value DataLakeGen2SharedKey for DataSourceCredentialType. */
    public static final DataSourceCredentialType DATA_LAKE_GEN2SHARED_KEY = fromString("DataLakeGen2SharedKey");

    /** Static value ServicePrincipal for DataSourceCredentialType. */
    public static final DataSourceCredentialType SERVICE_PRINCIPAL = fromString("ServicePrincipal");

    /** Static value ServicePrincipalInKV for DataSourceCredentialType. */
    public static final DataSourceCredentialType SERVICE_PRINCIPAL_IN_KV = fromString("ServicePrincipalInKV");

    /**
     * Creates or finds a DataSourceCredentialType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DataSourceCredentialType.
     */
    @JsonCreator
    public static DataSourceCredentialType fromString(String name) {
        return fromString(name, DataSourceCredentialType.class);
    }

    /** @return known DataSourceCredentialType values. */
    public static Collection<DataSourceCredentialType> values() {
        return values(DataSourceCredentialType.class);
    }
}