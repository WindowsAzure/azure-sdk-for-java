// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for LexicalAnalyzerName.
 */
public final class LexicalAnalyzerName extends ExpandableStringEnum<LexicalAnalyzerName> {
    /**
     * Static value ar.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName AR_MICROSOFT = fromString("ar.microsoft");

    /**
     * Static value ar.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName AR_LUCENE = fromString("ar.lucene");

    /**
     * Static value hy.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName HY_LUCENE = fromString("hy.lucene");

    /**
     * Static value bn.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName BN_MICROSOFT = fromString("bn.microsoft");

    /**
     * Static value eu.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName EU_LUCENE = fromString("eu.lucene");

    /**
     * Static value bg.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName BG_MICROSOFT = fromString("bg.microsoft");

    /**
     * Static value bg.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName BG_LUCENE = fromString("bg.lucene");

    /**
     * Static value ca.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName CA_MICROSOFT = fromString("ca.microsoft");

    /**
     * Static value ca.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName CA_LUCENE = fromString("ca.lucene");

    /**
     * Static value zh-Hans.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName ZH_HANS_MICROSOFT = fromString("zh-Hans.microsoft");

    /**
     * Static value zh-Hans.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName ZH_HANS_LUCENE = fromString("zh-Hans.lucene");

    /**
     * Static value zh-Hant.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName ZH_HANT_MICROSOFT = fromString("zh-Hant.microsoft");

    /**
     * Static value zh-Hant.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName ZH_HANT_LUCENE = fromString("zh-Hant.lucene");

    /**
     * Static value hr.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName HR_MICROSOFT = fromString("hr.microsoft");

    /**
     * Static value cs.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName CS_MICROSOFT = fromString("cs.microsoft");

    /**
     * Static value cs.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName CS_LUCENE = fromString("cs.lucene");

    /**
     * Static value da.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName DA_MICROSOFT = fromString("da.microsoft");

    /**
     * Static value da.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName DA_LUCENE = fromString("da.lucene");

    /**
     * Static value nl.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName NL_MICROSOFT = fromString("nl.microsoft");

    /**
     * Static value nl.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName NL_LUCENE = fromString("nl.lucene");

    /**
     * Static value en.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName EN_MICROSOFT = fromString("en.microsoft");

    /**
     * Static value en.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName EN_LUCENE = fromString("en.lucene");

    /**
     * Static value et.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName ET_MICROSOFT = fromString("et.microsoft");

    /**
     * Static value fi.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName FI_MICROSOFT = fromString("fi.microsoft");

    /**
     * Static value fi.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName FI_LUCENE = fromString("fi.lucene");

    /**
     * Static value fr.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName FR_MICROSOFT = fromString("fr.microsoft");

    /**
     * Static value fr.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName FR_LUCENE = fromString("fr.lucene");

    /**
     * Static value gl.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName GL_LUCENE = fromString("gl.lucene");

    /**
     * Static value de.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName DE_MICROSOFT = fromString("de.microsoft");

    /**
     * Static value de.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName DE_LUCENE = fromString("de.lucene");

    /**
     * Static value el.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName EL_MICROSOFT = fromString("el.microsoft");

    /**
     * Static value el.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName EL_LUCENE = fromString("el.lucene");

    /**
     * Static value gu.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName GU_MICROSOFT = fromString("gu.microsoft");

    /**
     * Static value he.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName HE_MICROSOFT = fromString("he.microsoft");

    /**
     * Static value hi.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName HI_MICROSOFT = fromString("hi.microsoft");

    /**
     * Static value hi.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName HI_LUCENE = fromString("hi.lucene");

    /**
     * Static value hu.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName HU_MICROSOFT = fromString("hu.microsoft");

    /**
     * Static value hu.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName HU_LUCENE = fromString("hu.lucene");

    /**
     * Static value is.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName IS_MICROSOFT = fromString("is.microsoft");

    /**
     * Static value id.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName ID_MICROSOFT = fromString("id.microsoft");

    /**
     * Static value id.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName ID_LUCENE = fromString("id.lucene");

    /**
     * Static value ga.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName GA_LUCENE = fromString("ga.lucene");

    /**
     * Static value it.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName IT_MICROSOFT = fromString("it.microsoft");

    /**
     * Static value it.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName IT_LUCENE = fromString("it.lucene");

    /**
     * Static value ja.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName JA_MICROSOFT = fromString("ja.microsoft");

    /**
     * Static value ja.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName JA_LUCENE = fromString("ja.lucene");

    /**
     * Static value kn.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName KN_MICROSOFT = fromString("kn.microsoft");

    /**
     * Static value ko.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName KO_MICROSOFT = fromString("ko.microsoft");

    /**
     * Static value ko.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName KO_LUCENE = fromString("ko.lucene");

    /**
     * Static value lv.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName LV_MICROSOFT = fromString("lv.microsoft");

    /**
     * Static value lv.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName LV_LUCENE = fromString("lv.lucene");

    /**
     * Static value lt.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName LT_MICROSOFT = fromString("lt.microsoft");

    /**
     * Static value ml.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName ML_MICROSOFT = fromString("ml.microsoft");

    /**
     * Static value ms.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName MS_MICROSOFT = fromString("ms.microsoft");

    /**
     * Static value mr.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName MR_MICROSOFT = fromString("mr.microsoft");

    /**
     * Static value nb.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName NB_MICROSOFT = fromString("nb.microsoft");

    /**
     * Static value no.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName NO_LUCENE = fromString("no.lucene");

    /**
     * Static value fa.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName FA_LUCENE = fromString("fa.lucene");

    /**
     * Static value pl.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName PL_MICROSOFT = fromString("pl.microsoft");

    /**
     * Static value pl.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName PL_LUCENE = fromString("pl.lucene");

    /**
     * Static value pt-BR.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName PT_BR_MICROSOFT = fromString("pt-BR.microsoft");

    /**
     * Static value pt-BR.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName PT_BR_LUCENE = fromString("pt-BR.lucene");

    /**
     * Static value pt-PT.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName PT_PT_MICROSOFT = fromString("pt-PT.microsoft");

    /**
     * Static value pt-PT.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName PT_PT_LUCENE = fromString("pt-PT.lucene");

    /**
     * Static value pa.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName PA_MICROSOFT = fromString("pa.microsoft");

    /**
     * Static value ro.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName RO_MICROSOFT = fromString("ro.microsoft");

    /**
     * Static value ro.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName RO_LUCENE = fromString("ro.lucene");

    /**
     * Static value ru.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName RU_MICROSOFT = fromString("ru.microsoft");

    /**
     * Static value ru.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName RU_LUCENE = fromString("ru.lucene");

    /**
     * Static value sr-cyrillic.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName SR_CYRILLIC_MICROSOFT = fromString("sr-cyrillic.microsoft");

    /**
     * Static value sr-latin.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName SR_LATIN_MICROSOFT = fromString("sr-latin.microsoft");

    /**
     * Static value sk.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName SK_MICROSOFT = fromString("sk.microsoft");

    /**
     * Static value sl.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName SL_MICROSOFT = fromString("sl.microsoft");

    /**
     * Static value es.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName ES_MICROSOFT = fromString("es.microsoft");

    /**
     * Static value es.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName ES_LUCENE = fromString("es.lucene");

    /**
     * Static value sv.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName SV_MICROSOFT = fromString("sv.microsoft");

    /**
     * Static value sv.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName SV_LUCENE = fromString("sv.lucene");

    /**
     * Static value ta.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName TA_MICROSOFT = fromString("ta.microsoft");

    /**
     * Static value te.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName TE_MICROSOFT = fromString("te.microsoft");

    /**
     * Static value th.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName TH_MICROSOFT = fromString("th.microsoft");

    /**
     * Static value th.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName TH_LUCENE = fromString("th.lucene");

    /**
     * Static value tr.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName TR_MICROSOFT = fromString("tr.microsoft");

    /**
     * Static value tr.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName TR_LUCENE = fromString("tr.lucene");

    /**
     * Static value uk.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName UK_MICROSOFT = fromString("uk.microsoft");

    /**
     * Static value ur.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName UR_MICROSOFT = fromString("ur.microsoft");

    /**
     * Static value vi.microsoft for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName VI_MICROSOFT = fromString("vi.microsoft");

    /**
     * Static value standard.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName STANDARD_LUCENE = fromString("standard.lucene");

    /**
     * Static value standardasciifolding.lucene for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName STANDARD_ASCII_FOLDING_LUCENE = fromString("standardasciifolding.lucene");

    /**
     * Static value keyword for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName KEYWORD = fromString("keyword");

    /**
     * Static value pattern for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName PATTERN = fromString("pattern");

    /**
     * Static value simple for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName SIMPLE = fromString("simple");

    /**
     * Static value stop for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName STOP = fromString("stop");

    /**
     * Static value whitespace for LexicalAnalyzerName.
     */
    public static final LexicalAnalyzerName WHITESPACE = fromString("whitespace");

    /**
     * Creates or finds a LexicalAnalyzerName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LexicalAnalyzerName.
     */
    @JsonCreator
    public static LexicalAnalyzerName fromString(String name) {
        return fromString(name, LexicalAnalyzerName.class);
    }

    /**
     * @return known LexicalAnalyzerName values.
     */
    public static Collection<LexicalAnalyzerName> values() {
        return values(LexicalAnalyzerName.class);
    }
}
