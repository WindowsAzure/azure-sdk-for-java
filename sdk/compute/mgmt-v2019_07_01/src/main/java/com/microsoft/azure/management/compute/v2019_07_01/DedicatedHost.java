/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.compute.v2019_07_01.implementation.DedicatedHostInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2019_07_01.implementation.ComputeManager;
import java.util.Map;
import java.util.List;
import org.joda.time.DateTime;

/**
 * Type representing DedicatedHost.
 */
public interface DedicatedHost extends HasInner<DedicatedHostInner>, Indexable, Refreshable<DedicatedHost>, Updatable<DedicatedHost.Update>, HasManager<ComputeManager> {
    /**
     * @return the autoReplaceOnFailure value.
     */
    Boolean autoReplaceOnFailure();

    /**
     * @return the hostId value.
     */
    String hostId();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the instanceView value.
     */
    DedicatedHostInstanceView instanceView();

    /**
     * @return the licenseType value.
     */
    DedicatedHostLicenseTypes licenseType();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the platformFaultDomain value.
     */
    Integer platformFaultDomain();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the provisioningTime value.
     */
    DateTime provisioningTime();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the virtualMachines value.
     */
    List<SubResourceReadOnly> virtualMachines();

    /**
     * The entirety of the DedicatedHost definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithHostGroup, DefinitionStages.WithLocation, DefinitionStages.WithSku, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DedicatedHost definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DedicatedHost definition.
         */
        interface Blank extends WithHostGroup {
        }

        /**
         * The stage of the dedicatedhost definition allowing to specify HostGroup.
         */
        interface WithHostGroup {
           /**
            * Specifies resourceGroupName, hostGroupName.
            * @param resourceGroupName The name of the resource group
            * @param hostGroupName The name of the dedicated host group
            * @return the next definition stage
            */
            WithLocation withExistingHostGroup(String resourceGroupName, String hostGroupName);
        }

        /**
         * The stage of the dedicatedhost definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location Resource location
            * @return the next definition stage
            */
            WithSku withLocation(String location);
        }

        /**
         * The stage of the dedicatedhost definition allowing to specify Sku.
         */
        interface WithSku {
           /**
            * Specifies sku.
            * @param sku SKU of the dedicated host for Hardware Generation and VM family. Only name is required to be set. List Microsoft.Compute SKUs for a list of possible values
            * @return the next definition stage
            */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the dedicatedhost definition allowing to specify AutoReplaceOnFailure.
         */
        interface WithAutoReplaceOnFailure {
            /**
             * Specifies autoReplaceOnFailure.
             * @param autoReplaceOnFailure Specifies whether the dedicated host should be replaced automatically in case of a failure. The value is defaulted to 'true' when not provided
             * @return the next definition stage
             */
            WithCreate withAutoReplaceOnFailure(Boolean autoReplaceOnFailure);
        }

        /**
         * The stage of the dedicatedhost definition allowing to specify LicenseType.
         */
        interface WithLicenseType {
            /**
             * Specifies licenseType.
             * @param licenseType Specifies the software license type that will be applied to the VMs deployed on the dedicated host. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **Windows_Server_Hybrid** &lt;br&gt;&lt;br&gt; **Windows_Server_Perpetual** &lt;br&gt;&lt;br&gt; Default: **None**. Possible values include: 'None', 'Windows_Server_Hybrid', 'Windows_Server_Perpetual'
             * @return the next definition stage
             */
            WithCreate withLicenseType(DedicatedHostLicenseTypes licenseType);
        }

        /**
         * The stage of the dedicatedhost definition allowing to specify PlatformFaultDomain.
         */
        interface WithPlatformFaultDomain {
            /**
             * Specifies platformFaultDomain.
             * @param platformFaultDomain Fault domain of the dedicated host within a dedicated host group
             * @return the next definition stage
             */
            WithCreate withPlatformFaultDomain(Integer platformFaultDomain);
        }

        /**
         * The stage of the dedicatedhost definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DedicatedHost>, DefinitionStages.WithAutoReplaceOnFailure, DefinitionStages.WithLicenseType, DefinitionStages.WithPlatformFaultDomain, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a DedicatedHost update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DedicatedHost>, UpdateStages.WithAutoReplaceOnFailure, UpdateStages.WithLicenseType, UpdateStages.WithPlatformFaultDomain, UpdateStages.WithTags {
    }

    /**
     * Grouping of DedicatedHost update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the dedicatedhost update allowing to specify AutoReplaceOnFailure.
         */
        interface WithAutoReplaceOnFailure {
            /**
             * Specifies autoReplaceOnFailure.
             * @param autoReplaceOnFailure Specifies whether the dedicated host should be replaced automatically in case of a failure. The value is defaulted to 'true' when not provided
             * @return the next update stage
             */
            Update withAutoReplaceOnFailure(Boolean autoReplaceOnFailure);
        }

        /**
         * The stage of the dedicatedhost update allowing to specify LicenseType.
         */
        interface WithLicenseType {
            /**
             * Specifies licenseType.
             * @param licenseType Specifies the software license type that will be applied to the VMs deployed on the dedicated host. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **Windows_Server_Hybrid** &lt;br&gt;&lt;br&gt; **Windows_Server_Perpetual** &lt;br&gt;&lt;br&gt; Default: **None**. Possible values include: 'None', 'Windows_Server_Hybrid', 'Windows_Server_Perpetual'
             * @return the next update stage
             */
            Update withLicenseType(DedicatedHostLicenseTypes licenseType);
        }

        /**
         * The stage of the dedicatedhost update allowing to specify PlatformFaultDomain.
         */
        interface WithPlatformFaultDomain {
            /**
             * Specifies platformFaultDomain.
             * @param platformFaultDomain Fault domain of the dedicated host within a dedicated host group
             * @return the next update stage
             */
            Update withPlatformFaultDomain(Integer platformFaultDomain);
        }

        /**
         * The stage of the dedicatedhost update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
