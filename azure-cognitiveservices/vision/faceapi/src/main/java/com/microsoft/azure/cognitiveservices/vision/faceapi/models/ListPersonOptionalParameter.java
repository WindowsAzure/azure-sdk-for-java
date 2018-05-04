/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;


/**
 * The optional parameters class for "listPerson" method.
 */
public class ListPersonOptionalParameter {
    /**
    * Starting person id to return (used to list a range of persons).
    */
    private String start;

    /**
    * Number of persons to return starting with the person id indicated by the 'start' parameter.
    */
    private Integer top;

    /**
    * Get the start value.
    *
    * @return the start value
    */
    public String start() {
        return this.start;
    }

    /**
    * Get the top value.
    *
    * @return the top value
    */
    public Integer top() {
        return this.top;
    }

    /**
    * Set the start value.
    * <p>
    * Starting person id to return (used to list a range of persons).
    *
    * @param start the start value to set
    * @return the listPersonOptionalParameter object itself.
    */
    public ListPersonOptionalParameter withStart(String start) {
        this.start = start;
        return this;
    }

    /**
    * Set the top value.
    * <p>
    * Number of persons to return starting with the person id indicated by the 'start' parameter.
    *
    * @param top the top value to set
    * @return the listPersonOptionalParameter object itself.
    */
    public ListPersonOptionalParameter withTop(int top) {
        this.top = top;
        return this;
    }

    }
