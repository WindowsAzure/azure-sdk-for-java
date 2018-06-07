/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator;

import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.AddImageOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.AddImageUrlInputOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.AddImageFileInputOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.BodyModelModel;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.Image;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.ImageIds;
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
     * @param addImageOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Image object if successful.
     */
    @Deprecated
    Image addImage(String listId, AddImageOptionalParameter addImageOptionalParameter);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param addImageOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Image object
     */
    @Deprecated
    Observable<Image> addImageAsync(String listId, AddImageOptionalParameter addImageOptionalParameter);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @return the first stage of the addImage call
     */
    ListManagementImagesAddImageDefinitionStages.WithListId addImage();

    /**
     * Grouping of addImage definition stages.
     */
    interface ListManagementImagesAddImageDefinitionStages {
        /**
         * The stage of the definition to be specify listId.
         */
        interface WithListId {
            /**
             * List Id of the image list.
             *
             * @return next definition stage
             */
            ListManagementImagesAddImageDefinitionStages.WithExecute withListId(String listId);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * Tag for the image.
             *
             * @return next definition stage
             */
            ListManagementImagesAddImageDefinitionStages.WithExecute withTag(Integer tag);

            /**
             * The image label.
             *
             * @return next definition stage
             */
            ListManagementImagesAddImageDefinitionStages.WithExecute withLabel(String label);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends ListManagementImagesAddImageDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the Image object if successful.
             */
            Image execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the Image object
             */
            Observable<Image> executeAsync();
        }
    }

    /**
     * The entirety of addImage definition.
     */
    interface ListManagementImagesAddImageDefinition extends
        ListManagementImagesAddImageDefinitionStages.WithListId,
        ListManagementImagesAddImageDefinitionStages.WithExecute {
    }


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
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> deleteAllImagesAsync(String listId);



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
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImageIds object
     */
    Observable<ImageIds> getAllImageIdsAsync(String listId);



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
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    Observable<String> deleteImageAsync(String listId, String imageId);


    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param addImageUrlInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Image object if successful.
     */
    @Deprecated
    Image addImageUrlInput(String listId, String contentType, BodyModelModel imageUrl, AddImageUrlInputOptionalParameter addImageUrlInputOptionalParameter);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param imageUrl The image url.
     * @param addImageUrlInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Image object
     */
    @Deprecated
    Observable<Image> addImageUrlInputAsync(String listId, String contentType, BodyModelModel imageUrl, AddImageUrlInputOptionalParameter addImageUrlInputOptionalParameter);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @return the first stage of the addImageUrlInput call
     */
    ListManagementImagesAddImageUrlInputDefinitionStages.WithListId addImageUrlInput();

    /**
     * Grouping of addImageUrlInput definition stages.
     */
    interface ListManagementImagesAddImageUrlInputDefinitionStages {
        /**
         * The stage of the definition to be specify listId.
         */
        interface WithListId {
            /**
             * List Id of the image list.
             *
             * @return next definition stage
             */
            WithContentType withListId(String listId);
        }
        /**
         * The stage of the definition to be specify contentType.
         */
        interface WithContentType {
            /**
             * The content type.
             *
             * @return next definition stage
             */
            WithImageUrl withContentType(String contentType);
        }
        /**
         * The stage of the definition to be specify imageUrl.
         */
        interface WithImageUrl {
            /**
             * The image url.
             *
             * @return next definition stage
             */
            ListManagementImagesAddImageUrlInputDefinitionStages.WithExecute withImageUrl(BodyModelModel imageUrl);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * Tag for the image.
             *
             * @return next definition stage
             */
            ListManagementImagesAddImageUrlInputDefinitionStages.WithExecute withTag(Integer tag);

            /**
             * The image label.
             *
             * @return next definition stage
             */
            ListManagementImagesAddImageUrlInputDefinitionStages.WithExecute withLabel(String label);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends ListManagementImagesAddImageUrlInputDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the Image object if successful.
             */
            Image execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the Image object
             */
            Observable<Image> executeAsync();
        }
    }

    /**
     * The entirety of addImageUrlInput definition.
     */
    interface ListManagementImagesAddImageUrlInputDefinition extends
        ListManagementImagesAddImageUrlInputDefinitionStages.WithListId,
        ListManagementImagesAddImageUrlInputDefinitionStages.WithContentType,
        ListManagementImagesAddImageUrlInputDefinitionStages.WithImageUrl,
        ListManagementImagesAddImageUrlInputDefinitionStages.WithExecute {
    }

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageStream The image file.
     * @param addImageFileInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Image object if successful.
     */
    @Deprecated
    Image addImageFileInput(String listId, byte[] imageStream, AddImageFileInputOptionalParameter addImageFileInputOptionalParameter);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param imageStream The image file.
     * @param addImageFileInputOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Image object
     */
    @Deprecated
    Observable<Image> addImageFileInputAsync(String listId, byte[] imageStream, AddImageFileInputOptionalParameter addImageFileInputOptionalParameter);

    /**
     * Add an image to the list with list Id equal to list Id passed.
     *
     * @return the first stage of the addImageFileInput call
     */
    ListManagementImagesAddImageFileInputDefinitionStages.WithListId addImageFileInput();

    /**
     * Grouping of addImageFileInput definition stages.
     */
    interface ListManagementImagesAddImageFileInputDefinitionStages {
        /**
         * The stage of the definition to be specify listId.
         */
        interface WithListId {
            /**
             * List Id of the image list.
             *
             * @return next definition stage
             */
            WithImageStream withListId(String listId);
        }
        /**
         * The stage of the definition to be specify imageStream.
         */
        interface WithImageStream {
            /**
             * The image file.
             *
             * @return next definition stage
             */
            ListManagementImagesAddImageFileInputDefinitionStages.WithExecute withImageStream(byte[] imageStream);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * Tag for the image.
             *
             * @return next definition stage
             */
            ListManagementImagesAddImageFileInputDefinitionStages.WithExecute withTag(Integer tag);

            /**
             * The image label.
             *
             * @return next definition stage
             */
            ListManagementImagesAddImageFileInputDefinitionStages.WithExecute withLabel(String label);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends ListManagementImagesAddImageFileInputDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the Image object if successful.
             */
            Image execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the Image object
             */
            Observable<Image> executeAsync();
        }
    }

    /**
     * The entirety of addImageFileInput definition.
     */
    interface ListManagementImagesAddImageFileInputDefinition extends
        ListManagementImagesAddImageFileInputDefinitionStages.WithListId,
        ListManagementImagesAddImageFileInputDefinitionStages.WithImageStream,
        ListManagementImagesAddImageFileInputDefinitionStages.WithExecute {
    }

}
