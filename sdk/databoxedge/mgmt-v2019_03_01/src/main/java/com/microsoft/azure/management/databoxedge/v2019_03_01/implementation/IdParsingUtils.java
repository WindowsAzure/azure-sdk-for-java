/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_03_01.implementation;
import java.util.Arrays;
import java.util.Iterator;

class IdParsingUtils {
    public static String getValueFromIdByName(String id, String name) {
        if (id == null) {
            return null;
        }
        Iterable<String> iterable = Arrays.asList(id.split("/"));
        Iterator<String> itr = iterable.iterator();
        while (itr.hasNext()) {
            String part = itr.next();
            if (part != null && part.trim() != "") {
                if (part.equalsIgnoreCase(name)) {
                    if (itr.hasNext()) {
                        return itr.next();
                    } else {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public static String getValueFromIdByPosition(String id, int pos) {
        if (id == null) {
            return null;
        }
        Iterable<String> iterable = Arrays.asList(id.split("/"));
        Iterator <String> itr = iterable.iterator();
        int index = 0;
        while (itr.hasNext()) {
            String part = itr.next();
            if (part != null && part.trim() != "") {
                if (index == pos) {
                    if (itr.hasNext()) {
                        return itr.next();
                    } else {
                        return null;
                    }
                }
            }
            index++;
        }
        return null;
    }
}
