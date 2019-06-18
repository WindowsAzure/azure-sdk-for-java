/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.azurestack.v2017_06_01.implementation.AzureStackManager;
import com.microsoft.azure.management.azurestack.v2017_06_01.implementation.RegistrationInner;

/**
 * Type representing Registration.
 */
public interface Registration extends HasInner<RegistrationInner>, Resource, GroupableResourceCore<AzureStackManager, RegistrationInner>, HasResourceGroup, Refreshable<Registration>, Updatable<Registration.Update>, HasManager<AzureStackManager> {
    /**
     * @return the billingModel value.
     */
    String billingModel();

    /**
     * @return the cloudId value.
     */
    String cloudId();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the objectId value.
     */
    String objectId();

    /**
     * The entirety of the Registration definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithRegistrationToken, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Registration definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Registration definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Registration definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithRegistrationToken> {
        }

        /**
         * The stage of the registration definition allowing to specify RegistrationToken.
         */
        interface WithRegistrationToken {
           /**
            * Specifies registrationToken.
            * @param registrationToken The token identifying registered Azure Stack
            * @return the next definition stage
*/
            WithCreate withRegistrationToken(String registrationToken);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Registration>, Resource.DefinitionWithTags<WithCreate> {
        }
    }
    /**
     * The template for a Registration update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Registration>, Resource.UpdateWithTags<Update> {
    }

    /**
     * Grouping of Registration update stages.
     */
    interface UpdateStages {
    }
}
