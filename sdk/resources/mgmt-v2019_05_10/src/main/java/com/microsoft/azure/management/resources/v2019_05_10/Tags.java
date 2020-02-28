/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_05_10;

import rx.Observable;
import com.microsoft.azure.management.resources.v2019_05_10.TagDetails;
import rx.Completable;

/**
 * Type representing Tags.
 */
public interface Tags {
    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TagDetails> listAsync();

    /**
     * Deletes a tag from the subscription.
     * You must remove all values from a resource tag before you can delete it.
     *
     * @param tagName The name of the tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String tagName);

    /**
     * Creates a tag in the subscription.
     * The tag name can have a maximum of 512 characters and is case insensitive. Tag names created by Azure have prefixes of microsoft, azure, or windows. You cannot create tags with one of these prefixes.
     *
     * @param tagName The name of the tag to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TagDetails> createOrUpdateAsync(String tagName);

    /**
     * Deletes a tag value.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteValueAsync(String tagName, String tagValue);

    /**
     * Creates a tag value. The name of the tag must already exist.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TagValue> createOrUpdateValueAsync(String tagName, String tagValue);

}
