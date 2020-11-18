/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.dns.v2017_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.dns.v2017_10_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.dns.v2017_10_01.implementation.ZoneInner;

/**
 * Type representing Zone.
 */
public interface Zone extends HasInner<ZoneInner>, Resource, GroupableResourceCore<NetworkManager, ZoneInner>, HasResourceGroup, Refreshable<Zone>, Updatable<Zone.Update>, HasManager<NetworkManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the maxNumberOfRecordSets value.
     */
    Long maxNumberOfRecordSets();

    /**
     * @return the maxNumberOfRecordsPerRecordSet value.
     */
    Long maxNumberOfRecordsPerRecordSet();

    /**
     * @return the nameServers value.
     */
    List<String> nameServers();

    /**
     * @return the numberOfRecordSets value.
     */
    Long numberOfRecordSets();

    /**
     * The entirety of the Zone definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithIfMatch, DefinitionStages.WithIfNoneMatch, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Zone definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Zone definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Zone definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithIfMatch> {
        }

        /**
         * The stage of the zone definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch The etag of the DNS zone. Omit this value to always overwrite the current zone. Specify the last-seen etag value to prevent accidentally overwriting any concurrent changes
            * @return the next definition stage
*/
            WithIfNoneMatch withIfMatch(String ifMatch);
        }

        /**
         * The stage of the zone definition allowing to specify IfNoneMatch.
         */
        interface WithIfNoneMatch {
           /**
            * Specifies ifNoneMatch.
            * @param ifNoneMatch Set to '*' to allow a new DNS zone to be created, but to prevent updating an existing zone. Other values will be ignored
            * @return the next definition stage
*/
            WithCreate withIfNoneMatch(String ifNoneMatch);
        }

        /**
         * The stage of the zone definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag The etag of the zone
             * @return the next definition stage
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Zone>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithEtag {
        }
    }
    /**
     * The template for a Zone update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Zone>, Resource.UpdateWithTags<Update>, UpdateStages.WithIfMatch, UpdateStages.WithIfNoneMatch, UpdateStages.WithEtag {
    }

    /**
     * Grouping of Zone update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the zone update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch The etag of the DNS zone. Omit this value to always overwrite the current zone. Specify the last-seen etag value to prevent accidentally overwriting any concurrent changes
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the zone update allowing to specify IfNoneMatch.
         */
        interface WithIfNoneMatch {
            /**
             * Specifies ifNoneMatch.
             * @param ifNoneMatch Set to '*' to allow a new DNS zone to be created, but to prevent updating an existing zone. Other values will be ignored
             * @return the next update stage
             */
            Update withIfNoneMatch(String ifNoneMatch);
        }

        /**
         * The stage of the zone update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag The etag of the zone
             * @return the next update stage
             */
            Update withEtag(String etag);
        }

    }
}
