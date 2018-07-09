/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi;

import com.microsoft.azure.cognitiveservices.vision.faceapi.models.CreateFaceListsOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.UpdateFaceListsOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.AddFaceFromUrlOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.AddFaceFromStreamOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.FaceList;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.PersistedFace;
import java.util.List;
import java.util.UUID;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in FaceLists.
 */
public interface FaceLists {
    /**
     * Create an empty face list. Up to 64 face lists are allowed to exist in one subscription.
     *
     * @param faceListId Id referencing a particular face list.
     * @param createOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    
    void create(String faceListId, CreateFaceListsOptionalParameter createOptionalParameter);

    /**
     * Create an empty face list. Up to 64 face lists are allowed to exist in one subscription.
     *
     * @param faceListId Id referencing a particular face list.
     * @param createOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a representation of the deferred computation of this call if successful.
     */
    
    Observable<Void> createAsync(String faceListId, CreateFaceListsOptionalParameter createOptionalParameter);

    /**
     * Create an empty face list. Up to 64 face lists are allowed to exist in one subscription.
     *
     * @return the first stage of the create call
     */
    FaceListsCreateDefinitionStages.WithFaceListId create();

    /**
     * Grouping of create definition stages.
     */
    interface FaceListsCreateDefinitionStages {
        /**
         * The stage of the definition to be specify faceListId.
         */
        interface WithFaceListId {
            /**
             * Id referencing a particular face list.
             *
             * @return next definition stage
             */
            FaceListsCreateDefinitionStages.WithExecute withFaceListId(String faceListId);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * User defined name, maximum length is 128.
             *
             * @return next definition stage
             */
            FaceListsCreateDefinitionStages.WithExecute withName(String name);

            /**
             * User specified data. Length should not exceed 16KB.
             *
             * @return next definition stage
             */
            FaceListsCreateDefinitionStages.WithExecute withUserData(String userData);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends FaceListsCreateDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             */
            void execute();

            /**
             * Execute the request asynchronously.
             *
             * @return a representation of the deferred computation of this call if successful.
             */
            Observable<Void> executeAsync();
        }
    }

    /**
     * The entirety of create definition.
     */
    interface FaceListsCreateDefinition extends
        FaceListsCreateDefinitionStages.WithFaceListId,
        FaceListsCreateDefinitionStages.WithExecute {
    }


    /**
     * Retrieve a face list's information.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FaceList object if successful.
     */
    FaceList get(String faceListId);

    /**
     * Retrieve a face list's information.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FaceList object
     */
    Observable<FaceList> getAsync(String faceListId);


    /**
     * Update information of a face list.
     *
     * @param faceListId Id referencing a particular face list.
     * @param updateOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    
    void update(String faceListId, UpdateFaceListsOptionalParameter updateOptionalParameter);

    /**
     * Update information of a face list.
     *
     * @param faceListId Id referencing a particular face list.
     * @param updateOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a representation of the deferred computation of this call if successful.
     */
    
    Observable<Void> updateAsync(String faceListId, UpdateFaceListsOptionalParameter updateOptionalParameter);

    /**
     * Update information of a face list.
     *
     * @return the first stage of the update call
     */
    FaceListsUpdateDefinitionStages.WithFaceListId update();

    /**
     * Grouping of update definition stages.
     */
    interface FaceListsUpdateDefinitionStages {
        /**
         * The stage of the definition to be specify faceListId.
         */
        interface WithFaceListId {
            /**
             * Id referencing a particular face list.
             *
             * @return next definition stage
             */
            FaceListsUpdateDefinitionStages.WithExecute withFaceListId(String faceListId);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * User defined name, maximum length is 128.
             *
             * @return next definition stage
             */
            FaceListsUpdateDefinitionStages.WithExecute withName(String name);

            /**
             * User specified data. Length should not exceed 16KB.
             *
             * @return next definition stage
             */
            FaceListsUpdateDefinitionStages.WithExecute withUserData(String userData);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends FaceListsUpdateDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             */
            void execute();

            /**
             * Execute the request asynchronously.
             *
             * @return a representation of the deferred computation of this call if successful.
             */
            Observable<Void> executeAsync();
        }
    }

    /**
     * The entirety of update definition.
     */
    interface FaceListsUpdateDefinition extends
        FaceListsUpdateDefinitionStages.WithFaceListId,
        FaceListsUpdateDefinitionStages.WithExecute {
    }


    /**
     * Delete an existing face list according to faceListId. Persisted face images in the face list will
      *  also be deleted.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String faceListId);

    /**
     * Delete an existing face list according to faceListId. Persisted face images in the face list will
      *  also be deleted.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a representation of the deferred computation of this call if successful.
     */
    Observable<Void> deleteAsync(String faceListId);



    /**
     * Retrieve information about all existing face lists. Only faceListId, name and userData will be
      *  returned.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;FaceList&gt; object if successful.
     */
    List<FaceList> list();

    /**
     * Retrieve information about all existing face lists. Only faceListId, name and userData will be
      *  returned.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;FaceList&gt; object
     */
    Observable<List<FaceList>> listAsync();



    /**
     * Delete an existing face from a face list (given by a persisitedFaceId and a faceListId). Persisted
      *  image related to the face will also be deleted.
     *
     * @param faceListId Id referencing a particular face list.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void deleteFace(String faceListId, UUID persistedFaceId);

    /**
     * Delete an existing face from a face list (given by a persisitedFaceId and a faceListId). Persisted
      *  image related to the face will also be deleted.
     *
     * @param faceListId Id referencing a particular face list.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a representation of the deferred computation of this call if successful.
     */
    Observable<Void> deleteFaceAsync(String faceListId, UUID persistedFaceId);


    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a
     *   persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param url Publicly reachable URL of an image.
     * @param addFaceFromUrlOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PersistedFace object if successful.
     */
    
    PersistedFace addFaceFromUrl(String faceListId, String url, AddFaceFromUrlOptionalParameter addFaceFromUrlOptionalParameter);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a
     *   persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param url Publicly reachable URL of an image.
     * @param addFaceFromUrlOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PersistedFace object
     */
    
    Observable<PersistedFace> addFaceFromUrlAsync(String faceListId, String url, AddFaceFromUrlOptionalParameter addFaceFromUrlOptionalParameter);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a
     *   persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @return the first stage of the addFaceFromUrl call
     */
    FaceListsAddFaceFromUrlDefinitionStages.WithFaceListId addFaceFromUrl();

    /**
     * Grouping of addFaceFromUrl definition stages.
     */
    interface FaceListsAddFaceFromUrlDefinitionStages {
        /**
         * The stage of the definition to be specify faceListId.
         */
        interface WithFaceListId {
            /**
             * Id referencing a particular face list.
             *
             * @return next definition stage
             */
            WithUrl withFaceListId(String faceListId);
        }
        /**
         * The stage of the definition to be specify url.
         */
        interface WithUrl {
            /**
             * Publicly reachable URL of an image.
             *
             * @return next definition stage
             */
            FaceListsAddFaceFromUrlDefinitionStages.WithExecute withUrl(String url);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * User-specified data about the face for any purpose. The maximum length is 1KB.
             *
             * @return next definition stage
             */
            FaceListsAddFaceFromUrlDefinitionStages.WithExecute withUserData(String userData);

            /**
             * A face rectangle to specify the target face to be added to a person in the format of
             *   "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the
             *   image, targetFace is required to specify which face to add. No targetFace means there is only one face
             *   detected in the entire image.
             *
             * @return next definition stage
             */
            FaceListsAddFaceFromUrlDefinitionStages.WithExecute withTargetFace(List<Integer> targetFace);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends FaceListsAddFaceFromUrlDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the PersistedFace object if successful.
             */
            PersistedFace execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the PersistedFace object
             */
            Observable<PersistedFace> executeAsync();
        }
    }

    /**
     * The entirety of addFaceFromUrl definition.
     */
    interface FaceListsAddFaceFromUrlDefinition extends
        FaceListsAddFaceFromUrlDefinitionStages.WithFaceListId,
        FaceListsAddFaceFromUrlDefinitionStages.WithUrl,
        FaceListsAddFaceFromUrlDefinitionStages.WithExecute {
    }

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a
     *   persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param image An image stream.
     * @param addFaceFromStreamOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PersistedFace object if successful.
     */
    
    PersistedFace addFaceFromStream(String faceListId, byte[] image, AddFaceFromStreamOptionalParameter addFaceFromStreamOptionalParameter);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a
     *   persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param image An image stream.
     * @param addFaceFromStreamOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PersistedFace object
     */
    
    Observable<PersistedFace> addFaceFromStreamAsync(String faceListId, byte[] image, AddFaceFromStreamOptionalParameter addFaceFromStreamOptionalParameter);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a
     *   persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @return the first stage of the addFaceFromStream call
     */
    FaceListsAddFaceFromStreamDefinitionStages.WithFaceListId addFaceFromStream();

    /**
     * Grouping of addFaceFromStream definition stages.
     */
    interface FaceListsAddFaceFromStreamDefinitionStages {
        /**
         * The stage of the definition to be specify faceListId.
         */
        interface WithFaceListId {
            /**
             * Id referencing a particular face list.
             *
             * @return next definition stage
             */
            WithImage withFaceListId(String faceListId);
        }
        /**
         * The stage of the definition to be specify image.
         */
        interface WithImage {
            /**
             * An image stream.
             *
             * @return next definition stage
             */
            FaceListsAddFaceFromStreamDefinitionStages.WithExecute withImage(byte[] image);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * User-specified data about the face for any purpose. The maximum length is 1KB.
             *
             * @return next definition stage
             */
            FaceListsAddFaceFromStreamDefinitionStages.WithExecute withUserData(String userData);

            /**
             * A face rectangle to specify the target face to be added to a person in the format of
             *   "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the
             *   image, targetFace is required to specify which face to add. No targetFace means there is only one face
             *   detected in the entire image.
             *
             * @return next definition stage
             */
            FaceListsAddFaceFromStreamDefinitionStages.WithExecute withTargetFace(List<Integer> targetFace);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends FaceListsAddFaceFromStreamDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the PersistedFace object if successful.
             */
            PersistedFace execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the PersistedFace object
             */
            Observable<PersistedFace> executeAsync();
        }
    }

    /**
     * The entirety of addFaceFromStream definition.
     */
    interface FaceListsAddFaceFromStreamDefinition extends
        FaceListsAddFaceFromStreamDefinitionStages.WithFaceListId,
        FaceListsAddFaceFromStreamDefinitionStages.WithImage,
        FaceListsAddFaceFromStreamDefinitionStages.WithExecute {
    }

}
