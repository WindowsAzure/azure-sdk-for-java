/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2015_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.servicebus.v2015_08_01.implementation.TopicsInner;
import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.servicebus.v2015_08_01.TopicNamespaceSharedAccessAuthorizationRuleResource;

/**
 * Type representing Topics.
 */
public interface Topics extends SupportsCreating<TopicResource.DefinitionStages.Blank>, HasInner<TopicsInner> {
    /**
     * Begins definition for a new AuthorizationRule resource.
     * @param name resource name.
     * @return the first stage of the new AuthorizationRule definition.
     */
    TopicNamespaceSharedAccessAuthorizationRuleResource.DefinitionStages.Blank defineAuthorizationRule(String name);

    /**
     * Returns a description for the specified topic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param topicName The topic name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TopicResource> getAsync(String resourceGroupName, String namespaceName, String topicName);

    /**
     * Gets all the topics in a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TopicResource> listAllAsync(final String resourceGroupName, final String namespaceName);

    /**
     * Deletes a topic from the specified namespace and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param topicName The topic name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String namespaceName, String topicName);

    /**
     * Returns the specified authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param topicName The topic name.
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TopicNamespaceSharedAccessAuthorizationRuleResource> getAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String topicName, String authorizationRuleName);

    /**
     * Gets authorization rules for a topic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param topicName The topic name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TopicNamespaceSharedAccessAuthorizationRuleResource> listAuthorizationRulesAsync(final String resourceGroupName, final String namespaceName, final String topicName);

    /**
     * Deletes a topic authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param topicName The topic name.
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String topicName, String authorizationRuleName);

    /**
     * Returns the specified authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param topicName The topic name.
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NamespaceSharedAccessAuthorizationRuleResource> postAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String topicName, String authorizationRuleName);

    /**
     * Gets the primary and secondary connection strings for the topic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param topicName The topic name.
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ResourceListKeys> listKeysAsync(String resourceGroupName, String namespaceName, String topicName, String authorizationRuleName);

    /**
     * Regenerates primary or secondary connection strings for the topic.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param topicName The topic name.
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ResourceListKeys> regenerateKeysAsync(String resourceGroupName, String namespaceName, String topicName, String authorizationRuleName);

}
