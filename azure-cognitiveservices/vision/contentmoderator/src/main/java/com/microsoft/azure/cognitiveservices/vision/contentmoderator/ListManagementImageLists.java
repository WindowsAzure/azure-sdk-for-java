/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator;

import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.Body;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.ImageList;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.RefreshIndex;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ListManagementImageLists.
 */
public interface ListManagementImageLists {
    /**
     * Returns the details of the image list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImageList object if successful.
     */
    ImageList getDetails(String listId);

    /**
     * Returns the details of the image list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImageList object
     */
    Observable<ImageList> getDetailsAsync(String listId);

    /**
     * Deletes image list with the list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String delete(String listId);

    /**
     * Deletes image list with the list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> deleteAsync(String listId);

    /**
     * Updates an image list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param body Schema of the body.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImageList object if successful.
     */
    ImageList update(String listId, String contentType, Body body);

    /**
     * Updates an image list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param body Schema of the body.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImageList object
     */
    Observable<ImageList> updateAsync(String listId, String contentType, Body body);

    /**
     * Creates an image list.
     *
     * @param contentType The content type.
     * @param body Schema of the body.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImageList object if successful.
     */
    ImageList create(String contentType, Body body);

    /**
     * Creates an image list.
     *
     * @param contentType The content type.
     * @param body Schema of the body.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImageList object
     */
    Observable<ImageList> createAsync(String contentType, Body body);

    /**
     * Gets all the Image Lists.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ImageList&gt; object if successful.
     */
    List<ImageList> getAllImageLists();

    /**
     * Gets all the Image Lists.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ImageList&gt; object
     */
    Observable<List<ImageList>> getAllImageListsAsync();

    /**
     * Refreshes the index of the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RefreshIndex object if successful.
     */
    RefreshIndex refreshIndexMethod(String listId);

    /**
     * Refreshes the index of the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RefreshIndex object
     */
    Observable<RefreshIndex> refreshIndexMethodAsync(String listId);

}
