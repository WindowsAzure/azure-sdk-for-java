/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;


/**
 * The "oCRFileInput operation optional parameters class.
 */
public class OCRFileInputOptionalParameter {
        /**
        * Whether to retain the submitted image for future use; defaults to false if omitted.
        */
        private Boolean cacheImage;

        /**
        * When set to True, the image goes through additional processing to come with additional candidates.
        image/tiff is not supported when enhanced is set to true
        Note: This impacts the response time.
        */
        private Boolean enhanced;

        /**
        * Get the cacheImage value.
        *
        * @return the cacheImage value
        */
        public Boolean cacheImage() {
            return this.cacheImage;
        }

        /**
        * Get the enhanced value.
        *
        * @return the enhanced value
        */
        public Boolean enhanced() {
            return this.enhanced;
        }

        /**
        * Set the cacheImage value.
        * <p>
        * Whether to retain the submitted image for future use; defaults to false if omitted.
        *
        * @param cacheImage the cacheImage value to set
        * @return the oCRFileInputOptionalParameter object itself.
        */
        public OCRFileInputOptionalParameter withCacheImage(boolean cacheImage) {
            this.cacheImage = cacheImage;
            return this;
        }

        /**
        * Set the enhanced value.
        * <p>
        * When set to True, the image goes through additional processing to come with additional candidates.
        image/tiff is not supported when enhanced is set to true
        Note: This impacts the response time.
        *
        * @param enhanced the enhanced value to set
        * @return the oCRFileInputOptionalParameter object itself.
        */
        public OCRFileInputOptionalParameter withEnhanced(boolean enhanced) {
            this.enhanced = enhanced;
            return this;
        }

    }
