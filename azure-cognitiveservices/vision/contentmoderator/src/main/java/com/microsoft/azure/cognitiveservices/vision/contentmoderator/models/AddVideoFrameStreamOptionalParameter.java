/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;


/**
 * The "addVideoFrameStream operation optional parameters class.
 */
public class AddVideoFrameStreamOptionalParameter {
        /**
        * Timescale of the video .
        */
        private int timescale;

        /**
        * Get the timescale value.
        *
        * @return the timescale value
        */
        public int timescale() {
            return this.timescale;
        }

        /**
        * Set the timescale value.
        * <p>
        * Timescale of the video .
        *
        * @param timescale the timescale value to set
        * @return the addVideoFrameStreamOptionalParameter object itself.
        */
        public AddVideoFrameStreamOptionalParameter withTimescale(int timescale) {
            this.timescale = timescale;
            return this;
        }

    }
