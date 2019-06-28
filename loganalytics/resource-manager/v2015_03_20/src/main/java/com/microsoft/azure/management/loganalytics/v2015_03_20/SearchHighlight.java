/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2015_03_20;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Highlight details.
 */
public class SearchHighlight {
    /**
     * The string that is put before a matched result.
     */
    @JsonProperty(value = "pre")
    private String pre;

    /**
     * The string that is put after a matched result.
     */
    @JsonProperty(value = "post")
    private String post;

    /**
     * Get the string that is put before a matched result.
     *
     * @return the pre value
     */
    public String pre() {
        return this.pre;
    }

    /**
     * Set the string that is put before a matched result.
     *
     * @param pre the pre value to set
     * @return the SearchHighlight object itself.
     */
    public SearchHighlight withPre(String pre) {
        this.pre = pre;
        return this;
    }

    /**
     * Get the string that is put after a matched result.
     *
     * @return the post value
     */
    public String post() {
        return this.post;
    }

    /**
     * Set the string that is put after a matched result.
     *
     * @param post the post value to set
     * @return the SearchHighlight object itself.
     */
    public SearchHighlight withPost(String post) {
        this.post = post;
        return this;
    }

}
