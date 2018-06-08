/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi;

import com.microsoft.azure.cognitiveservices.vision.faceapi.models.CreatePersonGroupPersonsOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.ListPersonGroupPersonsOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.UpdatePersonGroupPersonsOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.UpdateFaceOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.AddPersonFaceFromUrlOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.AddPersonFaceFromStreamOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.PersistedFace;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.Person;
import java.util.List;
import java.util.UUID;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PersonGroupPersons.
 */
public interface PersonGroupPersons {
    /**
     * Create a new person in a specified person group.
     *
     * @param personGroupId Id referencing a particular person group.
     * @param createOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Person object if successful.
     */
    
    Person create(String personGroupId, CreatePersonGroupPersonsOptionalParameter createOptionalParameter);

    /**
     * Create a new person in a specified person group.
     *
     * @param personGroupId Id referencing a particular person group.
     * @param createOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Person object
     */
    
    Observable<Person> createAsync(String personGroupId, CreatePersonGroupPersonsOptionalParameter createOptionalParameter);

    /**
     * Create a new person in a specified person group.
     *
     * @return the first stage of the create call
     */
    PersonGroupPersonsCreateDefinitionStages.WithPersonGroupId create();

    /**
     * Grouping of create definition stages.
     */
    interface PersonGroupPersonsCreateDefinitionStages {
        /**
         * The stage of the definition to be specify personGroupId.
         */
        interface WithPersonGroupId {
            /**
             * Id referencing a particular person group.
             *
             * @return next definition stage
             */
            PersonGroupPersonsCreateDefinitionStages.WithExecute withPersonGroupId(String personGroupId);
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
            PersonGroupPersonsCreateDefinitionStages.WithExecute withName(String name);

            /**
             * User specified data. Length should not exceed 16KB.
             *
             * @return next definition stage
             */
            PersonGroupPersonsCreateDefinitionStages.WithExecute withUserData(String userData);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends PersonGroupPersonsCreateDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the Person object if successful.
             */
            Person execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the Person object
             */
            Observable<Person> executeAsync();
        }
    }

    /**
     * The entirety of create definition.
     */
    interface PersonGroupPersonsCreateDefinition extends
        PersonGroupPersonsCreateDefinitionStages.WithPersonGroupId,
        PersonGroupPersonsCreateDefinitionStages.WithExecute {
    }

    /**
     * List all persons in a person group, and retrieve person information (including personId, name, userData and
     *   persistedFaceIds of registered faces of the person).
     *
     * @param personGroupId Id referencing a particular person group.
     * @param listOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;Person&gt; object if successful.
     */
    
    List<Person> list(String personGroupId, ListPersonGroupPersonsOptionalParameter listOptionalParameter);

    /**
     * List all persons in a person group, and retrieve person information (including personId, name, userData and
     *   persistedFaceIds of registered faces of the person).
     *
     * @param personGroupId Id referencing a particular person group.
     * @param listOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;Person&gt; object
     */
    
    Observable<List<Person>> listAsync(String personGroupId, ListPersonGroupPersonsOptionalParameter listOptionalParameter);

    /**
     * List all persons in a person group, and retrieve person information (including personId, name, userData and
     *   persistedFaceIds of registered faces of the person).
     *
     * @return the first stage of the list call
     */
    PersonGroupPersonsListDefinitionStages.WithPersonGroupId list();

    /**
     * Grouping of list definition stages.
     */
    interface PersonGroupPersonsListDefinitionStages {
        /**
         * The stage of the definition to be specify personGroupId.
         */
        interface WithPersonGroupId {
            /**
             * Id referencing a particular person group.
             *
             * @return next definition stage
             */
            PersonGroupPersonsListDefinitionStages.WithExecute withPersonGroupId(String personGroupId);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * Starting person id to return (used to list a range of persons).
             *
             * @return next definition stage
             */
            PersonGroupPersonsListDefinitionStages.WithExecute withStart(String start);

            /**
             * Number of persons to return starting with the person id indicated by the 'start' parameter.
             *
             * @return next definition stage
             */
            PersonGroupPersonsListDefinitionStages.WithExecute withTop(Integer top);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends PersonGroupPersonsListDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the List&lt;Person&gt; object if successful.
             */
            List<Person> execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the List&lt;Person&gt; object
             */
            Observable<List<Person>> executeAsync();
        }
    }

    /**
     * The entirety of list definition.
     */
    interface PersonGroupPersonsListDefinition extends
        PersonGroupPersonsListDefinitionStages.WithPersonGroupId,
        PersonGroupPersonsListDefinitionStages.WithExecute {
    }


    /**
     * Delete an existing person from a person group. Persisted face images of the person will also be
      *  deleted.
     *
     * @param personGroupId Id referencing a particular person group.
     * @param personId Id referencing a particular person.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String personGroupId, UUID personId);

    /**
     * Delete an existing person from a person group. Persisted face images of the person will also be
      *  deleted.
     *
     * @param personGroupId Id referencing a particular person group.
     * @param personId Id referencing a particular person.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a representation of the deferred computation of this call if successful.
     */
    Observable<Void> deleteAsync(String personGroupId, UUID personId);



    /**
     * Retrieve a person's information, including registered persisted faces, name and userData.
     *
     * @param personGroupId Id referencing a particular person group.
     * @param personId Id referencing a particular person.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Person object if successful.
     */
    Person get(String personGroupId, UUID personId);

    /**
     * Retrieve a person's information, including registered persisted faces, name and userData.
     *
     * @param personGroupId Id referencing a particular person group.
     * @param personId Id referencing a particular person.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Person object
     */
    Observable<Person> getAsync(String personGroupId, UUID personId);


    /**
     * Update name or userData of a person.
     *
     * @param personGroupId Id referencing a particular person group.
     * @param personId Id referencing a particular person.
     * @param updateOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    
    void update(String personGroupId, UUID personId, UpdatePersonGroupPersonsOptionalParameter updateOptionalParameter);

    /**
     * Update name or userData of a person.
     *
     * @param personGroupId Id referencing a particular person group.
     * @param personId Id referencing a particular person.
     * @param updateOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a representation of the deferred computation of this call if successful.
     */
    
    Observable<Void> updateAsync(String personGroupId, UUID personId, UpdatePersonGroupPersonsOptionalParameter updateOptionalParameter);

    /**
     * Update name or userData of a person.
     *
     * @return the first stage of the update call
     */
    PersonGroupPersonsUpdateDefinitionStages.WithPersonGroupId update();

    /**
     * Grouping of update definition stages.
     */
    interface PersonGroupPersonsUpdateDefinitionStages {
        /**
         * The stage of the definition to be specify personGroupId.
         */
        interface WithPersonGroupId {
            /**
             * Id referencing a particular person group.
             *
             * @return next definition stage
             */
            WithPersonId withPersonGroupId(String personGroupId);
        }
        /**
         * The stage of the definition to be specify personId.
         */
        interface WithPersonId {
            /**
             * Id referencing a particular person.
             *
             * @return next definition stage
             */
            PersonGroupPersonsUpdateDefinitionStages.WithExecute withPersonId(UUID personId);
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
            PersonGroupPersonsUpdateDefinitionStages.WithExecute withName(String name);

            /**
             * User specified data. Length should not exceed 16KB.
             *
             * @return next definition stage
             */
            PersonGroupPersonsUpdateDefinitionStages.WithExecute withUserData(String userData);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends PersonGroupPersonsUpdateDefinitionStages.WithAllOptions {
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
    interface PersonGroupPersonsUpdateDefinition extends
        PersonGroupPersonsUpdateDefinitionStages.WithPersonGroupId,
        PersonGroupPersonsUpdateDefinitionStages.WithPersonId,
        PersonGroupPersonsUpdateDefinitionStages.WithExecute {
    }


    /**
     * Delete a face from a person. Relative image for the persisted face will also be deleted.
     *
     * @param personGroupId Id referencing a particular person group.
     * @param personId Id referencing a particular person.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void deleteFace(String personGroupId, UUID personId, UUID persistedFaceId);

    /**
     * Delete a face from a person. Relative image for the persisted face will also be deleted.
     *
     * @param personGroupId Id referencing a particular person group.
     * @param personId Id referencing a particular person.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a representation of the deferred computation of this call if successful.
     */
    Observable<Void> deleteFaceAsync(String personGroupId, UUID personId, UUID persistedFaceId);



    /**
     * Retrieve information about a persisted face (specified by persistedFaceId, personId and its
      *  belonging personGroupId).
     *
     * @param personGroupId Id referencing a particular person group.
     * @param personId Id referencing a particular person.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PersistedFace object if successful.
     */
    PersistedFace getFace(String personGroupId, UUID personId, UUID persistedFaceId);

    /**
     * Retrieve information about a persisted face (specified by persistedFaceId, personId and its
      *  belonging personGroupId).
     *
     * @param personGroupId Id referencing a particular person group.
     * @param personId Id referencing a particular person.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PersistedFace object
     */
    Observable<PersistedFace> getFaceAsync(String personGroupId, UUID personId, UUID persistedFaceId);


    /**
     * Update a person persisted face's userData field.
     *
     * @param personGroupId Id referencing a particular person group.
     * @param personId Id referencing a particular person.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @param updateFaceOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    
    void updateFace(String personGroupId, UUID personId, UUID persistedFaceId, UpdateFaceOptionalParameter updateFaceOptionalParameter);

    /**
     * Update a person persisted face's userData field.
     *
     * @param personGroupId Id referencing a particular person group.
     * @param personId Id referencing a particular person.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @param updateFaceOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a representation of the deferred computation of this call if successful.
     */
    
    Observable<Void> updateFaceAsync(String personGroupId, UUID personId, UUID persistedFaceId, UpdateFaceOptionalParameter updateFaceOptionalParameter);

    /**
     * Update a person persisted face's userData field.
     *
     * @return the first stage of the updateFace call
     */
    PersonGroupPersonsUpdateFaceDefinitionStages.WithPersonGroupId updateFace();

    /**
     * Grouping of updateFace definition stages.
     */
    interface PersonGroupPersonsUpdateFaceDefinitionStages {
        /**
         * The stage of the definition to be specify personGroupId.
         */
        interface WithPersonGroupId {
            /**
             * Id referencing a particular person group.
             *
             * @return next definition stage
             */
            WithPersonId withPersonGroupId(String personGroupId);
        }
        /**
         * The stage of the definition to be specify personId.
         */
        interface WithPersonId {
            /**
             * Id referencing a particular person.
             *
             * @return next definition stage
             */
            WithPersistedFaceId withPersonId(UUID personId);
        }
        /**
         * The stage of the definition to be specify persistedFaceId.
         */
        interface WithPersistedFaceId {
            /**
             * Id referencing a particular persistedFaceId of an existing face.
             *
             * @return next definition stage
             */
            PersonGroupPersonsUpdateFaceDefinitionStages.WithExecute withPersistedFaceId(UUID persistedFaceId);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * User-provided data attached to the face. The size limit is 1KB.
             *
             * @return next definition stage
             */
            PersonGroupPersonsUpdateFaceDefinitionStages.WithExecute withUserData(String userData);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends PersonGroupPersonsUpdateFaceDefinitionStages.WithAllOptions {
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
     * The entirety of updateFace definition.
     */
    interface PersonGroupPersonsUpdateFaceDefinition extends
        PersonGroupPersonsUpdateFaceDefinitionStages.WithPersonGroupId,
        PersonGroupPersonsUpdateFaceDefinitionStages.WithPersonId,
        PersonGroupPersonsUpdateFaceDefinitionStages.WithPersistedFaceId,
        PersonGroupPersonsUpdateFaceDefinitionStages.WithExecute {
    }

    /**
     * Add a representative face to a person for identification. The input face is specified as an image with a
     *   targetFace rectangle.
     *
     * @param personGroupId Id referencing a particular person group.
     * @param personId Id referencing a particular person.
     * @param url Publicly reachable URL of an image.
     * @param addPersonFaceFromUrlOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PersistedFace object if successful.
     */
    
    PersistedFace addPersonFaceFromUrl(String personGroupId, UUID personId, String url, AddPersonFaceFromUrlOptionalParameter addPersonFaceFromUrlOptionalParameter);

    /**
     * Add a representative face to a person for identification. The input face is specified as an image with a
     *   targetFace rectangle.
     *
     * @param personGroupId Id referencing a particular person group.
     * @param personId Id referencing a particular person.
     * @param url Publicly reachable URL of an image.
     * @param addPersonFaceFromUrlOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PersistedFace object
     */
    
    Observable<PersistedFace> addPersonFaceFromUrlAsync(String personGroupId, UUID personId, String url, AddPersonFaceFromUrlOptionalParameter addPersonFaceFromUrlOptionalParameter);

    /**
     * Add a representative face to a person for identification. The input face is specified as an image with a
     *   targetFace rectangle.
     *
     * @return the first stage of the addPersonFaceFromUrl call
     */
    PersonGroupPersonsAddPersonFaceFromUrlDefinitionStages.WithPersonGroupId addPersonFaceFromUrl();

    /**
     * Grouping of addPersonFaceFromUrl definition stages.
     */
    interface PersonGroupPersonsAddPersonFaceFromUrlDefinitionStages {
        /**
         * The stage of the definition to be specify personGroupId.
         */
        interface WithPersonGroupId {
            /**
             * Id referencing a particular person group.
             *
             * @return next definition stage
             */
            WithPersonId withPersonGroupId(String personGroupId);
        }
        /**
         * The stage of the definition to be specify personId.
         */
        interface WithPersonId {
            /**
             * Id referencing a particular person.
             *
             * @return next definition stage
             */
            WithUrl withPersonId(UUID personId);
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
            PersonGroupPersonsAddPersonFaceFromUrlDefinitionStages.WithExecute withUrl(String url);
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
            PersonGroupPersonsAddPersonFaceFromUrlDefinitionStages.WithExecute withUserData(String userData);

            /**
             * A face rectangle to specify the target face to be added to a person in the format of
             *   "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the
             *   image, targetFace is required to specify which face to add. No targetFace means there is only one face
             *   detected in the entire image.
             *
             * @return next definition stage
             */
            PersonGroupPersonsAddPersonFaceFromUrlDefinitionStages.WithExecute withTargetFace(List<Integer> targetFace);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends PersonGroupPersonsAddPersonFaceFromUrlDefinitionStages.WithAllOptions {
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
     * The entirety of addPersonFaceFromUrl definition.
     */
    interface PersonGroupPersonsAddPersonFaceFromUrlDefinition extends
        PersonGroupPersonsAddPersonFaceFromUrlDefinitionStages.WithPersonGroupId,
        PersonGroupPersonsAddPersonFaceFromUrlDefinitionStages.WithPersonId,
        PersonGroupPersonsAddPersonFaceFromUrlDefinitionStages.WithUrl,
        PersonGroupPersonsAddPersonFaceFromUrlDefinitionStages.WithExecute {
    }

    /**
     * Add a representative face to a person for identification. The input face is specified as an image with a
     *   targetFace rectangle.
     *
     * @param personGroupId Id referencing a particular person group.
     * @param personId Id referencing a particular person.
     * @param image An image stream.
     * @param addPersonFaceFromStreamOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PersistedFace object if successful.
     */
    
    PersistedFace addPersonFaceFromStream(String personGroupId, UUID personId, byte[] image, AddPersonFaceFromStreamOptionalParameter addPersonFaceFromStreamOptionalParameter);

    /**
     * Add a representative face to a person for identification. The input face is specified as an image with a
     *   targetFace rectangle.
     *
     * @param personGroupId Id referencing a particular person group.
     * @param personId Id referencing a particular person.
     * @param image An image stream.
     * @param addPersonFaceFromStreamOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PersistedFace object
     */
    
    Observable<PersistedFace> addPersonFaceFromStreamAsync(String personGroupId, UUID personId, byte[] image, AddPersonFaceFromStreamOptionalParameter addPersonFaceFromStreamOptionalParameter);

    /**
     * Add a representative face to a person for identification. The input face is specified as an image with a
     *   targetFace rectangle.
     *
     * @return the first stage of the addPersonFaceFromStream call
     */
    PersonGroupPersonsAddPersonFaceFromStreamDefinitionStages.WithPersonGroupId addPersonFaceFromStream();

    /**
     * Grouping of addPersonFaceFromStream definition stages.
     */
    interface PersonGroupPersonsAddPersonFaceFromStreamDefinitionStages {
        /**
         * The stage of the definition to be specify personGroupId.
         */
        interface WithPersonGroupId {
            /**
             * Id referencing a particular person group.
             *
             * @return next definition stage
             */
            WithPersonId withPersonGroupId(String personGroupId);
        }
        /**
         * The stage of the definition to be specify personId.
         */
        interface WithPersonId {
            /**
             * Id referencing a particular person.
             *
             * @return next definition stage
             */
            WithImage withPersonId(UUID personId);
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
            PersonGroupPersonsAddPersonFaceFromStreamDefinitionStages.WithExecute withImage(byte[] image);
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
            PersonGroupPersonsAddPersonFaceFromStreamDefinitionStages.WithExecute withUserData(String userData);

            /**
             * A face rectangle to specify the target face to be added to a person in the format of
             *   "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the
             *   image, targetFace is required to specify which face to add. No targetFace means there is only one face
             *   detected in the entire image.
             *
             * @return next definition stage
             */
            PersonGroupPersonsAddPersonFaceFromStreamDefinitionStages.WithExecute withTargetFace(List<Integer> targetFace);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends PersonGroupPersonsAddPersonFaceFromStreamDefinitionStages.WithAllOptions {
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
     * The entirety of addPersonFaceFromStream definition.
     */
    interface PersonGroupPersonsAddPersonFaceFromStreamDefinition extends
        PersonGroupPersonsAddPersonFaceFromStreamDefinitionStages.WithPersonGroupId,
        PersonGroupPersonsAddPersonFaceFromStreamDefinitionStages.WithPersonId,
        PersonGroupPersonsAddPersonFaceFromStreamDefinitionStages.WithImage,
        PersonGroupPersonsAddPersonFaceFromStreamDefinitionStages.WithExecute {
    }

}
