/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.implementation;

import com.azure.common.annotations.BodyParam;
import com.azure.common.annotations.DELETE;
import com.azure.common.annotations.ExpectedResponses;
import com.azure.common.annotations.GET;
import com.azure.common.annotations.HeaderParam;
import com.azure.common.annotations.Host;
import com.azure.common.annotations.HostParam;
import com.azure.common.annotations.PathParam;
import com.azure.common.annotations.POST;
import com.azure.common.annotations.QueryParam;
import com.azure.common.annotations.UnexpectedResponseExceptionType;
import com.azure.common.http.rest.SimpleResponse;
import com.azure.common.implementation.RestProxy;
import com.azure.common.implementation.Validator;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementImages;
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
public final class ListManagementImagesImpl implements ListManagementImages {
    /**
     * The proxy service used to perform REST calls.
     */
    private ListManagementImagesService service;

    /**
     * The service client containing this operation class.
     */
    private ContentModeratorClientImpl client;

    /**
     * Initializes an instance of ListManagementImagesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ListManagementImagesImpl(ContentModeratorClientImpl client) {
        this.service = RestProxy.create(ListManagementImagesService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for ListManagementImages to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{Endpoint}")
    private interface ListManagementImagesService {
        @POST("contentmoderator/lists/v1.0/imagelists/{listId}/images")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<SimpleResponse<Image>> addImage(@PathParam("listId") String listId, @HostParam("Endpoint") String endpoint, @QueryParam("tag") Integer tag, @QueryParam("label") String label);

        @DELETE("contentmoderator/lists/v1.0/imagelists/{listId}/images")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<SimpleResponse<String>> deleteAllImages(@PathParam("listId") String listId, @HostParam("Endpoint") String endpoint);

        @GET("contentmoderator/lists/v1.0/imagelists/{listId}/images")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<SimpleResponse<ImageIds>> getAllImageIds(@PathParam("listId") String listId, @HostParam("Endpoint") String endpoint);

        @DELETE("contentmoderator/lists/v1.0/imagelists/{listId}/images/{ImageId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<SimpleResponse<String>> deleteImage(@PathParam("listId") String listId, @PathParam("ImageId") String imageId, @HostParam("Endpoint") String endpoint);

        @POST("contentmoderator/lists/v1.0/imagelists/{listId}/images")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<SimpleResponse<Image>> addImageUrlInput(@PathParam("listId") String listId, @HostParam("Endpoint") String endpoint, @QueryParam("tag") Integer tag, @QueryParam("label") String label, @HeaderParam("Content-Type") String contentType, @BodyParam("application/json; charset=utf-8") BodyModel imageUrl);

        @POST("contentmoderator/lists/v1.0/imagelists/{listId}/images")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(APIErrorException.class)
        Mono<SimpleResponse<Image>> addImageFileInput(@PathParam("listId") String listId, @HostParam("Endpoint") String endpoint, @QueryParam("tag") Integer tag, @QueryParam("label") String label, @HeaderParam("Content-Length") long contentLength, @BodyParam("image/gif") Flux<ByteBuf> imageStream);
    }

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Image object if successful.
     */
    public Image addImage(@NonNull String listId) {
        return addImageAsync(listId).block();
    }

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SimpleResponse<Image>> addImageWithRestResponseAsync(@NonNull String listId) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        final Integer tag = null;
        final String label = null;
        return service.addImage(listId, this.client.endpoint(), tag, label);
    }

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Image> addImageAsync(@NonNull String listId) {
        return addImageWithRestResponseAsync(listId)
            .flatMap((SimpleResponse<Image> res) -> Mono.just(res.value()));
    }

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
    public Image addImage(@NonNull String listId, Integer tag, String label) {
        return addImageAsync(listId, tag, label).block();
    }

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SimpleResponse<Image>> addImageWithRestResponseAsync(@NonNull String listId, Integer tag, String label) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        return service.addImage(listId, this.client.endpoint(), tag, label);
    }

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param tag Tag for the image.
     * @param label The image label.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Image> addImageAsync(@NonNull String listId, Integer tag, String label) {
        return addImageWithRestResponseAsync(listId, tag, label)
            .flatMap((SimpleResponse<Image> res) -> Mono.just(res.value()));
    }

    /**
     * Deletes all images from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    public String deleteAllImages(@NonNull String listId) {
        return deleteAllImagesAsync(listId).block();
    }

    /**
     * Deletes all images from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SimpleResponse<String>> deleteAllImagesWithRestResponseAsync(@NonNull String listId) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        return service.deleteAllImages(listId, this.client.endpoint());
    }

    /**
     * Deletes all images from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<String> deleteAllImagesAsync(@NonNull String listId) {
        return deleteAllImagesWithRestResponseAsync(listId)
            .flatMap((SimpleResponse<String> res) -> Mono.just(res.value()));
    }

    /**
     * Gets all image Ids from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ImageIds object if successful.
     */
    public ImageIds getAllImageIds(@NonNull String listId) {
        return getAllImageIdsAsync(listId).block();
    }

    /**
     * Gets all image Ids from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SimpleResponse<ImageIds>> getAllImageIdsWithRestResponseAsync(@NonNull String listId) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        return service.getAllImageIds(listId, this.client.endpoint());
    }

    /**
     * Gets all image Ids from the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<ImageIds> getAllImageIdsAsync(@NonNull String listId) {
        return getAllImageIdsWithRestResponseAsync(listId)
            .flatMap((SimpleResponse<ImageIds> res) -> Mono.just(res.value()));
    }

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
    public String deleteImage(@NonNull String listId, @NonNull String imageId) {
        return deleteImageAsync(listId, imageId).block();
    }

    /**
     * Deletes an image from the list with list Id and image Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageId Id of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SimpleResponse<String>> deleteImageWithRestResponseAsync(@NonNull String listId, @NonNull String imageId) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        if (imageId == null) {
            throw new IllegalArgumentException("Parameter imageId is required and cannot be null.");
        }
        return service.deleteImage(listId, imageId, this.client.endpoint());
    }

    /**
     * Deletes an image from the list with list Id and image Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageId Id of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<String> deleteImageAsync(@NonNull String listId, @NonNull String imageId) {
        return deleteImageWithRestResponseAsync(listId, imageId)
            .flatMap((SimpleResponse<String> res) -> Mono.just(res.value()));
    }

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
    public Image addImageUrlInput(@NonNull String listId, @NonNull String contentType, @NonNull BodyModel imageUrl) {
        return addImageUrlInputAsync(listId, contentType, imageUrl).block();
    }

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SimpleResponse<Image>> addImageUrlInputWithRestResponseAsync(@NonNull String listId, @NonNull String contentType, @NonNull BodyModel imageUrl) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        if (contentType == null) {
            throw new IllegalArgumentException("Parameter contentType is required and cannot be null.");
        }
        if (imageUrl == null) {
            throw new IllegalArgumentException("Parameter imageUrl is required and cannot be null.");
        }
        Validator.validate(imageUrl);
        final Integer tag = null;
        final String label = null;
        return service.addImageUrlInput(listId, this.client.endpoint(), tag, label, contentType, imageUrl);
    }

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Image> addImageUrlInputAsync(@NonNull String listId, @NonNull String contentType, @NonNull BodyModel imageUrl) {
        return addImageUrlInputWithRestResponseAsync(listId, contentType, imageUrl)
            .flatMap((SimpleResponse<Image> res) -> Mono.just(res.value()));
    }

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
    public Image addImageUrlInput(@NonNull String listId, @NonNull String contentType, @NonNull BodyModel imageUrl, Integer tag, String label) {
        return addImageUrlInputAsync(listId, contentType, imageUrl, tag, label).block();
    }

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
    public Mono<SimpleResponse<Image>> addImageUrlInputWithRestResponseAsync(@NonNull String listId, @NonNull String contentType, @NonNull BodyModel imageUrl, Integer tag, String label) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        if (contentType == null) {
            throw new IllegalArgumentException("Parameter contentType is required and cannot be null.");
        }
        if (imageUrl == null) {
            throw new IllegalArgumentException("Parameter imageUrl is required and cannot be null.");
        }
        Validator.validate(imageUrl);
        return service.addImageUrlInput(listId, this.client.endpoint(), tag, label, contentType, imageUrl);
    }

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
    public Mono<Image> addImageUrlInputAsync(@NonNull String listId, @NonNull String contentType, @NonNull BodyModel imageUrl, Integer tag, String label) {
        return addImageUrlInputWithRestResponseAsync(listId, contentType, imageUrl, tag, label)
            .flatMap((SimpleResponse<Image> res) -> Mono.just(res.value()));
    }

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
    public Image addImageFileInput(@NonNull String listId, @NonNull long contentLength, @NonNull Flux<ByteBuf> imageStream) {
        return addImageFileInputAsync(listId, contentLength, imageStream).block();
    }

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentLength The content length.
     * @param imageStream The image file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<SimpleResponse<Image>> addImageFileInputWithRestResponseAsync(@NonNull String listId, @NonNull long contentLength, @NonNull Flux<ByteBuf> imageStream) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        if (imageStream == null) {
            throw new IllegalArgumentException("Parameter imageStream is required and cannot be null.");
        }
        final Integer tag = null;
        final String label = null;
        return service.addImageFileInput(listId, this.client.endpoint(), tag, label, contentLength, imageStream);
    }

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentLength The content length.
     * @param imageStream The image file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<Image> addImageFileInputAsync(@NonNull String listId, @NonNull long contentLength, @NonNull Flux<ByteBuf> imageStream) {
        return addImageFileInputWithRestResponseAsync(listId, contentLength, imageStream)
            .flatMap((SimpleResponse<Image> res) -> Mono.just(res.value()));
    }

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
    public Image addImageFileInput(@NonNull String listId, @NonNull long contentLength, @NonNull Flux<ByteBuf> imageStream, Integer tag, String label) {
        return addImageFileInputAsync(listId, contentLength, imageStream, tag, label).block();
    }

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
    public Mono<SimpleResponse<Image>> addImageFileInputWithRestResponseAsync(@NonNull String listId, @NonNull long contentLength, @NonNull Flux<ByteBuf> imageStream, Integer tag, String label) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        if (imageStream == null) {
            throw new IllegalArgumentException("Parameter imageStream is required and cannot be null.");
        }
        return service.addImageFileInput(listId, this.client.endpoint(), tag, label, contentLength, imageStream);
    }

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
    public Mono<Image> addImageFileInputAsync(@NonNull String listId, @NonNull long contentLength, @NonNull Flux<ByteBuf> imageStream, Integer tag, String label) {
        return addImageFileInputWithRestResponseAsync(listId, contentLength, imageStream, tag, label)
            .flatMap((SimpleResponse<Image> res) -> Mono.just(res.value()));
    }
}
