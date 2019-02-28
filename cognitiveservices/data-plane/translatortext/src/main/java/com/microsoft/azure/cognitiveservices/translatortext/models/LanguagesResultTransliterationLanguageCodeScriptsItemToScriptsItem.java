/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.translatortext.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LanguagesResultTransliterationLanguageCodeScriptsItemToScriptsItem
 * model.
 */
public class LanguagesResultTransliterationLanguageCodeScriptsItemToScriptsItem {
    /**
     * The code property.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The nativeName property.
     */
    @JsonProperty(value = "nativeName")
    private String nativeName;

    /**
     * The dir property.
     */
    @JsonProperty(value = "dir")
    private String dir;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the LanguagesResultTransliterationLanguageCodeScriptsItemToScriptsItem object itself.
     */
    public LanguagesResultTransliterationLanguageCodeScriptsItemToScriptsItem withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the LanguagesResultTransliterationLanguageCodeScriptsItemToScriptsItem object itself.
     */
    public LanguagesResultTransliterationLanguageCodeScriptsItemToScriptsItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the nativeName value.
     *
     * @return the nativeName value
     */
    public String nativeName() {
        return this.nativeName;
    }

    /**
     * Set the nativeName value.
     *
     * @param nativeName the nativeName value to set
     * @return the LanguagesResultTransliterationLanguageCodeScriptsItemToScriptsItem object itself.
     */
    public LanguagesResultTransliterationLanguageCodeScriptsItemToScriptsItem withNativeName(String nativeName) {
        this.nativeName = nativeName;
        return this;
    }

    /**
     * Get the dir value.
     *
     * @return the dir value
     */
    public String dir() {
        return this.dir;
    }

    /**
     * Set the dir value.
     *
     * @param dir the dir value to set
     * @return the LanguagesResultTransliterationLanguageCodeScriptsItemToScriptsItem object itself.
     */
    public LanguagesResultTransliterationLanguageCodeScriptsItemToScriptsItem withDir(String dir) {
        this.dir = dir;
        return this;
    }

}
