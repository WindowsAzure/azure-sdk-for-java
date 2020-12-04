/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.cdn.v2020_09_01.implementation.RuleSetsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing RuleSets.
 */
public interface RuleSets extends SupportsCreating<RuleSet.DefinitionStages.Blank>, HasInner<RuleSetsInner> {
    /**
     * Checks the quota and actual usage of endpoints under the given CDN profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param ruleSetName Name of the rule set under the profile which is unique globally.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Usage> listResourceUsageAsync(final String resourceGroupName, final String profileName, final String ruleSetName);

    /**
     * Gets an existing AzureFrontDoor rule set with the specified rule set name under the specified subscription, resource group and profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param ruleSetName Name of the rule set under the profile which is unique globally.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RuleSet> getAsync(String resourceGroupName, String profileName, String ruleSetName);

    /**
     * Lists existing AzureFrontDoor rule sets within a profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RuleSet> listByProfileAsync(final String resourceGroupName, final String profileName);

    /**
     * Deletes an existing AzureFrontDoor rule set with the specified rule set name under the specified subscription, resource group and profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param ruleSetName Name of the rule set under the profile which is unique globally.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String profileName, String ruleSetName);

}
