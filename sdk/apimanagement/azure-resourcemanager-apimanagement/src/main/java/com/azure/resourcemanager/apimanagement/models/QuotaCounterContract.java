// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.resourcemanager.apimanagement.fluent.models.QuotaCounterContractInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of QuotaCounterContract. */
public interface QuotaCounterContract {
    /**
     * Gets the counterKey property: The Key value of the Counter. Must not be empty.
     *
     * @return the counterKey value.
     */
    String counterKey();

    /**
     * Gets the periodKey property: Identifier of the Period for which the counter was collected. Must not be empty.
     *
     * @return the periodKey value.
     */
    String periodKey();

    /**
     * Gets the periodStartTime property: The date of the start of Counter Period. The date conforms to the following
     * format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the periodStartTime value.
     */
    OffsetDateTime periodStartTime();

    /**
     * Gets the periodEndTime property: The date of the end of Counter Period. The date conforms to the following
     * format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the periodEndTime value.
     */
    OffsetDateTime periodEndTime();

    /**
     * Gets the value property: Quota Value Properties.
     *
     * @return the value value.
     */
    QuotaCounterValueContractProperties value();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.QuotaCounterContractInner object.
     *
     * @return the inner object.
     */
    QuotaCounterContractInner innerModel();
}
