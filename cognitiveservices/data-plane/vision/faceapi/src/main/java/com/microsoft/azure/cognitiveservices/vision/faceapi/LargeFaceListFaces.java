/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi;

import com.microsoft.azure.cognitiveservices.vision.faceapi.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.PersistedFace;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in LargeFaceListFaces.
 */
public interface LargeFaceListFaces {
    /**
     * List all faces in a large face list, and retrieve face information (including userData and persistedFaceIds of registered faces of the face).
     *
     * @param largeFaceListId Id referencing a particular large face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PersistedFace&gt; object if successful.
     */
    List<PersistedFace> list(String largeFaceListId);

    /**
     * List all faces in a large face list, and retrieve face information (including userData and persistedFaceIds of registered faces of the face).
     *
     * @param largeFaceListId Id referencing a particular large face list.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<PersistedFace>> listAsync(String largeFaceListId, final ServiceCallback<List<PersistedFace>> serviceCallback);

    /**
     * List all faces in a large face list, and retrieve face information (including userData and persistedFaceIds of registered faces of the face).
     *
     * @param largeFaceListId Id referencing a particular large face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PersistedFace&gt; object
     */
    Observable<List<PersistedFace>> listAsync(String largeFaceListId);

    /**
     * List all faces in a large face list, and retrieve face information (including userData and persistedFaceIds of registered faces of the face).
     *
     * @param largeFaceListId Id referencing a particular large face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PersistedFace&gt; object
     */
    Observable<ServiceResponse<List<PersistedFace>>> listWithServiceResponseAsync(String largeFaceListId);
    /**
     * List all faces in a large face list, and retrieve face information (including userData and persistedFaceIds of registered faces of the face).
     *
     * @param largeFaceListId Id referencing a particular large face list.
     * @param start Starting face id to return (used to list a range of faces).
     * @param top Number of faces to return starting with the face id indicated by the 'start' parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PersistedFace&gt; object if successful.
     */
    List<PersistedFace> list(String largeFaceListId, String start, Integer top);

    /**
     * List all faces in a large face list, and retrieve face information (including userData and persistedFaceIds of registered faces of the face).
     *
     * @param largeFaceListId Id referencing a particular large face list.
     * @param start Starting face id to return (used to list a range of faces).
     * @param top Number of faces to return starting with the face id indicated by the 'start' parameter.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<PersistedFace>> listAsync(String largeFaceListId, String start, Integer top, final ServiceCallback<List<PersistedFace>> serviceCallback);

    /**
     * List all faces in a large face list, and retrieve face information (including userData and persistedFaceIds of registered faces of the face).
     *
     * @param largeFaceListId Id referencing a particular large face list.
     * @param start Starting face id to return (used to list a range of faces).
     * @param top Number of faces to return starting with the face id indicated by the 'start' parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PersistedFace&gt; object
     */
    Observable<List<PersistedFace>> listAsync(String largeFaceListId, String start, Integer top);

    /**
     * List all faces in a large face list, and retrieve face information (including userData and persistedFaceIds of registered faces of the face).
     *
     * @param largeFaceListId Id referencing a particular large face list.
     * @param start Starting face id to return (used to list a range of faces).
     * @param top Number of faces to return starting with the face id indicated by the 'start' parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PersistedFace&gt; object
     */
    Observable<ServiceResponse<List<PersistedFace>>> listWithServiceResponseAsync(String largeFaceListId, String start, Integer top);

}
