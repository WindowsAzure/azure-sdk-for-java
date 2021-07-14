// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security;

import com.azure.core.util.Context;

/** Samples for Alerts UpdateSubscriptionLevelStateToDismiss. */
public final class AlertsUpdateSubscriptionLevelStateToDismissSamples {
    /**
     * Sample code: Update security alert state on a subscription from a security data location.
     *
     * @param securityManager Entry point to SecurityManager. API spec for Microsoft.Security (Azure Security Center)
     *     resource provider.
     */
    public static void updateSecurityAlertStateOnASubscriptionFromASecurityDataLocation(
        com.azure.resourcemanager.security.SecurityManager securityManager) {
        securityManager
            .alerts()
            .updateSubscriptionLevelStateToDismissWithResponse(
                "westeurope", "2518298467986649999_4d25bfef-2d77-4a08-adc0-3e35715cc92a", Context.NONE);
    }
}
