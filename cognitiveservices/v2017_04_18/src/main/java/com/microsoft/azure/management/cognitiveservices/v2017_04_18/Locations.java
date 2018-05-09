/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation.CheckSkuAvailabilitysInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Locations.
 */
public interface Locations extends HasInner<CheckSkuAvailabilitysInner> {
    /**
     * Check available SKUs.
     *
     * @param location Resource location.
     * @param skus The SKU of the resource.
     * @param kind The Kind of the resource. Possible values include: 'Bing.Autosuggest.v7', 'Bing.CustomSearch', 'Bing.Search.v7', 'Bing.Speech', 'Bing.SpellCheck.v7', 'ComputerVision', 'ContentModerator', 'CustomSpeech', 'CustomVision.Prediction', 'CustomVision.Training', 'Emotion', 'Face', 'LUIS', 'QnAMaker', 'SpeakerRecognition', 'SpeechTranslation', 'TextAnalytics', 'TextTranslation', 'WebLM'
     * @param type The Type of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CheckSkuAvailabilityResultList> listAsync(String location, List<SkuName> skus, Kind kind, String type);

}
