/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2020_11_01_preview.implementation.TokensInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Tokens.
 */
public interface Tokens extends SupportsCreating<Token.DefinitionStages.Blank>, HasInner<TokensInner> {
    /**
     * Gets the properties of the specified token.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Token> getAsync(String resourceGroupName, String registryName, String tokenName);

    /**
     * Lists all the tokens for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Token> listAsync(final String resourceGroupName, final String registryName);

    /**
     * Deletes a token from a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String registryName, String tokenName);

}
