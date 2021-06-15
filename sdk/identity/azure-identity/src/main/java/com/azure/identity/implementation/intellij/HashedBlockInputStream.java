/*
 * Copyright 2015 Jo Rabin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Portions Copyright (c) Microsoft Corporation
 */

package com.azure.identity.implementation.intellij;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * Takes an underlying input stream formatted as Hashed Blocks
 * and provides the content of the blocks as an input stream
 *
 * Taken From KeePassJava
 *
 * <p>A Hashed block consists of:
 *
 * <ol>
 * <li>A 4 byte block sequence number, increments from 0
 * <li>A 32 byte MD5 hash of the content
 * <li>A 4 byte length field
 * <li>Content
 * </ol>
 *
 * <p>The stream of blocks is terminated with a 0 length 0 hash block.
 *
 * <p>Originally developed for KeePass. A KeePass hash block
 * stream is little endian, i.e. the sequence
 * number and length fields are low order byte first.
 *
 * @author Jo
 */
public class HashedBlockInputStream extends InputStream {

    private static  MessageDigest md5;
    static {
        try {
            md5 = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }
    private static final int HASH_SIZE = 32;
    private static final byte[] ZERO_HASH = new byte[HASH_SIZE];

    private long expectedSequenceNumber = 0;
    private boolean littleEndian = false;
    private boolean done = false;
    private InputStream inputStream;
    private ByteArrayInputStream blockInputStream = new ByteArrayInputStream(new byte[0]);

    /**
     * Create a Big Endian Hash Block Input Stream
     * @param inputStream the input stream containing the hash blocks
     */
    public HashedBlockInputStream(InputStream inputStream) {
        this(inputStream, false);
    }

    /**
     * Create a Hash Block Input Stream with choice of endian encoding
     * @param inputStream the input stream containing the hash blocks
     * @param littleEndian true if the stream is little endian encoded
     */
    public HashedBlockInputStream(InputStream inputStream, boolean littleEndian) {
        this.inputStream = inputStream;
        this.littleEndian = littleEndian;
    }

    @Override
    public int read(byte[] b, int offset, int length) throws IOException {
        return get(b, offset, length);
    }

    @Override
    public int read() throws IOException {
        byte[] buffer = new byte[1];
        if (get(buffer, 0, 1) != 1) {
            throw new IOException("Could not read int");
        }
        return buffer[0] & 0xFF;
    }

    @Override
    public void close() throws IOException {
        inputStream.close();
    }

    /**
     * Gets bytes from the internal buffer and replenishes the buffer as necessary
     * @param b a byte array to fill
     * @param offset the offset to strat from
     * @param length the number of bytes to return
     * @return the number of bytes actually returned, , -1 if end of file
     * @throws IOException
     */
    protected int get(byte[] b, int offset, int length) throws IOException {
        if (done) {
            return -1;
        }
        int totalBytesRead = 0;
        int bytesRead;
        while ((bytesRead = blockInputStream.read(b, offset, length)) < length && !done) {
            if (bytesRead == -1) {
                load();
            } else {
                offset += bytesRead;
                length -= bytesRead;
                totalBytesRead += bytesRead;
            }
        }
        return bytesRead > 0 ? totalBytesRead + bytesRead : totalBytesRead;
    }

    /**
     * Reload the internal buffer from the underlying input stream
     * @throws IOException
     */
    protected void load() throws IOException {
        // read the sequence number of the block
        long sequenceNumber = readUInt();
        if (sequenceNumber != expectedSequenceNumber) {
            throw new IllegalStateException("Expected sequence number " +
                    expectedSequenceNumber + " got " + sequenceNumber);
        }
        expectedSequenceNumber++;

        // get the block hash
        byte[] hash = new byte[HASH_SIZE];
        readFully(hash);

        // get the length
        long readLength = readUInt();
        if (readLength < 0) {
            throw new IllegalStateException("Got negative length for block");
        }
        // length 0 means end of file
        if (readLength == 0) {
            if (!Arrays.equals(hash, ZERO_HASH)) {
                throw new IllegalStateException("Block hash was not zero on final block");
            }
            done = true;
            return;
        }

        // get the new buffer
        byte[] readBuffer = new byte[(int) readLength];
        readFully(readBuffer);

        // check the hash
        md5.update(readBuffer);
        if (!Arrays.equals(md5.digest(), hash)) {
            throw new IllegalStateException("MD5 check failed while reading HashBlock");
        }
        blockInputStream = new ByteArrayInputStream(readBuffer);
    }

    /**
     * Read an unsigned 4 byte int decoding from the endian format
     * @return a long holding the value read
     * @throws IOException
     */
    private long readUInt() throws IOException {
        byte[] buf = new byte[4];
        readFully(buf);
        if (littleEndian) {
            return buf[3] << 24 | (buf[2] & 0xFF) << 16 | (buf[1] & 0xFF) << 8 | (buf[0] & 0xFF);
        }
        return buf[0] << 24 | (buf[1] & 0xFF) << 16 | (buf[2] & 0xFF) << 8 | (buf[3] & 0xFF);
    }

    /**
     * Fill the buffer passed
     * @param buffer the buffer to fill
     * @throws IOException if the buffer could not be filled
     */
    private void readFully(byte[] buffer) throws IOException {
        int bytesToRead = buffer.length;
        int bytesSoFar = 0;
        while (bytesSoFar < buffer.length) {
            int bytesRead = inputStream.read(buffer, bytesSoFar, bytesToRead);
            if (bytesRead <= 0) {
                throw new EOFException();
            }
            bytesSoFar += bytesRead;
            bytesToRead -= bytesRead;
        }
    }
}

