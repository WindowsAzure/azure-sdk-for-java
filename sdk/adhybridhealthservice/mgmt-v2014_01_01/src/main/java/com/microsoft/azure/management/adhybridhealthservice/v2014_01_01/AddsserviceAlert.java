/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation.AlertInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation.ADHybridHealthServiceManager;
import java.util.List;
import java.util.UUID;
import org.joda.time.DateTime;

/**
 * Type representing AddsserviceAlert.
 */
public interface AddsserviceAlert extends HasInner<AlertInner>, HasManager<ADHybridHealthServiceManager> {
    /**
     * @return the activeAlertProperties value.
     */
    List<ServiceItem> activeAlertProperties();

    /**
     * @return the additionalInformation value.
     */
    List<AdditionalInformation> additionalInformation();

    /**
     * @return the alertId value.
     */
    UUID alertId();

    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the lastUpdated value.
     */
    DateTime lastUpdated();

    /**
     * @return the level value.
     */
    Level level();

    /**
     * @return the monitorRoleType value.
     */
    String monitorRoleType();

    /**
     * @return the relatedLinks value.
     */
    List<HelpLink> relatedLinks();

    /**
     * @return the remediation value.
     */
    String remediation();

    /**
     * @return the resolvedAlertProperties value.
     */
    List<ServiceItem> resolvedAlertProperties();

    /**
     * @return the resolvedDate value.
     */
    DateTime resolvedDate();

    /**
     * @return the scope value.
     */
    String scope();

    /**
     * @return the serviceId value.
     */
    UUID serviceId();

    /**
     * @return the serviceMemberId value.
     */
    UUID serviceMemberId();

    /**
     * @return the shortName value.
     */
    String shortName();

    /**
     * @return the state value.
     */
    State state();

    /**
     * @return the tenantId value.
     */
    UUID tenantId();

}
