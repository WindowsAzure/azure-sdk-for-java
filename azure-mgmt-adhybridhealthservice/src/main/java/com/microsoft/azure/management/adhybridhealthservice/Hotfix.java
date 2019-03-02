/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The details of the hotfix installed in the server.
 */
public class Hotfix {
    /**
     * The name of the hotfix KB.
     */
    @JsonProperty(value = "kbName")
    private String kbName;

    /**
     * The link to the KB Article.
     */
    @JsonProperty(value = "link")
    private String link;

    /**
     * The date and time, in UTC, when the KB was installed in the server.
     */
    @JsonProperty(value = "installedDate")
    private DateTime installedDate;

    /**
     * Get the name of the hotfix KB.
     *
     * @return the kbName value
     */
    public String kbName() {
        return this.kbName;
    }

    /**
     * Set the name of the hotfix KB.
     *
     * @param kbName the kbName value to set
     * @return the Hotfix object itself.
     */
    public Hotfix withKbName(String kbName) {
        this.kbName = kbName;
        return this;
    }

    /**
     * Get the link to the KB Article.
     *
     * @return the link value
     */
    public String link() {
        return this.link;
    }

    /**
     * Set the link to the KB Article.
     *
     * @param link the link value to set
     * @return the Hotfix object itself.
     */
    public Hotfix withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * Get the date and time, in UTC, when the KB was installed in the server.
     *
     * @return the installedDate value
     */
    public DateTime installedDate() {
        return this.installedDate;
    }

    /**
     * Set the date and time, in UTC, when the KB was installed in the server.
     *
     * @param installedDate the installedDate value to set
     * @return the Hotfix object itself.
     */
    public Hotfix withInstalledDate(DateTime installedDate) {
        this.installedDate = installedDate;
        return this;
    }

}
