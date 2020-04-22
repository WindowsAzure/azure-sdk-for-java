// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.internal.avro.implementation.schema.primitive;

import com.azure.storage.internal.avro.implementation.AvroParserState;
import com.azure.storage.internal.avro.implementation.schema.AvroSchema;
import com.azure.storage.internal.avro.implementation.util.AvroUtils;

import java.util.function.Consumer;

/**
 * int values are written using variable-length zig-zag coding.
 *
 * Since longs and ints share the same encoding, just add a LongSchema and convert the result into an Integer.
 */
public class AvroIntegerSchema extends AvroSchema {

    /**
     * Constructs a new AvroIntegerSchema.
     *
     * @param state The state of the parser.
     * @param onResult The result handler.
     */
    public AvroIntegerSchema(AvroParserState state, Consumer<Object> onResult) {
        super(state, onResult);
    }

    @Override
    public void add() {
        this.state.push(this);
        /* Read the Long, then convert it to an Integer. */
        AvroLongSchema numberSchema = new AvroLongSchema(
            this.state,
            this::onNumber
        );
        numberSchema.add();
    }

    /**
     * Number handler
     *
     * @param number The Long to convert.
     */
    private void onNumber(Object number) {
        AvroUtils.checkLong("'number'", number);
        /* Convert the Long into an Integer, then we're done. */
        this.result = Math.toIntExact((Long) number);
        this.done = true;
    }

    @Override
    public void progress() {
        /* Progress is defined by progress on the sub-type schemas. */
    }

    @Override
    public boolean canProgress() {
        /* Can always make progress since it is defined by the progress on the sub-type schemas. */
        return true;
    }
}
