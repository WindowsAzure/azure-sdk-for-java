// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.perf.test.core;

import reactor.core.publisher.Flux;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Random;

/**
 * Utility class to help with data creation for perf testing.
 */
public class TestDataCreationHelper {
    private static final int RANDOM_BYTES_LENGTH = 1024 * 1024; // 1MB
    private static final byte[] RANDOM_BYTES;
    private static final ByteBuffer RANDOM_BYTE_BUFFER;
    private static final int SIZE = (1024 * 1024 * 1024) + 1;

    static {
        Random random = new Random(0);
        RANDOM_BYTES = new byte[RANDOM_BYTES_LENGTH];
        random.nextBytes(RANDOM_BYTES);
        RANDOM_BYTE_BUFFER = ByteBuffer.wrap(TestDataCreationHelper.RANDOM_BYTES).asReadOnlyBuffer();
    }

    /**
     * Creates a {@link Flux} of {@code size} with repeated values of {@code byteBuffer}.
     *
     * @param byteBuffer the byteBuffer to create Flux from.
     * @param size the size of the flux to create.
     * @return The created {@link Flux}
     */
    @SuppressWarnings("cast")
    public static Flux<ByteBuffer> createCircularByteBufferFlux(ByteBuffer byteBuffer, long size) {
        int remaining = byteBuffer.remaining();

        int quotient = (int) size / remaining;
        int remainder = (int) size % remaining;

        return Flux.range(0, quotient)
            .map(i -> byteBuffer.duplicate())
            .concatWithValues((ByteBuffer) byteBuffer.duplicate().limit(remainder));
    }

    /**
     * Creates a random flux of specified size.
     *
     * @param size the size of the stream
     * @return the {@link Flux} of {@code size}
     */
    public static Flux<ByteBuffer> createRandomByteBufferFlux(long size) {
        return createCircularByteBufferFlux(RANDOM_BYTE_BUFFER, size);
    }

    /**
     * Creates a random stream of specified size.
     *
     * @param size the size of the stream
     * @return the {@link InputStream} of {@code size}
     * @throws IllegalArgumentException if {@code size} is more than {@link #SIZE}
     */
    public static InputStream createRandomInputStream(long size) {
        if (size > SIZE) {
            throw new IllegalArgumentException("size must be <= " + SIZE);
        }

        return new RepeatingInputStream((int) size);
    }

    /**
     * Writes the size of bytes into the OutputStream.
     *
     * @param outputStream Stream to write into.
     * @param size Number of bytes to write.
     * @throws IOException If an IO error occurs.
     */
    public static void writeBytesToOutputStream(OutputStream outputStream, long size) throws IOException {
        int quotient = (int) size / RANDOM_BYTES.length;
        int remainder = (int) size % RANDOM_BYTES.length;

        for (int i = 0; i < quotient; i++) {
            outputStream.write(RANDOM_BYTES);
        }

        outputStream.write(RANDOM_BYTES, 0, remainder);
    }

    /**
     * Writes the data from InputStream into the OutputStream.
     *
     * @param inputStream stream to read from.
     * @param outputStream stream to write into.
     * @param bufferSize number of bytes to read in a single read.
     * @throws IOException If an IO error occurs.
     * @return the number of bytes transferred.
     */
    public static long copyStream(InputStream inputStream, OutputStream outputStream, int bufferSize) throws IOException {
        long transferred = 0;
        byte[] buffer = new byte[bufferSize];
        int read;
        while ((read = inputStream.read(buffer, 0, bufferSize)) >= 0) {
            outputStream.write(buffer, 0, read);
            transferred += read;
        }
        return transferred;
    }
}
