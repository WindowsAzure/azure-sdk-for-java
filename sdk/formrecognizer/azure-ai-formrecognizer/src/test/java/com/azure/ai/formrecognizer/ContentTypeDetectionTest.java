// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer;

import com.azure.ai.formrecognizer.implementation.Utility;
import com.azure.ai.formrecognizer.implementation.models.ContentType;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;

import static com.azure.ai.formrecognizer.implementation.Utility.getContentType;
import static com.azure.ai.formrecognizer.implementation.Utility.toFluxByteBuffer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit tests for automatically detection of content type.
 */
public class ContentTypeDetectionTest {

    /**
     * Test for JPG file content type detection for {@link Utility#getContentType} method.
     *
     * @throws  IOException if an I/O error occurs reading from the stream
     */
    @Test
    public void jpgContentDetectionTest() throws IOException {
        File sourceFile = new File("src/test/resources/sample-files/contoso-allinone.jpg");
        Flux<ByteBuffer> buffer = toFluxByteBuffer(new ByteArrayInputStream(Files.readAllBytes(sourceFile.toPath())));
        assertEquals(ContentType.IMAGE_JPEG, getContentType(buffer.blockFirst()));
    }

    /**
     * Test for PDF file content type detection for {@link Utility#getContentType} method.
     *
     * @throws  IOException if an I/O error occurs reading from the stream
     */
    @Test
    public void pdfContentDetectionTest() throws IOException {
        File sourceFile = new File("src/test/resources/sample-files/sample.pdf");
        Flux<ByteBuffer> buffer = toFluxByteBuffer(new ByteArrayInputStream(Files.readAllBytes(sourceFile.toPath())));
        assertEquals(ContentType.APPLICATION_PDF, getContentType(buffer.blockFirst()));
    }

    /**
     * Test for PNG file content type detection for {@link Utility#getContentType} method.
     *
     * @throws  IOException if an I/O error occurs reading from the stream
     */
    @Test
    public void pngContentDetectionTest() throws IOException {
        File sourceFile = new File("src/test/resources/sample-files/pngFile.png");
        Flux<ByteBuffer> buffer = toFluxByteBuffer(new ByteArrayInputStream(Files.readAllBytes(sourceFile.toPath())));
        assertEquals(ContentType.IMAGE_PNG, getContentType(buffer.blockFirst()));
    }

    /**
     * Test for TIFF file content type detection for {@link Utility#getContentType} method.
     *
     * @throws  IOException if an I/O error occurs reading from the stream
     */
    @Test
    public void tiffContentDetectionTest() throws IOException {
        File sourceFile = new File("src/test/resources/sample-files/cell.tif");
        Flux<ByteBuffer> buffer = toFluxByteBuffer(new ByteArrayInputStream(Files.readAllBytes(sourceFile.toPath())));
        assertEquals(ContentType.IMAGE_TIFF, getContentType(buffer.blockFirst()));
    }

    /**
     * Test for not supported file content type detection for {@link Utility#getContentType} method.
     *
     * @throws  IOException if an I/O error occurs reading from the stream
     */
    @Test
    public void notSupportContentDetectionTest() throws IOException {
        File sourceFile = new File("src/test/resources/sample-files/docFile.doc");
        Flux<ByteBuffer> buffer = toFluxByteBuffer(new ByteArrayInputStream(Files.readAllBytes(sourceFile.toPath())));
        assertThrows(IllegalArgumentException.class, () -> getContentType(buffer.blockFirst()));
    }
}
