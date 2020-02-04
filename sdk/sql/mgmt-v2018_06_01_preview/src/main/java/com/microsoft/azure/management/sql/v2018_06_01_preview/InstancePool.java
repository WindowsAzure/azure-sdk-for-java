/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2018_06_01_preview.implementation.SqlManager;
import com.microsoft.azure.management.sql.v2018_06_01_preview.implementation.InstancePoolInner;

/**
 * Type representing InstancePool.
 */
public interface InstancePool extends HasInner<InstancePoolInner>, Resource, GroupableResourceCore<SqlManager, InstancePoolInner>, HasResourceGroup, Refreshable<InstancePool>, Updatable<InstancePool.Update>, HasManager<SqlManager> {
    /**
     * @return the licenseType value.
     */
    InstancePoolLicenseType licenseType();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the subnetId value.
     */
    String subnetId();

    /**
     * @return the vCores value.
     */
    int vCores();

    /**
     * The entirety of the InstancePool definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithLicenseType, DefinitionStages.WithSubnetId, DefinitionStages.WithVCores, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of InstancePool definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a InstancePool definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the InstancePool definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithLicenseType> {
        }

        /**
         * The stage of the instancepool definition allowing to specify LicenseType.
         */
        interface WithLicenseType {
           /**
            * Specifies licenseType.
            * @param licenseType The license type. Possible values are 'LicenseIncluded' (price for SQL license is included) and 'BasePrice' (without SQL license price). Possible values include: 'LicenseIncluded', 'BasePrice'
            * @return the next definition stage
*/
            WithSubnetId withLicenseType(InstancePoolLicenseType licenseType);
        }

        /**
         * The stage of the instancepool definition allowing to specify SubnetId.
         */
        interface WithSubnetId {
           /**
            * Specifies subnetId.
            * @param subnetId Resource ID of the subnet to place this instance pool in
            * @return the next definition stage
*/
            WithVCores withSubnetId(String subnetId);
        }

        /**
         * The stage of the instancepool definition allowing to specify VCores.
         */
        interface WithVCores {
           /**
            * Specifies vCores.
            * @param vCores Count of vCores belonging to this instance pool
            * @return the next definition stage
*/
            WithCreate withVCores(int vCores);
        }

        /**
         * The stage of the instancepool definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The name and tier of the SKU
             * @return the next definition stage
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<InstancePool>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithSku {
        }
    }
    /**
     * The template for a InstancePool update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<InstancePool>, Resource.UpdateWithTags<Update>, UpdateStages.WithSku {
    }

    /**
     * Grouping of InstancePool update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the instancepool update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The name and tier of the SKU
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }

    }
}
