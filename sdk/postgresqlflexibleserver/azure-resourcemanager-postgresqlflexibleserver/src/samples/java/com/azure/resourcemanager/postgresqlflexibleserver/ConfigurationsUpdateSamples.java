// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver;

import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Configuration;

/** Samples for Configurations Update. */
public final class ConfigurationsUpdateSamples {
    /**
     * Sample code: Update a user configuration.
     *
     * @param postgreSqlManager Entry point to PostgreSqlManager. The Microsoft Azure management API provides create,
     *     read, update, and delete functionality for Azure PostgreSQL resources including servers, databases, firewall
     *     rules, VNET rules, security alert policies, log files and configurations with new business model.
     */
    public static void updateAUserConfiguration(
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager postgreSqlManager) {
        Configuration resource =
            postgreSqlManager
                .configurations()
                .getWithResponse("testrg", "testserver", "event_scheduler", Context.NONE)
                .getValue();
        resource.update().withValue("on").withSource("user-override").apply();
    }
}
