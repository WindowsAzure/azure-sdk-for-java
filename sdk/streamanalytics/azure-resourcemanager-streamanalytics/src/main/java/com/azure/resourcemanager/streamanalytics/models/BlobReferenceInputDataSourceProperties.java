// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

/** The properties that are associated with a blob input containing reference data. */
@Immutable
public final class BlobReferenceInputDataSourceProperties extends BlobDataSourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BlobReferenceInputDataSourceProperties.class);

    /** {@inheritDoc} */
    @Override
    public BlobReferenceInputDataSourceProperties withStorageAccounts(List<StorageAccount> storageAccounts) {
        super.withStorageAccounts(storageAccounts);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BlobReferenceInputDataSourceProperties withContainer(String container) {
        super.withContainer(container);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BlobReferenceInputDataSourceProperties withPathPattern(String pathPattern) {
        super.withPathPattern(pathPattern);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BlobReferenceInputDataSourceProperties withDateFormat(String dateFormat) {
        super.withDateFormat(dateFormat);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BlobReferenceInputDataSourceProperties withTimeFormat(String timeFormat) {
        super.withTimeFormat(timeFormat);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
