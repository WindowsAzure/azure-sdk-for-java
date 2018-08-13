/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.prediction;

import com.microsoft.azure.cognitiveservices.vision.customvision.prediction.models.PredictImageWithNoStoreOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.customvision.prediction.models.PredictImageUrlWithNoStoreOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.customvision.prediction.models.PredictImageOptionalParameter;
import com.microsoft.azure.cognitiveservices.vision.customvision.prediction.models.PredictImageUrlOptionalParameter;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.cognitiveservices.vision.customvision.prediction.models.ImagePrediction;
import java.util.UUID;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Predictions.
 */
public interface Predictions {
    /**
     * Predict an image without saving the result.
     *
     * @param projectId The project id.
     * @param imageData the InputStream value.
     * @param predictImageWithNoStoreOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImagePrediction object if successful.
     */
    @Deprecated
    ImagePrediction predictImageWithNoStore(UUID projectId, byte[] imageData, PredictImageWithNoStoreOptionalParameter predictImageWithNoStoreOptionalParameter);

    /**
     * Predict an image without saving the result.
     *
     * @param projectId The project id.
     * @param imageData the InputStream value.
     * @param predictImageWithNoStoreOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    @Deprecated
    Observable<ImagePrediction> predictImageWithNoStoreAsync(UUID projectId, byte[] imageData, PredictImageWithNoStoreOptionalParameter predictImageWithNoStoreOptionalParameter);

    /**
     * Predict an image without saving the result.
     *
     * @return the first stage of the predictImageWithNoStore call
     */
    PredictionsPredictImageWithNoStoreDefinitionStages.WithProjectId predictImageWithNoStore();

    /**
     * Grouping of predictImageWithNoStore definition stages.
     */
    interface PredictionsPredictImageWithNoStoreDefinitionStages {
        /**
         * The stage of the definition to be specify projectId.
         */
        interface WithProjectId {
            /**
             * The project id.
             *
             * @return next definition stage
             */
            WithImageData withProjectId(UUID projectId);
        }
        /**
         * The stage of the definition to be specify imageData.
         */
        interface WithImageData {
            /**
             *
             *
             * @return next definition stage
             */
            PredictionsPredictImageWithNoStoreDefinitionStages.WithExecute withImageData(byte[] imageData);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * Optional. Specifies the id of a particular iteration to evaluate against.
             *   The default iteration for the project will be used when not specified.
             *
             * @return next definition stage
             */
            PredictionsPredictImageWithNoStoreDefinitionStages.WithExecute withIterationId(UUID iterationId);

            /**
             * Optional. Specifies the name of application using the endpoint.
             *
             * @return next definition stage
             */
            PredictionsPredictImageWithNoStoreDefinitionStages.WithExecute withApplication(String application);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends PredictionsPredictImageWithNoStoreDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the ImagePrediction object if successful.
             */
            ImagePrediction execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the ImagePrediction object
             */
            Observable<ImagePrediction> executeAsync();
        }
    }

    /**
     * The entirety of predictImageWithNoStore definition.
     */
    interface PredictionsPredictImageWithNoStoreDefinition extends
        PredictionsPredictImageWithNoStoreDefinitionStages.WithProjectId,
        PredictionsPredictImageWithNoStoreDefinitionStages.WithImageData,
        PredictionsPredictImageWithNoStoreDefinitionStages.WithExecute {
    }

    /**
     * Predict an image url without saving the result.
     *
     * @param projectId The project id.
     * @param predictImageUrlWithNoStoreOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImagePrediction object if successful.
     */
    @Deprecated
    ImagePrediction predictImageUrlWithNoStore(UUID projectId, PredictImageUrlWithNoStoreOptionalParameter predictImageUrlWithNoStoreOptionalParameter);

    /**
     * Predict an image url without saving the result.
     *
     * @param projectId The project id.
     * @param predictImageUrlWithNoStoreOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    @Deprecated
    Observable<ImagePrediction> predictImageUrlWithNoStoreAsync(UUID projectId, PredictImageUrlWithNoStoreOptionalParameter predictImageUrlWithNoStoreOptionalParameter);

    /**
     * Predict an image url without saving the result.
     *
     * @return the first stage of the predictImageUrlWithNoStore call
     */
    PredictionsPredictImageUrlWithNoStoreDefinitionStages.WithProjectId predictImageUrlWithNoStore();

    /**
     * Grouping of predictImageUrlWithNoStore definition stages.
     */
    interface PredictionsPredictImageUrlWithNoStoreDefinitionStages {
        /**
         * The stage of the definition to be specify projectId.
         */
        interface WithProjectId {
            /**
             * The project id.
             *
             * @return next definition stage
             */
            PredictionsPredictImageUrlWithNoStoreDefinitionStages.WithExecute withProjectId(UUID projectId);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * Optional. Specifies the id of a particular iteration to evaluate against.
             *   The default iteration for the project will be used when not specified.
             *
             * @return next definition stage
             */
            PredictionsPredictImageUrlWithNoStoreDefinitionStages.WithExecute withIterationId(UUID iterationId);

            /**
             * Optional. Specifies the name of application using the endpoint.
             *
             * @return next definition stage
             */
            PredictionsPredictImageUrlWithNoStoreDefinitionStages.WithExecute withApplication(String application);

            /**
             *
             *
             * @return next definition stage
             */
            PredictionsPredictImageUrlWithNoStoreDefinitionStages.WithExecute withUrl(String url);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends PredictionsPredictImageUrlWithNoStoreDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the ImagePrediction object if successful.
             */
            ImagePrediction execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the ImagePrediction object
             */
            Observable<ImagePrediction> executeAsync();
        }
    }

    /**
     * The entirety of predictImageUrlWithNoStore definition.
     */
    interface PredictionsPredictImageUrlWithNoStoreDefinition extends
        PredictionsPredictImageUrlWithNoStoreDefinitionStages.WithProjectId,
        PredictionsPredictImageUrlWithNoStoreDefinitionStages.WithExecute {
    }

    /**
     * Predict an image and saves the result.
     *
     * @param projectId The project id.
     * @param imageData the InputStream value.
     * @param predictImageOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImagePrediction object if successful.
     */
    @Deprecated
    ImagePrediction predictImage(UUID projectId, byte[] imageData, PredictImageOptionalParameter predictImageOptionalParameter);

    /**
     * Predict an image and saves the result.
     *
     * @param projectId The project id.
     * @param imageData the InputStream value.
     * @param predictImageOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    @Deprecated
    Observable<ImagePrediction> predictImageAsync(UUID projectId, byte[] imageData, PredictImageOptionalParameter predictImageOptionalParameter);

    /**
     * Predict an image and saves the result.
     *
     * @return the first stage of the predictImage call
     */
    PredictionsPredictImageDefinitionStages.WithProjectId predictImage();

    /**
     * Grouping of predictImage definition stages.
     */
    interface PredictionsPredictImageDefinitionStages {
        /**
         * The stage of the definition to be specify projectId.
         */
        interface WithProjectId {
            /**
             * The project id.
             *
             * @return next definition stage
             */
            WithImageData withProjectId(UUID projectId);
        }
        /**
         * The stage of the definition to be specify imageData.
         */
        interface WithImageData {
            /**
             *
             *
             * @return next definition stage
             */
            PredictionsPredictImageDefinitionStages.WithExecute withImageData(byte[] imageData);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * Optional. Specifies the id of a particular iteration to evaluate against.
             *   The default iteration for the project will be used when not specified.
             *
             * @return next definition stage
             */
            PredictionsPredictImageDefinitionStages.WithExecute withIterationId(UUID iterationId);

            /**
             * Optional. Specifies the name of application using the endpoint.
             *
             * @return next definition stage
             */
            PredictionsPredictImageDefinitionStages.WithExecute withApplication(String application);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends PredictionsPredictImageDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the ImagePrediction object if successful.
             */
            ImagePrediction execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the ImagePrediction object
             */
            Observable<ImagePrediction> executeAsync();
        }
    }

    /**
     * The entirety of predictImage definition.
     */
    interface PredictionsPredictImageDefinition extends
        PredictionsPredictImageDefinitionStages.WithProjectId,
        PredictionsPredictImageDefinitionStages.WithImageData,
        PredictionsPredictImageDefinitionStages.WithExecute {
    }

    /**
     * Predict an image url and saves the result.
     *
     * @param projectId The project id.
     * @param predictImageUrlOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ImagePrediction object if successful.
     */
    @Deprecated
    ImagePrediction predictImageUrl(UUID projectId, PredictImageUrlOptionalParameter predictImageUrlOptionalParameter);

    /**
     * Predict an image url and saves the result.
     *
     * @param projectId The project id.
     * @param predictImageUrlOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ImagePrediction object
     */
    @Deprecated
    Observable<ImagePrediction> predictImageUrlAsync(UUID projectId, PredictImageUrlOptionalParameter predictImageUrlOptionalParameter);

    /**
     * Predict an image url and saves the result.
     *
     * @return the first stage of the predictImageUrl call
     */
    PredictionsPredictImageUrlDefinitionStages.WithProjectId predictImageUrl();

    /**
     * Grouping of predictImageUrl definition stages.
     */
    interface PredictionsPredictImageUrlDefinitionStages {
        /**
         * The stage of the definition to be specify projectId.
         */
        interface WithProjectId {
            /**
             * The project id.
             *
             * @return next definition stage
             */
            PredictionsPredictImageUrlDefinitionStages.WithExecute withProjectId(UUID projectId);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * Optional. Specifies the id of a particular iteration to evaluate against.
             *   The default iteration for the project will be used when not specified.
             *
             * @return next definition stage
             */
            PredictionsPredictImageUrlDefinitionStages.WithExecute withIterationId(UUID iterationId);

            /**
             * Optional. Specifies the name of application using the endpoint.
             *
             * @return next definition stage
             */
            PredictionsPredictImageUrlDefinitionStages.WithExecute withApplication(String application);

            /**
             *
             *
             * @return next definition stage
             */
            PredictionsPredictImageUrlDefinitionStages.WithExecute withUrl(String url);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends PredictionsPredictImageUrlDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the ImagePrediction object if successful.
             */
            ImagePrediction execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the ImagePrediction object
             */
            Observable<ImagePrediction> executeAsync();
        }
    }

    /**
     * The entirety of predictImageUrl definition.
     */
    interface PredictionsPredictImageUrlDefinition extends
        PredictionsPredictImageUrlDefinitionStages.WithProjectId,
        PredictionsPredictImageUrlDefinitionStages.WithExecute {
    }

}
