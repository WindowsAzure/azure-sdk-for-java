/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.databoxedge.v2019_07_01.implementation.RoleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.databoxedge.v2019_07_01.implementation.DataBoxEdgeManager;

/**
 * Type representing Role.
 */
public interface Role extends HasInner<RoleInner>, Indexable, Refreshable<Role>, Updatable<Role.Update>, HasManager<DataBoxEdgeManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Role definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDataBoxEdgeDevice, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Role definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Role definition.
         */
        interface Blank extends WithDataBoxEdgeDevice {
        }

        /**
         * The stage of the role definition allowing to specify DataBoxEdgeDevice.
         */
        interface WithDataBoxEdgeDevice {
           /**
            * Specifies deviceName, resourceGroupName.
            * @param deviceName The device name
            * @param resourceGroupName The resource group name
            * @return the next definition stage
            */
            WithCreate withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Role> {
        }
    }
    /**
     * The template for a Role update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Role> {
    }

    /**
     * Grouping of Role update stages.
     */
    interface UpdateStages {
    }
}
