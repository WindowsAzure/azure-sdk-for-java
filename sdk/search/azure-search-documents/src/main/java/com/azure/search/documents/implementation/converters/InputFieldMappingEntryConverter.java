// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.implementation.converters;

import com.azure.search.documents.models.InputFieldMappingEntry;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.InputFieldMappingEntry} and
 * {@link InputFieldMappingEntry}.
 */
public final class InputFieldMappingEntryConverter {
    /**
     * Maps from {@link com.azure.search.documents.implementation.models.InputFieldMappingEntry} to
     * {@link InputFieldMappingEntry}.
     */
    public static InputFieldMappingEntry map(com.azure.search.documents.implementation.models.InputFieldMappingEntry obj) {
        if (obj == null) {
            return null;
        }
        InputFieldMappingEntry inputFieldMappingEntry = new InputFieldMappingEntry();

        if (obj.getInputs() != null) {
            List<InputFieldMappingEntry> inputs =
                obj.getInputs().stream().map(InputFieldMappingEntryConverter::map).collect(Collectors.toList());
            inputFieldMappingEntry.setInputs(inputs);
        }

        String name = obj.getName();
        inputFieldMappingEntry.setName(name);

        String source = obj.getSource();
        inputFieldMappingEntry.setSource(source);

        String sourceContext = obj.getSourceContext();
        inputFieldMappingEntry.setSourceContext(sourceContext);
        return inputFieldMappingEntry;
    }

    /**
     * Maps from {@link InputFieldMappingEntry} to
     * {@link com.azure.search.documents.implementation.models.InputFieldMappingEntry}.
     */
    public static com.azure.search.documents.implementation.models.InputFieldMappingEntry map(InputFieldMappingEntry obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.InputFieldMappingEntry inputFieldMappingEntry =
            new com.azure.search.documents.implementation.models.InputFieldMappingEntry();

        if (obj.getInputs() != null) {
            List<com.azure.search.documents.implementation.models.InputFieldMappingEntry> inputs =
                obj.getInputs().stream().map(InputFieldMappingEntryConverter::map).collect(Collectors.toList());
            inputFieldMappingEntry.setInputs(inputs);
        }

        String name = obj.getName();
        inputFieldMappingEntry.setName(name);

        String source = obj.getSource();
        inputFieldMappingEntry.setSource(source);

        String sourceContext = obj.getSourceContext();
        inputFieldMappingEntry.setSourceContext(sourceContext);
        return inputFieldMappingEntry;
    }

    private InputFieldMappingEntryConverter() {
    }
}
