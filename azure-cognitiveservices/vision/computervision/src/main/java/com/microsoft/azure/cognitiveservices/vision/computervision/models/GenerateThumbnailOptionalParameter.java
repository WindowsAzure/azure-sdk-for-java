/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;


/**
 * The "generateThumbnail operation optional parameters class.
 */
public class GenerateThumbnailOptionalParameter {
        /**
        * Boolean flag for enabling smart cropping.
        */
        private boolean smartCropping;

        /**
        * Get the smartCropping value.
        *
        * @return the smartCropping value
        */
        public boolean smartCropping() {
            return this.smartCropping;
        }

        /**
        * Set the smartCropping value.
        * <p>
        * Boolean flag for enabling smart cropping.
        *
        * @param smartCropping the smartCropping value to set
        * @return the generateThumbnailOptionalParameter object itself.
        */
        public GenerateThumbnailOptionalParameter withSmartCropping(boolean smartCropping) {
            this.smartCropping = smartCropping;
            return this;
        }

    }
