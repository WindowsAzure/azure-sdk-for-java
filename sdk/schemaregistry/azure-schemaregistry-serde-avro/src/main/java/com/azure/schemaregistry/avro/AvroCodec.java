// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.schemaregistry.avro;

import com.azure.schemaregistry.Codec;
import org.apache.avro.Schema;

/**
 * Base Codec class for Avro encoder and decoder implementations
 */
abstract class AvroCodec implements Codec {
    public String serializationFormat() {
        return "avro";
    }

    /**
     * @param schemaString string representation of schema
     * @return avro schema
     */
    public Schema parseSchemaString(String schemaString) {
        return (new Schema.Parser()).parse(schemaString);
    }
}
