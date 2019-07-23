/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The Audio Analyzer preset applies a pre-defined set of AI-based analysis
 * operations, including speech transcription. Currently, the preset supports
 * processing of content with a single audio track.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = AudioAnalyzerPreset.class)
@JsonTypeName("#Microsoft.Media.AudioAnalyzerPreset")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.VideoAnalyzerPreset", value = VideoAnalyzerPreset.class)
})
public class AudioAnalyzerPreset extends Preset {
    /**
     * The language for the audio payload in the input using the BCP-47 format
     * of 'language tag-region' (e.g: 'en-US').  The list of supported
     * languages are English ('en-US' and 'en-GB'), Spanish ('es-ES' and
     * 'es-MX'), French ('fr-FR'), Italian ('it-IT'), Japanese ('ja-JP'),
     * Portuguese ('pt-BR'), Chinese ('zh-CN'), German ('de-DE'), Arabic
     * ('ar-EG' and 'ar-SY'), Russian ('ru-RU'), Hindi ('hi-IN'), and Korean
     * ('ko-KR'). If you know the language of your content, it is recommended
     * that you specify it. If the language isn't specified or set to null,
     * automatic language detection will choose the first language detected and
     * process with the selected language for the duration of the file. This
     * language detection feature currently supports English, Chinese, French,
     * German, Italian, Japanese, Spanish, Russian, and Portuguese. It does not
     * currently support dynamically switching between languages after the
     * first language is detected. The automatic detection works best with
     * audio recordings with clearly discernable speech. If automatic detection
     * fails to find the language, transcription would fallback to 'en-US'.".
     */
    @JsonProperty(value = "audioLanguage")
    private String audioLanguage;

    /**
     * Get the language for the audio payload in the input using the BCP-47 format of 'language tag-region' (e.g: 'en-US').  The list of supported languages are English ('en-US' and 'en-GB'), Spanish ('es-ES' and 'es-MX'), French ('fr-FR'), Italian ('it-IT'), Japanese ('ja-JP'), Portuguese ('pt-BR'), Chinese ('zh-CN'), German ('de-DE'), Arabic ('ar-EG' and 'ar-SY'), Russian ('ru-RU'), Hindi ('hi-IN'), and Korean ('ko-KR'). If you know the language of your content, it is recommended that you specify it. If the language isn't specified or set to null, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. This language detection feature currently supports English, Chinese, French, German, Italian, Japanese, Spanish, Russian, and Portuguese. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernable speech. If automatic detection fails to find the language, transcription would fallback to 'en-US'.".
     *
     * @return the audioLanguage value
     */
    public String audioLanguage() {
        return this.audioLanguage;
    }

    /**
     * Set the language for the audio payload in the input using the BCP-47 format of 'language tag-region' (e.g: 'en-US').  The list of supported languages are English ('en-US' and 'en-GB'), Spanish ('es-ES' and 'es-MX'), French ('fr-FR'), Italian ('it-IT'), Japanese ('ja-JP'), Portuguese ('pt-BR'), Chinese ('zh-CN'), German ('de-DE'), Arabic ('ar-EG' and 'ar-SY'), Russian ('ru-RU'), Hindi ('hi-IN'), and Korean ('ko-KR'). If you know the language of your content, it is recommended that you specify it. If the language isn't specified or set to null, automatic language detection will choose the first language detected and process with the selected language for the duration of the file. This language detection feature currently supports English, Chinese, French, German, Italian, Japanese, Spanish, Russian, and Portuguese. It does not currently support dynamically switching between languages after the first language is detected. The automatic detection works best with audio recordings with clearly discernable speech. If automatic detection fails to find the language, transcription would fallback to 'en-US'.".
     *
     * @param audioLanguage the audioLanguage value to set
     * @return the AudioAnalyzerPreset object itself.
     */
    public AudioAnalyzerPreset withAudioLanguage(String audioLanguage) {
        this.audioLanguage = audioLanguage;
        return this;
    }

}
