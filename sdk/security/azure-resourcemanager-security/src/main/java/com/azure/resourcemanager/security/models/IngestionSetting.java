// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.IngestionSettingInner;

/** An immutable client-side representation of IngestionSetting. */
public interface IngestionSetting {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: Ingestion setting data.
     *
     * @return the properties value.
     */
    Object properties();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.IngestionSettingInner object.
     *
     * @return the inner object.
     */
    IngestionSettingInner innerModel();

    /** The entirety of the IngestionSetting definition. */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCreate {
    }
    /** The IngestionSetting definition stages. */
    interface DefinitionStages {
        /** The first stage of the IngestionSetting definition. */
        interface Blank extends WithCreate {
        }
        /**
         * The stage of the IngestionSetting definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            IngestionSetting create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            IngestionSetting create(Context context);
        }
        /** The stage of the IngestionSetting definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Ingestion setting data.
             *
             * @param properties Ingestion setting data.
             * @return the next definition stage.
             */
            WithCreate withProperties(Object properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    IngestionSetting refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    IngestionSetting refresh(Context context);

    /**
     * Returns the token that is used for correlating ingested telemetry with the resources in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configures how to correlate scan data and logs with resources associated with the subscription.
     */
    IngestionSettingToken listTokens();

    /**
     * Returns the token that is used for correlating ingested telemetry with the resources in the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return configures how to correlate scan data and logs with resources associated with the subscription.
     */
    Response<IngestionSettingToken> listTokensWithResponse(Context context);

    /**
     * Connection strings for ingesting security scan logs and data.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return connection string for ingesting security data and logs.
     */
    ConnectionStrings listConnectionStrings();

    /**
     * Connection strings for ingesting security scan logs and data.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return connection string for ingesting security data and logs.
     */
    Response<ConnectionStrings> listConnectionStringsWithResponse(Context context);
}
