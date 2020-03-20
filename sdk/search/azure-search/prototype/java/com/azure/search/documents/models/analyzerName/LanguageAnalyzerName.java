package com.azure.search.documents.models.analyzerName;

import com.azure.core.util.ExpandableStringEnum;
import com.azure.search.documents.models.AnalyzerName;
import com.azure.search.documents.models.DataType;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;
import java.util.stream.Collectors;

public class LanguageAnalyzerName extends ExpandableStringEnum<LanguageAnalyzerName> {
    public static final LanguageAnalyzerName EN_LUCENE = fromString(AnalyzerName.EN_LUCENE.toString());
    public static final LanguageAnalyzerName EN_MICROSOFT = fromString(AnalyzerName.EN_MICROSOFT.toString());
    public static final LanguageAnalyzerName FR_LUCENE = fromString(AnalyzerName.FR_LUCENE.toString());
    public static final LanguageAnalyzerName FR_MICROSOFT = fromString(AnalyzerName.FR_MICROSOFT.toString());
    public static final LanguageAnalyzerName STANDARD_LUCENE = fromString(AnalyzerName.STANDARD_LUCENE.toString());

    /**
     * Creates or finds a AnalyzerName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AnalyzerName.
     */
    @JsonCreator
    private static LanguageAnalyzerName fromString(String name) {
        return fromString(name, LanguageAnalyzerName.class);
    }

    public static Collection<AnalyzerName> values() {
        return values(LanguageAnalyzerName.class).stream().map(LanguageAnalyzerName::toAnalyzerName)
            .collect(Collectors.toList());
    }

    public AnalyzerName toAnalyzerName() {
        return AnalyzerName.fromString(this.toString());
    }
}
