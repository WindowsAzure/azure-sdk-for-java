/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator;

import com.azure.common.http.rest.SimpleResponse;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.BodyModel;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.Image;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.ImageIds;
import io.netty.buffer.ByteBuf;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.annotation.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * ListManagementImages.
 */
public interface ListManagementImages {
    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Image object if successful.
     */
    Image addImage(@NonNull String listId);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<Image>> addImageWithRestResponseAsync(@NonNull String listId);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Image> addImageAsync(@NonNull String listId);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Image object if successful.
     */
    Image addImage(@NonNull String listId, Integer tag, String label);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<Image>> addImageWithRestResponseAsync(@NonNull String listId, Integer tag, String label);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Image> addImageAsync(@NonNull String listId, Integer tag, String label);

    /**
     * Deletes all images from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    String deleteAllImages(@NonNull String listId);

    /**
     * Deletes all images from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<String>> deleteAllImagesWithRestResponseAsync(@NonNull String listId);

    /**
     * Deletes all images from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<String> deleteAllImagesAsync(@NonNull String listId);

    /**
     * Gets all image Ids from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImageIds object if successful.
     */
    ImageIds getAllImageIds(@NonNull String listId);

    /**
     * Gets all image Ids from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<ImageIds>> getAllImageIdsWithRestResponseAsync(@NonNull String listId);

    /**
     * Gets all image Ids from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<ImageIds> getAllImageIdsAsync(@NonNull String listId);

    /**
     * Deletes an image from the list with list Id and image Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageId Id of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    String deleteImage(@NonNull String listId, @NonNull String imageId);

    /**
     * Deletes an image from the list with list Id and image Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageId Id of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<String>> deleteImageWithRestResponseAsync(@NonNull String listId, @NonNull String imageId);

    /**
     * Deletes an image from the list with list Id and image Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageId Id of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<String> deleteImageAsync(@NonNull String listId, @NonNull String imageId);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Image object if successful.
     */
    Image addImageUrlInput(@NonNull String listId, @NonNull String contentType, @NonNull BodyModel imageUrl);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<Image>> addImageUrlInputWithRestResponseAsync(@NonNull String listId, @NonNull String contentType, @NonNull BodyModel imageUrl);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Image> addImageUrlInputAsync(@NonNull String listId, @NonNull String contentType, @NonNull BodyModel imageUrl);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Image object if successful.
     */
    Image addImageUrlInput(@NonNull String listId, @NonNull String contentType, @NonNull BodyModel imageUrl, Integer tag, String label);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<Image>> addImageUrlInputWithRestResponseAsync(@NonNull String listId, @NonNull String contentType, @NonNull BodyModel imageUrl, Integer tag, String label);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Image> addImageUrlInputAsync(@NonNull String listId, @NonNull String contentType, @NonNull BodyModel imageUrl, Integer tag, String label);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentLength The content length.
     * @param imageStream The image file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Image object if successful.
     */
    Image addImageFileInput(@NonNull String listId, @NonNull long contentLength, @NonNull Flux<ByteBuf> imageStream);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentLength The content length.
     * @param imageStream The image file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<Image>> addImageFileInputWithRestResponseAsync(@NonNull String listId, @NonNull long contentLength, @NonNull Flux<ByteBuf> imageStream);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentLength The content length.
     * @param imageStream The image file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Image> addImageFileInputAsync(@NonNull String listId, @NonNull long contentLength, @NonNull Flux<ByteBuf> imageStream);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentLength The content length.
     * @param imageStream The image file.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Image object if successful.
     */
    Image addImageFileInput(@NonNull String listId, @NonNull long contentLength, @NonNull Flux<ByteBuf> imageStream, Integer tag, String label);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentLength The content length.
     * @param imageStream The image file.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<Image>> addImageFileInputWithRestResponseAsync(@NonNull String listId, @NonNull long contentLength, @NonNull Flux<ByteBuf> imageStream, Integer tag, String label);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentLength The content length.
     * @param imageStream The image file.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Image> addImageFileInputAsync(@NonNull String listId, @NonNull long contentLength, @NonNull Flux<ByteBuf> imageStream, Integer tag, String label);
}
