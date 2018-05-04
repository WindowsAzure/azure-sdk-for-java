/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;


/**
 * The optional parameters class for "getVideoFrames" method.
 */
public class GetVideoFramesOptionalParameter {
    /**
    * Time stamp of the frame from where you want to start fetching the frames.
    */
    private Integer startSeed;

    /**
    * Number of frames to fetch.
    */
    private Integer noOfRecords;

    /**
    * Get frames filtered by tags.
    */
    private String filter;

    /**
    * Get the startSeed value.
    *
    * @return the startSeed value
    */
    public Integer startSeed() {
        return this.startSeed;
    }

    /**
    * Get the noOfRecords value.
    *
    * @return the noOfRecords value
    */
    public Integer noOfRecords() {
        return this.noOfRecords;
    }

    /**
    * Get the filter value.
    *
    * @return the filter value
    */
    public String filter() {
        return this.filter;
    }

    /**
    * Set the startSeed value.
    * <p>
    * Time stamp of the frame from where you want to start fetching the frames.
    *
    * @param startSeed the startSeed value to set
    * @return the getVideoFramesOptionalParameter object itself.
    */
    public GetVideoFramesOptionalParameter withStartSeed(int startSeed) {
        this.startSeed = startSeed;
        return this;
    }

    /**
    * Set the noOfRecords value.
    * <p>
    * Number of frames to fetch.
    *
    * @param noOfRecords the noOfRecords value to set
    * @return the getVideoFramesOptionalParameter object itself.
    */
    public GetVideoFramesOptionalParameter withNoOfRecords(int noOfRecords) {
        this.noOfRecords = noOfRecords;
        return this;
    }

    /**
    * Set the filter value.
    * <p>
    * Get frames filtered by tags.
    *
    * @param filter the filter value to set
    * @return the getVideoFramesOptionalParameter object itself.
    */
    public GetVideoFramesOptionalParameter withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    }
