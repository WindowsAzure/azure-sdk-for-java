/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2019_11_01.implementation.ComputeManager;
import java.util.List;
import com.microsoft.azure.management.compute.v2019_11_01.implementation.DedicatedHostGroupInner;

/**
 * Type representing DedicatedHostGroup.
 */
public interface DedicatedHostGroup extends HasInner<DedicatedHostGroupInner>, Resource, GroupableResourceCore<ComputeManager, DedicatedHostGroupInner>, HasResourceGroup, Refreshable<DedicatedHostGroup>, Updatable<DedicatedHostGroup.Update>, HasManager<ComputeManager> {
    /**
     * @return the hosts value.
     */
    List<SubResourceReadOnly> hosts();

    /**
     * @return the platformFaultDomainCount value.
     */
    int platformFaultDomainCount();

    /**
     * @return the zones value.
     */
    List<String> zones();

    /**
     * The entirety of the DedicatedHostGroup definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithPlatformFaultDomainCount, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DedicatedHostGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DedicatedHostGroup definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the DedicatedHostGroup definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithPlatformFaultDomainCount> {
        }

        /**
         * The stage of the dedicatedhostgroup definition allowing to specify PlatformFaultDomainCount.
         */
        interface WithPlatformFaultDomainCount {
           /**
            * Specifies platformFaultDomainCount.
            * @param platformFaultDomainCount Number of fault domains that the host group can span
            * @return the next definition stage
*/
            WithCreate withPlatformFaultDomainCount(int platformFaultDomainCount);
        }

        /**
         * The stage of the dedicatedhostgroup definition allowing to specify Zones.
         */
        interface WithZones {
            /**
             * Specifies zones.
             * @param zones Availability Zone to use for this host group. Only single zone is supported. The zone can be assigned only during creation. If not provided, the group supports all zones in the region. If provided, enforces each host in the group to be in the same zone
             * @return the next definition stage
             */
            WithCreate withZones(List<String> zones);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DedicatedHostGroup>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithZones {
        }
    }
    /**
     * The template for a DedicatedHostGroup update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DedicatedHostGroup>, Resource.UpdateWithTags<Update>, UpdateStages.WithZones {
    }

    /**
     * Grouping of DedicatedHostGroup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the dedicatedhostgroup update allowing to specify Zones.
         */
        interface WithZones {
            /**
             * Specifies zones.
             * @param zones Availability Zone to use for this host group. Only single zone is supported. The zone can be assigned only during creation. If not provided, the group supports all zones in the region. If provided, enforces each host in the group to be in the same zone
             * @return the next update stage
             */
            Update withZones(List<String> zones);
        }

    }
}
