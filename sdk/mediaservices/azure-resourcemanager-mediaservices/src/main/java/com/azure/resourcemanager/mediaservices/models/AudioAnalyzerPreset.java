// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/**
 * The Audio Analyzer preset applies a pre-defined set of AI-based analysis operations, including speech transcription.
 * Currently, the preset supports processing of content with a single audio track.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@odata\\.type",
    defaultImpl = AudioAnalyzerPreset.class)
@JsonTypeName("#Microsoft.Media.AudioAnalyzerPreset")
@JsonSubTypes({@JsonSubTypes.Type(name = "#Microsoft.Media.VideoAnalyzerPreset", value = VideoAnalyzerPreset.class)})
@JsonFlatten
@Fluent
public class AudioAnalyzerPreset extends Preset {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AudioAnalyzerPreset.class);

    /*
     * The language for the audio payload in the input using the BCP-47 format
     * of 'language tag-region' (e.g: 'en-US').  If you know the language of
     * your content, it is recommended that you specify it. The language must
     * be specified explicitly for AudioAnalysisMode::Basic, since automatic
     * language detection is not included in basic mode. If the language isn't
     * specified or set to null, automatic language detection will choose the
     * first language detected and process with the selected language for the
     * duration of the file. It does not currently support dynamically
     * switching between languages after the first language is detected. The
     * automatic detection works best with audio recordings with clearly
     * discernable speech. If automatic detection fails to find the language,
     * transcription would fallback to 'en-US'." The list of supported
     * languages is available here:
     * https://go.microsoft.com/fwlink/?linkid=2109463
     */
    @JsonProperty(value = "audioLanguage")
    private String audioLanguage;

    /*
     * Determines the set of audio analysis operations to be performed. If
     * unspecified, the Standard AudioAnalysisMode would be chosen.
     */
    @JsonProperty(value = "mode")
    private AudioAnalysisMode mode;

    /*
     * Dictionary containing key value pairs for parameters not exposed in the
     * preset itself
     */
    @JsonProperty(value = "experimentalOptions")
    private Map<String, String> experimentalOptions;

    /**
     * Get the audioLanguage property: The language for the audio payload in the input using the BCP-47 format of
     * 'language tag-region' (e.g: 'en-US'). If you know the language of your content, it is recommended that you
     * specify it. The language must be specified explicitly for AudioAnalysisMode::Basic, since automatic language
     * detection is not included in basic mode. If the language isn't specified or set to null, automatic language
     * detection will choose the first language detected and process with the selected language for the duration of the
     * file. It does not currently support dynamically switching between languages after the first language is detected.
     * The automatic detection works best with audio recordings with clearly discernable speech. If automatic detection
     * fails to find the language, transcription would fallback to 'en-US'." The list of supported languages is
     * available here: https://go.microsoft.com/fwlink/?linkid=2109463.
     *
     * @return the audioLanguage value.
     */
    public String audioLanguage() {
        return this.audioLanguage;
    }

    /**
     * Set the audioLanguage property: The language for the audio payload in the input using the BCP-47 format of
     * 'language tag-region' (e.g: 'en-US'). If you know the language of your content, it is recommended that you
     * specify it. The language must be specified explicitly for AudioAnalysisMode::Basic, since automatic language
     * detection is not included in basic mode. If the language isn't specified or set to null, automatic language
     * detection will choose the first language detected and process with the selected language for the duration of the
     * file. It does not currently support dynamically switching between languages after the first language is detected.
     * The automatic detection works best with audio recordings with clearly discernable speech. If automatic detection
     * fails to find the language, transcription would fallback to 'en-US'." The list of supported languages is
     * available here: https://go.microsoft.com/fwlink/?linkid=2109463.
     *
     * @param audioLanguage the audioLanguage value to set.
     * @return the AudioAnalyzerPreset object itself.
     */
    public AudioAnalyzerPreset withAudioLanguage(String audioLanguage) {
        this.audioLanguage = audioLanguage;
        return this;
    }

    /**
     * Get the mode property: Determines the set of audio analysis operations to be performed. If unspecified, the
     * Standard AudioAnalysisMode would be chosen.
     *
     * @return the mode value.
     */
    public AudioAnalysisMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: Determines the set of audio analysis operations to be performed. If unspecified, the
     * Standard AudioAnalysisMode would be chosen.
     *
     * @param mode the mode value to set.
     * @return the AudioAnalyzerPreset object itself.
     */
    public AudioAnalyzerPreset withMode(AudioAnalysisMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the experimentalOptions property: Dictionary containing key value pairs for parameters not exposed in the
     * preset itself.
     *
     * @return the experimentalOptions value.
     */
    public Map<String, String> experimentalOptions() {
        return this.experimentalOptions;
    }

    /**
     * Set the experimentalOptions property: Dictionary containing key value pairs for parameters not exposed in the
     * preset itself.
     *
     * @param experimentalOptions the experimentalOptions value to set.
     * @return the AudioAnalyzerPreset object itself.
     */
    public AudioAnalyzerPreset withExperimentalOptions(Map<String, String> experimentalOptions) {
        this.experimentalOptions = experimentalOptions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
