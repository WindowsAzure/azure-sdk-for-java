/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.edgegateway.v2019_03_01.implementation.AlertInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.edgegateway.v2019_03_01.implementation.DataBoxEdgeManager;
import org.joda.time.DateTime;
import java.util.Map;

/**
 * Type representing Alert.
 */
public interface Alert extends HasInner<AlertInner>, Indexable, Refreshable<Alert>, HasManager<DataBoxEdgeManager> {
    /**
     * @return the alertType value.
     */
    String alertType();

    /**
     * @return the appearedAtDateTime value.
     */
    DateTime appearedAtDateTime();

    /**
     * @return the detailedInformation value.
     */
    Map<String, String> detailedInformation();

    /**
     * @return the errorDetails value.
     */
    AlertErrorDetails errorDetails();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the recommendation value.
     */
    String recommendation();

    /**
     * @return the severity value.
     */
    AlertSeverity severity();

    /**
     * @return the title value.
     */
    String title();

    /**
     * @return the type value.
     */
    String type();

}
