// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.internal.avro.implementation.schema.complex;

import com.azure.storage.internal.avro.implementation.AvroParserState;
import com.azure.storage.internal.avro.implementation.schema.AvroSchema;

import java.util.function.Consumer;

/**
 * Fixed instances are encoded using the number of bytes declared in the schema.
 * Wait for the cache to fill up, then get the bytes.
 * Note: We return a List of ByteBuffer since the number of bytes requested can be long and a single ByteBuffer can
 * only hold Integer.MAX bytes.
 *
 * FixedBytes
 */
public class AvroFixedSchema extends AvroSchema {

    private final long size;

    /**
     * Constructs a new AvroFixedSchema.
     *
     * @param size The number of bytes to read.
     * @param state The state of the parser.
     * @param onResult The result handler.
     */
    public AvroFixedSchema(long size, AvroParserState state, Consumer<Object> onResult) {
        super(state, onResult);
        this.size = size;
    }

    @Override
    public void add() {
        this.state.push(this);
    }

    @Override
    public void progress() {
        /* Consume size bytes, then we're done. */
        this.result = this.state.consume(size);
        this.done = true;
    }

    @Override
    public boolean canProgress() {
        /* State must have enough bytes to satisfy size.*/
        return this.state.contains(this.size);
    }

}
