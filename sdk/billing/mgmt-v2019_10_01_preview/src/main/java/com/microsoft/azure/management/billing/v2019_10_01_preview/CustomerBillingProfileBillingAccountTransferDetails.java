/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.TransferDetailsInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.BillingManager;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing CustomerBillingProfileBillingAccountTransferDetails.
 */
public interface CustomerBillingProfileBillingAccountTransferDetails extends HasInner<TransferDetailsInner>, HasManager<BillingManager> {
    /**
     * @return the billingAccountId value.
     */
    String billingAccountId();

    /**
     * @return the billingProfileId value.
     */
    String billingProfileId();

    /**
     * @return the canceledBy value.
     */
    String canceledBy();

    /**
     * @return the creationTime value.
     */
    DateTime creationTime();

    /**
     * @return the detailedTransferStatus value.
     */
    List<DetailedTransferStatus> detailedTransferStatus();

    /**
     * @return the expirationTime value.
     */
    DateTime expirationTime();

    /**
     * @return the initiatorCustomerType value.
     */
    String initiatorCustomerType();

    /**
     * @return the initiatorEmailId value.
     */
    String initiatorEmailId();

    /**
     * @return the invoiceSectionId value.
     */
    String invoiceSectionId();

    /**
     * @return the lastModifiedTime value.
     */
    DateTime lastModifiedTime();

    /**
     * @return the recipientEmailId value.
     */
    String recipientEmailId();

    /**
     * @return the resellerId value.
     */
    String resellerId();

    /**
     * @return the resellerName value.
     */
    String resellerName();

    /**
     * @return the transferStatus value.
     */
    TransferStatus transferStatus();

}
