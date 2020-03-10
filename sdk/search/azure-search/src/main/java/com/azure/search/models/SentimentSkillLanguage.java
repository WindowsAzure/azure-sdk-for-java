// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for SentimentSkillLanguage.
 */
public final class SentimentSkillLanguage extends ExpandableStringEnum<SentimentSkillLanguage> {
    /**
     * Static value da for SentimentSkillLanguage.
     */
    public static final SentimentSkillLanguage DA = fromString("da");

    /**
     * Static value nl for SentimentSkillLanguage.
     */
    public static final SentimentSkillLanguage NL = fromString("nl");

    /**
     * Static value en for SentimentSkillLanguage.
     */
    public static final SentimentSkillLanguage EN = fromString("en");

    /**
     * Static value fi for SentimentSkillLanguage.
     */
    public static final SentimentSkillLanguage FI = fromString("fi");

    /**
     * Static value fr for SentimentSkillLanguage.
     */
    public static final SentimentSkillLanguage FR = fromString("fr");

    /**
     * Static value de for SentimentSkillLanguage.
     */
    public static final SentimentSkillLanguage DE = fromString("de");

    /**
     * Static value el for SentimentSkillLanguage.
     */
    public static final SentimentSkillLanguage EL = fromString("el");

    /**
     * Static value it for SentimentSkillLanguage.
     */
    public static final SentimentSkillLanguage IT = fromString("it");

    /**
     * Static value no for SentimentSkillLanguage.
     */
    public static final SentimentSkillLanguage NO = fromString("no");

    /**
     * Static value pl for SentimentSkillLanguage.
     */
    public static final SentimentSkillLanguage PL = fromString("pl");

    /**
     * Static value pt-PT for SentimentSkillLanguage.
     */
    public static final SentimentSkillLanguage PT_PT = fromString("pt-PT");

    /**
     * Static value ru for SentimentSkillLanguage.
     */
    public static final SentimentSkillLanguage RU = fromString("ru");

    /**
     * Static value es for SentimentSkillLanguage.
     */
    public static final SentimentSkillLanguage ES = fromString("es");

    /**
     * Static value sv for SentimentSkillLanguage.
     */
    public static final SentimentSkillLanguage SV = fromString("sv");

    /**
     * Static value tr for SentimentSkillLanguage.
     */
    public static final SentimentSkillLanguage TR = fromString("tr");

    /**
     * Creates or finds a SentimentSkillLanguage from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SentimentSkillLanguage.
     */
    @JsonCreator
    public static SentimentSkillLanguage fromString(String name) {
        return fromString(name, SentimentSkillLanguage.class);
    }

    /**
     * @return known SentimentSkillLanguage values.
     */
    public static Collection<SentimentSkillLanguage> values() {
        return values(SentimentSkillLanguage.class);
    }
}
