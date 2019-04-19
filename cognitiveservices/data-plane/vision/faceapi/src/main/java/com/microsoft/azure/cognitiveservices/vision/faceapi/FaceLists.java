/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi;

import com.azure.common.http.rest.SimpleResponse;
import com.azure.common.http.rest.VoidResponse;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.FaceList;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.PersistedFace;
import com.microsoft.azure.cognitiveservices.vision.faceapi.models.RecognitionModel;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.UUID;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.annotation.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * FaceLists.
 */
public interface FaceLists {
    /**
     * Create an empty face list with user-specified faceListId, name, an optional userData and recognitionModel. Up to 64 face lists are allowed in one subscription.
     * &lt;br /&gt; Face list is a list of faces, up to 1,000 faces, and used by [Face - Find Similar](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395237).
     * &lt;br /&gt; After creation, user should use [FaceList - Add Face](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395250) to import the faces. Faces are stored on server until [FaceList - Delete](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039524f) is called.
     * &lt;br /&gt; Find Similar is used for scenario like finding celebrity-like faces, similar face filtering, or as a light way face identification. But if the actual use is to identify person, please use [PersonGroup](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395244) / [LargePersonGroup](/docs/services/563879b61984550e40cbbe8d/operations/599acdee6ac60f11b48b5a9d) and [Face - Identify](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395239).
     * &lt;br /&gt; Please consider [LargeFaceList](/docs/services/563879b61984550e40cbbe8d/operations/5a157b68d2de3616c086f2cc) when the face number is large. It can support up to 1,000,000 faces. 'recognitionModel' should be specified to associate with this face list. The default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify the model you need in this parameter. New faces that are added to an existing face list will use the recognition model that's already associated with the collection. Existing face features in a face list can't be updated to features extracted by another version of recognition model.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void create(@NonNull String faceListId);

    /**
     * Create an empty face list with user-specified faceListId, name, an optional userData and recognitionModel. Up to 64 face lists are allowed in one subscription.
     * &lt;br /&gt; Face list is a list of faces, up to 1,000 faces, and used by [Face - Find Similar](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395237).
     * &lt;br /&gt; After creation, user should use [FaceList - Add Face](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395250) to import the faces. Faces are stored on server until [FaceList - Delete](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039524f) is called.
     * &lt;br /&gt; Find Similar is used for scenario like finding celebrity-like faces, similar face filtering, or as a light way face identification. But if the actual use is to identify person, please use [PersonGroup](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395244) / [LargePersonGroup](/docs/services/563879b61984550e40cbbe8d/operations/599acdee6ac60f11b48b5a9d) and [Face - Identify](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395239).
     * &lt;br /&gt; Please consider [LargeFaceList](/docs/services/563879b61984550e40cbbe8d/operations/5a157b68d2de3616c086f2cc) when the face number is large. It can support up to 1,000,000 faces. 'recognitionModel' should be specified to associate with this face list. The default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify the model you need in this parameter. New faces that are added to an existing face list will use the recognition model that's already associated with the collection. Existing face features in a face list can't be updated to features extracted by another version of recognition model.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<VoidResponse> createWithRestResponseAsync(@NonNull String faceListId);

    /**
     * Create an empty face list with user-specified faceListId, name, an optional userData and recognitionModel. Up to 64 face lists are allowed in one subscription.
     * &lt;br /&gt; Face list is a list of faces, up to 1,000 faces, and used by [Face - Find Similar](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395237).
     * &lt;br /&gt; After creation, user should use [FaceList - Add Face](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395250) to import the faces. Faces are stored on server until [FaceList - Delete](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039524f) is called.
     * &lt;br /&gt; Find Similar is used for scenario like finding celebrity-like faces, similar face filtering, or as a light way face identification. But if the actual use is to identify person, please use [PersonGroup](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395244) / [LargePersonGroup](/docs/services/563879b61984550e40cbbe8d/operations/599acdee6ac60f11b48b5a9d) and [Face - Identify](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395239).
     * &lt;br /&gt; Please consider [LargeFaceList](/docs/services/563879b61984550e40cbbe8d/operations/5a157b68d2de3616c086f2cc) when the face number is large. It can support up to 1,000,000 faces. 'recognitionModel' should be specified to associate with this face list. The default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify the model you need in this parameter. New faces that are added to an existing face list will use the recognition model that's already associated with the collection. Existing face features in a face list can't be updated to features extracted by another version of recognition model.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Void> createAsync(@NonNull String faceListId);

    /**
     * Create an empty face list with user-specified faceListId, name, an optional userData and recognitionModel. Up to 64 face lists are allowed in one subscription.
     * &lt;br /&gt; Face list is a list of faces, up to 1,000 faces, and used by [Face - Find Similar](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395237).
     * &lt;br /&gt; After creation, user should use [FaceList - Add Face](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395250) to import the faces. Faces are stored on server until [FaceList - Delete](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039524f) is called.
     * &lt;br /&gt; Find Similar is used for scenario like finding celebrity-like faces, similar face filtering, or as a light way face identification. But if the actual use is to identify person, please use [PersonGroup](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395244) / [LargePersonGroup](/docs/services/563879b61984550e40cbbe8d/operations/599acdee6ac60f11b48b5a9d) and [Face - Identify](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395239).
     * &lt;br /&gt; Please consider [LargeFaceList](/docs/services/563879b61984550e40cbbe8d/operations/5a157b68d2de3616c086f2cc) when the face number is large. It can support up to 1,000,000 faces. 'recognitionModel' should be specified to associate with this face list. The default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify the model you need in this parameter. New faces that are added to an existing face list will use the recognition model that's already associated with the collection. Existing face features in a face list can't be updated to features extracted by another version of recognition model.
     *
     * @param faceListId Id referencing a particular face list.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @param recognitionModel Possible values include: 'recognition_01', 'recognition_02'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void create(@NonNull String faceListId, String name, String userData, RecognitionModel recognitionModel);

    /**
     * Create an empty face list with user-specified faceListId, name, an optional userData and recognitionModel. Up to 64 face lists are allowed in one subscription.
     * &lt;br /&gt; Face list is a list of faces, up to 1,000 faces, and used by [Face - Find Similar](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395237).
     * &lt;br /&gt; After creation, user should use [FaceList - Add Face](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395250) to import the faces. Faces are stored on server until [FaceList - Delete](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039524f) is called.
     * &lt;br /&gt; Find Similar is used for scenario like finding celebrity-like faces, similar face filtering, or as a light way face identification. But if the actual use is to identify person, please use [PersonGroup](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395244) / [LargePersonGroup](/docs/services/563879b61984550e40cbbe8d/operations/599acdee6ac60f11b48b5a9d) and [Face - Identify](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395239).
     * &lt;br /&gt; Please consider [LargeFaceList](/docs/services/563879b61984550e40cbbe8d/operations/5a157b68d2de3616c086f2cc) when the face number is large. It can support up to 1,000,000 faces. 'recognitionModel' should be specified to associate with this face list. The default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify the model you need in this parameter. New faces that are added to an existing face list will use the recognition model that's already associated with the collection. Existing face features in a face list can't be updated to features extracted by another version of recognition model.
     *
     * @param faceListId Id referencing a particular face list.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @param recognitionModel Possible values include: 'recognition_01', 'recognition_02'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<VoidResponse> createWithRestResponseAsync(@NonNull String faceListId, String name, String userData, RecognitionModel recognitionModel);

    /**
     * Create an empty face list with user-specified faceListId, name, an optional userData and recognitionModel. Up to 64 face lists are allowed in one subscription.
     * &lt;br /&gt; Face list is a list of faces, up to 1,000 faces, and used by [Face - Find Similar](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395237).
     * &lt;br /&gt; After creation, user should use [FaceList - Add Face](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395250) to import the faces. Faces are stored on server until [FaceList - Delete](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039524f) is called.
     * &lt;br /&gt; Find Similar is used for scenario like finding celebrity-like faces, similar face filtering, or as a light way face identification. But if the actual use is to identify person, please use [PersonGroup](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395244) / [LargePersonGroup](/docs/services/563879b61984550e40cbbe8d/operations/599acdee6ac60f11b48b5a9d) and [Face - Identify](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f30395239).
     * &lt;br /&gt; Please consider [LargeFaceList](/docs/services/563879b61984550e40cbbe8d/operations/5a157b68d2de3616c086f2cc) when the face number is large. It can support up to 1,000,000 faces. 'recognitionModel' should be specified to associate with this face list. The default value for 'recognitionModel' is 'recognition_01', if the latest model needed, please explicitly specify the model you need in this parameter. New faces that are added to an existing face list will use the recognition model that's already associated with the collection. Existing face features in a face list can't be updated to features extracted by another version of recognition model.
     *
     * @param faceListId Id referencing a particular face list.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @param recognitionModel Possible values include: 'recognition_01', 'recognition_02'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Void> createAsync(@NonNull String faceListId, String name, String userData, RecognitionModel recognitionModel);

    /**
     * Retrieve a face list’s faceListId, name, userData, recognitionModel and faces in the face list.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the FaceList object if successful.
     */
    FaceList get(@NonNull String faceListId);

    /**
     * Retrieve a face list’s faceListId, name, userData, recognitionModel and faces in the face list.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<FaceList>> getWithRestResponseAsync(@NonNull String faceListId);

    /**
     * Retrieve a face list’s faceListId, name, userData, recognitionModel and faces in the face list.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<FaceList> getAsync(@NonNull String faceListId);

    /**
     * Retrieve a face list’s faceListId, name, userData, recognitionModel and faces in the face list.
     *
     * @param faceListId Id referencing a particular face list.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the FaceList object if successful.
     */
    FaceList get(@NonNull String faceListId, Boolean returnRecognitionModel);

    /**
     * Retrieve a face list’s faceListId, name, userData, recognitionModel and faces in the face list.
     *
     * @param faceListId Id referencing a particular face list.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<FaceList>> getWithRestResponseAsync(@NonNull String faceListId, Boolean returnRecognitionModel);

    /**
     * Retrieve a face list’s faceListId, name, userData, recognitionModel and faces in the face list.
     *
     * @param faceListId Id referencing a particular face list.
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<FaceList> getAsync(@NonNull String faceListId, Boolean returnRecognitionModel);

    /**
     * Update information of a face list.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void update(@NonNull String faceListId);

    /**
     * Update information of a face list.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<VoidResponse> updateWithRestResponseAsync(@NonNull String faceListId);

    /**
     * Update information of a face list.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Void> updateAsync(@NonNull String faceListId);

    /**
     * Update information of a face list.
     *
     * @param faceListId Id referencing a particular face list.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void update(@NonNull String faceListId, String name, String userData);

    /**
     * Update information of a face list.
     *
     * @param faceListId Id referencing a particular face list.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<VoidResponse> updateWithRestResponseAsync(@NonNull String faceListId, String name, String userData);

    /**
     * Update information of a face list.
     *
     * @param faceListId Id referencing a particular face list.
     * @param name User defined name, maximum length is 128.
     * @param userData User specified data. Length should not exceed 16KB.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Void> updateAsync(@NonNull String faceListId, String name, String userData);

    /**
     * Delete an existing face list according to faceListId. Persisted face images in the face list will also be deleted.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(@NonNull String faceListId);

    /**
     * Delete an existing face list according to faceListId. Persisted face images in the face list will also be deleted.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<VoidResponse> deleteWithRestResponseAsync(@NonNull String faceListId);

    /**
     * Delete an existing face list according to faceListId. Persisted face images in the face list will also be deleted.
     *
     * @param faceListId Id referencing a particular face list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Void> deleteAsync(@NonNull String faceListId);

    /**
     * List face lists’ faceListId, name, userData and recognitionModel. &lt;br /&gt;
     * To get face information inside faceList use [FaceList - Get](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039524c).
     *
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List&lt;FaceList&gt; object if successful.
     */
    List<FaceList> list();

    /**
     * List face lists’ faceListId, name, userData and recognitionModel. &lt;br /&gt;
     * To get face information inside faceList use [FaceList - Get](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039524c).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<List<FaceList>>> listWithRestResponseAsync();

    /**
     * List face lists’ faceListId, name, userData and recognitionModel. &lt;br /&gt;
     * To get face information inside faceList use [FaceList - Get](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039524c).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<List<FaceList>> listAsync();

    /**
     * List face lists’ faceListId, name, userData and recognitionModel. &lt;br /&gt;
     * To get face information inside faceList use [FaceList - Get](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039524c).
     *
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List&lt;FaceList&gt; object if successful.
     */
    List<FaceList> list(Boolean returnRecognitionModel);

    /**
     * List face lists’ faceListId, name, userData and recognitionModel. &lt;br /&gt;
     * To get face information inside faceList use [FaceList - Get](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039524c).
     *
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<List<FaceList>>> listWithRestResponseAsync(Boolean returnRecognitionModel);

    /**
     * List face lists’ faceListId, name, userData and recognitionModel. &lt;br /&gt;
     * To get face information inside faceList use [FaceList - Get](/docs/services/563879b61984550e40cbbe8d/operations/563879b61984550f3039524c).
     *
     * @param returnRecognitionModel A value indicating whether the operation should return 'recognitionModel' in response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<List<FaceList>> listAsync(Boolean returnRecognitionModel);

    /**
     * Delete an existing face from a face list (given by a persistedFaceId and a faceListId). Persisted image related to the face will also be deleted.
     *
     * @param faceListId Id referencing a particular face list.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteFace(@NonNull String faceListId, @NonNull UUID persistedFaceId);

    /**
     * Delete an existing face from a face list (given by a persistedFaceId and a faceListId). Persisted image related to the face will also be deleted.
     *
     * @param faceListId Id referencing a particular face list.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<VoidResponse> deleteFaceWithRestResponseAsync(@NonNull String faceListId, @NonNull UUID persistedFaceId);

    /**
     * Delete an existing face from a face list (given by a persistedFaceId and a faceListId). Persisted image related to the face will also be deleted.
     *
     * @param faceListId Id referencing a particular face list.
     * @param persistedFaceId Id referencing a particular persistedFaceId of an existing face.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<Void> deleteFaceAsync(@NonNull String faceListId, @NonNull UUID persistedFaceId);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param url Publicly reachable URL of an image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PersistedFace object if successful.
     */
    PersistedFace addFaceFromUrl(@NonNull String faceListId, @NonNull String url);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param url Publicly reachable URL of an image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<PersistedFace>> addFaceFromUrlWithRestResponseAsync(@NonNull String faceListId, @NonNull String url);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param url Publicly reachable URL of an image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<PersistedFace> addFaceFromUrlAsync(@NonNull String faceListId, @NonNull String url);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param url Publicly reachable URL of an image.
     * @param userData User-specified data about the face for any purpose. The maximum length is 1KB.
     * @param targetFace A face rectangle to specify the target face to be added to a person in the format of "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the image, targetFace is required to specify which face to add. No targetFace means there is only one face detected in the entire image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PersistedFace object if successful.
     */
    PersistedFace addFaceFromUrl(@NonNull String faceListId, @NonNull String url, String userData, List<Integer> targetFace);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param url Publicly reachable URL of an image.
     * @param userData User-specified data about the face for any purpose. The maximum length is 1KB.
     * @param targetFace A face rectangle to specify the target face to be added to a person in the format of "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the image, targetFace is required to specify which face to add. No targetFace means there is only one face detected in the entire image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<PersistedFace>> addFaceFromUrlWithRestResponseAsync(@NonNull String faceListId, @NonNull String url, String userData, List<Integer> targetFace);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param url Publicly reachable URL of an image.
     * @param userData User-specified data about the face for any purpose. The maximum length is 1KB.
     * @param targetFace A face rectangle to specify the target face to be added to a person in the format of "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the image, targetFace is required to specify which face to add. No targetFace means there is only one face detected in the entire image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<PersistedFace> addFaceFromUrlAsync(@NonNull String faceListId, @NonNull String url, String userData, List<Integer> targetFace);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param contentLength The content length.
     * @param image An image stream.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PersistedFace object if successful.
     */
    PersistedFace addFaceFromStream(@NonNull String faceListId, @NonNull long contentLength, @NonNull Flux<ByteBuf> image);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param contentLength The content length.
     * @param image An image stream.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<PersistedFace>> addFaceFromStreamWithRestResponseAsync(@NonNull String faceListId, @NonNull long contentLength, @NonNull Flux<ByteBuf> image);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param contentLength The content length.
     * @param image An image stream.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<PersistedFace> addFaceFromStreamAsync(@NonNull String faceListId, @NonNull long contentLength, @NonNull Flux<ByteBuf> image);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param contentLength The content length.
     * @param image An image stream.
     * @param userData User-specified data about the face for any purpose. The maximum length is 1KB.
     * @param targetFace A face rectangle to specify the target face to be added to a person in the format of "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the image, targetFace is required to specify which face to add. No targetFace means there is only one face detected in the entire image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws APIErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PersistedFace object if successful.
     */
    PersistedFace addFaceFromStream(@NonNull String faceListId, @NonNull long contentLength, @NonNull Flux<ByteBuf> image, String userData, List<Integer> targetFace);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param contentLength The content length.
     * @param image An image stream.
     * @param userData User-specified data about the face for any purpose. The maximum length is 1KB.
     * @param targetFace A face rectangle to specify the target face to be added to a person in the format of "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the image, targetFace is required to specify which face to add. No targetFace means there is only one face detected in the entire image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<SimpleResponse<PersistedFace>> addFaceFromStreamWithRestResponseAsync(@NonNull String faceListId, @NonNull long contentLength, @NonNull Flux<ByteBuf> image, String userData, List<Integer> targetFace);

    /**
     * Add a face to a face list. The input face is specified as an image with a targetFace rectangle. It returns a persistedFaceId representing the added face, and persistedFaceId will not expire.
     *
     * @param faceListId Id referencing a particular face list.
     * @param contentLength The content length.
     * @param image An image stream.
     * @param userData User-specified data about the face for any purpose. The maximum length is 1KB.
     * @param targetFace A face rectangle to specify the target face to be added to a person in the format of "targetFace=left,top,width,height". E.g. "targetFace=10,10,100,100". If there is more than one face in the image, targetFace is required to specify which face to add. No targetFace means there is only one face detected in the entire image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    Mono<PersistedFace> addFaceFromStreamAsync(@NonNull String faceListId, @NonNull long contentLength, @NonNull Flux<ByteBuf> image, String userData, List<Integer> targetFace);
}
