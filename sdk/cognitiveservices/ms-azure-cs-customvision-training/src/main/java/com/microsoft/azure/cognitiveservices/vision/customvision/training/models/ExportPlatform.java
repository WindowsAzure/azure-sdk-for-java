/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ExportPlatform.
 */
public final class ExportPlatform extends ExpandableStringEnum<ExportPlatform> {
    /** Static value CoreML for ExportPlatform. */
    public static final ExportPlatform CORE_ML = fromString("CoreML");

    /** Static value TensorFlow for ExportPlatform. */
    public static final ExportPlatform TENSOR_FLOW = fromString("TensorFlow");

    /** Static value DockerFile for ExportPlatform. */
    public static final ExportPlatform DOCKER_FILE = fromString("DockerFile");

    /** Static value ONNX for ExportPlatform. */
    public static final ExportPlatform ONNX = fromString("ONNX");

    /** Static value VAIDK for ExportPlatform. */
    public static final ExportPlatform VAIDK = fromString("VAIDK");

    /**
     * Creates or finds a ExportPlatform from its string representation.
     * @param name a name to look for
     * @return the corresponding ExportPlatform
     */
    @JsonCreator
    public static ExportPlatform fromString(String name) {
        return fromString(name, ExportPlatform.class);
    }

    /**
     * @return known ExportPlatform values
     */
    public static Collection<ExportPlatform> values() {
        return values(ExportPlatform.class);
    }
}
