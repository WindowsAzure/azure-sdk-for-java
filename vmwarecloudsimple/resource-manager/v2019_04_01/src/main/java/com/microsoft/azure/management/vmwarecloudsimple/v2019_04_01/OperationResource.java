/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation.OperationResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01.implementation.VMwareCloudSimpleManager;
import org.joda.time.DateTime;

/**
 * Type representing OperationResource.
 */
public interface OperationResource extends HasInner<OperationResourceInner>, Indexable, Refreshable<OperationResource>, HasManager<VMwareCloudSimpleManager> {
    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the error value.
     */
    OperationError error();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the status value.
     */
    String status();

}
