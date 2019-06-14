/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.UserContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.ApiManagementManager;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing GroupUserContract.
 */
public interface GroupUserContract extends HasInner<UserContractInner>, Indexable, Updatable<GroupUserContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the email value.
     */
    String email();

    /**
     * @return the firstName value.
     */
    String firstName();

    /**
     * @return the groups value.
     */
    List<GroupContractProperties> groups();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the identities value.
     */
    List<UserIdentityContract> identities();

    /**
     * @return the lastName value.
     */
    String lastName();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the note value.
     */
    String note();

    /**
     * @return the registrationDate value.
     */
    DateTime registrationDate();

    /**
     * @return the state value.
     */
    UserState state();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the GroupUserContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of GroupUserContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a GroupUserContract definition.
         */
        interface Blank extends WithGroup {
        }

        /**
         * The stage of the groupusercontract definition allowing to specify Group.
         */
        interface WithGroup {
           /**
            * Specifies resourceGroupName, serviceName, groupId.
            * @param resourceGroupName The name of the resource group
            * @param serviceName The name of the API Management service
            * @param groupId Group identifier. Must be unique in the current API Management service instance
            * @return the next definition stage
            */
            WithCreate withExistingGroup(String resourceGroupName, String serviceName, String groupId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<GroupUserContract> {
        }
    }
    /**
     * The template for a GroupUserContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<GroupUserContract> {
    }

    /**
     * Grouping of GroupUserContract update stages.
     */
    interface UpdateStages {
    }
}
