/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator;

import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.BodyModel;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.Image;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.ImageIds;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ListManagementImages.
 */
public interface ListManagementImages {
    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Image object if successful.
     */
    Image addImage(String listId);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Image> addImageAsync(String listId, final ServiceCallback<Image> serviceCallback);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Image object
     */
    Observable<Image> addImageAsync(String listId);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Image object
     */
    Observable<ServiceResponse<Image>> addImageWithServiceResponseAsync(String listId);
    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Image object if successful.
     */
    Image addImage(String listId, Integer tag, String label);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param tag Tag for the image.
     * @param label The image label.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Image> addImageAsync(String listId, Integer tag, String label, final ServiceCallback<Image> serviceCallback);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Image object
     */
    Observable<Image> addImageAsync(String listId, Integer tag, String label);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Image object
     */
    Observable<ServiceResponse<Image>> addImageWithServiceResponseAsync(String listId, Integer tag, String label);

    /**
     * Deletes all images from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String deleteAllImages(String listId);

    /**
     * Deletes all images from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> deleteAllImagesAsync(String listId, final ServiceCallback<String> serviceCallback);

    /**
     * Deletes all images from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> deleteAllImagesAsync(String listId);

    /**
     * Deletes all images from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> deleteAllImagesWithServiceResponseAsync(String listId);

    /**
     * Gets all image Ids from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImageIds object if successful.
     */
    ImageIds getAllImageIds(String listId);

    /**
     * Gets all image Ids from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ImageIds> getAllImageIdsAsync(String listId, final ServiceCallback<ImageIds> serviceCallback);

    /**
     * Gets all image Ids from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImageIds object
     */
    Observable<ImageIds> getAllImageIdsAsync(String listId);

    /**
     * Gets all image Ids from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImageIds object
     */
    Observable<ServiceResponse<ImageIds>> getAllImageIdsWithServiceResponseAsync(String listId);

    /**
     * Deletes an image from the list with list Id and image Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageId Id of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String deleteImage(String listId, String imageId);

    /**
     * Deletes an image from the list with list Id and image Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageId Id of the image.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<String> deleteImageAsync(String listId, String imageId, final ServiceCallback<String> serviceCallback);

    /**
     * Deletes an image from the list with list Id and image Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageId Id of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> deleteImageAsync(String listId, String imageId);

    /**
     * Deletes an image from the list with list Id and image Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageId Id of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<ServiceResponse<String>> deleteImageWithServiceResponseAsync(String listId, String imageId);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Image object if successful.
     */
    Image addImageUrlInput(String listId, String contentType, BodyModel imageUrl);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Image> addImageUrlInputAsync(String listId, String contentType, BodyModel imageUrl, final ServiceCallback<Image> serviceCallback);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Image object
     */
    Observable<Image> addImageUrlInputAsync(String listId, String contentType, BodyModel imageUrl);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Image object
     */
    Observable<ServiceResponse<Image>> addImageUrlInputWithServiceResponseAsync(String listId, String contentType, BodyModel imageUrl);
    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Image object if successful.
     */
    Image addImageUrlInput(String listId, String contentType, BodyModel imageUrl, Integer tag, String label);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param tag Tag for the image.
     * @param label The image label.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Image> addImageUrlInputAsync(String listId, String contentType, BodyModel imageUrl, Integer tag, String label, final ServiceCallback<Image> serviceCallback);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Image object
     */
    Observable<Image> addImageUrlInputAsync(String listId, String contentType, BodyModel imageUrl, Integer tag, String label);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Image object
     */
    Observable<ServiceResponse<Image>> addImageUrlInputWithServiceResponseAsync(String listId, String contentType, BodyModel imageUrl, Integer tag, String label);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageStream The image file.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Image object if successful.
     */
    Image addImageFileInput(String listId, byte[] imageStream);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageStream The image file.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Image> addImageFileInputAsync(String listId, byte[] imageStream, final ServiceCallback<Image> serviceCallback);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageStream The image file.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Image object
     */
    Observable<Image> addImageFileInputAsync(String listId, byte[] imageStream);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageStream The image file.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Image object
     */
    Observable<ServiceResponse<Image>> addImageFileInputWithServiceResponseAsync(String listId, byte[] imageStream);
    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageStream The image file.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Image object if successful.
     */
    Image addImageFileInput(String listId, byte[] imageStream, Integer tag, String label);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageStream The image file.
     * @param tag Tag for the image.
     * @param label The image label.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Image> addImageFileInputAsync(String listId, byte[] imageStream, Integer tag, String label, final ServiceCallback<Image> serviceCallback);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageStream The image file.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Image object
     */
    Observable<Image> addImageFileInputAsync(String listId, byte[] imageStream, Integer tag, String label);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageStream The image file.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Image object
     */
    Observable<ServiceResponse<Image>> addImageFileInputWithServiceResponseAsync(String listId, byte[] imageStream, Integer tag, String label);

}
