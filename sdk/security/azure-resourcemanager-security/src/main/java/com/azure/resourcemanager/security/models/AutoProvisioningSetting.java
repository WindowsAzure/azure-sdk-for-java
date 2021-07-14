// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.AutoProvisioningSettingInner;

/** An immutable client-side representation of AutoProvisioningSetting. */
public interface AutoProvisioningSetting {
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
     * Gets the autoProvision property: Describes what kind of security agent provisioning action to take.
     *
     * @return the autoProvision value.
     */
    AutoProvision autoProvision();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.AutoProvisioningSettingInner object.
     *
     * @return the inner object.
     */
    AutoProvisioningSettingInner innerModel();

    /** The entirety of the AutoProvisioningSetting definition. */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithCreate {
    }
    /** The AutoProvisioningSetting definition stages. */
    interface DefinitionStages {
        /** The first stage of the AutoProvisioningSetting definition. */
        interface Blank extends WithCreate {
        }
        /**
         * The stage of the AutoProvisioningSetting definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithAutoProvision {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AutoProvisioningSetting create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AutoProvisioningSetting create(Context context);
        }
        /** The stage of the AutoProvisioningSetting definition allowing to specify autoProvision. */
        interface WithAutoProvision {
            /**
             * Specifies the autoProvision property: Describes what kind of security agent provisioning action to take.
             *
             * @param autoProvision Describes what kind of security agent provisioning action to take.
             * @return the next definition stage.
             */
            WithCreate withAutoProvision(AutoProvision autoProvision);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    AutoProvisioningSetting refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AutoProvisioningSetting refresh(Context context);
}
