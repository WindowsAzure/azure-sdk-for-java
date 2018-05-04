/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.face;

import com.microsoft.azure.cognitiveservices.vision.face.models.FindSimilarOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.face.models.IdentifyOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.face.models.DetectWithUrlOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.face.models.DetectWithStreamOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.face.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.face.models.AzureRegions;
import com.microsoft.azure.cognitiveservices.vision.face.models.DetectedFace;
import com.microsoft.azure.cognitiveservices.vision.face.models.FaceAttributeType;
import com.microsoft.azure.cognitiveservices.vision.face.models.FindSimilarMatchMode;
import com.microsoft.azure.cognitiveservices.vision.face.models.GroupResult;
import com.microsoft.azure.cognitiveservices.vision.face.models.IdentifyResult;
import com.microsoft.azure.cognitiveservices.vision.face.models.SimilarFace;
import com.microsoft.azure.cognitiveservices.vision.face.models.VerifyResult;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Faces.
 */
public interface Faces {
    /**
     * Given query face's faceId, find the similar-looking faces from a faceId array or a faceListId.
     *
     * @param faceId FaceId of the query face. User needs to call Face - Detect first to get a valid faceId. Note that this
     *  faceId is not persisted and will expire 24 hours after the detection call
     * @param findSimilarOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;SimilarFace&gt; object if successful.
     */
    List<SimilarFace> findSimilar(UUID faceId, FindSimilarOptionalParameter findSimilarOptionalParameter);

    /**
     * Given query face's faceId, find the similar-looking faces from a faceId array or a faceListId.
     *
     * @param faceId FaceId of the query face. User needs to call Face - Detect first to get a valid faceId. Note that this
     *  faceId is not persisted and will expire 24 hours after the detection call
     * @param findSimilarOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;SimilarFace&gt; object
     */
    Observable<List<SimilarFace>> findSimilarAsync(UUID faceId, FindSimilarOptionalParameter findSimilarOptionalParameter);

    /**
     * Divide candidate faces into groups based on face similarity.
     *
     * @param faceIds Array of candidate faceId created by Face - Detect. The maximum is 1000 faces
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the GroupResult object if successful.
     */
    GroupResult group(List<UUID> faceIds);

    /**
     * Divide candidate faces into groups based on face similarity.
     *
     * @param faceIds Array of candidate faceId created by Face - Detect. The maximum is 1000 faces
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<GroupResult> groupAsync(List<UUID> faceIds, final ServiceCallback<GroupResult> serviceCallback);

    /**
     * Divide candidate faces into groups based on face similarity.
     *
     * @param faceIds Array of candidate faceId created by Face - Detect. The maximum is 1000 faces
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupResult object
     */
    Observable<GroupResult> groupAsync(List<UUID> faceIds);

    /**
     * Divide candidate faces into groups based on face similarity.
     *
     * @param faceIds Array of candidate faceId created by Face - Detect. The maximum is 1000 faces
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the GroupResult object
     */
    Observable<ServiceResponse<GroupResult>> groupWithServiceResponseAsync(List<UUID> faceIds);

    /**
     * Identify unknown faces from a person group.
     *
     * @param personGroupId PersonGroupId of the target person group, created by PersonGroups.Create
     * @param faceIds Array of query faces faceIds, created by the Face - Detect. Each of the faces are identified independently.
     *  The valid number of faceIds is between [1, 10].
     * @param identifyOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;IdentifyResult&gt; object if successful.
     */
    List<IdentifyResult> identify(String personGroupId, List<UUID> faceIds, IdentifyOptionalParameter identifyOptionalParameter);

    /**
     * Identify unknown faces from a person group.
     *
     * @param personGroupId PersonGroupId of the target person group, created by PersonGroups.Create
     * @param faceIds Array of query faces faceIds, created by the Face - Detect. Each of the faces are identified independently.
     *  The valid number of faceIds is between [1, 10].
     * @param identifyOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;IdentifyResult&gt; object
     */
    Observable<List<IdentifyResult>> identifyAsync(String personGroupId, List<UUID> faceIds, IdentifyOptionalParameter identifyOptionalParameter);

    /**
     * Verify whether two faces belong to a same person or whether one face belongs to a person.
     *
     * @param faceId1 FaceId of the first face, comes from Face - Detect
     * @param faceId2 FaceId of the second face, comes from Face - Detect
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VerifyResult object if successful.
     */
    VerifyResult verifyFaceToFace(UUID faceId1, UUID faceId2);

    /**
     * Verify whether two faces belong to a same person or whether one face belongs to a person.
     *
     * @param faceId1 FaceId of the first face, comes from Face - Detect
     * @param faceId2 FaceId of the second face, comes from Face - Detect
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VerifyResult> verifyFaceToFaceAsync(UUID faceId1, UUID faceId2, final ServiceCallback<VerifyResult> serviceCallback);

    /**
     * Verify whether two faces belong to a same person or whether one face belongs to a person.
     *
     * @param faceId1 FaceId of the first face, comes from Face - Detect
     * @param faceId2 FaceId of the second face, comes from Face - Detect
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VerifyResult object
     */
    Observable<VerifyResult> verifyFaceToFaceAsync(UUID faceId1, UUID faceId2);

    /**
     * Verify whether two faces belong to a same person or whether one face belongs to a person.
     *
     * @param faceId1 FaceId of the first face, comes from Face - Detect
     * @param faceId2 FaceId of the second face, comes from Face - Detect
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VerifyResult object
     */
    Observable<ServiceResponse<VerifyResult>> verifyFaceToFaceWithServiceResponseAsync(UUID faceId1, UUID faceId2);

    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and
     *  attributes.
     *
     * @param url the String value
     * @param detectWithUrlOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;DetectedFace&gt; object if successful.
     */
    List<DetectedFace> detectWithUrl(String url, DetectWithUrlOptionalParameter detectWithUrlOptionalParameter);

    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and
     *  attributes.
     *
     * @param url the String value
     * @param detectWithUrlOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DetectedFace&gt; object
     */
    Observable<List<DetectedFace>> detectWithUrlAsync(String url, DetectWithUrlOptionalParameter detectWithUrlOptionalParameter);

    /**
     * Verify whether two faces belong to a same person. Compares a face Id with a Person Id.
     *
     * @param faceId FaceId the face, comes from Face - Detect
     * @param personGroupId Using existing personGroupId and personId for fast loading a specified person. personGroupId is created in Person Groups.Create.
     * @param personId Specify a certain person in a person group. personId is created in Persons.Create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the VerifyResult object if successful.
     */
    VerifyResult verifyFaceToPerson(UUID faceId, String personGroupId, UUID personId);

    /**
     * Verify whether two faces belong to a same person. Compares a face Id with a Person Id.
     *
     * @param faceId FaceId the face, comes from Face - Detect
     * @param personGroupId Using existing personGroupId and personId for fast loading a specified person. personGroupId is created in Person Groups.Create.
     * @param personId Specify a certain person in a person group. personId is created in Persons.Create.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<VerifyResult> verifyFaceToPersonAsync(UUID faceId, String personGroupId, UUID personId, final ServiceCallback<VerifyResult> serviceCallback);

    /**
     * Verify whether two faces belong to a same person. Compares a face Id with a Person Id.
     *
     * @param faceId FaceId the face, comes from Face - Detect
     * @param personGroupId Using existing personGroupId and personId for fast loading a specified person. personGroupId is created in Person Groups.Create.
     * @param personId Specify a certain person in a person group. personId is created in Persons.Create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VerifyResult object
     */
    Observable<VerifyResult> verifyFaceToPersonAsync(UUID faceId, String personGroupId, UUID personId);

    /**
     * Verify whether two faces belong to a same person. Compares a face Id with a Person Id.
     *
     * @param faceId FaceId the face, comes from Face - Detect
     * @param personGroupId Using existing personGroupId and personId for fast loading a specified person. personGroupId is created in Person Groups.Create.
     * @param personId Specify a certain person in a person group. personId is created in Persons.Create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the VerifyResult object
     */
    Observable<ServiceResponse<VerifyResult>> verifyFaceToPersonWithServiceResponseAsync(UUID faceId, String personGroupId, UUID personId);

    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and
     *  attributes.
     *
     * @param image An image stream.
     * @param detectWithStreamOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;DetectedFace&gt; object if successful.
     */
    List<DetectedFace> detectWithStream(byte[] image, DetectWithStreamOptionalParameter detectWithStreamOptionalParameter);

    /**
     * Detect human faces in an image and returns face locations, and optionally with faceIds, landmarks, and
     *  attributes.
     *
     * @param image An image stream.
     * @param detectWithStreamOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DetectedFace&gt; object
     */
    Observable<List<DetectedFace>> detectWithStreamAsync(byte[] image, DetectWithStreamOptionalParameter detectWithStreamOptionalParameter);

}
