/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2017_09_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.implementation.BatchAIManager;
import com.microsoft.azure.management.batchai.v2017_09_01_preview.implementation.FileInner;
import org.joda.time.DateTime;

/**
 * Type representing File.
 */
public interface File extends HasInner<FileInner>, HasManager<BatchAIManager> {
    /**
     * @return the contentLength value.
     */
    Long contentLength();

    /**
     * @return the downloadUrl value.
     */
    String downloadUrl();

    /**
     * @return the lastModified value.
     */
    DateTime lastModified();

    /**
     * @return the name value.
     */
    String name();

}
