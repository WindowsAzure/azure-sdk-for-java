// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.AuthorizationRuleInner;
import java.util.List;

/** An immutable client-side representation of AuthorizationRule. */
public interface AuthorizationRule {
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
     * Gets the rights property: The rights associated with the rule.
     *
     * @return the rights value.
     */
    List<AccessRights> rights();

    /**
     * Gets the inner com.azure.resourcemanager.eventhubs.generated.fluent.models.AuthorizationRuleInner object.
     *
     * @return the inner object.
     */
    AuthorizationRuleInner innerModel();

    /** The entirety of the AuthorizationRule definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The AuthorizationRule definition stages. */
    interface DefinitionStages {
        /** The first stage of the AuthorizationRule definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the AuthorizationRule definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, namespaceName.
             *
             * @param resourceGroupName Name of the resource group within the azure subscription.
             * @param namespaceName The Namespace name.
             * @return the next definition stage.
             */
            WithCreate withExistingNamespace(String resourceGroupName, String namespaceName);
        }
        /**
         * The stage of the AuthorizationRule definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithRights {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AuthorizationRule create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AuthorizationRule create(Context context);
        }
        /** The stage of the AuthorizationRule definition allowing to specify rights. */
        interface WithRights {
            /**
             * Specifies the rights property: The rights associated with the rule..
             *
             * @param rights The rights associated with the rule.
             * @return the next definition stage.
             */
            WithCreate withRights(List<AccessRights> rights);
        }
    }
    /**
     * Begins update for the AuthorizationRule resource.
     *
     * @return the stage of resource update.
     */
    AuthorizationRule.Update update();

    /** The template for AuthorizationRule update. */
    interface Update extends UpdateStages.WithRights {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AuthorizationRule apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AuthorizationRule apply(Context context);
    }
    /** The AuthorizationRule update stages. */
    interface UpdateStages {
        /** The stage of the AuthorizationRule update allowing to specify rights. */
        interface WithRights {
            /**
             * Specifies the rights property: The rights associated with the rule..
             *
             * @param rights The rights associated with the rule.
             * @return the next definition stage.
             */
            Update withRights(List<AccessRights> rights);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    AuthorizationRule refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AuthorizationRule refresh(Context context);
}
