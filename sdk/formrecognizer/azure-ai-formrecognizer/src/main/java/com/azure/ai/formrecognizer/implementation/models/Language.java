// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Language. */
public final class Language extends ExpandableStringEnum<Language> {
    /** Static value en for Language. */
    public static final Language EN = fromString("en");

    /** Static value es for Language. */
    public static final Language ES = fromString("es");

    /** Static value de for Language. */
    public static final Language DE = fromString("de");

    /** Static value fr for Language. */
    public static final Language FR = fromString("fr");

    /** Static value it for Language. */
    public static final Language IT = fromString("it");

    /** Static value nl for Language. */
    public static final Language NL = fromString("nl");

    /** Static value pt for Language. */
    public static final Language PT = fromString("pt");

    /** Static value ja for Language. */
    public static final Language JA = fromString("ja");

    /** Static value zh-Hans for Language. */
    public static final Language ZH_HANS = fromString("zh-Hans");

    /**
     * Creates or finds a Language from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Language.
     */
    @JsonCreator
    public static Language fromString(String name) {
        return fromString(name, Language.class);
    }

    /** @return known Language values. */
    public static Collection<Language> values() {
        return values(Language.class);
    }
}
