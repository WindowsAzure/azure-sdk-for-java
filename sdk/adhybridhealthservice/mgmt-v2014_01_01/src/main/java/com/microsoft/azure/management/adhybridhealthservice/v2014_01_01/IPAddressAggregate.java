/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation.IPAddressAggregateInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation.ADHybridHealthServiceManager;

/**
 * Type representing IPAddressAggregate.
 */
public interface IPAddressAggregate extends HasInner<IPAddressAggregateInner>, HasManager<ADHybridHealthServiceManager> {
    /**
     * @return the attemptCountThresholdIsExceeded value.
     */
    Boolean attemptCountThresholdIsExceeded();

    /**
     * @return the attemptCountThresholdOnTrigger value.
     */
    Integer attemptCountThresholdOnTrigger();

    /**
     * @return the attemptThresholdTypeOnTrigger value.
     */
    String attemptThresholdTypeOnTrigger();

    /**
     * @return the badPasswordErrorCount value.
     */
    Integer badPasswordErrorCount();

    /**
     * @return the extranetLockoutErrorCount value.
     */
    Integer extranetLockoutErrorCount();

    /**
     * @return the firstAuditTimestamp value.
     */
    String firstAuditTimestamp();

    /**
     * @return the geographicLocation value.
     */
    String geographicLocation();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the ipAddress value.
     */
    String ipAddress();

    /**
     * @return the isWhitelistedIpAddress value.
     */
    Boolean isWhitelistedIpAddress();

    /**
     * @return the lastAuditTimestamp value.
     */
    String lastAuditTimestamp();

    /**
     * @return the networkLocation value.
     */
    String networkLocation();

    /**
     * @return the serviceId value.
     */
    String serviceId();

    /**
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * @return the timeSpan value.
     */
    String timeSpan();

    /**
     * @return the timestamp value.
     */
    String timestamp();

    /**
     * @return the uniqueUsernamesAttemptedCount value.
     */
    Integer uniqueUsernamesAttemptedCount();

}
