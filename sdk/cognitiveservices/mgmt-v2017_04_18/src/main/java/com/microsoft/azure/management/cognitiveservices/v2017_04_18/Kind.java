/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Kind.
 */
public final class Kind extends ExpandableStringEnum<Kind> {
    /** Static value Bing.Autosuggest.v7 for Kind. */
    public static final Kind BING_AUTOSUGGESTV7 = fromString("Bing.Autosuggest.v7");

    /** Static value Bing.CustomSearch for Kind. */
    public static final Kind BING_CUSTOM_SEARCH = fromString("Bing.CustomSearch");

    /** Static value Bing.Search.v7 for Kind. */
    public static final Kind BING_SEARCHV7 = fromString("Bing.Search.v7");

    /** Static value Bing.Speech for Kind. */
    public static final Kind BING_SPEECH = fromString("Bing.Speech");

    /** Static value Bing.SpellCheck.v7 for Kind. */
    public static final Kind BING_SPELL_CHECKV7 = fromString("Bing.SpellCheck.v7");

    /** Static value ComputerVision for Kind. */
    public static final Kind COMPUTER_VISION = fromString("ComputerVision");

    /** Static value ContentModerator for Kind. */
    public static final Kind CONTENT_MODERATOR = fromString("ContentModerator");

    /** Static value CustomSpeech for Kind. */
    public static final Kind CUSTOM_SPEECH = fromString("CustomSpeech");

    /** Static value CustomVision.Prediction for Kind. */
    public static final Kind CUSTOM_VISION_PREDICTION = fromString("CustomVision.Prediction");

    /** Static value CustomVision.Training for Kind. */
    public static final Kind CUSTOM_VISION_TRAINING = fromString("CustomVision.Training");

    /** Static value Emotion for Kind. */
    public static final Kind EMOTION = fromString("Emotion");

    /** Static value Face for Kind. */
    public static final Kind FACE = fromString("Face");

    /** Static value LUIS for Kind. */
    public static final Kind LUIS = fromString("LUIS");

    /** Static value QnAMaker for Kind. */
    public static final Kind QN_AMAKER = fromString("QnAMaker");

    /** Static value SpeakerRecognition for Kind. */
    public static final Kind SPEAKER_RECOGNITION = fromString("SpeakerRecognition");

    /** Static value SpeechTranslation for Kind. */
    public static final Kind SPEECH_TRANSLATION = fromString("SpeechTranslation");

    /** Static value TextAnalytics for Kind. */
    public static final Kind TEXT_ANALYTICS = fromString("TextAnalytics");

    /** Static value TextTranslation for Kind. */
    public static final Kind TEXT_TRANSLATION = fromString("TextTranslation");

    /** Static value WebLM for Kind. */
    public static final Kind WEB_LM = fromString("WebLM");

    /**
     * Creates or finds a Kind from its string representation.
     * @param name a name to look for
     * @return the corresponding Kind
     */
    @JsonCreator
    public static Kind fromString(String name) {
        return fromString(name, Kind.class);
    }

    /**
     * @return known Kind values
     */
    public static Collection<Kind> values() {
        return values(Kind.class);
    }
}
