/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.computervision;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for OcrLanguages.
 */
public enum OcrLanguages {
    /** Enum value unk. */
    UNK("unk"),

    /** Enum value zh-Hans. */
    ZH_HANS("zh-Hans"),

    /** Enum value zh-Hant. */
    ZH_HANT("zh-Hant"),

    /** Enum value cs. */
    CS("cs"),

    /** Enum value da. */
    DA("da"),

    /** Enum value nl. */
    NL("nl"),

    /** Enum value en. */
    EN("en"),

    /** Enum value fi. */
    FI("fi"),

    /** Enum value fr. */
    FR("fr"),

    /** Enum value de. */
    DE("de"),

    /** Enum value el. */
    EL("el"),

    /** Enum value hu. */
    HU("hu"),

    /** Enum value it. */
    IT("it"),

    /** Enum value ja. */
    JA("ja"),

    /** Enum value ko. */
    KO("ko"),

    /** Enum value nb. */
    NB("nb"),

    /** Enum value pl. */
    PL("pl"),

    /** Enum value pt. */
    PT("pt"),

    /** Enum value ru. */
    RU("ru"),

    /** Enum value es. */
    ES("es"),

    /** Enum value sv. */
    SV("sv"),

    /** Enum value tr. */
    TR("tr"),

    /** Enum value ar. */
    AR("ar"),

    /** Enum value ro. */
    RO("ro"),

    /** Enum value sr-Cyrl. */
    SR_CYRL("sr-Cyrl"),

    /** Enum value sr-Latn. */
    SR_LATN("sr-Latn"),

    /** Enum value sk. */
    SK("sk");

    /** The actual serialized value for a OcrLanguages instance. */
    private String value;

    OcrLanguages(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OcrLanguages instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed OcrLanguages object, or null if unable to parse.
     */
    @JsonCreator
    public static OcrLanguages fromString(String value) {
        OcrLanguages[] items = OcrLanguages.values();
        for (OcrLanguages item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
