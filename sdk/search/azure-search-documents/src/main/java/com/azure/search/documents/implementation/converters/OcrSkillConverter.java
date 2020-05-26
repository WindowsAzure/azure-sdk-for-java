// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.implementation.converters;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.InputFieldMappingEntry;
import com.azure.search.documents.models.OcrSkill;
import com.azure.search.documents.models.OcrSkillLanguage;
import com.azure.search.documents.models.OutputFieldMappingEntry;
import com.azure.search.documents.models.TextExtractionAlgorithm;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.OcrSkill} and {@link OcrSkill}.
 */
public final class OcrSkillConverter {
    /**
     * Maps from {@link com.azure.search.documents.implementation.models.OcrSkill} to {@link OcrSkill}.
     */
    public static OcrSkill map(com.azure.search.documents.implementation.models.OcrSkill obj) {
        if (obj == null) {
            return null;
        }
        OcrSkill ocrSkill = new OcrSkill();

        if (obj.getOutputs() != null) {
            List<OutputFieldMappingEntry> outputs =
                obj.getOutputs().stream().map(OutputFieldMappingEntryConverter::map).collect(Collectors.toList());
            ocrSkill.setOutputs(outputs);
        }

        if (obj.getInputs() != null) {
            List<InputFieldMappingEntry> inputs =
                obj.getInputs().stream().map(InputFieldMappingEntryConverter::map).collect(Collectors.toList());
            ocrSkill.setInputs(inputs);
        }

        String name = obj.getName();
        ocrSkill.setName(name);

        String context = obj.getContext();
        ocrSkill.setContext(context);

        String description = obj.getDescription();
        ocrSkill.setDescription(description);

        if (obj.getTextExtractionAlgorithm() != null) {
            TextExtractionAlgorithm textExtractionAlgorithm =
                TextExtractionAlgorithmConverter.map(obj.getTextExtractionAlgorithm());
            ocrSkill.setTextExtractionAlgorithm(textExtractionAlgorithm);
        }

        if (obj.getDefaultLanguageCode() != null) {
            OcrSkillLanguage defaultLanguageCode = OcrSkillLanguageConverter.map(obj.getDefaultLanguageCode());
            ocrSkill.setDefaultLanguageCode(defaultLanguageCode);
        }

        Boolean shouldDetectOrientation = obj.isShouldDetectOrientation();
        ocrSkill.setShouldDetectOrientation(shouldDetectOrientation);
        return ocrSkill;
    }

    /**
     * Maps from {@link OcrSkill} to {@link com.azure.search.documents.implementation.models.OcrSkill}.
     */
    public static com.azure.search.documents.implementation.models.OcrSkill map(OcrSkill obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.OcrSkill ocrSkill =
            new com.azure.search.documents.implementation.models.OcrSkill();

        if (obj.getOutputs() != null) {
            List<com.azure.search.documents.implementation.models.OutputFieldMappingEntry> outputs =
                obj.getOutputs().stream().map(OutputFieldMappingEntryConverter::map).collect(Collectors.toList());
            ocrSkill.setOutputs(outputs);
        }

        if (obj.getInputs() != null) {
            List<com.azure.search.documents.implementation.models.InputFieldMappingEntry> inputs =
                obj.getInputs().stream().map(InputFieldMappingEntryConverter::map).collect(Collectors.toList());
            ocrSkill.setInputs(inputs);
        }

        String name = obj.getName();
        ocrSkill.setName(name);

        String context = obj.getContext();
        ocrSkill.setContext(context);

        String description = obj.getDescription();
        ocrSkill.setDescription(description);

        if (obj.getTextExtractionAlgorithm() != null) {
            com.azure.search.documents.implementation.models.TextExtractionAlgorithm textExtractionAlgorithm =
                TextExtractionAlgorithmConverter.map(obj.getTextExtractionAlgorithm());
            ocrSkill.setTextExtractionAlgorithm(textExtractionAlgorithm);
        }

        if (obj.getDefaultLanguageCode() != null) {
            com.azure.search.documents.implementation.models.OcrSkillLanguage defaultLanguageCode =
                OcrSkillLanguageConverter.map(obj.getDefaultLanguageCode());
            ocrSkill.setDefaultLanguageCode(defaultLanguageCode);
        }

        Boolean shouldDetectOrientation = obj.shouldDetectOrientation();
        ocrSkill.setShouldDetectOrientation(shouldDetectOrientation);
        return ocrSkill;
    }

    private OcrSkillConverter() {
    }
}
