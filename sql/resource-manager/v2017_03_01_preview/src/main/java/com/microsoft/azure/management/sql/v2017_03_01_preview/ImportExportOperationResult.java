/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.SqlManager;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.ImportExportOperationResultInner;
import java.util.UUID;

/**
 * Type representing ImportExportOperationResult.
 */
public interface ImportExportOperationResult extends HasInner<ImportExportOperationResultInner>, HasManager<SqlManager> {
    /**
     * @return the blobUri value.
     */
    String blobUri();

    /**
     * @return the databaseName value.
     */
    String databaseName();

    /**
     * @return the errorMessage value.
     */
    String errorMessage();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastModifiedTime value.
     */
    String lastModifiedTime();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the queuedTime value.
     */
    String queuedTime();

    /**
     * @return the requestId value.
     */
    UUID requestId();

    /**
     * @return the requestType value.
     */
    String requestType();

    /**
     * @return the serverName value.
     */
    String serverName();

    /**
     * @return the status value.
     */
    String status();

    /**
     * @return the type value.
     */
    String type();

}
