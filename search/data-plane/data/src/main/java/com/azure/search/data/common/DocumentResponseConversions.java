// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.data.common;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Utility class for Document Respose conversions
 */
public class DocumentResponseConversions {

    /**
     * Convert a Linked HashMap object to Map object
     * @param linkedMapObject object to convert
     * @return Map<String, Object>
     */
    @SuppressWarnings (value="unchecked")
    public static Map<String, Object> convertLinkedHashMapToMap(Object linkedMapObject) {
        LinkedHashMap<String, Object> linkedMap = (LinkedHashMap<String, Object>) linkedMapObject;
        Set<Map.Entry<String, Object>> entries = linkedMap.entrySet();

        Map<String, Object> convertedMap = new HashMap<>();

        for (Map.Entry<String, Object> entry : entries) {
            convertedMap.put(entry.getKey(), entry.getValue());
        }

        return convertedMap;

    }
}
