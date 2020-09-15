package com.azure.digitaltwins.core.implementation.converters;

import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerEncoding;

/**
 * Encodes the continuation token as a json encoded string
 */
public class ContinuationTokenSerializer {
    /**
     * Encodes the continuation token as a json encoded string that the ADT service expects
     * @param continuationToken The continuation token.
     * @return Json encoded String
     * example:
     * Input: {"_t":2,"_s":null,"_rc":"[{\"token\":\"+RID:~WftkAMiSVqReAQAAAAAAAA==#RT:4#TRC:100#ISV:2#IEO:65551#FPC:AgEAAAAMAFEBAMARQP9/n4Eqjw==\",\"range\":{\"min\":\"\",\"max\":\"05C1DFFFFFFFFC\"}}]","_q":"SELECT * FROM digitaltwins where IsOccupied = true"}
     * Output: "{\"_t\":2,\"_s\":null,\"_rc\":\"[{\\\"token\\\":\\\"+RID:~WftkAMiSVqReAQAAAAAAAA==#RT:4#TRC:100#ISV:2#IEO:65551#FPC:AgEAAAAMAFEBAMARQP9/n4Eqjw==\\\",\\\"range\\\":{\\\"min\\\":\\\"\\\",\\\"max\\\":\\\"05C1DFFFFFFFFC\\\"}}]\",\"_q\":\"SELECT * FROM digitaltwins where IsOccupied = true\"}"
     */
    public static String serialize(String continuationToken) {
        try {
            return new JacksonAdapter().serialize(continuationToken, SerializerEncoding.JSON);
        }
        catch (Exception e){
            throw new IllegalArgumentException("Invalid continuation token");
        }
    }
}
