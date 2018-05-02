/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;


/**
 * The "evaluateUrlInput operation optional parameters class.
 */
public class EvaluateUrlInputOptionalParameter {
        /**
        * Whether to retain the submitted image for future use; defaults to false if omitted.
        */
        private Boolean cacheImage;

        /**
        * Get the cacheImage value.
        *
        * @return the cacheImage value
        */
        public Boolean cacheImage() {
            return this.cacheImage;
        }

        /**
        * Set the cacheImage value.
        * <p>
        * Whether to retain the submitted image for future use; defaults to false if omitted.
        *
        * @param cacheImage the cacheImage value to set
        * @return the evaluateUrlInputOptionalParameter object itself.
        */
        public EvaluateUrlInputOptionalParameter withCacheImage(boolean cacheImage) {
            this.cacheImage = cacheImage;
            return this;
        }

    }
